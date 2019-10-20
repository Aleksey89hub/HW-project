package com.zokas.hw;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = scan.nextInt();
        System.out.print("Введите b: ");
        int b = scan.nextInt();
        System.out.print("Введите r: ");
        int r = scan.nextInt();
        if (Math.sqrt(a*a+b*b)/2<=r) {
            System.out.println ("Да, полностью закроет");
        } else {
            System.out.println ("Нет, не закроет полностью");
        }
    }
}


