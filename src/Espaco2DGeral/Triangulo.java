package Espaco2DGeral;

public class Triangulo extends Forma {

    private double lado1;
    private double lado2;
    private double lado3;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        super();
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {

        double area;
        area = (this.lado1 + this.lado2 + this.lado3) / 2;

        return Math.sqrt(area * (area - lado1) * (area - lado2) * (area - lado3));
    }

    @Override
    public double calcularPerimetro() {

        double perimetro;
        perimetro = lado1 + lado2 + lado3;

        return perimetro;
    }

    public String tipoTriangulo() {

        String tipo;
        if (lado1 == lado2 && lado2 == lado3) {

            tipo = "Equilatero";
            return tipo;

        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {

            tipo = "Isoceles";
            return tipo;

        } else {

            tipo = "Escaleno";
            return tipo;
        }
    }
}