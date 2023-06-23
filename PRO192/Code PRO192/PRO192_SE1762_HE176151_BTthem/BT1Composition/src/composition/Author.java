/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Author {

    private String name;
    private String email;
    private char gender;

    public Author() {
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void checkChar() {
        Scanner sc = new Scanner(System.in);
        while (true) {
          
            char c = sc.next().charAt(0);
            try {
                if (c == 'm' || c == 'f') {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Input again");
            }
        }

    }

    @Override
    public String toString() {
        return this.name + " " + "(" + this.gender + ")" + " at " + this.email;
    }
}
