package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RectangleTester {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Digite o comprimento: ");
        double comprimento = sc.nextDouble();
        rectangle.setComprimento(comprimento);

        System.out.println("Digite a largura: ");
        double largura = sc.nextDouble();
        rectangle.setLargura(largura);


        System.out.println("A área é: " + rectangle.area());
        System.out.println("O perimetro é: " + rectangle.perimetro());

    }
}
