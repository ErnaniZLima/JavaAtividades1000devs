package OperadorTernario;

import java.util.Scanner;

public class Codigo01 {
    public static void main(String[] args) {
        // Cria o objeto Scanner para ler dados do teclado
        Scanner teclado = new Scanner(System.in);

        try {
            // Solicita ao usuário que digite um número inteiro
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();

            // Variável que armazenará o resultado (Par ou Ímpar)
            String resultado;
            // verifica se o número é par ou ímpar
            resultado = (numero % 2 == 0) ? "Par" : "Impar";

            // Exibe o resultado na tela
            System.out.println("O número é " + resultado);
        } catch (Exception e) {
            System.out.printf("Erro: %s", e);
        } finally {
            // Fecha o objeto Scanner para liberar o recurso de entrada
            teclado.close();
        }
    }
}