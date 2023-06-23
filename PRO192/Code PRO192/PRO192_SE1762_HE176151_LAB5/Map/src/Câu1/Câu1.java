/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu1 {
    //Viết chương trình Java để nối phần tử được chỉ định vào cuối tập băm.

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

        System.out.println("Danh sách ban đầu là " + set);
        System.out.print("Nhập phần tử được chỉ định: ");
        String b = sc.nextLine();       
        set.add(b);
        System.out.println("Danh sách lúc sau là: " + set);

    }

}
