package EstruturaDeDecisao;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) throws Exception {
        // Faça um Programa que leia três números e mostre o maior e o menor deles.
        Scanner Teclado = new Scanner(System.in);
        int valor1, valor2, valor3;
        int maior, menor;

        try {
            System.out.print("Digite o valor 1: ");
            valor1 = Teclado.nextInt();
            System.out.print("Digite o valor 2: ");
            valor2 = Teclado.nextInt();
            System.out.print("Digite o valor 3: ");
            valor3 = Teclado.nextInt();

            // Inicializa as variáveis
            maior = valor1;
            menor = valor1;

            // Verifica o maior
            if (valor2 > maior) {
                maior = valor2;
            }
            if (valor3 > maior) {
                maior = valor3;
            }

            // Verifica o menor
            if (valor2 < menor) {
                menor = valor2;
            }
            if (valor3 < menor) {
                menor = valor3;
            }

            System.out.printf("O maior valor é: %d e o menor é: %d\n", maior, menor);

        } catch (Exception e) {
            System.out.printf("Erro: ", e);
        } finally {
            Teclado.close();
        }
    }
}
