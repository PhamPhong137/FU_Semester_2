/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu7;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu7 {
    //Viết chương trình Java để chuyển một bộ băm thành một mảng.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> set = new LinkedHashSet<>();
        System.out.println("Nhập danh sách: ");
        System.out.print("Nhập số lượng phần tử: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            set.add(a);
        }
        System.out.println("Tập Set ban đầu: " + set);
        System.out.println("Chuyển thành mảng: ");
        Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
