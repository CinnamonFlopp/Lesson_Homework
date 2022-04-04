package com.company;
import java.util.Scanner;
public class DZ {
    public static Scanner scannerGlobal = new Scanner(System.in);


    public static void main(String[] args) {
        First();
        Third();
        System.out.println();
        System.out.print("Enter two numbers: ");
        int a = scannerGlobal.nextInt();
        int b = scannerGlobal.nextInt();
        Outputing(a, b);
        TicTacToe();

    }

    private static void First() {
        int[] array = new int[]{2, 3, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " - element n" + i);
        }
    }

    private static void Sort() {
        // тут есть очень лёгкий способ, буквльно одной строчкой, но я его забыл
    }

    private static void Third() {
        String[] arrayaz = new String[26];
        char az = 97;
        for (int i = 0; i < arrayaz.length; i++) {
            arrayaz[i] = String.valueOf(az);
            az++;
            System.out.print(arrayaz[i]);
        }
        System.out.println();
        String[] arrayaAzZ = new String[54];
        az = 97;
        char AZ = 65;
        for (int i = 2; i < arrayaAzZ.length; i += 2) {
            arrayaAzZ[i] = String.valueOf(AZ);
            arrayaAzZ[i + 1] = String.valueOf(az);
            AZ++;
            az++;
            System.out.print(arrayaAzZ[i]);
            System.out.print(arrayaAzZ[i + 1]);
        }
        System.out.println();
        char number = 48;
        for (int i = 0; i < 2; i++) {
            arrayaAzZ[i] = String.valueOf(number);
            number++;
            System.out.print(arrayaAzZ[i]);
        }
        for (int i = 2; i < arrayaAzZ.length; i++) {
            System.out.print(arrayaAzZ[i]);
        }
    }

    private static void Outputing(int a, int b) {
        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int z = 0; z < b; z++) {
                System.out.print(array[i][z] + " ");
            }
            System.out.println();
        }
    }
    private static void TicTacToe(){
        int[][] array = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int z = 0; z < 2; z++) {
                System.out.print(array[i][z] + " | ");
            }
            System.out.println();
        }
    }
}

