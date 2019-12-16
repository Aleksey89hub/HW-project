package HW7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("task3.txt");
        StringBuilder str = new StringBuilder(" example of text");
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter(file));
            str.reverse();
            writer.write(String.valueOf(str));
            writer.flush();
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
