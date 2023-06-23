/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu1;

import java.util.LinkedList;
import java.util.Scanner;



/**
 *
 * @author PC-Phong
 */
public class Câu1 {
//Viết chương trình Java để nối phần tử được chỉ định vào cuối danh sách liên kết.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi[] ={"Phong","Huy","Đức"};
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < chuoi.length; i++) {
            list.add(chuoi[i]);
        }
        System.out.println("Danh sách ban đầu là: ");
        System.out.println(list);
        System.out.println("Nhập phần tử muốn thêm: ");
        String a= sc.nextLine();       
        list.add(a);
        System.out.println("Danh sách mới là: ");
        System.out.println(list);
        
    }
    
}
