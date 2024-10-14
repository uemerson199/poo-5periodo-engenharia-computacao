package application;

import entities.Caminhao;
import entities.Carro;
import entities.Motos;
import entities.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Essa é minha classe principal, onde estou executando o problema. Postei no espaço para a classe Veiculo, devido a não ter o campo pra ela

        List<Veiculo> veiculos = new ArrayList<>();

        Carro carro1 = new Carro("Celta", "Chevrolet", "2008", 2);
        veiculos.add(carro1);
        Carro carro2 = new Carro("Corola", "Toyota", "2022", 4);
        veiculos.add(carro2);
        Caminhao caminhao1 = new Caminhao("FH", "Volvo", "2003", 10000.00);
        veiculos.add(caminhao1);
        Caminhao caminhao2 = new Caminhao("FH", "Volvo", "2018", 10000.00);
        veiculos.add(caminhao2);
        Motos moto1 = new Motos("Crf", "Honda", "2020", 250);
        veiculos.add(moto1);
        Motos moto2 = new Motos("Tornado", "Honda", "2008", 250);
        veiculos.add(moto2);


        for (Veiculo v:
             veiculos) {
            System.out.println(v.imprimirDetalhes());
        }


    }

}
