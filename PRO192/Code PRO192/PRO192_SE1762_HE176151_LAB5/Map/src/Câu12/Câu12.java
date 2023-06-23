/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu12;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu12 {
    // Viết chương trình Java để loại bỏ tất cả các phần tử khỏi tập băm.
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
        set.clear();
        System.out.println("Sau khi loại bỏ tất cả phần tử: "+set);
    }
}
