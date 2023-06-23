/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu4;

import java.util.Collection;
import java.util.Collections;
import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu4 {
//Viết chương trình Java để lặp một danh sách liên kết theo thứ tự ngược lại.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi[] = {"Phong", "Huy", "Đức"};
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < chuoi.length; i++) {
            list.add(chuoi[i]);
        }
        System.out.println("Danh sách ban đầu là: ");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("Danh sách lúc sau là: ");
        System.out.println(list);
        
        //Cách 2:
//        for (int i = list.size()-1; i >= 0; i--) {
//            System.out.print(list.get(i)+" ");
//        }
//       System.out.println("");

    }
}
