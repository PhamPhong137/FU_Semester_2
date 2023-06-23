/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        System.out.println(list.size());
//        list.add("Ha Noi");
//        list.add(78);
//        list.add(1,"chen thu 1");
//        list.add("Ha Noi");
//        System.out.println(list);
//        int vt = list.indexOf("Ha Noi");
//        System.out.println(vt);
//        System.out.println(list.lastIndexOf("Ha Noi"));
//        list.remove(new Integer(78));
//        System.out.println(list);
//        System.out.println(list.get(list.size()-1));
//        list.set(0, new Hocsinh("n877","jonny",1234)); // đè vô vị trí đầu tiên 
//        System.out.println(list);

//        Vector v = new Vector(3, 3);
//        System.out.println(v.capacity());
//        v.add("A");
//        v.add("B");
//        v.add("C");
//        System.out.println(v.capacity());
//        v.add("D");
//        System.out.println(v.capacity());
//        List<Integer> list = new ArrayList<>();// lấy ra sẽ không cần ép kiểu
//        list.add(123);
//        list.add("to an an");
//        list.add(new Hocsinh("b65","laichhu",12));
//        int a = (int)list.get(0);
//        String b=(String)list.get(1);
        List<Hocsinh> list = new ArrayList<>();
        list.add(new Hocsinh("b7", "Bình", 123));
        list.add(new Hocsinh("b8", "Lan", 567));
        list.add(new Hocsinh("b9", "Tho", 900));
        System.out.println("c1");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("c2");
        for (Hocsinh i : list) {
            System.out.println(i);
        }
        System.out.println("c3");
        list.forEach(i -> {
            System.out.println(i);
        });
        System.out.println("c4");
        //Lamda Expresstion
        list.forEach(i-> System.out.println(i));
        System.out.println("c5");
        list.forEach(System.out::println);
        System.out.println("c6");
        for(Iterator<Hocsinh> i = list.iterator();i.hasNext();){
            System.out.println(i.next());
        }
        System.out.println("c7");
        list.stream().forEach(System.out::println);
    }
}
