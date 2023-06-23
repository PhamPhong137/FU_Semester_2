/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import controller.QLPT;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Main {

    public static void main(String[] args) {
        QLPT q = new QLPT();
        String fname = "src/controller/ptgt.dat";
        while (true) {
            System.out.println("1. Nhap 1 phuong tien giao thong");
            System.out.println("2. Hien thi DS PTGT");
            System.out.println("3. Luu vao file");
            System.out.println("4. Doc tu file");
            System.out.println("5. Tim kiem theo hang");
            System.out.println("6. Tim kiem theo mau");
            System.out.println("7. Tim kiem gia tu ... den ..");
            System.out.println("8. Sua thong tin 1 PTGT");
            System.out.println("9. Xoa 1 PTGT");
            System.out.println("10. Sap xep phuong tien theo nam");
            System.out.println("11. Sap xep phuong tien theo hang");
            System.out.println("12.Săp xep theo hai thuoc tinh(Hang,gia)");
            System.out.print(" moi chon (0-12):");
            int chon;
            Scanner sc = new Scanner(System.in);
            while (true) {
                try {
                    chon = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.print("Mời bạn nhập lại:");
                }
            }
            switch (chon) {
                case 0:
                    System.out.println("Bye!!!");
                    System.exit(0);
                case 1:
                    q.nhap();
                    break;
                case 2:
                    q.hienthi();
                    break;
                case 3:
                    q.luu(fname);
                    break;
                case 4:
                    q.doc(fname);
                    break;
                case 5:
                    q.timTheoHang();
                    break;
                case 6:
                    q.timTheoMau();
                    break;
                case 7:
                    q.timTheoGia();
                    break;
                case 8:
                    q.sua();
                    break;
                case 9:
                    q.xoa();
                    break;
                case 10:
                case 11:
                case 12:
                default:
                    System.out.println("Ban chi chon 0-12");
                    break;

            }

        }
    }
}
