package com.zokas.hw;

import java.util.Random;

public class task11 {
    public static void main(String[] args) {

        int n = new Random().nextInt((100 - 1) + 1) + 1;
        int [] mas = new int[n];
        for(int i= 0;i<n;i++){
            mas[i]=1 + (int)(Math.random() * 100);
            System.out.print(mas[i]+ " ");
        }
    }

}

