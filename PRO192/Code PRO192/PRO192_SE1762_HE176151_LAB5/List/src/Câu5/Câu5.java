/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu5;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu5 {
//Viết chương trình Java để chèn phần tử được chỉ định vào vị trí xác định trong danh sách liên kết.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi[] = {"Phong", "Huy", "Đức"};
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < chuoi.length; i++) {
            list.add(chuoi[i]);
        }
        System.out.println("Danh sách ban đầu là: ");
        System.out.println(list);
        System.out.print("Nhập phần tử muốn chèn: ");
        String m = sc.nextLine();
        System.out.print("Vị trí muốn chèn: ");
        int a = Integer.parseInt(sc.nextLine());
        if (a <= 0 || a > list.size()) {
            System.out.println("Vượt quá giá trị:");
        } else {
            list.add(a - 1, m);
            System.out.println("Danh sách lúc sau là: ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println("");
        }
    }

}
