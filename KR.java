package com.company;
import java.util.Scanner;

public class KR {
    public static Scanner scannerGlobal = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        int len = scannerGlobal.nextInt();
        int initialValue = scannerGlobal.nextInt();
        Change();
        Smaller();
        Diagonal();
        Input(len, initialValue);

    }

    private static void Change() {
        int[] numbarray = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < numbarray.length; i++) {
            if (numbarray[i] == 0) {
                numbarray[i] = 1;
            } else {
                numbarray[i] = 0;
            }
            System.out.print(numbarray[i] + " ");
        }
    }

    private static void Smaller() {
        int[] numbarray = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int summ = 0;
        int summaffter = 0;
        for (int i = 0; i < numbarray.length; i++) {
            summ += numbarray[i];
            if (numbarray[i] < 6) {
                numbarray[i] *= 2;
                summaffter += numbarray[i];
            } else {
                summaffter += numbarray[i];
            }
        }
        System.out.print("Summ before - " + summ + " Summ after - " + summaffter);
    }

    private static void Diagonal() {
        int n = 4;
        int[][] diagonal = new int[5][5];
        for (int i = 0; i < 5; i++) {
            diagonal[i][i] = 1;
            diagonal[i][n] = 1;
            n--;
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int z = 0; z < 5; z++) {
                System.out.print(diagonal[i][z] + " ");
            }
            System.out.println();

        }
    }
    private static void Input(int a, int b) {
        int[] array = new int[a];
        for(int i = 0; i<a; i++){
            array[i] = b;
            System.out.print(array[i]);
        }
    }
}
