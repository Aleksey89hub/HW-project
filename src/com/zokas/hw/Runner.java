package HW6;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        Good vodka = new Good(1, "Finland", 25);
        Good condom = new Good(2, "Durex", 5);
        Good bouquet = new Good(101, "Roses", 100);
        Good iceCream = new Good(3, "Kashtan", 2);

        Set<Good> vasyaGood = new HashSet<>();
        vasyaGood.add(vodka);
        vasyaGood.add(iceCream);
        vasyaGood.add(bouquet);
        Set<Good> mashaGood = new HashSet<>();
        mashaGood.add(iceCream);

        Customer vasya = new Customer(1, "Vasya", vasyaGood);
        Customer masha = new Customer(2, "Masha", mashaGood);
        Queue<Customer> customers = new LinkedList<>();
        customers.add(vasya);
        customers.add(masha);

        CashDesk cashDesk = new CashDesk(1, customers);

        cashDesk.process();


    }
}
