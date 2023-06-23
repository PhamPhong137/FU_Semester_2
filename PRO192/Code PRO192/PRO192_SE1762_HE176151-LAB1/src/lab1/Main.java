/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author PC-Phong
 */
public class Main {

    Scanner sc = new Scanner(System.in);

    public void menuChinh() {
        System.out.println("{A].One-dimension array");
        System.out.println("[B].Two-dimension array");
        System.out.println("[E].Exit");
        System.out.println("Your choice:");
    }

    public void menu1() {
        System.out.println("1.Ascending order sort(Quick-Sort)");
        System.out.println("2.Input max,min:");
        System.out.println("3.Delete duplicate element");
        System.out.println("4.Statistics even,odd number");
        System.out.println("5.Return main menu");

    }

    public void menu2() {
        System.out.println("1.Add Matrix ");
        System.out.println("2.Mul Matrix ");
        System.out.println("3.Return main menu");
    }

    public int getChoice1() {

        System.out.println("Your choice: ");
        int choice = 0;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= 5) {
                    break;
                } else {
                    System.out.println("Choice with in 1-5: ");
                }
            } catch (Exception e) {
                System.out.println("Please input choice again:");
            }
        }
        return choice;
    }
    
   

    public int getChoice2() {

        System.out.println("Your choice: ");
        int choice = 0;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println("Choice with in 1-3: ");
                }
            } catch (Exception e) {
                System.out.println("Please input choice again:");
            }
        }
        return choice;
    }

    public int partition(int a[], int begin, int end) {
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

    public void quickSort(int a[], int begin, int end) {
        if (begin < end) {
            int partition = partition(a, begin, end);

            quickSort(a, begin, partition - 1);
            quickSort(a, partition + 1, end);

        }
    }

    public void deleteRepeat(int a[]) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {

                    for (int k = j; k < a.length - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    // Giảm kích thước mảng
                    a = Arrays.copyOf(a, a.length - 1);
                    // Quay lại vị trí i vì có thể còn phần tử trùng nhau sau khi xóa
                    j--;
                }
            }
        }
        System.out.println("Array after delete duplicate elements:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");

    }

    public void statisticsOddEven(int a[]) {
        int countSochan = 0;
        int countSole = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                countSochan++;
            } else {
                System.out.print(a[i] + " ");
                countSole++;
            }
        }
        System.out.printf("\nHave %d oven number:", countSochan);
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }

        }
        System.out.printf("\nHave %d odd number: ", countSole);
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }

        }
        System.out.println();
    }

    public int getSize(String mess) {

        System.out.print(mess);
        int number = 0;
        while (true) {
            try {
                number = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Please input choice again:");
            }
        }
        return number;
    }

    public void printMatrix(int matrix[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public int[][] getMatrix(int row, int col) {
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = getSize("Matrix[" + i + "][" + j + "]: ");
            }
        }
        return matrix;
    }

    public void addMatrix() {
        int row1 = getSize("Enter row matrix 1: ");
        int col1 = getSize("Enter column matrix 1: ");

        int row2;
        int col2;
        while (true) {
            row2 = getSize("Enter row matrix 2: ");
            if (row2 == row1) {
                break;
            } else {
                System.out.println("Need row2 = row1");
            }

        }
        while (true) {
            col2 = getSize("Enter column matrix2 : ");
            if (col2 == col1) {
                break;
            } else {
                System.out.println("Need col2 = col1");
            }
        }
        System.out.println("Input Matrix1:");
        int matrix1[][] = getMatrix(row1, col1);
        System.out.println("Input Matrix2:");
        int matrix2[][] = getMatrix(row2, col2);
        int ketqua[][] = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                ketqua[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        printMatrix(matrix1, row1, col1);
        System.out.println("+");
        printMatrix(matrix2, row2, col2);
        System.out.println("=");
        printMatrix(ketqua, row2, col2);
    }

    public void mulMatrix() {
        int row1 = getSize("Enter row matrix 1: ");
        int col1 = getSize("Enter column matrix 1: ");

        int row2;

        while (true) {
            row2 = getSize("Enter row matrix 2: ");
            if (row2 == col1) {
                break;
            } else {
                System.out.println("Need row2 = col1");
            }

        }
        int col2 = getSize("Enter column matrix 2: ");
        System.out.println("Input Matrix1:");
        int matrix1[][] = getMatrix(row1, col1);
        System.out.println("Input Matrix2:");
        int matrix2[][] = getMatrix(row2, col2);
        int ketqua[][] = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {
                    ketqua[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        printMatrix(matrix1, row1, col1);
        System.out.println("*");
        printMatrix(matrix2, row2, col2);
        System.out.println("=");

        printMatrix(ketqua, row1, col2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        int[] a;
        while (true) {
            obj.menuChinh();
            String choice = sc.next();
            switch (choice) {
                case "A":

                    while (true) {
                        obj.menu1();
                        System.out.print("Input the number of elements of the array: ");
                        int n = sc.nextInt();
                        a = new int[n];
                        System.out.println("Input array:");
                        for (int i = 0; i < a.length; i++) {
                            a[i] = sc.nextInt();
                        }
                        int c = obj.getChoice1();
                        if (c == 1) {

                            obj.quickSort(a, 0, a.length - 1);
                            System.out.println("The sorted array is: " + Arrays.toString(a));

                        }
                        if (c == 2) {

                            Arrays.sort(a);
                            System.out.println("Max is:" + a[n - 1]);
                            System.out.println("Min is:" + a[0]);
                        }
                        if (c == 3) {
                            obj.deleteRepeat(a);

                        }
                        if (c == 4) {

                            obj.statisticsOddEven(a);
                        }
                        if (c == 5) {
                            break;
                        }
                    }
                    break;
                case "B":
                    while (true) {

                        obj.menu2();
                        int d = obj.getChoice2();
                        if (d == 1) {
                            obj.addMatrix();

                        }
                        if (d == 2) {
                            obj.mulMatrix();

                        }
                        if (d == 3) {
                            break;
                        }
                    }
                    break;
                case "E":
                    System.out.println("Done");
                    System.exit(0);

                default:
                    System.out.println("Input again");
                    break;
            }
        }

    }

}
