/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu7;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu7 {
//Viết một chương trình Java để kiểm tra xem một bản đồ có chứa một ánh xạ cho khóa được chỉ định hay không.
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
        System.out.println("Map ban đầu là: " + hashMap);
        System.out.print("Nhập key: ");
        String key = sc.nextLine();
        if (hashMap.containsKey(key)) {
            System.out.println("HashMap chứa key : " + key);
        } else {
            System.out.println("HashMap không chứa key: " + key);
        }
    }

}

