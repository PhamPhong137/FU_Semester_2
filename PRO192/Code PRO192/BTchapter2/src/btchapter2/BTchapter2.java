/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btchapter2;

import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class BTchapter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Bai 1
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhap a và b");
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        float c=(float)a/b;
//        int n=(int)(c+0.5);
//        System.out.println("Sau khi làm tròn");
//        System.out.println(n);

        //Bai2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap n ");
//        float n = scanner.nextFloat();
//        int a=(int)n;
//        float b=n-a;
//        System.out.println("Phần nguyên là: " + a);
//        System.out.println("Phần dư là: " + b);
        //Bai3
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap n ");
//        float n = scanner.nextFloat();
//        if(n==(int)n){
//            System.out.println("Là số nguyên");
//        }else{
//            System.out.println("Ko phải số nguyên");
//        }
        //Bai4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap n");
//        double n = sc.nextDouble();
//        System.out.println("Nhap chữ số sau dấu phẩy:");
//        int a=sc.nextInt();
//        double c=Math.pow(10,a);
//        double m=n*c;
//        double x=(Math.round(m))/c;
//        
//        System.out.println(x);
//        
//        
        //Bai5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap n");
//        int n = sc.nextInt();
//        int res = 0;
//        int tmp;
//        while (n > 0) {
//            tmp = n % 10;
//            res = res * 10 + tmp;
//            n = n / 10;
//        }
//        System.out.println(res);
      //  Bai6
//        Scanner sc = new Scanner(System.in);
//        int a[];
//        int k;
//        String LaMa;
//        a = new int[20];
//        System.out.println("Input LaMa number: ");
//        LaMa = sc.nextLine();
//        for (int i = 0; i < LaMa.length(); i++) {
//            if (LaMa.charAt(i) == 'I'){
//                a[i] = 1;
//            }
//            if (LaMa.charAt(i) == 'V') {
//                a[i] = 5;
//            }
//            if (LaMa.charAt(i) == 'X') {
//                a[i] = 10;
//            }
//            if (LaMa.charAt(i) == 'L') {
//                a[i] = 50;
//            }
//            if (LaMa.charAt(i) == 'C') {
//                a[i] = 100;
//            }
//            if (LaMa.charAt(i) == 'D') {
//                a[i] = 500;
//            }
//            if (LaMa.charAt(i) == 'M') {
//                a[i] = 1000;
//            }
//
//        }
//        
//        k = a[LaMa.length() - 1];
//        for (int i = 0; i < LaMa.length() - 1; i++) {
//            if (a[i] < a[i + 1]) {
//                k = k - a[i ];
//            } else if (a[i] == a[i + 1] || a[i] > a[i + 1]) {
//                k = k + a[i ];
//            }
//        }
//        System.out.println(k);
        //bai7
//        Scanner sc=new Scanner(System.in);
//        
//        System.out.println("Nhap n");
//        int n=sc.nextInt();
//        System.out.println("|"+n+"|="+Math.abs(n));
        //bai8
//        Scanner sc=new Scanner(System.in);
//        
//        System.out.println("Nhap n");
//        float n=sc.nextFloat();
//        System.out.println("|"+n+"|="+Math.abs(n));
//        
        //Bai9
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap n");
//        double n = sc.nextDouble();
//        
//        System.out.format("n = %0.3f", n);
        //Bai10
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao chuoi cac so:");
//        String chuoi = sc.nextLine();
//        int sum = 0;
//        float ave;
//        String[] numberString = chuoi.split(" ");
//        int[] numbers = new int[chuoi.length()];
//        for (int i = 0; i < numberString.length; i++) {
//            numbers[i] = Integer.parseInt(numberString[i]);
//        }
//
//        for (int i = 0; i < numberString.length; i++) {
//            sum += numbers[i];
//        }
//        ave = (float) (sum / (numberString.length));
//        System.out.println(ave);

    }
}
