/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2.ws5;

import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Main {

    public static void main(String[] args) {
        Person[] e = new Person[10];
        int n = 0, c = 0;
        do {
            System.out.println("Worker (1); Officer(2): ");
            Scanner in = new Scanner(System.in);
            c = in.nextInt();
            if (c == 1) {
                //accept information of worker
                System.out.print("Enter worker name: ");
                String name = in.next();
                System.out.print("Enter worker working hours: ");
                int hrs = in.nextInt();
                e[n] = new Worker(name, hrs);

                n++;
            } else if (c == 2) {
                //accept information of Officer
                System.out.print("Enter Officer name: ");
                String name = in.next();
                System.out.print("Enter officer salary: ");
                double salary = in.nextDouble();
                e[n] = new Officer(name, salary);
                n++;
            }
        } while (c != 0);
        //print all objects of epho
        for (int i = 0; i < n; i++) {
//print the instance of Worker only
            if (e[i] instanceof Worker) {
                e[i].display();
            }
        }

    }

}
