/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-Phong
 */
public class SpecCoffee extends Coffee {

    private int price;

    public SpecCoffee() {
    }

    public SpecCoffee(int price) {
        this.price = price;
    }

    public SpecCoffee(String name, int size, int price) {
        super(name, size);
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() +", " + price;
    }

    public void setData() {
        super.setName("CF" + super.getName());
    }

    public int getValue() {
        if (super.getSize() > 10) {
            return price;
        } else {
            return price + 5;
        }
    }

}
