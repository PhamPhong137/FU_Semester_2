/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu9 {
    //Viết một chương trình Java để tạo một khung nhìn tập hợp của các ánh xạ có trong một bản đồ.
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

      // Tạo khung nhìn tập hợp của các ánh xạ trong HashMap
      for (Map.Entry<String, String> hashmap1 : hashMap.entrySet()) {
         System.out.println("Key: " + hashmap1.getKey() + ", Value: " + hashmap1.getValue());
      }
   }

}
