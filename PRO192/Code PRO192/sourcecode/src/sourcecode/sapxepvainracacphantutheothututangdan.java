/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.Scanner;
import javafx.print.Collation;

/**
 *
 * @author PC-Phong
 */
public class sapxepvainracacphantutheothututangdan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String[] list = txt.split("\\s+");
        List<String> listS = new ArrayList<>();
        for (String o : list) {
            listS.add(o);
        }
        Collections.sort(listS, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);

            }

        });
        for (String o : listS) {
            System.out.println(o);
        }

    }
}
