package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee1 = new Employee("Uemerson", 5000.0, 4432);
        Employee employee2 = new Employee("Joãozinho", 10000.0, 4433);
        Employee employee3 = new Employee("Pedrinho", 1400.0, 1056);

        System.out.println("Lista de funcionarios e suas informações: ");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }
}
