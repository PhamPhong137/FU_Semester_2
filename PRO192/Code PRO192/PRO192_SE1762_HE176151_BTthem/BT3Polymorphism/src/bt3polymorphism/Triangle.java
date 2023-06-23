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
public class Triangle extends Shape {

    private int base, height;

    public Triangle(String color,int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public String toString() {
        return "Rectangle[base=" + base + ",height=" + height + "," + super.toString() + "]";

    }
    public double getArea(){
        return 0.5*base*height;
    }
}
