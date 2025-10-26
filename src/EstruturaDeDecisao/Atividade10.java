
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) throws Exception {
        // Leia um valor e apresente uma frase que diga se o número é: par ou ímpar e
        // positivo ou negativo. Caso o valor seja 0, mostre a mensagem: Onúmero
        // digitado é neutro.
        // Exemplo 01:
        // Digite o número: 5
        // O número 5 é impar e positivo.
        // Exemplo 02:
        // Digite o número: -6
        // O número -6 é par e negativo.
        // Exemplo 03:
        // Digite o número: 0
        // O número digitado é neutro.

        Scanner Teclado = new Scanner(System.in);
        int valor;
        try {
            System.out.print("Digite um numero:  ");
            valor = Teclado.nextInt();

            if (valor == 0) {
                System.out.println("Valor Neutro");
            } else if (valor % 2 == 0 && valor > 0) {
                System.out.println("Valor Par");
                System.out.println("Valor Positivo");
            } else if (valor % 2 == 0 && valor < 0) {
                System.out.println("Valor Par");
                System.out.println("Valor Negativo");
            } else if (valor > 0) {
                System.out.println("Valor Impar");
                System.out.println("Valor Positivo");
            } else {
                System.out.println("Valor Impar");
                System.out.println("Valor Negativo");
            }

        } catch (InputMismatchException e) {
            System.out.println("O valor deve ser um inteiro!");
        } catch (Exception e) {
            System.out.printf("Erro: %s ", e);
        } finally {
            Teclado.close();
        }
    }
}
