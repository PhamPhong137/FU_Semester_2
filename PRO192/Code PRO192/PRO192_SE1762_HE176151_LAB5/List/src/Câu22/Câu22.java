/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu22;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu22 {
//Viết chương trình Java để kiểm tra xem một phần tử cụ thể có tồn tại trong danh sách liên kết hay không.
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
        System.out.println("Danh sách ban đầu:");
        System.out.println(list);
        System.out.print("Nhập phần tử chỉ định: ");
        int check = 0;
        String m = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(m)) {
                System.out.println("Có tồn tại phần tử đó");
                check = 1;
                break;
            }

        }
        if (check == 0) {
            System.out.println("Không có phần tử đó");
        }

    }
}
