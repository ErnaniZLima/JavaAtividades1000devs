package EstruturaDeDecisao;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        // Álcool:
        // - até 20 litros, desconto de 3% por litro
        // - acima de 20 litros, desconto de 5% por litro

        // Gasolina:
        // - até 20 litros, desconto de 4% por litro

        // - acima de 20 litros, desconto de 6% por litro
        // Escreva um algoritmo que leia o número de litros vendidos, o tipo de
        // combustível como um número inteiro (codificado da seguinte forma: 1 - álcool,
        // 2 - gasolina),
        // calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do
        // litro da gasolina é R$ 5,50 e o preço do litro do álcool é R$ 3,90
        int quantidadeAbastecidaAlcool, quantidadeAbastecidaGasolina, tipoCombustivel;
        double valorAlcool, ValorGasolina;

        valorAlcool = 3.90;
        ValorGasolina = 5.50;

        try {
            System.out.print("Voce Deseja Abastecer com que tipo de combustivel? \n 1 - Alcool \n 2 - Gasolina\n ");
            tipoCombustivel = Teclado.nextInt();

            if (tipoCombustivel == 1) {

                System.out.print("Qual quantidade de alcool voce deseja abastecer: ");
                quantidadeAbastecidaAlcool = Teclado.nextInt();

                if (quantidadeAbastecidaAlcool <= 19.99) {

                    System.out.println("Valor Final: R$ " + (quantidadeAbastecidaAlcool * valorAlcool) * 0.97);
                    System.out.println("Seu Desconto foi de: R$ " + (quantidadeAbastecidaAlcool * valorAlcool) * 0.03);

                } else {

                    System.out.println("Valor Final: R$ " + (quantidadeAbastecidaAlcool * valorAlcool) * 0.95);
                    System.out.println("Seu Desconto foi de: R$ " + (quantidadeAbastecidaAlcool * valorAlcool) * 0.05);
                }

            } else if (tipoCombustivel == 2) {

                System.out.print("Qual quantidade de gasolina voce deseja abastecer: ");
                quantidadeAbastecidaGasolina = Teclado.nextInt();

                if (quantidadeAbastecidaGasolina <= 19.99) {

                    System.out.println("Valor Final: R$ " + (quantidadeAbastecidaGasolina * ValorGasolina) * 0.96);
                    System.out.println(
                            "Seu Desconto foi de: R$ " + (quantidadeAbastecidaGasolina * ValorGasolina) * 0.04);

                } else {

                    System.out.println("Valor Final: R$ " + (quantidadeAbastecidaGasolina * ValorGasolina) * 0.94);
                    System.out.println(
                            "Seu Desconto foi de: R$ " + (quantidadeAbastecidaGasolina * ValorGasolina) * 0.06);
                }

            } else {

                System.out.println("Opcao Invalida!");

            }
        } catch (Exception error) {
            System.out.printf("Erro! voce deve fornecer um numero inteiro! Erro: %s", error);

        } finally {
            Teclado.close();
        }
    }
}