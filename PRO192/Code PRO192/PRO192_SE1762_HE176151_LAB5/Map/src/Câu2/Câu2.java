/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu2;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu2 {
//Viết chương trình Java để lặp qua tất cả các phần tử trong danh sách băm.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> set = new LinkedHashSet<>();
        System.out.println("Nhập danh sách: ");
        System.out.print("Nhập số lượng phần tử: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            set.add(a);
        }
        System.out.println("Lặp qua các phần tử: ");
        //cách1
//        for (Object object : set) {
//            String m = (String) object;
//            System.out.println(m);
//        }
        //Cach2
        set.forEach((obj) -> {
            System.out.print(obj+" ");
        });

    }
}
