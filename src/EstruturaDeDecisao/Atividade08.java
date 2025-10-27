package EstruturaDeDecisao;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) throws Exception {
        // Faça um Programa que peça os 3 lados de um triângulo. O programa deverá
        // informar se os valores podem ser um triângulo. Caso seja um triângulo indique
        // o tipo do triângulo: equilátero, isósceles ou escaleno. Dicas:
        // - Para saber se é um triângulo: Cada lado individual deve ser menor que a
        // soma dos outros dois lados que restaram. Você deve validar se cada
        // lado satisfaça este creitério.
        // - Triângulo Equilátero: três lados iguais;
        // - Triângulo Isósceles: quaisquer dois lados iguais;
        // - Triângulo Escaleno: três lados diferentes;
        Scanner Teclado = new Scanner(System.in);
        double lado1, lado2, lado3;

        try {

            System.out.print("Digite o lado 1: ");
            lado1 = Teclado.nextDouble();

            System.out.print("Digite o lado 2: ");
            lado2 = Teclado.nextDouble();

            System.out.print("Digite o lado 3: ");
            lado3 = Teclado.nextDouble();

            if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("Triangulo Equilatero");
                } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
                    System.out.println("Triangulo Isosceles");
                } else {
                    System.out.println("Triangulo Escaleno");
                }
            } else {
                System.out
                        .println("Cada lado individual deve ser menor que a soma dos outros dois lados que restaram.");
            }

        } catch (Exception e) {
            System.out.printf("Erro: %s ", e);
        } finally {
            Teclado.close();
        }

    }
}
