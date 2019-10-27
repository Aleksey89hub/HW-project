package com.zokas.hw;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {


        System.out.print("Введите любое целое число от 1 до 9: ");
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        switch (num) {
            case 1:

                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            case 8:
                System.out.println("понедельник");
                break;
            case 9:
                System.out.println("вторник");
                break;

        }
    }
}
