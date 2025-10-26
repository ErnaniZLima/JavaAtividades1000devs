
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) throws Exception {
        // Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao
        // usuário a valor do saque e depois informar quantas notas de cadavalor serão
        // fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O
        // valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se
        // preocupar com aquantidade de notas existentes na máquina.

        // Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas
        // de 100, uma nota de 50, uma nota de 5 e uma nota de 1;

        // Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas
        // de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de
        // 1.

        Scanner Teclado = new Scanner(System.in);
        int valorSaque, notas;
        try {
            System.out.println("Digite o valor de seu saque: ");
            valorSaque = Teclado.nextInt();
            if (valorSaque <= 600 && valorSaque >= 10) {
                notas = valorSaque / 100;
                valorSaque = valorSaque % 100;
                if (notas > 0) {
                    System.out.printf("Notas de 100: %d\n", notas);
                }
                notas = valorSaque / 50;
                valorSaque = valorSaque % 50;
                if (notas > 0) {
                    System.out.printf("Notas de 50: %d\n", notas);
                }
                notas = valorSaque / 10;
                valorSaque = valorSaque % 10;
                if (notas > 0) {
                    System.out.printf("Notas de 10: %d\n", notas);
                }
                notas = valorSaque / 5;
                valorSaque = valorSaque % 5;
                if (notas > 0) {
                    System.out.printf("Notas de 5: %d\n", notas);
                }
                notas = valorSaque / 1;
                valorSaque = valorSaque % 1;
                if (notas > 0) {
                    System.out.printf("Notas de 1: %d\n", notas);
                }
            } else {
                System.out.println("O valor deve ser no maximo R$ 600 e no minimo R$ 10");
            }
        } catch (InputMismatchException e) {
            System.out.printf("O valor deve ser um inteiro!, Erro: %s", e);
        } catch (Exception erro) {
            System.out.printf("Erro: %s", erro);
        } finally {
            Teclado.close();
        }
    }
}