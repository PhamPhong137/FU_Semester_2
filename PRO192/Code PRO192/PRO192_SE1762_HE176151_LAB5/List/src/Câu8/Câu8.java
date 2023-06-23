/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu8;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu8 {
    //Viết chương trình Java để chèn phần tử được chỉ định vào cuối danh sách liên kết.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        list.add("Phong");
        list.add("Huy");
        list.add("Đức");
        System.out.println("Danh sách ban đầu: " + list);
        System.out.print("Nhập phần tử muốn chèn: ");
        String a = sc.nextLine();
        list.add(a);
        System.out.println("Danh sách sau khi chèn là:");
        System.out.println(list);
    }
}
