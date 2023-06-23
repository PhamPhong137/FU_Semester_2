/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Modal.PTGT;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author PC-Phong
 */
public class QLPT {

    private List<PTGT> list;
    Scanner sc = new Scanner(System.in);

    public QLPT() {
        list = new ArrayList<>();
    }

    public void setList(List<PTGT> list) {
        this.list = list;
    }

    //check ma trung
    private int vitri(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)) {
                return i;
            }
        }

        return -1;
    }

    //Nhap 1 PT
    public void nhap() {

        String re = "^[AB]{1}\\d{4}";
        String ma, hang, mau;
        int nam;
        double gia;
        while (true) {
            try {
                System.out.print("ma: ");
                ma = sc.nextLine().toUpperCase();
                if ((vitri(ma) == -1 && ma.matches(re))) {
                    break;
                } else {
                    throw new ValidException("ma trung ma hc khong dung dinh dang");
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        System.out.print("Hang: ");
        hang = sc.nextLine();
        while (true) {
            try {
                System.out.println("nam: ");
                nam = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Nhap 4 so");
            }

        }
        while (true) {
            try {
                System.out.print("gia: ");
                gia = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Nhap so thuc!");
            }

        }
        System.out.print("mau sac:");
        mau = sc.nextLine();

        list.add(new PTGT(ma, hang, nam, gia, mau));

    }

    public void hienthi() {
        System.out.println("DS PTGT");
        for (PTGT p : list) {
            System.out.println(p);
        }
        System.out.println("---------------------");
        System.out.println("Tong so: " + list.size());

    }

    public void luu(String fname) {
        IOFile.ghi(fname, list);

    }

    public void doc(String fname) {
        setList(IOFile.doc(fname));
    }

    //tim theo hang
    public void timTheoHang() {
        int t = 0;
        System.out.println("Nhap hang can tim:");
        String key = sc.nextLine();
        for (PTGT p : list) {
            if (p.getHang().toLowerCase().indexOf(key.toLowerCase()) >= 0) {
                System.out.println(p);
                t = 1;
            }
        }
        if (t == 0) {
            System.out.println("Khong tim thay phuong tien nao");
        }

    }

    // tim theo mau sac
    public void timTheoMau() {
        int t = 0;
        System.out.println("Nhap mau can tim:");
        String mau = sc.nextLine();
        for (PTGT p : list) {
            if (p.getMau().toLowerCase().indexOf(mau.toLowerCase()) >= 0) {
                System.out.println(p);
                t = 1;
            }
        }
        if (t == 0) {
            System.out.println("Khong tim thay phuong tien nao");
        }

    }

    // tim theo giá
    public void timTheoGia() {
        int t = 0;
        double gt, gd;
        while (true) {
            try {
                System.out.println("Nhap tu gia");
                gt = Double.parseDouble(sc.nextLine());
                System.out.println("Nhap den gia");
                gd = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Nhap vào giá là số ");
            }

        }

        for (PTGT p : list) {
            if (p.getGia() >= gt && p.getGia() <= gd) {
                System.out.println(p);
                t = 1;
            }
        }
        if (t == 0) {
            System.out.println("Khong tim thay phuong tien nao");
        }
    }

    public void xoa() {
        System.out.println("Nhap vào mã phương tiện cần xóa:");
        String ma = sc.nextLine();
        int vt = vitri(ma);
        if (vt == -1) {
            System.out.println("Khong tim thay PT có mã để xóa");
        } else {
            PTGT p = list.remove(vt);
            System.out.println(p);
        }

    }

    //sua
    public void sua() {
        System.out.println("Nhap ma PT can sua:");
        String ma = sc.nextLine();
        int vt = vitri(ma);
        if (vt == -1) {
            System.out.println("Khong tim thay PT có mã:");
        } else {
            PTGT p = list.get(vt);
            String hang, mau;
            int nam;
            double gia;
            System.out.print("Hang moi: ");
            hang = sc.nextLine();
            while (true) {
                try {
                    System.out.println("nam moi: ");
                    nam = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Nhap 4 so");
                }

            }
            while (true) {
                try {
                    System.out.print("gia moi: ");
                    gia = Double.parseDouble(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Nhap so thuc!");
                }

            }
            System.out.print("mau sac moi:");
            mau = sc.nextLine();
            
            p.setHang(hang);
            p.setNam(nam);
            p.setMau(mau);
            p.setGia(gia);
            
            System.out.println("sua thanh cong");
        }

    }

}
