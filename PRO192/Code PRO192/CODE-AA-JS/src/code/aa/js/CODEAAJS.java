/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.aa.js;

import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class CODEAAJS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, k;
        int total;
        int total1 = 0;
        int total2 = 0;
        x = sc.nextInt();
        y = sc.nextInt();
        k = sc.nextInt();
        int nx = x - 1;
        int ny = y - 1;
        total1 = nx + ny * x;
        total2 = ny + nx * y;

        if (total1 > total2) {
            if (k > total2 && k < total1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (total2 > total1) {
            if (k > total1 && k < total2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if (total1 == k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
