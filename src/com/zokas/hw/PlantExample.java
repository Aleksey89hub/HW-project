package HW6;

import jdk.nashorn.internal.parser.Scanner;

public class PlantExample {
    private String example;

    public PlantExample(String example) {
        this.example = example;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return "PlantExample{" +
                "example='" + example + '\'' +
                '}';
    }
}
