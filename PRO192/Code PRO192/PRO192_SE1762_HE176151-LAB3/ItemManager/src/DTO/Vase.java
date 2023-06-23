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
public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String checkMaterial() {
        String materialVase;
        while (true) {
            try {
                System.out.print("Input material of Vase: ");
                materialVase = sc.nextLine();

                setMaterial(materialVase);
                String m = materialVase.trim();

                if (m.isEmpty()) {
                    throw new NullPointerException();
                } else {
                    return materialVase;
                }
            } catch (NullPointerException e) {
                System.err.println("Input again");
            }
        }

    }

    
    public int checkHeight() {
        int heightVase;

        while (true) {
            try {
                System.out.print("Input height of Vase: ");
                heightVase = Integer.parseInt(sc.nextLine());
                setHeight(heightVase);
                if (heightVase <= 0) {
                    throw new NumberFormatException();
                }
                return heightVase;

            } catch (NumberFormatException e) {
                System.err.println("Input again");

            }

        }

    }
    public void inputVase() {
        super.input();
        checkHeight();
        checkMaterial();
        
    }

    public void outputVase() {
        System.out.println("--Vase:");
        output();
        System.out.println("Height Vase: " + getHeight());
        System.out.println("Material Vase: " + getMaterial());
    }
}
