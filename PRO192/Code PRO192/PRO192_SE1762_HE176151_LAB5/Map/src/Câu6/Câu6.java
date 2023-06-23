/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu6;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu6 {
//Viết chương trình Java để sao chép một bộ băm sang một bộ băm khác.
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
        System.out.println("Tập Set ban đầu: " + set);
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        System.out.print("Sao chép bộ Set: ");
        set1.addAll(set);
        System.out.println(set1);

    }
}
