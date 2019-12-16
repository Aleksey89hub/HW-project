package HW6;

import java.util.HashMap;
import java.util.Map;


public class BotanistRunner  {






    public static void main(String[] args) {

        Plant plant = new Plant("WaterMelon");
        Plant plant1 = new Plant("Apple");
        Plant plant2 = new Plant("Pomegranate");
        PlantExample type = new PlantExample(" is a berry");
        PlantExample type1 = new PlantExample(" is  a Fruit");
        PlantExample type2 = new PlantExample(" is a  Fruit");


        Map<Object, Object> botanistApp = new HashMap<>();
        botanistApp.put(plant, type);
        botanistApp.put(plant1, type1);
        botanistApp.put(plant2, type2);
        System.out.println(plant+ " is a "+botanistApp.get(plant));
        System.out.println("-----------------------------------------");
        for (Map.Entry<Object, Object> search : botanistApp.entrySet()) {
            System.out.println(search);


        }

    }


}
