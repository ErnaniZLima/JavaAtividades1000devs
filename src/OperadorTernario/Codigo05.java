package OperadorTernario;

import java.util.Scanner;

public class Codigo05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            // Solicita ao usuário um número
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();

            // Estrutura condicional com várias ações diferentes
            String posiOuNega = (numero > 0)? "Positivo" : "Negativo ou Zero";
            System.out.printf("O Numero e %s . %n",posiOuNega);

            String mensagem = (numero > 0)
            ? String.format("Calculando a raiz quadrada...\nA raiz quadrada de %d é %.2f", numero, Math.sqrt(numero))
            : String.format("Calculando o quadrado do número...\nO quadrado de %d é %d", numero, numero * numero);

            System.out.println(mensagem);

        } catch (Exception e) {
            System.out.printf("Erro: %s", e);
        } finally {
            teclado.close();
        }
    }
}