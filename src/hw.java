import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number == 7) {
            System.out.println("Вы ввели число 7");
        } else {
            System.out.println("Вы ввели не 7");
        }
    }
}































































