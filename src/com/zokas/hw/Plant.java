package HW6;

import java.util.Map;

public class Plant {
    private String TypePlant;

    public Plant(String typePlant) {
        TypePlant = typePlant;
    }

    public String getTypePlant() {
        return TypePlant;
    }

    public void setTypePlant(String typePlant) {
        TypePlant = typePlant;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "TypePlant='" + TypePlant + '\'' +
                '}';
    }
}

