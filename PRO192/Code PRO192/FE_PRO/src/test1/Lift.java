/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author PC-Phong
 */
public class Lift extends Ladder{
    
    public final void step(){
        System.out.println("Lift");
    }
    public static void main(String[] args) {
        new Lift().step();
    }
}
