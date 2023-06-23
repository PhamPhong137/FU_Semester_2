/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tets7;

/**
 *
 * @author PC-Phong
 */
public class CEx {

    public static void main(String[] args) {
        Base b;
        Sub s1;
        Sub s2;
        s1 = new Sub();
        b = (Base) s1;
        s2 = (Sub) b;
    }
}
