/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author PC-Phong
 */
public class StudentManager {

    public static void main(String[] args) {
        StudentList sl = new StudentList();
        Inputter v = new Inputter();
        Menu m = new Menu();
        while (true) {
            m.getChoice();
            int chon = v.checkMenu();
            switch (chon) {
                case 1:
                    sl.addStudent();
                    break;
                case 2:
                    sl.searchStudent();
                    break;
                case 3:
                    sl.updateStudent();
                    break;
                case 4:
                    sl.removeStudent();
                    break;
                case 5:
                    sl.printAll();
                    break;
                case 6:
                    System.out.println("Bye!!!");
                    System.exit(0);
                default:
                    System.out.println("Ban chi chon 0-6");
                    break;

            }

        }
    }

}
