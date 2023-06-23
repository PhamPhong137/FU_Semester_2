/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class quickSort {

    public static int partition(int a[], int begin, int end) {
        int pivot = a[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (a[j] <= pivot) {
                i++;
                int swap = a[i];
                a[i] = a[j];
                a[j] = swap;
            }

        }
        int swap = a[i + 1];
        a[i + 1] = a[end];
        a[end] = swap;

        return i + 1;

    }

    public static void quickSort(int a[], int begin, int end) {
        if (begin < end) {
            int partition = partition(a, begin, end);

            quickSort(a, begin, partition - 1);
            quickSort(a, partition + 1, end);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu cua mang");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();

        }
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }

}
