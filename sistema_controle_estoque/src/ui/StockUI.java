package ui;

import model.Product;
import service.StockService;
import java.util.Scanner;

public class StockUI {

    private Scanner scanner;
    private StockService stockService;

    public StockUI() {
        scanner = new Scanner(System.in);
        stockService = new StockService();
    }

    public void start() {
        System.out.println("MENU: ");
        System.out.println("1.) Adicionar produto: ");
        System.out.println("2.) Remover produto: ");
        System.out.println("3.) Listar produtos: ");
        System.out.println("4.) Atualizar o preço de um produto: ");
        System.out.println("0.) Sair.");

        String optionStr = scanner.nextLine();

        while (!optionStr.equals("0")) {
            int option = Integer.parseInt(optionStr);

            switch (option) {
                case 1:
                    System.out.println("Digite o id do produto: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    //Integer id = scanner.nextInt();
                    System.out.println("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    double preco = Double.parseDouble(scanner.nextLine());
                    System.out.println("Digite a quantidade do Produto: ");
                    int quantity = Integer.parseInt(scanner.nextLine());

                    Product product = new Product(nome, preco, quantity, id);
                    stockService.addProduct(product);
                    break;
                case 2:
                    System.out.println("Digite o id do produto: ");
                    int idRemove = Integer.parseInt(scanner.nextLine());
                    stockService.removeProduct(idRemove);
                    break;
                case 3:
                    System.out.println("Lista de produtos: ");
                    stockService.lisProducts();
                    break;
                case 4:
                    System.out.print("Digite o id do produto a ser alterado o preço: ");
                    int idAlterar = Integer.parseInt(scanner.nextLine());
                    System.out.print("Digite o novo preço do produto: ");
                    double novoPreco = Double.parseDouble(scanner.nextLine());
                    stockService.updatedPrice(novoPreco, idAlterar);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("MENU: ");
            System.out.println("1.) Adicionar produto: ");
            System.out.println("2.) Remover produto: ");
            System.out.println("3.) Listar produtos: ");
            System.out.println("4.) Atualizar o preço de um produto: ");
            System.out.println("0.) Sair.");

            optionStr = scanner.nextLine();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        StockUI ui = new StockUI();
        ui.start();
    }
}

