/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author PC-Phong
 */
public class TestCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Integer(34));
        c.add("Ha Noi");
        c.add(new NhanVien("nv23","binh",123));
        System.out.println(c);
        Iterator i =c.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    
}
