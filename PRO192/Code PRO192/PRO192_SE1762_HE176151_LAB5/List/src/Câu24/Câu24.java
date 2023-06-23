/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu24;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list1 = new LinkedList<String>();
        System.out.println("Nhập danh sách liên kết 1: ");
        System.out.print("Nhập số phần tử danh sách 1: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            list1.add(a);
        }
        System.out.println(list1);
        LinkedList<String> list2 = new LinkedList<String>();
        System.out.println("Nhập danh sách liên kết 2: ");
        System.out.print("Nhập số phần tử danh sách 2: ");
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String a = sc.nextLine();
            list2.add(a);
        }
        System.out.println(list2);
        
        if (list1.equals(list2)) {
            System.out.println("Hai danh sách liên kết giống nhau.");
        } else {
            System.out.println("Hai danh sách liên kết khác nhau.");
        }
        
    }
}
