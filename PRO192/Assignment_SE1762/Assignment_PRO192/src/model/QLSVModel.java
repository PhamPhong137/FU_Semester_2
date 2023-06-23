package model;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class QLSVModel {
private ArrayList listStudent;
private String tenFile="";


public String getTenFile() {
	return tenFile;
}
public void setTenFile(String tenFile) {
	this.tenFile = tenFile;
}
public QLSVModel() {
	this.listStudent = new ArrayList();
	this.tenFile="";
}
public QLSVModel(ArrayList listStudent) {
	this.listStudent = listStudent;
}
public ArrayList getListStudent() {
	return listStudent;
}
public void setListStudent(ArrayList listStudent) {
	this.listStudent = listStudent;
}
public void insert(Student student) {
	this.listStudent.add(student);
}
public void delete(Student student) {
	this.listStudent.remove(student);
}

    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeRow(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
