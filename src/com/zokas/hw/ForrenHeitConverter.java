package HW3;

public class ForrenHeitConverter implements Converter {
    @Override
    public double getValue(double Celsius) {
        return (Celsius *9/5)+32;
    }
}
