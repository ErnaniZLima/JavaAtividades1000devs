package OperadorTernario;

import java.util.Scanner;

public class Codigo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            // Solicita dois números ao usuário
            System.out.print("Digite o primeiro número: ");
            int a = teclado.nextInt();

            System.out.print("Digite o segundo número: ");
            int b = teclado.nextInt();

            int maior;

            // Verifica qual dos dois números é maior
            maior = (a > b) ? (maior = a) : (maior = b);

            // Exibe o maior número
            System.out.println("Maior número: " + maior);
        } catch (Exception e) {
            System.out.printf("Erro: %s", e);
        } finally {
            teclado.close();
        }

    }
}
