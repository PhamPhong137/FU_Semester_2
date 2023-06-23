/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pro192;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Validate v = new Validate();
        while (true) {
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("8.");
            System.out.print("Mời bạn chọn (0-8):");
            
            Scanner sc = new Scanner(System.in);
            StudentManagement sm = new StudentManagement();
            int choice=v.checkChoice();
            switch (choice) {
                case 0:
                    System.out.println("Bye!!!");
                    System.exit(0);
                case 1:

                    sm.inputStudent(students);
                    break;
                case 2:
                    sm.outputStudent(students);
                    break;
                case 3:
                    sm.addStudent(students);
                    break;
                case 4:
                    sm.searchStudent(students);
                    break;
                case 5:
                    sm.removeStudent(students);
                    break;
                case 6:
                    sm.calculateResult(students);
                    break;
                case 7:
                    sm.checkStudentComplete(students);
                    break;
                case 8:
                    sm.printFile(students);

                    break;
                default:
                    System.out.println("Ban chi chon 0-8");
                    break;

            }

        }

    }

}
