package com.zokas.hw;

public class task9 {
    public static void main(String[] args) {
        String str = "";
        int j=0;
        for (char i = 'a'; i <= 'z'; i++) {
            str = str + i;
            System.out.print(str);
            str = "";
            j++;
            if (j%4==0) {
                System.out.print(" ");
            }
        }
    }
}
