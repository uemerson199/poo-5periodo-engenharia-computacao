package application;

import entities.StringUtil;

import java.util.Scanner;

public class StringUtilTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome a ser invertido: ");
        String nome = sc.next();

        String nomeReverso = StringUtil.reverse(nome);
        System.out.println("Nome reverso: " + nomeReverso);
    }
}
