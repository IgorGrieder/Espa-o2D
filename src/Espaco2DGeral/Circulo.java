package Espaco2DGeral;

public class Circulo extends Forma {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area;
        area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro = 2 * Math.PI * raio;
        return perimetro;
    }
}
