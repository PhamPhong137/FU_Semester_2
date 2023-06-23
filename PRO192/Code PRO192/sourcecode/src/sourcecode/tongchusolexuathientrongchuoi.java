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
public class tongchusolexuathientrongchuoi {

    public static void main(String[] args) {
        String txt="fagwif357";
       int total=0;
       for(int i=0;i<txt.length();i++){
            if(Character.isDigit(txt.charAt(i))){
                int number = Integer.parseInt(txt.charAt(i)+"");// them "" để thành kiểu String
                if(number %2==1){
                    total=total+number;
                }
            }
       }
        System.out.println(total);
    }

}
