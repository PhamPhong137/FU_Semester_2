/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Main {

    public static String fun1(String str) {

        char[] s = str.toCharArray();
        boolean kt = false;
        if (s[0] == ' ') {

            kt = true;
        } else {
            s[0] = Character.toUpperCase(s[0]);
        }
        for (int i = 0; i < str.length(); i++) {

            if (s[i] == '.') {
                kt = true;
                continue;
            }

            if (kt == true) {
                s[i] = Character.toUpperCase(s[i]);
                if (s[i] == ' ') {
                    kt = true;
                } else {
                    kt = false;
                }
            }

        }

//        for (int i = 0; i < str.length(); i++) {
//            System.out.print(s[i]);
//        }
        String output = new String(s);
        return output;
    }

    public static String fun2(String txt) {
        String s = txt.replaceAll("\\s+", " ");
        return s;
    }

    public static String fun3(String txt) {
        String s = txt.replaceAll("new generation university", "New Generation University");
        return s;
    }

    public static String fun4(String txt) {
        String s = txt.replaceAll("Vietnam", "VIETNAM");
        return s;
    }

    public static String fun5(String txt) {
        String s = txt.replaceAll("(?i)financing Promoting Technology", "FPT University");
              
        return s;
    }

    public void fun6(String txt) {
        int nguyenam = 0;
        int phuam = 0;
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                nguyenam++;
            } else if (Character.isAlphabetic(c)) {
                phuam++;
            }
        }
        System.out.println("Số nguyên âm là: " + nguyenam);
        System.out.println("So phụ âm là: " + phuam);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        String txt = "financing Promoting Technology was established with the mission to develop a ‘new generation university’ with a    modern educational philosophy which combines training    activities with the actual need for skills in   the country, leveraging Vietnam to a level at which it can compete    with developed countries in the world. financing     Promoting Technology trains industrial engineers, and this requires a close association with IT firms, combining   training with      reality to be able to implement the most advanced technologies.";
        System.out.println("Đoạn văn:"+txt);
        System.out.println("1.Viết hoa ký tự đầu tiên trong chuỗi và đầu của câu tiếp theo.");;
        System.out.println("2.Tìm và xóa khoảng trắng dư");
        System.out.println("3.Tìm và viết lại New Generation University");
        System.out.println("4.Tìm và viết in hoa VIETNAM");
        System.out.println("5.Tìm và đổi financing Promoting Technology thành FPT University.");
        System.out.println("6.Thống kê nguyên âm và phụ âm trong đoạn văn trên.");
        System.out.println("7.Thoát khỏi menu.");
        while (true) {
            System.out.print("Mời bạn lựa chọn: ");
            int choice = 0;
            while (true) {
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice >= 1 && choice <= 7) {
                        break;
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.print("Mời bạn nhập lại:");
                }
            }
            if (choice == 1) {

                txt = fun1(txt);
                System.out.println(txt);
            }
            if (choice == 2) {

                txt = txt.replaceAll("\\s+", " ").trim();
                System.out.println(txt);
            }
            if (choice == 3) {

                txt = fun3(txt);
                System.out.println(txt);
            }
            if (choice == 4) {
                txt = fun4(txt);
                System.out.println(txt);
            }
            if (choice == 5) {
                txt = fun5(txt);
                System.out.println(txt);
            }
            if (choice == 6) {
                obj.fun6(txt);
            }
            if (choice == 7) {
                break;
            }
        }
    }

}
