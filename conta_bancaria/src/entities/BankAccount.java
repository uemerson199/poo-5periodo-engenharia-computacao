package entities;

public class BankAccount {
    public int numeroConta;
    public double saldoConta;

    public BankAccount() {

    }

    public BankAccount(int numeroConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double depositar(double valor) {
        return saldoConta += valor;
    }

    public double saque(double valor) {
        return saldoConta -= valor;
    }

    public void exibirSaldo() {
        System.out.printf("Saldo da conta: %.2f%n", getSaldoConta());
    }

}
