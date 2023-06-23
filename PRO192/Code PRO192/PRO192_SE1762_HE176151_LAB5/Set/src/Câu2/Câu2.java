/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu2;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu2 {

    //Viết chương trình Java để đếm số lượng ánh xạ khóa-giá trị (kích thước) trong một bản đồ.
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử HashMap: ");
        int a = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < a; i++) {
            System.out.print("Key " + i + ": ");
            String key = sc.nextLine();
            System.out.print("Value " + i + ": ");
            String m = sc.nextLine();
            hashMap.put(key, m);
        }
        System.out.println("Số lượng khóa-giá trị là "+ hashMap.size());
    }
}
