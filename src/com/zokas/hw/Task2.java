package HW7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Task2{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream("F:/TestHelloWOrld/javaTest.txt");
        int min = file.read();
        while (file.available()>0)
        {
            int data = file.read();
            if (data<min)
            {
                min = data;
            }

        }
        file.close();
        System.out.println(min);
    }
}