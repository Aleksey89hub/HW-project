package com.zokas.hw;

public class task7 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        String s = "*";
        String star = "";
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                star = star + s;
            }
            System.out.println(star + " ");
            star = "";
        }

    }
}