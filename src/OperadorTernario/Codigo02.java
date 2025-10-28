package OperadorTernario;

import java.util.Scanner;

public class Codigo02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            // Solicita o valor da compra ao usuário
            System.out.print("Digite o valor da compra: ");
            double valorCompra = teclado.nextDouble();

            double desconto;

            // Se o valor for maior que 300, aplica 10% de desconto
            // Caso contrário, aplica 5%

            desconto = (valorCompra > 300.0) ? valorCompra * 0.10 : valorCompra * 0.05;
            // Exibe o valor do desconto calculado
            System.out.println("Desconto aplicado: R$ " + desconto);
        } catch (Exception e) {
            System.out.printf("Erro: %s", e);
        } finally {
            teclado.close();

        }
    }
}