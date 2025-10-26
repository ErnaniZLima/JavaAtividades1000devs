
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) throws Exception {
        // Faça um Programa que leia um número e exiba o dia correspondente da semana,
        // conforme esta regra:
        // (1 - Domingo, 2 - Segunda, 3 - Terça, 4 - Quarta, 5 - Quinta, 6 -Sexta e 7 -
        // Sábado).
        // Se o usuário digitar outro valor deve aparecer valor inválido.
        Scanner Teclado = new Scanner(System.in);
        int numero;
        try {
            System.out.print("Digite um numero de 1 a 7: ");
            numero = Teclado.nextInt();

            if (numero == 1) {
                System.out.print("Domingo");
            } else if (numero == 2) {
                System.out.print("Segunda-Feira");
            } else if (numero == 3) {
                System.out.print("Terca-Feira");
            } else if (numero == 4) {
                System.out.print("Quarta-Feira");
            } else if (numero == 5) {
                System.out.print("Quinta-Feira");
            } else if (numero == 6) {
                System.out.print("Sexta-Feira");
            } else if (numero == 7) {
                System.out.print("Sabado");
            } else {
                System.out.print("Opcao Invalida!");
            }

        } catch (InputMismatchException erro) {

            System.out.printf("O valor deve ser um inteiro! \n Erro: %s", erro);

        } catch (Exception erroDesconhecido) {

            System.out.printf("Erro Desconhecido", erroDesconhecido);

        } finally {
            Teclado.close();
        }
    }
}
