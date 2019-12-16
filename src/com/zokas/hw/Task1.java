package HW7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Task1 {

        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fileInputStream = new FileInputStream("F:/TestHelloWOrld/javaTest.txt");
            int maxBite = 0;
            while (fileInputStream.available() > 0)
            {
                int oneByt =fileInputStream.read();
                if (maxBite < oneByt)
                {
                    maxBite = oneByt;
                }
            }
            fileInputStream.close();
            reader.close();
            System.out.println(maxBite);
        }
    }

