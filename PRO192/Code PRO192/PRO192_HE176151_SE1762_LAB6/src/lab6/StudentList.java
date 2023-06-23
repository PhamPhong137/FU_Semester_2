/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class StudentList {

    Inputter v = new Inputter();
    private List<Student> list;

    Scanner sc = new Scanner(System.in);

    public StudentList() {

        list = new ArrayList<>();
    }

    public StudentList(List<Student> list) {
        this.list = list;
    }

    private int vitri(String code) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(code)) {
                return i;
            }
        }

        return -1;
    }

    public String inputCode() {

        String re = "^[Ss]\\d{3}$";
        String code;
        while (true) {
            try {
                System.out.print("Student code: ");
                code = sc.nextLine();
                if ((vitri(code) == -1 && code.matches(re))) {
                    break;
                } else {
                    throw new Exception("Mã trùng hoặc không đúng định dạng ");
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        return code;
    }

    public void addStudent() {
        String code = inputCode().toUpperCase();
        String name = v.checkName().toUpperCase();
        int mark = v.checkMark();
        list.add(new Student(code, name, mark));
        System.out.println("Student " + code + " has been added");
    }

    public void searchStudent() {
        int t = 0;
        if (list.isEmpty()) {
            System.out.println("Empty list. No search can be performed!");
        } else {
            System.out.print("Nhap mã số sinh viên càn tìm: ");
            String key = sc.nextLine();
            for (Student p : list) {
                if (p.getCode().equals(key.toUpperCase())) {
                    System.out.println(p);
                    t = 1;
                }
            }
            if (t == 0) {
                System.out.println("Khong tim thay sinh viên có mã số " + key);
            }
        }
    }

    public void updateStudent() {
        int t = 0;
        if (list.isEmpty()) {
            System.out.println("Empty list. No search can be performed!");
        } else {
            System.out.print("Nhap mã số sinh viên càn chỉnh sửa: ");
            String key = sc.nextLine();
            for (Student p : list) {
                if (p.getCode().equals(key.toUpperCase())) {
                    String name;
                    int mark;
                    System.out.print("Old name: " + p.getName());
                    System.out.print(" ,new name: ");
                    name = v.checkName();
                    System.out.print("Old mark: " + p.getMark());
                    System.out.print(" ,new mark: ");
                    mark = v.checkMark();
                    p.setMark(mark);
                    p.setName(name);
                    System.out.println("Đã chỉnh sửa sinh viên có mã số " + key);
                    t = 1;
                }
            }
            if (t == 0) {
                System.out.println("Khong tim thay sinh viên có mã số " + key);
            }
        }

    }

    public void removeStudent() {
        int t = 0;
        if (list.isEmpty()) {
            System.out.println("Empty list. No search can be performed!");
        } else {
            System.out.print("Nhap mã số sinh viên càn xóa: ");
            String key = sc.nextLine();
            for (Student p : list) {
                if (p.getCode().equals(key.toUpperCase())) {
                    if (list.size() == 1) {
                        list.clear();
                    } else {
                        list.remove(p);
                        t = 1;
                        System.out.println("Mã số sinh viên " + key + " đã bị xóa");
                        if (list.isEmpty()) {
                            System.out.println("Danh sách hiện tại trống");
                        }
                    }
                }
            }
            if (t == 0) {
                System.out.println("Khong tim thay sinh viên có mã số " + key);
            }
        }

    }

    public void printAll() {

        if (list.isEmpty()) {
            System.out.println("Emplty list!");
        } else {
            System.out.println("Student list: ");
            for (Student student : list) {
                System.out.println(student);
            }
            System.out.println("---------------------");
            System.out.println("Tong so: " + list.size());
        }

    }

}
