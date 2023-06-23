/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.*;

/**
 *
 * @author PC-Phong
 */
public class AntiqueShop {

    public static void main(String[] args) {
        String[] options = {"Create a Vase", "Create a Statue", "Create a Painting", "Display the Item","Exit"};
        Item item = null;
        int choice = 0;
        do {
            while (true) {
                try {
                    choice = Menu.getChoice(options);
                    if(choice<=0 ||choice>5){
                        throw new Exception() ;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Input option again ");
                    
                }
            }
            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase) item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPainting();
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase) {
                            ((Vase) item).outputVase();
                        } else if (item instanceof Statue) {
                            ((Statue) item).outputStatue();
                        } else if (item instanceof Painting) {
                            ((Painting) item).outputPainting();
                        }
                    } else {
                        System.out.println("You need to create an object");
                    }
                    break;
                case 5:
                    System.exit(0);
            }

        } while (choice <=4);
    }
}
