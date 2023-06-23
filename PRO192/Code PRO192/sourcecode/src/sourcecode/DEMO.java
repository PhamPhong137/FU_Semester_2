/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode;

/**
 *
 * @author PC-Phong
 */
public class DEMO {

    public static void main(String[] args) {
        String txt1 = "PhOng";
        String txt2 = "PhoNG";
        
        if(txt1.equalsIgnoreCase(txt2)){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
    }
}
