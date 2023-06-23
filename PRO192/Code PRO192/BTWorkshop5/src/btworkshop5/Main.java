/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btworkshop5;

import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Enter list of phone numbers");
        System.out.println("-----------------------------------------");
        PhoneNumber phonelist[] = new PhoneNumber[1000];
        int choice = 0;
        int n = 0;
        do {
            System.out.println("Type of phone number ? (1 – local phone, 2 – Inter phone number, 0 - exit):  ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter area code:");
                int area = sc.nextInt();
                System.out.print("Enter number:");
                String number = sc.next();
                phonelist[n]=new PhoneNumber(area,number);
                n++;
            } else if (choice == 2) {
                System.out.print("Enter country code:");
                String cc = sc.next();
                System.out.print("Enter area code:");
                int area = sc.nextInt();
                System.out.print("Enter number:");
                String number =sc.next();
                phonelist[n]= new IntPhoneNumber(cc,area,number);
                n++;
            }

        } while (choice != 0);
        for (int i = 0; i < n; i++) {
            phonelist[i].display();
        }
    }

}
