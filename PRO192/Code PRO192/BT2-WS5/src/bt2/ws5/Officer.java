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
public class Officer extends Person {
    private double bSalary;

    public Officer() {
    }
    
    public Officer(String name, double bSalary ) {
        super(name);
        this.bSalary = bSalary;
    }

    

    public double getbSalary() {
        return bSalary;
    }

    public void setbSalary(double bSalary) {
        this.bSalary = bSalary;
    }
    public void display(){
        
    }
    @Override
    public double getSalary(){
        return 0;
            
     }
    
    
}
