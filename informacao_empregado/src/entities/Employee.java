package entities;

public class Employee {
    private String nome;
    private double salario;
    private int id;

    public Employee() {

    }

    public Employee(String nome, double salario, int id) {
        this.nome = nome;
        this.salario = salario;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "," +
                " Salario: " + salario + "," +
                " Id: " + id;
    }
}
