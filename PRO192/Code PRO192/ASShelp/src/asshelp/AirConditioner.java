/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asshelp;

/**
 *
 * @author PC-Phong
 */
public class AirConditioner extends Product {

    private double power;

    public AirConditioner() {
    }

    public AirConditioner(double power) {
        this.power = power;
    }

    

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

}
