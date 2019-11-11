package HW3;

import java.util.Scanner;

public class MainConverter {
    public static void main(String[] args) {
        System.out.println("Enter temperature in Celsius");
        Scanner input = new Scanner(System.in);
        double enterValue = input.nextDouble();
        Converter farrenheits = new ForrenHeitConverter();
        System.out.println("Temperature in Farrenheit is ");
        System.out.println(farrenheits.getValue(enterValue));
        double enterValue1 = input.nextDouble();
        Converter kelvin = new KelvinConverter();
        System.out.println("Temperature in Kelvin is ");
        System.out.println(kelvin.getValue(enterValue1));
    }
}
