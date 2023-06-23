/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu4;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu4 {
    //Viết chương trình Java để làm trống một tập băm.
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
        System.out.println("Tập Set ban đầu là: "+set);
        set.clear();
        System.out.println("Tập Set sau khi xóa: "+set);
        
        
        
    }
}
