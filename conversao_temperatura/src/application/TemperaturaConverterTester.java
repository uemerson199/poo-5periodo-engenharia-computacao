package application;

import entities.TemperaturaConverter;

import java.util.Locale;
import java.util.Scanner;

public class TemperaturaConverterTester {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        TemperaturaConverter temperatura = new TemperaturaConverter();

        System.out.println("Digite a temperatura em Celcius para ser convertida em Farenheit : ");
        double temperaturaFahrenheit  = sc.nextDouble();
        System.out.println("Temperatura em Farenheit: " +TemperaturaConverter.converterCelsius(temperaturaFahrenheit));

        System.out.println("Digite a temperatura em Farenheit para ser convertida em Celcius: ");
        double temperaturaCelcius = sc.nextDouble();
        System.out.println("Temperatura em Celcius: " + TemperaturaConverter.converterFahrenheit(temperaturaCelcius));


    }
}
