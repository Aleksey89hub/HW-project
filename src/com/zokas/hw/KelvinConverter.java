package HW3;

public class KelvinConverter implements Converter {

    @Override
    public double getValue(double Celsius) {
        return Celsius+273.15;
    }
}
