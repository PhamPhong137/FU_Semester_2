/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu6;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu6 {
    //. Viết chương trình Java để chèn các phần tử vào danh sách liên kết ở vị trí đầu tiên và cuối cùng.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        LinkedList<String> list = new LinkedList<String>();
        list.add("Phong");
        list.add("Huy");
        list.add("Đức");
        System.out.println("Danh sách ban đầu: "+list);
        LinkedList<String> list1 = new LinkedList<String>();
        System.out.print("Nhap số phần tử muốn chèn: ");
        int n=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String a=sc.nextLine();
            list1.add(a);
        }
        list.addAll(list1);
        list.addAll(0,list1);
        System.out.println("Danh sách sau khi chèn là:");
        System.out.println(list);
    }
}
