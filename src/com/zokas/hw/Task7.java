package HW7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(("http[\\:][\\/][\\/]example[\\.]com[\\/]"));
        Matcher matcher = pattern.matcher("http://example.com/");
        boolean ft = matcher.matches();
        System.out.println("The entered example is  " + ft);

    }
}
