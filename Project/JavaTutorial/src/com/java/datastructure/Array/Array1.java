package com.java.datastructure.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numbers;
        numbers=new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i]=sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i]+"\t");
        }

        Arrays.sort(numbers);

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i]+"\t");
            System.out.println();
        }
    }
}
