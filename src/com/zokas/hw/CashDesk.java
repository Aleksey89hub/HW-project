package HW6;

import javafx.print.Printer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CashDesk {
    private int id;

    private Queue<Customer> customers = new LinkedList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Queue<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Queue<Customer> customers) {
        this.customers = customers;
    }

    public CashDesk(int id, Queue<Customer> customers) {
        this.id = id;
        this.customers = customers;
    }

    public void process() {
        int customerCount = 0;
        for (Customer currentCustomer : customers) {
            customerCount++;
            String customerName = currentCustomer.getName();

            Set<Good> goods = currentCustomer.getGood();
            int goodCount = 0;
            for (Good good : goods) {
                goodCount++;
                System.out.println(currentCustomer);

            }

        }

    }
}
