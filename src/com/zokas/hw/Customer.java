package HW6;

import java.util.Set;

public class Customer {

    private int id;
    private String name;
    private Set<Good>good;

    public Customer(int id, String name, Set<Good> good) {
        this.id = id;
        this.name = name;
        this.good = good;
    }

    @Override
    public String toString() {
        return "Customer{" +
                " id=  " + id +
                ", name= '" + name + '\'' +
                ", good= " + good +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Good> getGood() {
        return good;
    }

    public void setGood(Set<Good> good) {
        this.good = good;
    }
}
