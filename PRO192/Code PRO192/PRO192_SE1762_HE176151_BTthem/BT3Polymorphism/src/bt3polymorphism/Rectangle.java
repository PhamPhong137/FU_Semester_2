/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3polymorphism;

/**
 *
 * @author PC-Phong
 */
public class Rectangle extends Shape {
    private int length, width;

    public Rectangle(String color, int width,int length) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    public String toString(){
        return "Rectangle[length=" + length + ",width="+ width +","+super.toString()+"]";
    }
    public double getArea(){
        return length * width;
    }
    
    
}
