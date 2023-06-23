/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SquareMatrix;

import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Menu {

    public static void main(String[] args) {
        while (true) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.print(" moi chon (0-9):");
            int chon;
            Scanner sc = new Scanner(System.in);
            while (true) {
                try {
                    chon = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.print("Mời bạn nhập lại:");
                }
            }
            switch (chon) {
                case 0:
                    System.out.println("Bye!!!");
                    System.exit(0);
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                default:
                    System.out.println("Ban chi chon 0-9");
                    break;

            }

        }
    }
}
