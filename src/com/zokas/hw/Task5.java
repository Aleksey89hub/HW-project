package HW7;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    private static String a;
    private static boolean bool;

    private static final String IpAdress =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        a = s.next();
        bool = validate(a);
        if (bool == true) {
            System.out.println("Строка является IP адресом");
        } else {
            System.out.println("Строка не является IP адресом");
        }
    }

    public static boolean validate(String ip) {
        Pattern pattern = Pattern.compile(IpAdress);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

}

