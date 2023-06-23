/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Item {

    Scanner sc = new Scanner(System.in);
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int checkValue() {
        int valueItem;

        while (true) {
            try {
                System.out.print("Enter the value of the item: ");
                valueItem = Integer.parseInt(sc.nextLine());
                setValue(valueItem);
                if (valueItem <= 0) {
                    throw new NumberFormatException("Value must be greater than 0.");
                }
                return valueItem;

            } catch (NumberFormatException e) {
                System.err.println("Input again ");

            }

        }

    }

    public String checkCreator() {
        String creatorItem;
        while (true) {
            try {
                System.out.print("Enter the creator of the item: ");
                creatorItem = sc.nextLine();
                
                setCreator(creatorItem);
                String m = creatorItem.trim();
              
                if (m.isEmpty()) {
                    throw new NullPointerException();
                } else {
                    return creatorItem;
                }
            } catch (NullPointerException e) {
                System.err.println("Input again ");
            }
        }

    }

    public void input() {
        checkValue();
        checkCreator();

    }

    public void output() {
        System.out.println("Value: " + this.value + "\n" + "Creator: " + this.creator);
    }

}
