/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu14;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu14 {
    //Viết chương trình Java để xóa tất cả các phần tử khỏi danh sách liên kết.
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String chuoi[] = {"Phong", "Huy", "Đức"};
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < chuoi.length; i++) {
            list.add(chuoi[i]);
        }
        System.out.println(list);
        
        list.clear();
        System.out.println(list);
        
        
    }
   
   
}
