package SwitchCase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConceitoNotasIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Leitura individual de 4 notas
            System.out.print("Digite a nota 1 (0 a 10): ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a nota 2 (0 a 10): ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a nota 3 (0 a 10): ");
            double nota3 = scanner.nextDouble();

            System.out.print("Digite a nota 4 (0 a 10): ");
            double nota4 = scanner.nextDouble();

            // Verificação de validade das notas
            boolean notasValidas = (nota1 >= 0 && nota1 <= 10) &&
                    (nota2 >= 0 && nota2 <= 10) &&
                    (nota3 >= 0 && nota3 <= 10) &&
                    (nota4 >= 0 && nota4 <= 10);

            if (!notasValidas) {
                System.out.println("Uma ou mais notas são inválidas. Todas devem estar entre 0 e 10.");
            } else {
                // Cálculo da média
                double media = (nota1 + nota2 + nota3 + nota4) / 4;
                System.out.printf("Média: %.2f\n", media);

                // Avaliação do conceito com base na média

                int mediaInt = (int) Math.floor(media);

                switch (mediaInt) {
                    case 10:
                        System.out.println("Conceito A+");
                        break;
                    case 9:
                        System.out.println("Conceito A");
                        break;
                    case 8:
                        System.out.println("Conceito B");
                        break;
                    case 7:
                        System.out.println("Conceito C");
                        break;
                    case 6:
                        System.out.println("Conceito D");
                        break;
                    default:
                        System.out.println("Conceito F");
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.printf("Somente sao aceitos numeros! Erro: %s ", e);
        } catch (Exception error) {
            System.out.printf(" Erro: %s ", error);
        } finally {
            scanner.close();
        }
    }
}