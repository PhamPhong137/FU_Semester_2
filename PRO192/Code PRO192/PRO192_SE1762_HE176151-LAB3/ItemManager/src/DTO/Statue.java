/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author PC-Phong
 */
public class Statue extends Item {

    private int weight;
    private String color;

    public Statue() {
    }

    public Statue(int weight, String color, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return color;
    }

    public void setColour(String color) {
        this.color = color;
    }
    public String checkColourStatue() {
        String colour;
        while (true) {
            try {
                System.out.print("Input the colour of Statue: ");
                colour = sc.nextLine();

                setColour(colour);
                String m = colour.trim();

                if (m.isEmpty()) {
                    throw new NullPointerException();
                } else {
                    return colour;
                }
            } catch (NullPointerException e) {
                System.err.println("Input again");
            }
        }

    }
    public int checkWeightStatue() {
        int weightStatue;

        while (true) {
            try {
                System.out.print("Input weight of Statue: ");
                weightStatue = Integer.parseInt(sc.nextLine());
                setValue(weightStatue);
                if (weightStatue <= 0) {
                    throw new NumberFormatException();
                }
                return weightStatue;

            } catch (NumberFormatException e) {
                System.err.println("Input again ");

            }

        }

    }
    public void inputStatue() {
        input();
        
        checkWeightStatue();
        checkColourStatue();
    }

    public void outputStatue() {
        System.out.println("--Statue: ");
        output();
        System.out.println("Weight Statue: " + getWeight());
        System.out.println("Colour Statue: " + getColour());
    }

}
