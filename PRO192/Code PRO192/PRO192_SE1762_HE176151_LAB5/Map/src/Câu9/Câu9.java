/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu9;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author PC-Phong
 */
public class Câu9 {
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
        System.out.println("Chuyển thành ArrayList: ");
        
        ArrayList setA = new ArrayList(set);
        System.out.println(setA);
    }
}
