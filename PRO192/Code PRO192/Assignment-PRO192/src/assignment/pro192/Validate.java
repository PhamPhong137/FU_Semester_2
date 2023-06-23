/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pro192;

import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Validate {

    Scanner sc = new Scanner(System.in);

    public double checkMark() {
        while (true) {
            try {
                double mark = Double.parseDouble(sc.nextLine());
                if (mark >= 0 && mark <= 10) {
                    return mark;
                } else {
                    System.out.println("Nhập điểm từ (0-10): ");
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.print("Nhập lại điểm: ");
            }
        }
    }

    public String checkString() {
        String name;
        while (true) {
            name = sc.nextLine();
            if (!name.trim().isEmpty()) {
                break;
            } else {
                System.out.print("Mời bạn nhập lại: ");
            }
        }
        return name;
    }

    public int checkSoluong() {
        int n = 0;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n > 0) {
                    return n;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.print("Nhập lại số lượng sinh viên: ");
            }
        }
    }

    public String checkSex() {
        String m;
        while (true) {
            m = sc.nextLine();

            if (m.trim().matches("male")) {
                return "male";
            }
            if (m.trim().matches("female")) {
                return "female";
            }
        }

    }

    public int checkChoice() {
        int choice=0;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                return choice;
            } catch (Exception e) {
                System.out.print("Mời bạn nhập lại:");
            }
        }
    }

}
