package com.zokas.hw;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число больше 2 : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int i=1;
        int f=1;
        while (i<=number){
            f=f*i;
            i++;
        }
        System.out.println(number+ "=" + f);
    }
}
