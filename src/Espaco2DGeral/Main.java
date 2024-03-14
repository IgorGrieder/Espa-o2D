package Espaco2DGeral;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Iniciar variaveis
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ponto2D> novoPonto;
        Espaco2D espaco = new Espaco2D();
        double x = 0;
        double y = 0;
        int condicao;

        // System out menu
        System.out.println("Bem vindo ao espaco 2D do Igor!");
        System.out.println("Digite 1 - Para criar uma nova forma");
        System.out.println("Digite 2 - Para visualiar a soma de area das formas criadas");
        System.out.println("Digite 3 - Para visualiar a soma de perimetro das formas criadas");
        System.out.println("Digite 4 - Para visualiar os tipos de triangulo");
        System.out.println("Digite 5 - Para sair");
        condicao = scanner.nextInt();

        while (condicao != 5) {
            // Digito de parada sendo o 5
            switch (condicao) {
                case 1:
                    novoPonto = new ArrayList<>();
                    System.out.println("Para sair, digite o valor 9999");

                    for (int i = 1; i <= 4; i++) {
                        System.out.println("Informe o valor do X do " + i + "o ponto");
                        x = scanner.nextDouble();
                        if (x == 9999) {
                            break;
                        }
                        System.out.println("Informe o valor do Y do " + i + "o ponto");
                        y = scanner.nextDouble();
                        if (y == 9999) {
                            break;
                        }
                        novoPonto.add(new Ponto2D(x, y));
                    }
                    // checagem de criacao ou nao de forma
                    if (espaco.adiconaForma(espaco.criaForma(novoPonto))) {
                        System.out.println("Forma adicionada com sucesso");
                    } else {
                        System.out.println("Nao foi possivel criar essa forma, insira novos pontos");
                    }
                    break;

                case 2:
                    System.out.println("A soma das areas das formas eh de: " + espaco.calcularAreaTotal());
                    break;

                case 3:
                    System.out.println("A soma dos periemtros das formas eh de: " + espaco.calcularPerimetroTotal());
                    break;

                case 4:
                    System.out.print("Os tipos dos triangulos formados sao: ");

                    for (String aux : espaco.mostraTipoTriangulos()) {
                        System.out.print(" " + aux);
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("Opcao indisponivel, tente novamente");
                    break;
            }

            // Logs de menu
            System.out.println("Digite 1 - Para criar uma nova forma");
            System.out.println("Digite 2 - Para visualiar a soma de area das formas criadas");
            System.out.println("Digite 3 - Para visualiar a soma de perimetro das formas criadas");
            System.out.println("Digite 4 - Para visualiar os tipos de triangulo");
            System.out.println("Digite 5 - Para sair");
            condicao = scanner.nextInt();
        }

        scanner.close();
    }
}
