/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu4;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu4 {
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
        System.out.println("Map ban đầu là: "+hashMap);
        hashMap.clear();
        System.out.println("Map sau khi loại bỏ hết các ánh xạ: "+hashMap);
        
    }
}
