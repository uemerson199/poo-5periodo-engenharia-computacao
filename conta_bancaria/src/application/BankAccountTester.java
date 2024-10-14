package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();

        System.out.println("SISTEMA BANCARIO");
        System.out.println("Digite uma opcao:");
        System.out.println("1-deposito");
        System.out.println("2-Saque");
        System.out.println("3-exibir saldo");
        System.out.println("0-finalizar.");

        int opcao = sc.nextInt();


        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    System.out.println("Qual o valor do deposito: ");
                    double valorDeposito = sc.nextDouble();
                    bankAccount.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Qual o valor do saque: ");
                    double valorSaque = sc.nextDouble();
                    bankAccount.saque(valorSaque);
                    break;
                case 3:
                    bankAccount.exibirSaldo();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println();
            System.out.println("SISTEMA BANCARIO");
            System.out.println("Digite uma opcao:");
            System.out.println("1-deposito");
            System.out.println("2-Saque");
            System.out.println("3-exibir saldo");
            System.out.println("0-finalizar");
            opcao = sc.nextInt();
        }

    }
}
