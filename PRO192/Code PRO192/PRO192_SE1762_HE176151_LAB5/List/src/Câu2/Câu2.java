/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu2 {
//Viết chương trình Java để lặp qua tất cả các phần tử trong danh sách liên kết.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi[] = {"Phong", "Huy", "Đức"};
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < chuoi.length; i++) {
            list.add(chuoi[i]);
        }
        System.out.println("Danh sách ban đầu là: ");
        System.out.println(list);
        System.out.println("Lặp qua các phần tử: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }

}
