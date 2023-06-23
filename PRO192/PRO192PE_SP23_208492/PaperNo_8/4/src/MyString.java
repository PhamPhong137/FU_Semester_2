/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-Phong
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count = 0;
        int countj = 0;
        String[] s = str.split("\\s+");
        for (int i = 0; i < s.length; i++) {
            char[] s1 = s[i].toCharArray();
            for (int j = 0; j < s1.length; j++) {
                if ("13579".contains(s1[j] + "")) {
                    countj++;
                }
                if (countj == 2) {
                    count++;
                    break;
                }
            }
            countj = 0;
        }
        return count;

    }

    @Override
    public String f2(String str) {
        String output = "";
        int pos = -1;
        String[] s = str.split("\\s+");
        int min = 10000;
        int max=0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() < min) {
                pos = i;
                min = s[i].length();
            }
        }
        for (int i = 0; i < s.length; i++) {
            if(s[i].length()>max){
                max=s[i].length();
            }
        }

        s[pos] = max + "";

        for (int i = 0; i < s.length; i++) {
            output = output + s[i] + " ";
        }
        return output.trim();
    }

}
