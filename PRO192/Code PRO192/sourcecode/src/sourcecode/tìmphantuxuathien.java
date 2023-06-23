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
public class tìmphantuxuathien {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 1, 3, 2};
        int[] count = new int[arr.length];
        int maxCount = 0;
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++; // đếm số lần xuât hiện các phẩn tử trong mảng

            if (count[arr[i]] > maxCount) {
                maxCount = count[arr[i]];
                maxIndex = i;
            }

        }

        System.out.println("Number " + arr[maxIndex] + " appears " + maxCount + " times");
        System.out.println(count[arr[0]]);
        
        for (int i = 0; i < arr.length; i++) {
            if(count[arr[i]]!=0){
                System.out.println(arr[i]+" appears " +count[arr[i]]+" times ");
                count[arr[i]]=0;
            }
        }
        
        
    }
}
