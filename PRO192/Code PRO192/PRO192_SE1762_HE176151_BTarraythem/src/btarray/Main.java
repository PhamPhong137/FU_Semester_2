/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PC-Phong
 */
public class Main {

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
        Main obj = new Main();

        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                arr[i] = sc.next().charAt(0);
            }
        }

        System.out.print("Mảng vừa nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        while (true) {

            System.out.println("1.Thêm giá trị vào mảng");
            System.out.println("2.Xóa giá trị từ mảng");
            System.out.println("3.Sắp xếp mảng với Quick sort");
            System.out.println("4.Tìm kiếm giá trị có trong mảng và in ra vị trí của nó");
            System.out.println("5.Exit");
            System.out.print("Mời bạn lựa chọn:");

            int choice = 0;
            while (true) {
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice >= 1 && choice <= 5) {
                        break;
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.print("Mời bạn nhập lại:");
                }
            }

            switch (choice) {
                case 1:
                    System.out.print("Nhập vị trí muốn chèn giá trị (0 đến " + (n - 1) + "): ");
                    int index = sc.nextInt();
                    System.out.print("Nhập giá trị muốn chèn: ");
                    int insertValue = sc.nextInt();

                    if (index < 0 || index > arr.length) {
                        System.out.println("Chỉ số không hợp lệ");
                    } else {

                        for (int i = arr.length - 1; i > index; i--) {
                            arr[i] = arr[i - 1];
                        }
                        arr[index] = insertValue;
                        
                        arr = Arrays.copyOf(arr, arr.length + 1);
                    }
                    System.out.println("Mảng sau khi chèn giá trị: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Nhập chỉ số muốn xóa: ");
                    int a = sc.nextInt();

                    for (int i = a; i < arr.length - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    arr = Arrays.copyOf(arr, arr.length - 1);
                    System.out.println("Mảng sau khi xóa:");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i] + " ");
                    }
                    break;
                case 3:
                    obj.quickSort(arr, 0, arr.length - 1);
                    System.out.println("The sorted array is: " + Arrays.toString(arr));
                    break;
                case 4:
                    System.out.println("Nhap giá trị cần tìm: ");
                    int value = sc.nextInt();

                    System.out.print("Vị trí của giá trị đó: ");
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == value) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println("");

                    break;

                case 5:
                    System.exit(0);
            }

        }
    }
}
