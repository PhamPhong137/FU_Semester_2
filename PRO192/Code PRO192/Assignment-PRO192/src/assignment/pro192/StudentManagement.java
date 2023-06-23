/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pro192;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author PC-Phong
 */
public class StudentManagement {

    Scanner sc = new Scanner(System.in);
    int n;
    Validate v = new Validate();

    public void thongTin(ArrayList<Student> list) {
        System.out.print("Nhập StudentID: ");
        String ID = v.checkString();
        System.out.print("Nhập fullName: ");
        String fullName = v.checkString();
        System.out.print("Nhập giới tính (male or female): ");
        String sex = v.checkSex();
        System.out.print("Nhập điểm Progress test: ");
        double pt = v.checkMark();
        System.out.print("Nhập điểm Assignment: ");
        double as = v.checkMark();
        System.out.print("Nhập điểm Workshop: ");
        double ws = v.checkMark();
        System.out.print("Nhập điểm Practical Exam: ");
        double pe = v.checkMark();
        System.out.print("Nhập điểm Final exam: ");
        double fe = v.checkMark();
        Student student = new Student(ID, fullName, sex, pt, as, ws, pe, fe);
        list.add(student);
    }

    public void inputStudent(ArrayList<Student> list) {
        System.out.print("Nhập số lượng sinh viên: ");
        n = v.checkSoluong();
        int i = 0;
        while (i < n) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            thongTin(list);
            i++;
        }
    }

    public void outputStudent(ArrayList<Student> list) {
        System.out.println("Danh sách sinh viên:");
        for (Student i : list) {
            System.out.println(i.toString());
        }
    }

    public void addStudent(ArrayList<Student> list) {
        thongTin(list);
    }

    public void searchStudent(ArrayList<Student> list) {
        System.out.print("Nhập mã sinh viên cần tìm kiếm: ");
        String searchID = v.checkString();

        int a = 1;
        for (Student i : list) {
            if (i.getStudentID().equals(searchID)) {
                System.out.println("Thông tin sinh viên cần tìm: ");
                System.out.println(i.toString());
                a = 0;
                break;
            }
        }
        if (a == 1) {
            System.out.println("Không tìm thấy sinh viên " + searchID);
        }

    }

    public void removeStudent(ArrayList<Student> list) {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String removeID = v.checkString();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student st = list.get(i);
            if (st.getStudentID().equals(removeID)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            list.remove(index);
            System.out.println("Đã xóa sinh viên có mã: " + removeID);
        } else {
            System.out.println("Không tìm thấy sinh viên có mã: " + removeID);
        }
    }

    public void calculateResult(ArrayList<Student> list) {
        for (Student i : list) {
            double progressTest = i.getProtessTest();
            double assignment = i.getAssignment();
            double workshop = i.getWorkshop();
            double practicalExam = i.getPracticalExam();
            double finalExam = i.getFinalExam();
            double result = progressTest * 0.1f + assignment * 0.1f + workshop * 0.1f + practicalExam * 0.4f + finalExam * 0.3f;

            i.setResult(result);
            System.out.println("Fullname: " + i.getFullname() + "StudentID: " + i.getStudentID() + "," + "Result: " + result);
        }
    }

    public void checkStudentComplete(ArrayList<Student> list) {
        for (Student i : list) {
            if (i.getProtessTest() <= 0 || i.getAssignment() <= 0 || i.getWorkshop() <= 0
                    || i.getPracticalExam() <= 0 || i.getFinalExam() < 4 || i.getResult() < 5) {
                System.out.println("Fullname: " + i.getFullname() + " StudentID: " + i.getStudentID() + " - incompleted");
            } else {
                System.out.println("Fullname: " + i.getFullname() + " StudentID: " + i.getStudentID() + " - completed");
            }
        }
    }

    public void printFile(ArrayList<Student> list) {
        try {
            FileWriter myWriter = new FileWriter("student.txt");
            for (Student i : list) {
                myWriter.write(i.writeStudenttoFile());
                myWriter.write("\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
