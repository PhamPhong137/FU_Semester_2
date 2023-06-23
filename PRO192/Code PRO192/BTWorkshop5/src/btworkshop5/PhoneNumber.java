/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btworkshop5;

import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class PhoneNumber {
    Scanner sc= new Scanner(System.in);
    private int area;
    private String number;

    public PhoneNumber() {
    }

    public PhoneNumber(int area, String number) {
        this.area = area;
        this.number = number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
   public void display(){
       System.out.println(this.area +" - "+ this.number);
   }
          
    
}
