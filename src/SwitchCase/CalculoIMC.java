package SwitchCase;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite seu peso (kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Digite sua altura (m): ");
            double altura = scanner.nextDouble();

            double imc = peso / (altura * altura);
            System.out.printf("Seu IMC é: %.2f\n", imc);

            int faixa;
            if (imc < 18.5) {
                faixa = 0;
            } else if (imc < 25) {
                faixa = 1;
            } else if (imc < 30) {
                faixa = 2;
            } else if (imc < 35) {
                faixa = 3;
            } else if (imc < 40) {
                faixa = 4;
            } else {
                faixa = 5;
            }

            switch (faixa) {
                case 0:
                    System.out.println("Abaixo do peso");
                    break;
                case 1:
                    System.out.println("Peso Normal");
                    break;
                case 2:
                    System.out.println("Sobrepeso");
                    break;
                case 3:
                    System.out.println("Obesidade grau I");
                    break;
                case 4:
                    System.out.println("Obesidade grau II");
                    break;
                case 5:
                    System.out.println("Obesidade grau III");
                    break;
                default:
                    System.out.println("Erro ao calcular IMC");
                    break;
            }

        } catch (Exception e) {
            System.out.printf("Erro: %s", e);
        } finally {
            scanner.close();
        }
    }
}
