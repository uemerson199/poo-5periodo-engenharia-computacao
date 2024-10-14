package entities;

public class TemperaturaConverter {

    public static double converterCelsius(double temperatura) {
        return temperatura * 1.8 + 32;
    }

    public static double converterFahrenheit(double temperatura) {
        return (temperatura - 32) / 1.8;
    }

}
