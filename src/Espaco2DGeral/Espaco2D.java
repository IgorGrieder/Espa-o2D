package Espaco2DGeral;

import java.util.ArrayList;

public class Espaco2D {

    private ArrayList<Forma> formas;

    public Espaco2D() {
        formas = new ArrayList<>();
    }

    public ArrayList<Forma> getFormas() {
        return formas;
    }

    public void setFormas(ArrayList<Forma> formas) {
        this.formas = formas;
    }

    public Forma criaForma(ArrayList<Ponto2D> pontos) {
        return Forma.geraForma(pontos);
    }

    public double calcularAreaTotal() {
        double areaTotal = 0;

        for (Forma aux : formas) {
            areaTotal = areaTotal + aux.calcularArea();
        }
        return areaTotal;
    }

    public double calcularPerimetroTotal() {
        double perimetroTotal = 0;

        for (Forma aux : formas) {
            perimetroTotal = perimetroTotal + aux.calcularPerimetro();
        }
        return perimetroTotal;
    }

    public boolean adiconaForma(Forma forma) {
        if (forma != null) {
            formas.add(forma);
            return true;
        } else
            return false;
    }

    public ArrayList<String> mostraTipoTriangulos() {
        ArrayList<String> tipo = new ArrayList<>();

        for (Forma aux : formas) {
            if (aux instanceof Triangulo) {
                tipo.add(((Triangulo) aux).tipoTriangulo());
            }
        }
        return tipo;
    }
}
