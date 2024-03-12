package poo;

public class Numero {
    private double x;

    private double getx() {
        return x;
    }

    private void setx(double x) {
        this.x = x;
    }

    public double soma(double x, double y) {
        setx(x + y);
        return getx();
    }

    public double subtracao(double x, double y) {
        setx(x - y);
        return getx();
    }

    public double multiplicacao(double x, double y) {
        setx(x * y);
        return getx();
    }

    public double divisao(double x, double y) {
        setx(x / y);
        return getx();
    }


}