package com.zokas.hw;

import java.util.Scanner;

public class task12 {public static void main(String[] args) {
    System.out.print("Введите центральное чило масива - ");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    int[] array= new int[number * 2 + 1];
    int i = 0;
    while (i<=number) {
        array[i]=i;
        System.out.print(array[i]+ " ");
        i++;
    }
    i = number-1;
    while (i<=number && i>=0) {
        array[i]=i;
        System.out.print(array[i]+ " ");
        i--;
    }
}
}
