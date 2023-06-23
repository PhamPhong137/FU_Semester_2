/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-Phong
 */
import java.util.Arrays;
import java.util.Scanner;

public class btchapter2array {

    public static void main(String[] args) {
        //Bai1(mang-so)
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap so phan tu: n=");
//        int n = sc.nextInt();
//        float[] a = new float[n];
//        for (int i = 0; i < n; i++) {
//            System.out.format("a[%d]=", i);
//            a[i] = sc.nextFloat();
//
//        }
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (a[j] > a[j + 1]) {//be đến lớn 
//                    float swap = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = swap;
//                }
//            }
//        }
//        for (float i : a) {
//            System.out.print(i + " ");
//        }
        //(mang-chuoi)
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        String[] words = new String[n];
        System.out.printf("Vui long nhap %d chuoi:\n",n);
        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.nextLine();
            
        }
        Arrays.sort(words);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(words));
        scanner.close();

        //bài2
//        Scanner sc=new Scanner(System.in);
//        float a[];
//        float sum=0;
//        float ave;
//        System.out.print("Nhap so phan tu: n=");
//        int n=sc.nextInt();
//        a= new float[20];
//        for(int i=0;i<n;i++){
//            System.out.format("a[%d]=",i);
//            a[i]=sc.nextFloat();
//            sum+=a[i];
//        }
//        System.out.println(sum);
//        
        //Bai3
//        Scanner sc = new Scanner(System.in);
//        int a[];
//        int i, j;
//        System.out.println("Nhap so phan tu mang:");
//        int n = sc.nextInt();
//        a = new int[n];
//        System.out.println("Nhap mang: ");
//        for (i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        int count = 0;
//        int k;
//        int flag = 0;
//
//        for (i = 0; i < n; i++) {
//            for (j = i + 1; j < n; j++) {
//                if (a[i] == a[j]) {
//                    count ++;
//                    for (k = j; k < n - 1; k++) {
//                        a[k] = a[k + 1];
//
//                    }
//                    n--;
//                    j--;
//
//                }
//
//            }
//            if (count >= 0) {
//                System.out.println("Gia tri " + a[i] + " lặp " + (count + 1) + " lần.");
//                flag = 1;
//                count = 0;
//            }
//
//        }
//        if (flag == 0) {
//            System.out.println("Mang khong co gia tri nao trung lap.");
//        }
        //Bai4 
//         Scanner sc=new Scanner(System.in);
//        float a[];
//        float sum=0;
//        float ave;
//        System.out.print("Nhap so phan tu: n=");
//        int n=sc.nextInt();
//        a= new float[20];
//        for(int i=0;i<n;i++){
//            System.out.format("a[%d]=",i);
//            a[i]=sc.nextFloat();
//            sum+=a[i];
//        }
//        ave=(float)(sum/n);
//        
//        System.out.println(ave);
        //Bai5 (Tìm phần tử lớn thứ hai)
//         Scanner sc=new Scanner(System.in);
//        float a[];
//        System.out.print("Nhap so phan tu: n=");
//        int n=sc.nextInt();
//        a= new float[n];
//        for(int i=0;i<n;i++){
//            System.out.format("a[%d]=",i);
//            a[i]=sc.nextFloat();
//         }
//        Arrays.sort(a);
//        System.out.println(a[n-2]);
        //bai6
//           Scanner sc=new Scanner(System.in);
//        float a[];
//        System.out.print("Nhap so phan tu: n=");
//        int n=sc.nextInt();
//        a= new float[n];
//        for(int i=0;i<n;i++){
//            System.out.format("a[%d]=",i);
//            a[i]=sc.nextFloat();
//         }
//        Arrays.sort(a);
//        System.out.println(a[1]);
        //bai7:tìm gia tri trung lap
//        Scanner sc = new Scanner(System.in);
//
//        double []a1 = new double[100];
//        double []a2 = new double[100];
//       
//        System.out.println("Nhap so phan tu cua day 1:");
//        int n1 = sc.nextInt();
//        for (int i = 0; i < n1; i++) {
//            a1[i] = sc.nextDouble();
//        }
//        System.out.println("Nhap so phan tu cua day 2");
//        int n2 = sc.nextInt();
//        for (int i = 0; i < n2; i++) {
//            a2[i] = sc.nextDouble();
//        }
//        for (int i = 0; i < n1; i++) {
//            for (int j = 0; j < n2; j++) {
//                if (a2[j] == a1[i]) {
//                    System.out.print(a2[j]);
//                }
//            }
//        }



    }

}
