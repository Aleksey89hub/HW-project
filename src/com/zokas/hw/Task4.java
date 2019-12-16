package HW7;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {

        int c;

        try {
            FileInputStream fileInputStream = new FileInputStream("F:/TestHelloWOrld/task4.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader br = new BufferedReader(inputStreamReader);



            String line = br.readLine();

            System.out.println("Original line:");
            System.out.println(line);
            System.out.println("___________________");

            int lastSymbolIndex = line.length() - 1;
            char lastSymbol = line.charAt(lastSymbolIndex);
            boolean isLastSymbolSpecific = false;
            if (lastSymbol == '!' ||
                    lastSymbol == '?' ||
                    lastSymbol == '.') {
                isLastSymbolSpecific = true;
            }

            System.out.println("Reversed line:");
            if (isLastSymbolSpecific) {
                line = line.substring(0, lastSymbolIndex);
                System.out.print(lastSymbol);
            }

            String delimiter = " ";
            String[] words = line.split(delimiter);
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i]);
                System.out.print(delimiter);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




