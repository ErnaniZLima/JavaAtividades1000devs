package EstruturaDeDecisao;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        // Exercício 03: Uma loja de venda de frutas está vendendo frutas com a seguinte
        // tabela de preços:
        // - Até 5 Kg: Morango R$ 2,50 por Kg e Maçã R$ 1,80 por Kg
        // - Acima de 5 Kg: Morango R$ 2,20 por Kg e Maçã R$ 1,50 por Kg
        // Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
        // ultrapassar
        // R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um
        // algoritmo para ler
        // a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e
        // escreva o valor
        // a ser pago pelo cliente.
        double precoMorango, precoMaca, quantidade, valorFinal;
        int valorMenu;
        Scanner Teclado = new Scanner(System.in);

        precoMaca = 1.80;
        precoMorango = 2.50;

        try {
            System.out.print("Voce deseja comprar que fruta?\n");
            System.out.print("1 - Maca\n");
            System.out.print("2 - Morango ");
            valorMenu = Teclado.nextInt();

            if (valorMenu == 1) {

                System.out.print("Que quantidade de Maca voce deseja comprar ?");
                quantidade = Teclado.nextDouble();
                if (quantidade <= 5) {
                    valorFinal = quantidade * precoMaca;
                    if (valorFinal >= 25) {
                        System.out.printf("Valor final: R$ %s ", valorFinal * 0.9);
                        System.out.printf("Quantidade: %s  Kg", quantidade);
                    } else {
                        System.out.printf("Valor final: R$ %s \n", valorFinal);
                        System.out.printf("Quantidade: %s  Kg", quantidade);
                    }
                } else if (quantidade >= 5) {
                    valorFinal = quantidade * (precoMaca - 0.3);
                    if (valorFinal >= 25) {
                        System.out.printf("Valor final: R$ %s ", valorFinal * 0.9);
                        System.out.printf("Quantidade: %s  Kg", quantidade);
                    } else if (quantidade >= 8) {
                        System.out.printf("Valor final: R$ %s ", valorFinal * 0.9);
                        System.out.printf("Quantidade: %s  Kg", quantidade);
                    } else {
                        System.out.printf("Valor final: R$ %s ", valorFinal);
                        System.out.printf("Quantidade: %s  Kg", quantidade);
                    }

                }

            } else if (valorMenu == 2) {
                System.out.print("Que quantidade de Morango voce deseja comprar ?");
                quantidade = Teclado.nextDouble();
                if (quantidade <= 5) {
                    valorFinal = quantidade * precoMorango;
                    if (valorFinal >= 25) {
                        System.out.printf("Valor final: R$ %s ", valorFinal * 0.9);
                        System.out.printf("Quantidade: %s  Kg", quantidade);
                    } else {
                        System.out.printf("Valor final: R$ %s \n", valorFinal);
                        System.out.printf("Quantidade: %s  Kg", quantidade);
                    }
                } else if (quantidade >= 5) {
                    valorFinal = quantidade * (precoMorango - 0.3);
                    if (valorFinal >= 25) {
                        System.out.printf("Valor final: R$ %s \n", valorFinal * 0.9);
                        System.out.printf("Quantidade: %s  Kg", quantidade);
                    } else if (quantidade >= 8) {
                        System.out.printf("Valor final: R$ %s \n", valorFinal * 0.9);
                        System.out.printf("Quantidade: %s  Kg", quantidade);
                    } else {
                        System.out.printf("Valor final: R$ %s \n", valorFinal);
                        System.out.printf("Quantidade: %s  Kg", quantidade);
                    }
                }
            }
        } catch (Exception erro) {

            System.out.printf("Erro: %s ", erro);

        } finally {

            Teclado.close();

        }

    }
}
