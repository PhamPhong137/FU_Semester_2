/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu11;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu11 {
    //Viết chương trình Java để hiển thị các phần tử và vị trí của chúng trong một danh sách liên kết.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi[] ={"Phong","Huy","Đức"};
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < chuoi.length; i++) {
            list.add(chuoi[i]);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" có vị tri thứ "+(i+1));
        }
    }
}
