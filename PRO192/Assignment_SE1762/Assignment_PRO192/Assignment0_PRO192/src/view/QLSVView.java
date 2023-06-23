package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.Student;


import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.Action;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JRadioButton;
import java.awt.Color;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.Student;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import java.awt.ScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import java.awt.GridLayout;
import javax.swing.JRadioButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JCheckBox;

public class QLSVView extends JFrame {

	private JPanel contentPane;
	public QLSVModel model;
	public JTextField textField;
	public JTable table;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_5;
	public JTextField textField_6;
	public JTextField textField_7;
	public JTextField textField_8;
	public ButtonGroup btg;
	public JRadioButton rdbtnNewRadioButton;
	public JRadioButton rdbtnNewRadioButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		setBackground(new Color(0, 0, 255));
		setFont(new Font("Dialog", Font.PLAIN, 20));
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Users\\Dell\\Downloads\\computer-program-icon-17.png"));
		setTitle("Student Management Program ");
		this.model = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 532);
		ActionListener action = new QLSVController(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Search or Delete", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		horizontalBox.setBounds(10, 11, 947, 50);
		contentPane.add(horizontalBox);

		JLabel lblNewLabel = new JLabel("              Student ID                    ");
		horizontalBox.add(lblNewLabel);

		textField = new JTextField();
		horizontalBox.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(action);
		horizontalBox.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(action);
		horizontalBox.add(btnNewButton_1);

		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1
				.setBorder(new TitledBorder(null, "Function", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		horizontalBox_1.setBounds(10, 439, 947, 45);
		contentPane.add(horizontalBox_1);

		JButton btnNewButton_4 = new JButton("Enter Student");
		btnNewButton_4.addActionListener(action);
		horizontalBox_1.add(btnNewButton_4);

		JLabel lblNewLabel_9_1 = new JLabel("                       ");
		horizontalBox_1.add(lblNewLabel_9_1);

		JButton btnNewButton_2 = new JButton("Print List");
		btnNewButton_2.addActionListener(action);
		horizontalBox_1.add(btnNewButton_2);

		JLabel lblNewLabel_9_1_1 = new JLabel("                        ");
		horizontalBox_1.add(lblNewLabel_9_1_1);

		JButton btnNewButton_3 = new JButton("Add Student");
		btnNewButton_3.addActionListener(action);
		horizontalBox_1.add(btnNewButton_3);

		JLabel lblNewLabel_9_1_2 = new JLabel("                          ");
		horizontalBox_1.add(lblNewLabel_9_1_2);

		JButton btnNewButton_3_1 = new JButton("Result");
		btnNewButton_3_1.addActionListener(action);
		horizontalBox_1.add(btnNewButton_3_1);

		JLabel lblNewLabel_9_1_3 = new JLabel("                        ");
		horizontalBox_1.add(lblNewLabel_9_1_3);

		JButton btnNewButton_3_2 = new JButton("Status");
		btnNewButton_3_2.addActionListener(action);
		horizontalBox_1.add(btnNewButton_3_2);

		JLabel lblNewLabel_9_1_3_1 = new JLabel("                       ");
		horizontalBox_1.add(lblNewLabel_9_1_3_1);

		JButton btnNewButton_5 = new JButton("Print File");
		btnNewButton_5.addActionListener(action);
		horizontalBox_1.add(btnNewButton_5);

		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2
				.setBorder(new TitledBorder(null, "List Students", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		horizontalBox_2.setBounds(10, 67, 947, 237);
		contentPane.add(horizontalBox_2);
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"No", "Student ID", "Full Name", "Sex", "Progress Test", "Assignment", "Work Shop", "Practical Exam", "Final Exam", "Result", "Status"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(27);
		table.getColumnModel().getColumn(1).setPreferredWidth(76);
		table.getColumnModel().getColumn(2).setPreferredWidth(119);
		table.getColumnModel().getColumn(3).setPreferredWidth(32);
		table.getColumnModel().getColumn(8).setPreferredWidth(59);
		table.setRowHeight(15);
		JScrollPane scrollPane = new JScrollPane(table);
		horizontalBox_2.add(scrollPane);

		Box horizontalBox_3 = Box.createHorizontalBox();
		horizontalBox_3
				.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		horizontalBox_3.setBounds(10, 315, 947, 113);
		contentPane.add(horizontalBox_3);

		JPanel panel = new JPanel();
		horizontalBox_3.add(panel);
		panel.setLayout(new GridLayout(4, 4));

		JLabel lblNewLabel_2 = new JLabel("             Student ID:");
		panel.add(lblNewLabel_2);

		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("                          Assignment:");
		panel.add(lblNewLabel_5);

		textField_5 = new JTextField();
		panel.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("             Full Name:");
		panel.add(lblNewLabel_1);

		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("                          Workshop:");
		panel.add(lblNewLabel_4);

		textField_3 = new JTextField();
		panel.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("             Sex:");
		panel.add(lblNewLabel_3);

		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addActionListener(action);
		panel_1.add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.addActionListener(action);
		panel_1.add(rdbtnNewRadioButton_1);
		btg = new ButtonGroup();
		btg.add(rdbtnNewRadioButton_1);
		btg.add(rdbtnNewRadioButton);
		JLabel lblNewLabel_7 = new JLabel("                          Practical Exam:");
		panel.add(lblNewLabel_7);

		textField_6 = new JTextField();
		panel.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("             Progress Test:");
		panel.add(lblNewLabel_6);

		textField_7 = new JTextField();
		panel.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("                          Final Exam:");
		panel.add(lblNewLabel_8);

		textField_8 = new JTextField();
		panel.add(textField_8);
		textField_8.setColumns(10);

		this.setVisible(true);
	}

	public void xoaForm() {
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_5.setText("");
		textField_6.setText("");
		textField_7.setText("");
		textField_8.setText("");
		btg.clearSelection();

	}

	public Student getStudent() {
		String studentID = this.textField_1.getText();
		String fullName = this.textField_2.getText();
		float workshop = Float.valueOf(this.textField_3.getText());
		float assign = Float.valueOf(this.textField_5.getText());
		float prac = Float.valueOf(this.textField_6.getText());
		float progress = Float.valueOf(this.textField_7.getText());
		float finalexam = Float.valueOf(this.textField_8.getText());
		String sex = "";
		if (this.rdbtnNewRadioButton.isSelected()) {
			sex = this.rdbtnNewRadioButton.getText();
		} else if (this.rdbtnNewRadioButton_1.isSelected()) {
			sex = this.rdbtnNewRadioButton_1.getText();
		}
		Student st = new Student(studentID, fullName, sex, progress, assign, workshop, prac, finalexam);
		return st;
	}

	public void themVaoDanhSach() {
		Student st = getStudent();
		this.model.insert(st);
		DefaultTableModel modele = (DefaultTableModel) table.getModel();
		int h= Integer.valueOf(modele.getRowCount());
		modele.addRow(new Object[] { h+1,st.getStudentID(), st.getFullName(), st.getSex(), st.getProgressTest(),
					st.getAssignment(), st.getWorkShop(), st.getPracticalExam(), st.getFinalExam() });
		
		}
	int count=0;
	
	public void inDanhSach() {
		
		int i=0;
		DefaultTableModel modele = (DefaultTableModel) table.getModel();
		int h=modele.getRowCount();
		
			for(int j=0;j<h;j++) {
				modele.removeRow(0);
			}
		
		ArrayList<Student> std=this.model.getListStudent();
		for (Student st: std ) {
			i++;
			modele.addRow(new Object[] { i,st.getStudentID(), st.getFullName(), st.getSex(), st.getProgressTest(),
					st.getAssignment(), st.getWorkShop(), st.getPracticalExam(), st.getFinalExam() });
		}
	}
	public void nhapSinhVien() {
		Student st = getStudent();
		this.model.insert(st);
	}
	public void xoaSinhVien() {
		String xoaSV=this.textField.getText();
		DefaultTableModel modele = (DefaultTableModel) table.getModel();
		int h=modele.getRowCount();
		ArrayList<Student> std=this.model.getListStudent();
		for (Student s: std ) {
			if(s.getStudentID().equals(xoaSV)) {
				this.model.delete(s);
				break;
			}
		}
		for(int j=0;j<h;j++) {
			modele.removeRow(0);
		}
		int i=0;
		for (Student st: std ) {
			i++;
			modele.addRow(new Object[] { i,st.getStudentID(), st.getFullName(), st.getSex(), st.getProgressTest(),
					st.getAssignment(), st.getWorkShop(), st.getPracticalExam(), st.getFinalExam() });
		}
		
	}
	public void timkiemSinhVien() {
		String timSV=this.textField.getText();
		int i=1;
		Student st=null;
		DefaultTableModel modele = (DefaultTableModel) table.getModel();
		int h=modele.getRowCount();
		ArrayList<Student> std=this.model.getListStudent();
		for (Student s: std ) {
			if(s.getStudentID().equals(timSV)) {
				st=s;
			}
		}
		for(int j=0;j<h;j++) {
			modele.removeRow(0);
		}
		modele.addRow(new Object[] { i,st.getStudentID(), st.getFullName(), st.getSex(), st.getProgressTest(),
				st.getAssignment(), st.getWorkShop(), st.getPracticalExam(), st.getFinalExam() });
		
	}
	public void result() {
		DefaultTableModel modele = (DefaultTableModel) table.getModel();
		int h=modele.getRowCount();
		for(int j=0;j<h;j++) {
			modele.removeRow(0);
		}
		int i=0;
		Float fn;
		ArrayList<Student> stdt=this.model.getListStudent();
		for (Student st: stdt ) {
			i++;
			fn=(float)(0.1*st.getProgressTest()+0.1*st.getAssignment()+0.1*st.getWorkShop()+0.4*st.getPracticalExam()+0.3*st.getFinalExam());
			modele.addRow(new Object[] { i,st.getStudentID(), st.getFullName(), st.getSex(), st.getProgressTest(),
					st.getAssignment(), st.getWorkShop(), st.getPracticalExam(), st.getFinalExam(),fn });
		}
	}
	public void status() {
		DefaultTableModel modele = (DefaultTableModel) table.getModel();
		int h=modele.getRowCount();
		for(int j=0;j<h;j++) {
			modele.removeRow(0);
		}
		int i=0;
		Float fn;
		ArrayList<Student> stdt=this.model.getListStudent();
		for (Student st: stdt ) {
			i++;
			String s="";
			fn=(float)(0.1*st.getProgressTest()+0.1*st.getAssignment()+0.1*st.getWorkShop()+0.4*st.getPracticalExam()+0.3*st.getFinalExam());
			if(fn>5&&st.getFinalExam()>=4&&st.getProgressTest()>0&&st.getPracticalExam()>0&&st.getAssignment()>0&&st.getWorkShop()>0) {
				s="  Completed";
			}else {
				s="  Incompleted";
			}
			modele.addRow(new Object[] { i,st.getStudentID(), st.getFullName(), st.getSex(), st.getProgressTest(),
					st.getAssignment(), st.getWorkShop(), st.getPracticalExam(), st.getFinalExam(),fn ,s});
		}
	}
	public void luuFile(String path) {
		try {
			this.model.setTenFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			ArrayList<Student> std= this.model.getListStudent();
			for (Student ts : std) {
				oos.writeObject(ts);
			}
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void thluuFile() {
		if(this.model.getTenFile().length()>0) {
			luuFile(this.model.getTenFile());
		}else {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				luuFile(file.getAbsolutePath());
			} 
		}
	}
}

