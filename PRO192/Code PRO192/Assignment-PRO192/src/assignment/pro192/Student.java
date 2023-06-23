/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pro192;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Student {

    private String StudentID;
    private String Fullname;
    private String Sex;
    private double ProtessTest;
    private double Assignment;
    private double Workshop;
    private double PracticalExam;
    private double FinalExam;
    private double Result;

    public Student() {
    }

    public Student(String StudentID, String Fullname, String Sex, double ProtessTest, double Assignment, double Workshop, double PracticalExam, double FinalExam) {
        this.StudentID = StudentID;
        this.Fullname = Fullname;
        this.Sex = Sex;
        this.ProtessTest = ProtessTest;
        this.Assignment = Assignment;
        this.Workshop = Workshop;
        this.PracticalExam = PracticalExam;
        this.FinalExam = FinalExam;

    }

    public Student(double Result) {
        this.Result = Result;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public double getProtessTest() {
        return ProtessTest;
    }

    public void setProtessTest(double ProtessTest) {
        this.ProtessTest = ProtessTest;
    }

    public double getAssignment() {
        return Assignment;
    }

    public void setAssignment(double Assignment) {
        this.Assignment = Assignment;
    }

    public double getWorkshop() {
        return Workshop;
    }

    public void setWorkshop(double Workshop) {
        this.Workshop = Workshop;
    }

    public double getPracticalExam() {
        return PracticalExam;
    }

    public void setPracticalExam(double PracticalExam) {
        this.PracticalExam = PracticalExam;
    }

    public double getFinalExam() {
        return FinalExam;
    }

    public void setFinalExam(double FinalExam) {
        this.FinalExam = FinalExam;
    }

    @Override
    public String toString() {
        return "StudentID= " + StudentID + ", Fullname= " + Fullname + ", Sex= " + Sex + ", ProtessTest= " + ProtessTest + ", Assignment= " + Assignment + ", Workshop= " + Workshop + ", PracticalExam= " + PracticalExam + ", FinalExam= " + FinalExam;
    }

    public double getResult() {
        return Math.round(ProtessTest * 0.1f + Assignment * 0.1f + Workshop * 0.1f + PracticalExam * 0.4f + FinalExam * 0.3f);
    }

    public void setResult(double Result) {
        this.Result = Result;
    }

    public String checkComplete() {        
        if (getProtessTest() <= 0 || getAssignment() <= 0 || getWorkshop() <= 0
                || getPracticalExam() <= 0 || getFinalExam() < 4 || getResult() < 5) {
            return "incompleted";
        } else {
            return "completed";
        }

    }

    public String writeStudenttoFile() {
        return "StudentID= " + StudentID + ", Fullname= " + Fullname + ", Sex= "
                + Sex + ", ProtessTest= " + ProtessTest + ", Assignment= "
                + Assignment + ", Workshop= " + Workshop + ", PracticalExam= "
                + PracticalExam + ", FinalExam= " + FinalExam + ", Result= " + getResult()+" "+ checkComplete();

    }

}
