/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu11;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu11 {
    //Viết chương trình Java để so sánh hai tập hợp và giữ lại các phần tử giống nhau trên cả hai tập hợp.
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
        System.out.println("Tập Set1: " + set);
        
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        System.out.println("Nhập danh sách: ");
        System.out.print("Nhập số lượng phần tử: ");
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String a = sc.nextLine();
            set1.add(a);
        }
        System.out.println("Tập Set2: " + set1);
        System.out.println("Các phần tử giống nhau của hai Set là: ");
        LinkedHashSet<String> intersection = new LinkedHashSet<>(set);
        intersection.retainAll(set1);
        System.out.println(intersection);
        
    }
}
