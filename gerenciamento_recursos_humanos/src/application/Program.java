package application;

import entities.Employee;
import entities.Manager;
import entities.Technician;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Employee employee = new Employee();


        System.out.println("Bem vindo ao sistema de Gerenciamento de RH: ");
        System.out.println("Digite uma opção: ");
        System.out.println("1 - Cadastrar funcionario.");
        System.out.println("2 - Remover funcionario.");
        System.out.println("3 - Atualizar Funcionario.");
        System.out.println("4 - Listar Funcionarios.");
        System.out.println("5 - Sair!");


        int opcao = sc.nextInt();


        while (opcao != 5) {


            switch (opcao) {
                case 1:
                    System.out.println("Digite (m) para gerente ou (t) para técnico: ");
                    char op = sc.next().charAt(0);
                    sc.nextLine();
                    System.out.println("Digite o nome do Funcionario: ");
                    String name = sc.nextLine();
                    System.out.println("Digite o id: ");
                    int id = sc.nextInt();
                    System.out.println("Digite o salario: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite o departamento: ");
                    String departamento = sc.nextLine();


                    if (op == 'm') {
                        Manager manager = new Manager(name, id, salario, departamento);
                        employee.addEmployee(manager);
                    } else if (op == 't') {
                        Technician technician = new Technician(name, id, salario, departamento);
                        employee.addEmployee(technician);
                    }
                    break;
                case 2:
                    System.out.println("Digite o id do funcionário a ser removido: ");
                    id = sc.nextInt();
                    employee.removeEmployee(id);
                    break;
                case 3:
                    System.out.println("Digite o id do funcionario a ser atualizado");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o nome do Funcionario: ");
                    name = sc.nextLine();
                    System.out.println("Digite o id: ");
                    id = sc.nextInt();
                    System.out.println("Digite o salario: ");
                    salario = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite o departamento: ");
                    departamento = sc.nextLine();
                    Employee employee1 = new Employee(name, id, salario);
                    employee.atualizarEmployee(employee1, id);
                    break;
                case 4:
                    employee.listarEmployees();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }


            System.out.println("Digite uma opção: ");
            System.out.println("1 - Cadastrar funcionario.");
            System.out.println("2 - Remover funcionario.");
            System.out.println("3 - Atualizar Funcionario.");
            System.out.println("4 - Listar Funcionarios.");
            System.out.println("5 - Sair!");


            opcao = sc.nextInt();


        }




    }
}
