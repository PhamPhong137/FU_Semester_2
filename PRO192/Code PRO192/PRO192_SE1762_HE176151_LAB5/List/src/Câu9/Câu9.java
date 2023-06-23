/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu9;
//Viết chương trình Java để chèn một số phần tử tại vị trí xác định vào danh sách liên kết.

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        list.add("Phong");
        list.add("Huy");
        list.add("Đức");
        System.out.println("Danh sách ban đầu: " + list);
        System.out.print("Nhập phần tử muốn chèn: ");
        String a = sc.nextLine();
        System.out.println("Nhập vị trí muốn chèn: ");

        int index = Integer.parseInt(sc.nextLine());
        if (index <= 0 || index > list.size()) {
            System.out.println("Vượt quá phạm vi");
        } else {
            list.add(index, a);
            System.out.println("Danh sách sau khi chèn là:");
            System.out.println(list);
        }

    }
}
