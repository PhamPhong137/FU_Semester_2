/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu3;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu3 {
//Viết chương trình Java để lặp qua tất cả các phần tử trong danh sách liên kết bắt đầu từ vị trí đã chỉ định.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi[] = {"Phong", "Huy", "Đức"};
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < chuoi.length; i++) {
            list.add(chuoi[i]);
        }
        System.out.println("Danh sách ban đầu là: ");
        System.out.println(list);
        System.out.print("Lặp qua các phần tử từ vị trí thứ: ");
        int a = Integer.parseInt(sc.nextLine());
        if (  a <= 0 || a > list.size() ) {
            System.out.println("Vượt quá phạm vi");
        } else {
            for (int i = a - 1; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
}
