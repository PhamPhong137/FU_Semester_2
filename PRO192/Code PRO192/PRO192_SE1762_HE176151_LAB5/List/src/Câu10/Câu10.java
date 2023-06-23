/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu10;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Câu10 {
   // Viết chương trình Java để lấy vị trí xuất hiện đầu tiên và cuối cùng của các phần tử được chỉ định trong danh sách liên kết.
    public static void main(String[] args) {
        int c = 0,b = 0;
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        System.out.println("Nhập danh sách liên kết: ");
        System.out.print("Nhập số phần tử: ");
        int n=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String a=sc.nextLine();
            list.add(a);
        }
        
        System.out.print("Nhập phần tử chỉ định: ");
        int check=1;
        String m = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(m)){
                c=i;
                break;
            }else{
                check=0;
            }
                 
        }
        for (int i =list.size()-1; i >=0; i--) {
            if(list.get(i).equals(m)){
                b=i;
                break;
            }
        }
        if(check!=0){
        System.out.println("Vị trí xuất hiện đầu tiên và cuối cùng của phần tử được chỉ định là:" + (c+1) +" "+ (b+1));
        }else{
            System.out.println("Không có phần tử đó");
        }
        
    }
}
