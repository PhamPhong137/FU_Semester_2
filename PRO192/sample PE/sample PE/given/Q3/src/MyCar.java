
import java.util.ArrayList;
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
public class MyCar implements ICar{

    @Override
    public int f1(List<Car> t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void f2(List<Car> t) {
        Collections.swap(t, 0, 4);
        Collections.swap(t, 1, 3);
    }

    @Override
    public void f3(List<Car> t) {
      ArrayList<Car> listcar = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listcar.add(t.get(i));
           
        }
        Collections.sort(listcar, new Comparator<Car>() {
          @Override
          public int compare(Car o1, Car o2) {
              int a=o2.getMaker().compareTo(o1.getMaker());
              
              if(a!=0){
                  return a;
              }else{
                  return o2.getRate()-o1.getRate();
              }
          }
      });
        for (int i = 5; i < t.size(); i++) {
            listcar.add(t.get(i));
        }
        t.clear();
        t.addAll(listcar);
        
            
      
    }
    
}
