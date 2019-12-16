package HW7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    private static String a;
    private static boolean bool;
    private static final String date="\\d{4}\\/(0?[1-9]|1[012])\\/(0?[1-9]|[12][0-9]|3[01]) ([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9].";
//([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9].
    //2019/11/15 13:00:00 -надо вывести вот так !!!! не могу поставить пробел
//
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        a =input.nextLine();
        bool = validate(a);
        if (bool == true) {
            System.out.println("You entered correct data ");
        } else {
            System.out.println("The entered data is incorrect ");
        }
    }

    public static boolean validate(String ip) {
        Pattern pattern = Pattern.compile(date);

        Matcher matcher = pattern.matcher(a);
        return matcher.matches();
    }

}



