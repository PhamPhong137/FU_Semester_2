/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Inputter {

    Scanner sc = new Scanner(System.in);

    public int checkMenu() {
        int chon = 0;
        while (true) {
            try {
                chon = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("Mời bạn nhập lại:");
            }
        }
        return chon;
    }

    public String checkName() {
        String name = null;

        while (true) {
            System.out.print("Name: ");
            try {
                name = sc.nextLine();
                if (name.trim().equals("")) {
                    throw new Exception("Không để trống tên");
                }
                break;
            } catch (Exception e) {
                System.err.println(e);
            }
        }

        return name;
    }

    public int checkMark() {
        int mark;
        while (true) {
            try {
                System.out.print("Mark: ");
                mark = Integer.parseInt(sc.nextLine());
                if (mark >= 0 && mark <= 10) {
                    break;
                }else{
                    throw new Exception("Nhập điểm từ 0 đến 10");
                }
            } catch (Exception e) {               
                System.err.println(e);
            }
        }
        return mark;
    }
}
