package HW6;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1," Donald Trump ");
        map.put(2,"Barack Obama");
        map.put(3 ,"W.Bush");
        map.put(4," Bill Clinton");
        map.put(5,"H.W Bush");



        System.out.println(map.keySet());
        System.out.println(map.values());


    }
}
