/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtunt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author PC-Phong
 */
public class StringTuNT {

    public void sapxepchuoisaukhitach() {
        String str = "Today is Monday";
        String[] sub_str = str.split("//s+");
        //cach1
//        Arrays.sort(sub_str);
//        System.out.println("Mang sau khi sap xep: " + Arrays.toString(sub_str));
        //Cach2
        List<String> list = Arrays.asList(sub_str);
        Collections.sort(list);
        System.out.println(list);
    }

    public void xacdinhvitrixaucon() {
        String str = "Today is Monday";
        String sub_str = "day";
        int first_index = str.indexOf(sub_str);
        int last_index = str.lastIndexOf(sub_str);
        System.out.println("first_index = " + first_index + "," + "last_index = " + last_index);
    }

    public void thaythexau() {
        String str = "Now is Monday and tomorrow is Tuesday";
        String sub_str = "day";
        String sub_str2 = "";
        String replaceString = str.replace(sub_str, sub_str2);
        System.out.println(replaceString);
    }

    public void tinhtongString() {
        String str = "12|3|4|6|1";
        String[] sub_str = str.split("\\|");
        int sum = 0;
        int[] arr = new int[str.length()];
        for (int i = 0; i < sub_str.length; i++) {
            arr[i] = Integer.parseInt(sub_str[i]);
            sum += arr[i];
        }
        System.out.println("Tong la: " + sum);
    }

    public void demsolanxuathien() {
        String str = "abc 1mmmxy";
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                count[c - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + count[i]);
            }
        }

    }

    public void travekituso() {
        String str = "s123a2";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//                count++;
//            }
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void traveso() {
        String str = "7s12t3a25";
        String[] numbers = str.split("\\D+");
        int[] arr = new int[numbers.length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            try {
                arr[i] = Integer.parseInt(numbers[i]);
                count++;
            } catch (Exception e) {
            }
        }
        System.out.println(count);
    }

    public void tinhtongchusotrongchuoi() {
        String str = "s123a2";
        int sum = 0;
        String[] numbers = str.split("");
        for (String s : numbers) {
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.println(sum);
    }

    public void tinhtongsotrongchuoi() {
        String str = "4s12t3a25";
        String[] numbers = str.split("\\D+");
        int sum = 0;
        for (String number : numbers) {
            if (!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }
        System.out.println("Sum of numbers in string " + str + " is: " + sum);

    }

    public void maxmintrongxau() {
        String str = "456s5h6r";
        String[] numbers = str.split("\\D+");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String number1 : numbers) {
            try {
                int number = Integer.parseInt(number1);
                max = Math.max(max, number);
                min = Math.min(min, number);
            }catch (NumberFormatException e) {
            }
        }
        System.out.println("Max= " + max);
        System.out.println("Min= " + min);
    }

    public void solanxuathienxaucon() {

    }

    public void daonguocxau() {
        String s = "abc";
        //Cach1
//        char[] s1 = s.toCharArray();
//        for(int i=s1.length-1;i>=0;i--){
//            System.out.print(s1[i]);
//        }
        //Cach2
//        StringBuilder input1 = new StringBuilder();
//        input1.append(s);
//        input1 = input1.reverse();
//        System.out.println(input1);
    }
    public void daonguocnuadaucuaxau(){
        String s="s1234a28";
        char[]s1= s.toCharArray();
        for(int i=(s.length()-2)/2;i>=0;i--){
            System.out.print(s1[i]);
        }
        for(int i=(s.length()-1)/2;i<s.length();i++){
            System.out.print(s1[i]);
        }
        System.out.println("");
    }
    public void xoabotudautiendainhat(){
        String s="ab cdef gh fegh ";
        String [] words = s.split("\\s+");
        int maxLength =0;
        int maxIndex=0;
        for (int i=0;i<words.length;i++){
            if(words[i].length()>maxLength){
                maxLength=words[i].length();
                maxIndex =i;
                
            }
        }
        StringBuilder sb =new StringBuilder();
        for (int i=0;i<words.length;i++){
            if(i!=maxIndex){
                sb.append(words[i]).append(" ");
            }
        }
        s=sb.toString();
        System.out.println(s);
        
    }

    public static void main(String[] args) {
        StringTuNT obj = new StringTuNT();
//        obj.sapxepchuoisaukhitach();
//        obj.xacdinhvitrixaucon();
//        obj.thaythexau();
//        obj.tinhtongString();
//        obj.demsolanxuathien();
//        obj.travekituso();
//        obj.traveso();
//        obj.tinhtongchusotrongchuoi();
//        obj.tinhtongsotrongchuoi();\
//        obj.maxmintrongxau();
//        obj.solanxuathienxaucon();
//        obj.daonguocxau();
//        obj.daonguocnuadaucuaxau();
          obj.xoabotudautiendainhat();
    }

}
