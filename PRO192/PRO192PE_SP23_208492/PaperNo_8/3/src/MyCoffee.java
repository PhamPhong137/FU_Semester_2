
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC-Phong
 */
public class MyCoffee implements ICoffee {

    @Override
    public int f1(List<Coffee> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (!(t.get(i).getName().contains("A") || t.get(i).getName().contains("B"))) {
                count++;
            }
        }

        return count;
    }

    @Override
    public void f2(List<Coffee> t) {
        int min = t.get(0).getSize();
        for (int i = 1; i < t.size(); i++) {
            if (t.get(i).getSize() < min) {
                min = t.get(i).getSize();
            }
        }
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getSize() == min) {
                t.remove(i);

                break;
            }
        }
    }

    @Override
    public void f3(List<Coffee> t) {
        Collections.sort(t.subList(0, 3), new Comparator<Coffee>() {
            @Override
            public int compare(Coffee o1, Coffee o2) {
                return o1.getSize() % 10 - o2.getSize() % 10;
            }
        });
    }

}
