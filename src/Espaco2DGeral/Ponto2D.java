package Espaco2DGeral;

public class Ponto2D {

    private double X;
    private double Y;

    public Ponto2D() {
        X = 0;
        Y = 0;
    }

    public Ponto2D(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public Ponto2D(Ponto2D novoPonto) {
        this.X = novoPonto.getX();
        this.Y = novoPonto.getY();
    }

    public double calculaDistancia(Ponto2D ponto) {
        double distancia = 0;
        distancia = Math.sqrt(Math.pow(this.X - ponto.getX(), 2) + Math.pow(this.Y - ponto.getY(), 2));
        return distancia;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void setX(double X) {
        this.X = X;
    }

    public void setY(double Y) {
        this.Y = Y;
    }
}
