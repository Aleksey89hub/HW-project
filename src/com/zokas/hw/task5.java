package com.zokas.hw;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        System.out.print("Введите любое целое число больше 3: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
