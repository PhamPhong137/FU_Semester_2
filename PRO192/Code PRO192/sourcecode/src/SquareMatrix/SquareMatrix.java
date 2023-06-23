/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SquareMatrix;

import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class SquareMatrix {

    private double[][] a;

    public SquareMatrix(int n) {
        a = new double[n][n];
    }

    public int getSize() {
        return a.length;
    }

    public void setA(double[][] a) {
        this.a = a;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma tran vuong:");
        for (int i = 0; i < getSize(); i++) {
            for (int j = 0; j < getSize(); j++) {
                a[i][j] = sc.nextDouble();
            }
        }
    }

    public void out() {
        for (int i = 0; i < getSize(); i++) {
            for (int j = 0; j < getSize(); j++) {
                System.out.println(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public double[][] trans() {
        double[][] t = new double[getSize()][getSize()];
        for (int i = 0; i < getSize(); i++) {
            for (int j = 0; j < getSize(); j++) {
                t[i][j] = a[j][i];
            }
        }

        return t;
    }
    
  

}
