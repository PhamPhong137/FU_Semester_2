/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmanager;

/**
 *
 * @author PC-Phong
 */
public class Car {
    private String Colour;
    private int Enginepower;
    private boolean Convertible;
    private boolean ParkingBrake;

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public int getEnginepower() {
        return Enginepower;
    }

    public void setEnginepower(int Enginepower) {
        this.Enginepower = Enginepower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public boolean isParkingBrake() {
        return ParkingBrake;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }

    public Car() {
    }
    

    public Car(String Colour, int Enginepower, boolean Convertible, boolean ParkingBrake) {
        this.Colour = Colour;
        this.Enginepower = Enginepower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");
    }
    public void output(){
        System.out.println("Colour : "+ this.Colour+"\nEngine Power : "+ this.Enginepower+"\nConvertible : "+this.Convertible+"\nParking Brake : "+this.ParkingBrake);
    }
    }
    
    

