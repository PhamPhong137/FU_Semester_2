/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author PC-Phong
 */
public class Câu12 {
   //Viết một chương trình Java để có được một chế độ xem tập hợp các giá trị có trong bản đồ này.
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
// Tạo khung hình các giá trị
        Collection<String> values = hashMap.values();
        for (String value : values) {
            System.out.println("Value: " + value);
        }
    }
}
