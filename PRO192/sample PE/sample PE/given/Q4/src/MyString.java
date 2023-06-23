
import java.util.ArrayList;

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
//        int sum = 0;
//        char[] s = str.toCharArray();
//        for (int i = 0; i < s.length; i++) {
//            if ("2357".contains(s[i] + "")) {
//                sum += s[i] - '0';
//            }
//        }
//        return sum;
//--------------------------------------------------------//

//        int count = 0;
//        String[] s = str.split("\\s+");
//        for (int i = 0; i < s.length; i++) {
//            char[] s1 = s[i].toCharArray();
//            for (int j = 0; j < s1.length; j++) {
//                if("02468".contains(s1[j]+"")){
//                   count++;
//                   break;
//                }
//            }
//        }
//
//        return count;
//--------------------------------------------------------------//
        int sum = 0;
        String[] s = str.split("\\s+");

        for (int i = 0; i < s.length; i++) {
            if (s[i].matches("\\d+")) {
                char[] s1 = s[i].toCharArray();
                for (int j = 0; j < s1.length; j++) {
                    sum += s1[j] - '0';
                }
                break;
            }
        }
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i].matches("\\d+")) {
                char[] s2 = s[i].toCharArray();
                for (int j = 0; j < s2.length; j++) {
                    sum += s2[j] - '0';
                }
                break;
            }
        }

        return sum;

    }

    @Override
    public String f2(String str) {
//        int pos = -1;
//        String[] s = str.split("\\s+");
//        for (int i = 0; i < s.length; i++) {
//            if (check(s[i])) {
//                pos = i;
//                break;
//            }
//        }
//        s[pos] = "99";
//        String output = "";
//        for (int i = 0; i < s.length; i++) {
//            output += s[i] + " ";
//        }
//
//        return output.trim();
//-----------------------------------------------------------------//
//    String []s = str.split("\\s+");
//       int count =0;
//       int countmax = 0;
//       String s1 = null;
//        for (int i = 0; i < s.length-1; i++) {
//           for(int j =i+1;j<s.length;j++){
//               if(s[i].equals(s[j])){
//                   count++;
//               }
//           }
//           if(count>countmax){
//               countmax=count;
//               s1=s[i];
//           }
//           count=0;
//        }
//        str=str.replaceAll(s1, "T");
//
//
//    return str.trim();
//-----------------------------------------------------------------------------------;;

//        String[] s = str.split("\\s+");
//        String s1 = null;
//        for (int i = 0; i < s.length; i++) {
//            if (check(s[i]) == true) {
//                s1 = s[i];
//                break;
//            }
//        }
//        
//        str = str.replace(s1, "YY");
//
//        return str.trim();
//--------------------------------------------------------------------------
//        String output = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (!"02468".contains(str.charAt(i) + "")) {
//                output += str.charAt(i);
//            }
//
//        }
//
//        return output.trim();
//        String[] s = str.split("\\s+");
//        int pos = -1;
//        for (int i = 0; i < s.length - 1; i++) {
//            if (s[i].substring(0, 1).compareTo(s[i + 1].substring(0, 1)) > 0) {
//                pos = i;
//                break;
//            }
//        }
//        String output = "";
//        for (int i = 0; i < s.length; i++) {
//            if (i != pos) {
//                output = output + s[i] + " ";
//            }
//        }
//        return output.trim();
//        String[] s = str.split("\\s+");
//        String output = "";
//        for (int i = 0; i < s.length; i++) {
//            if (s[i].matches("\\d+")) {
//                char[] s1 = s[i].toCharArray();
//                for (int j = s1.length - 1; j >= 0; j--) {
//                    output += s1[j];
//                }
//                break;
//            }
//        }
//        output += " ";
//        for (int i = s.length - 1; i >= 0; i--) {
//            if (s[i].matches("\\d+")) {
//                char[] s2 = s[i].toCharArray();
//                for (int j = s2.length - 1; j >= 0; j--) {
//                    output += s2[j];
//                }
//                break;
//            }
//        }
//        return output.trim();
//        String output = "";
//        char[] s = str.toCharArray();
//        for (int i = 0; i < s.length; i++) {
//            if ("0123456789".contains(s[i] + "") || Character.isLetter(s[i])) {
//                output += s[i];
//            }
//        }
//        return output.trim();
        //  }
//    public boolean check(String s) {
//        StringBuffer s1 = new StringBuffer(s);
//        if (s1.reverse().toString().equals(s)) {
//            return true;
//        }
//        return false;
//
//    }
//    public boolean check(String s) {
//        StringBuffer str = new StringBuffer(s);
//        if (str.reverse().toString().equals(s)) {
//            return true;
//        }
//        return false;
//
//    }
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if ("012345678".contains(str.charAt(i) + "")) {
                output += str.charAt(i) - '0' + 1;
            } else {
                output += str.charAt(i);
            }
        }
 
        return output.trim();
    }
}
