package Espaco2DGeral;
import java.util.ArrayList;

public abstract class Forma {
    
    abstract double calcularArea();
    abstract double calcularPerimetro();
    
    public static Forma geraForma(ArrayList<Ponto2D> pontos){
        Forma forma  = null;

        if (pontos.size() == 2){
            double raio = pontos.get(0).calculaDistancia(pontos.get(1));
            if (raio > 0){
                forma = new Circulo(raio);
            }
        }

        if (pontos.size() == 3){
            double lado1 = pontos.get(0).calculaDistancia(pontos.get(1));
            double lado2 = pontos.get(1).calculaDistancia(pontos.get(2));
            double lado3 = pontos.get(2).calculaDistancia(pontos.get(0));

            if((lado1 + lado2) > lado3){
                forma = new Triangulo(lado1,lado2,lado3);
            }
        }

        if (pontos.size() == 4){
            double lado1 = pontos.get(0).calculaDistancia(pontos.get(1));
            double lado2 = pontos.get(1).calculaDistancia(pontos.get(2));
            double lado3 = pontos.get(2).calculaDistancia(pontos.get(3));
            double lado4 = pontos.get(3).calculaDistancia(pontos.get(0));

            if(lado1 == lado2 && lado2 == lado3 && lado3 == lado4){
                forma = new Quadrado(lado1,lado2,lado3,lado4);
            }
        }
        return forma;
    }
}
