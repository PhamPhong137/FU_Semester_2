/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2.ws5;

/**
 *
 * @author PC-Phong
 */
public class Worker extends Person {
    private double hrs;
    private final double RATE = 5.5;

    public Worker() {
    }

    public Worker(double hrs) {
        this.hrs = hrs;
    }

    public Worker(String name,double hrs) {
        super(name);
        this.hrs = hrs;
    }

   
    public double getHrs() {
        return hrs;
    }

    public void setHrs(double hrs) {
        this.hrs = hrs;
    }
    
    @Override
    
    public double getSalary(){
        return this.hrs *RATE;
    }
    @Override
    public void display(){
        System.out.println(super.getName());
        System.out.println(getSalary());
        
    }
}
