package SwitchCase;

import java.util.Scanner;

public class DiasDaSemanaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número de 1 a 7: ");

            int dia = scanner.nextInt();

            switch (dia) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-feira");
                    break;
                case 3:
                    System.out.println("Terca-feira");
                    break;
                case 4:
                    System.out.println("Quarta-feira");
                    break;
                case 5:
                    System.out.println("Quinta-feira");
                    break;
                case 6:
                    System.out.println("Sexta-feira");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
                default:
                    System.out.println("Dia inválido");
                    break;
            }
        } catch (Exception e) {
            System.out.printf("Erro: %s", e);
        } finally {
            scanner.close();
        }
    }
}
