package SwitchCase;

import java.util.Scanner;

public class AvaliadorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {

            System.out.print("Digite a sua idade: ");
            int idade = scanner.nextInt();

            int faixa;
            if (idade < 0) {
                faixa = -1;
            } else if (idade < 12) {
                faixa = 0;
            } else if (idade < 18) {
                faixa = 1;
            } else if (idade < 60) {
                faixa = 2;
            } else {
                faixa = 3;
            }

            switch (faixa) {
                case -1:
                    System.out.println("Idade inválida.");
                    break;
                case 0:
                    System.out.println("Criança");
                    break;
                case 1:
                    System.out.println("Adolescente");
                    break;
                case 2:
                    System.out.println("Adulto");
                    break;
                case 3:
                    System.out.println("Idoso");
                    break;
            }
        } catch (Exception e) {
            System.out.printf("Erro: %s", e);
        } finally {
            scanner.close();
        }
    }
}
