package com.zokas.hw;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("Вы ввели четное число");
        } else {
            System.out.println("Вы ввели нечетное число");
        }
    }

}