/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu18;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu18 {
    //Viết chương trình Java để sao chép một danh sách liên kết sang một danh sách liên kết khác.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        System.out.println("Nhập danh sách liên kết: ");
        System.out.print("Nhập số phần tử: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            list.add(a);
        }
        System.out.println(list);
        
        LinkedList<String> list1 = new LinkedList<String>();
        list1.addAll(list);
        System.out.println("Sao chép danh sách liên kết:");
        System.out.println(list);
    }
}
