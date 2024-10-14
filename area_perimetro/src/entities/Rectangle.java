package entities;

public class Rectangle {
    private double comprimento;
    private double largura;

    public Rectangle() {

    }

    public Rectangle(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double area() {
        return comprimento * largura;
    }

    public double perimetro() {
        return 2 * (comprimento + largura);
    }
}
