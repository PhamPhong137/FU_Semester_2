/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu1;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu1 {
    //Viết chương trình Java để liên kết giá trị được chỉ định với khóa được chỉ định trong HashMap.
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<String,String>();
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhập số phần tử HashMap: ");
        int a =Integer.parseInt(sc.nextLine());
        for (int i = 0; i < a; i++) {
            System.out.print("Key "+i+": ");
            String key= sc.nextLine();
            System.out.print("Value "+i+": ");
            String m = sc.nextLine();
            hashMap.put(key,m);
        }
        System.out.println("Hashmap ban đầu là: "+hashMap);
        System.out.print("Nhập khóa được chỉ định: ");
        String b= sc.nextLine();
        System.out.print("Nhập giá trị được chỉ định: ");
        String c = sc.nextLine();
        hashMap.put(b,c);
        
        System.out.println("Sau khi liên kết là: "+hashMap);
        
    }
    
}
