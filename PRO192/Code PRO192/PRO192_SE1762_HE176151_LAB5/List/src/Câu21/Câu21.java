/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu21;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu21 {
    //Viết chương trình Java để lấy nhưng không loại bỏ, phần tử cuối cùng của danh sách liên kết.
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
        System.out.println("Danh sách ban đầu: ");
        System.out.println(list);
        System.out.println("Phần tử cuối cùng là: "+list.get(list.size()-1));
        
        
        
    }
}
