package EstruturaDeDecisao;

import java.util.Scanner;
import java.util.InputMismatchException;

// Faça um Programa que solicite um dia, um mês e um ano e determine se estes números forma uma data válida. 
//Não utilize nenhuma biblioteca adicional do Java para isto.Faça apenas utilizando estrutruas de decisão. Pesquise como identificar se um ano é um número bisexto.
// Exemplo 01:
// Digite o dia: 29
// Digite o mês: 02
// Digite o ano: 2016
// A data 29/02/2016 é válida
// Exemplo 02:
// Digite o dia: 29
// Digite o mês: 02
// Digite o ano: 2017
// A data 29/02/2017 é inválida
// Exemplo 03:
// Digite o dia: 31
// Digite o mês: 04
// Digite o ano: 2017
// A data 31/04/2017 é inválida
// Exemplo 04:
// Digite o dia: 30
// Digite o mês: 04
// Digite o ano: 2017
// A data 30/04/2017 é válida

public class Atividade13 {
    public static void main(String[] args) throws Exception {

        int dia, mes, ano;
        Scanner Teclado = new Scanner(System.in);

        try {

            System.out.print("Informe um dia: ");
            dia = Teclado.nextInt();

            System.out.print("Informe um mes: ");
            mes = Teclado.nextInt();

            System.out.print("Informe um ano: ");
            ano = Teclado.nextInt();

            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia < 32 && dia >= 1) {
                    System.out.printf("A data %s/%s/%s e Valida", dia, mes, ano);
                } else {
                    System.out.printf("A data %s/%s/%s e invalida", dia, mes, ano);
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia < 31 && dia >= 1) {
                    System.out.printf("A data %s/%s/%s e Valida", dia, mes, ano);
                } else {
                    System.out.printf("A data %s/%s/%s e invalida", dia, mes, ano);
                }
            } else if (mes == 2) {
                if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0) && dia == 29)) {
                    System.out.printf("A data %s/%s/%s e Valida", dia, mes, ano);
                } else if (dia < 29 && dia >= 1) {
                    System.out.printf("A data %s/%s/%s e Valida", dia, mes, ano);
                } else {
                    System.out.printf("A data %s/%s/%s e invalida", dia, mes, ano);
                }
            } else {
                System.out.println("Mes Invalido!");
            }

        } catch (InputMismatchException e) {
            System.out.printf("Erro: %s", e);
        } finally {
            Teclado.close();
        }
    }
}