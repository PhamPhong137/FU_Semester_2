package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.QLSVView;

public class QLSVController implements ActionListener {
	public QLSVView view;

	public QLSVController(QLSVView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào: "+cm);
		if(cm.equals("Add Student")) {
			this.view.themVaoDanhSach();
			this.view.xoaForm();
		}else if(cm.equals("Print List")) {
			this.view.inDanhSach();
		}else if(cm.equals("Enter Student")) {
			this.view.nhapSinhVien();
			this.view.xoaForm();
		}else if(cm.equals("Delete")) {
			this.view.xoaSinhVien();
		}else if(cm.equals("Search")){
			this.view.timkiemSinhVien();
		}else if(cm.equals("Result")) {
			this.view.result();
		}else if(cm.equals("Status")) {
			this.view.status();
		}else if(cm.equals("Print File")){
			this.view.thluuFile();
		}
	}

}