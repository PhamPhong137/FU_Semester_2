/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btstring;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class BTString {

    /**
     * @param s
     */
    public void findLength(String s) {
        System.out.println(s.length());
    }

    public void tachKitu(String s) {
        //Cach 1: tách ki tu riêng lẻ
//        String[] words = s.split("");
//        for (String word : words) {
//            System.out.println(word);
//        }
        //cach 2:
        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void tachKitudaonguoc(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public void demSotuchuoi(String s) {
//        int count = 0;
//
//        if (s.charAt(0) != ' ') {
//            count++;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if ((s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')) {
//                count++;
//            }
//        }
//        System.out.println(count);
            s=s.trim();
            String[] sub_s = s.split(" ");
            System.out.println(sub_s.length);
    }

    public void sosanhchuoi(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("Hai String khong giong nhau. ");
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    System.out.println("Hai String khong giong nhau. ");

                }
            }
            System.out.println("Hai String giong nhau.");
        }
    }

    public void countCharNumSpechar(String s) {
        int Char = 0, Num = 0, Spechar = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'z') {
                Char++;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                Num++;
            } else {
                Spechar++;
            }
        }
        System.out.println("Char : " + Char + "\nNumber : " + Num + "\nSpecial Char : " + Spechar);
    }

    public void copyString(String s1, String s2) {
        String s3;
        System.out.println("String after copy : ");
        s3 = s1.concat(s2);
        System.out.println(s3);
    }

    public static void main(String[] args) {
        BTString obj = new BTString();
        Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//        System.out.println("So ki tu cua chuoi la:");
//        obj.findLength(s);
//        System.out.println("Sau khi tach chuoi:");
//        obj.tachKitu(s);
//        System.out.println("Sau khi tach chuoi theo thu tu dao nguoc");
//        obj.tachKitudaonguoc(s);
//        System.out.println("So tu trong chuoi la:");
//        obj.demSotuchuoi(s);
//        System.out.println("So sanh hai chuoi");
//        System.out.println("Nhap chuoi 2:");
//        String s2 = sc.nextLine();
//        obj.sosanhchuoi(s, s2);
//        System.out.println("Tinh tong chữ số, số, kí tự đặc biệt");
//        obj.countCharNumSpechar(s);
//        System.out.println("Sao chep chuoi");
//        obj.copyString(s, s2);
        System.out.println("Sap xep mang chuoi");
        System.out.println("Nhap mang chuoi:");
        int n;      
        while (true) {
            try {
                 n = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhap lai:");
            }
        }
        String[] words = new String[n];
        System.out.printf("Vui long nhap %d chuoi:\n", n);
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.nextLine();

        }
        Arrays.sort(words);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(words));
        sc.close();

    }

}
