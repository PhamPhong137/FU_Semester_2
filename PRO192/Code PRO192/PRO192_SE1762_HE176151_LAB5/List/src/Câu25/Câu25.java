/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Câu25;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author PC-Phong
 */
public class Câu25 {
    //kiemtrarong
    public static void main(String[] args) {
        // tạo 1 list rỗng 
        List<String> list = new LinkedList<>();
       
        if (list.isEmpty()) {
            System.out.println("Danh sách liên kết rỗng.");
        } else {
            System.out.println("Danh sách liên kết không rỗng.");
        }
    }
}
