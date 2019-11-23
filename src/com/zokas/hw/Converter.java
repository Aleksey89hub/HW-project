package HW4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {
    public static void main(String[] args) {
        String st [] = {"Masha","Dasha","Julia"};
        int numbers [] = { 1,2,3,4};
        List<String>list = new ArrayList<>(Arrays.asList(st));
        for(String s:list){
            System.out.println(s);
        }
     List<Integer>intlist = new ArrayList<Integer>(numbers.length);
        for(int i:numbers){
            intlist.add(i);
        }
        System.out.println(intlist);



    }
}
