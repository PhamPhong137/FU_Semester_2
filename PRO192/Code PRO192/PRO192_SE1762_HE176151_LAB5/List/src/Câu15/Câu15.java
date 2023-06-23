/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu15;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu15 {
    //Viết chương trình Java hoán đổi hai phần tử trong danh sách liên kết.
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String chuoi[] ={"Phong","Huy","Đức"};
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < chuoi.length; i++) {
            list.add(chuoi[i]);
        }
        System.out.println(list);
        System.out.println("Nhập hai vị trí cần hoán đổi:");
        int a=Integer.parseInt(sc.nextLine());
        int b=Integer.parseInt(sc.nextLine());
        
        String temp =list.get(a-1);
        list.set(a-1,list.get(b-1));
        list.set(b-1, temp);
        System.out.println(list);
        
    }
}
