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
public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int value, String creator, int height, int width, boolean watercolour, boolean isframed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = watercolour;
        this.isFramed = isframed;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void inputPainting() {
        input();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input height of Painting: ");
                int heightPaint = Integer.parseInt(sc.nextLine());
                setHeight(heightPaint);
                if(heightPaint<=0){
                    throw new Exception() ;
                }
                break;
            } catch (Exception e) {
                System.err.println("Input again ");

            }
        }
        while (true) {
            try {
                System.out.print("Input width of Painting: ");
                int widthPaint = Integer.parseInt(sc.nextLine());
                setWidth(widthPaint);
                if(widthPaint<=0){
                    throw new Exception() ;
                }
                break;
            } catch (Exception e) {
                System.err.println("Input again ");

            }
        }
        while (true) {
            try {
                System.out.println("Is watercolour ?(true or false) ");
                boolean iswatercolourPaint = sc.nextBoolean();
                setIsWatercolour(iswatercolourPaint);
                break;
            } catch (Exception e) {
                System.err.println("Input again ");
                sc.nextLine();
            }
        }
        while (true) {
            try {
                System.out.println("Is Framed ?(true or false) ");
                boolean isframedPaint = sc.nextBoolean();
                setIsFramed(isframedPaint);
                break;
            } catch (Exception e) {
                System.err.println("Input again");
                sc.nextLine();
            }
        }
    }

    public void outputPainting() {
        System.out.println("--Painting:");
        output();
        System.out.println("Height Painting: " + getHeight());
        System.out.println("Width Painting: " + getWidth());
        System.out.println("Is watercolour: " + isIsWatercolour());
        System.out.println("Is framed: " + isIsFramed());
    }
}
