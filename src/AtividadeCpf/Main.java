package AtividadeCpf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cpf;

        int d1, d2, d3, d4, d5, d6, d7, d8, d9, verificador1, verificador2, codigoVerificador1, codigoVerificador2;

        int parte1, parte2;
        int restoDivisao1, restoDivisao2;

        try {
            System.out.println("Digite o seu CPF: ");
            cpf = teclado.nextLine();
            cpf = cpf.replaceAll("[^0-9]", "");

            // charat devolve o codigo ascii (decimal) do digito conforme a tabela
            // como os digitos iniciam na posicao decimal 48 (0 = 48), (1 = 49)
            d1 = cpf.charAt(0) - 48; // primeiro digito
            d2 = cpf.charAt(1) - 48; // segundo digito
            d3 = cpf.charAt(2) - 48; // terceiro digito
            d4 = cpf.charAt(3) - 48; // quarto digito
            d5 = cpf.charAt(4) - 48; // quinto digito
            d6 = cpf.charAt(5) - 48; // sexto digito
            d7 = cpf.charAt(6) - 48; // setimo digito
            d8 = cpf.charAt(7) - 48; // oitavo digito
            d9 = cpf.charAt(8) - 48; // nono digito
            verificador1 = cpf.charAt(9) - 48; // verificador1
            verificador2 = cpf.charAt(10) - 48; // verificador2

            if (cpf.length() <= 11) {
                if (d1 == d2 && d2 == d3 && d4 == d5 && d5 == d6 && d6 == d7 && d7 == d8 && d8 == d9
                        && d9 == verificador1
                        && verificador1 == verificador2) {
                    System.out.println("CPF Invalido!");
                }
            } else {
                System.out.println("CPF Invalido!");
            }

            parte1 = (d1 * 10) + (d2 * 9) + (d3 * 8) + (d4 * 7) + (d5 * 6) + (d6 * 5) + (d7 * 4) + (d8 * 3) + (d9 * 2);

            restoDivisao1 = parte1 % 11;

            if (restoDivisao1 < 2) {
                codigoVerificador1 = 0;
            } else {
                codigoVerificador1 = 11 - restoDivisao1;
            }

            parte2 = (d1 * 11) + (d2 * 10) + (d3 * 9) + (d4 * 8) + (d5 * 7) + (d6 * 6) + (d7 * 5) + (d8 * 4) + (d9 * 3)
                    + (codigoVerificador1 * 2);
            restoDivisao2 = parte2 % 11;

            if (restoDivisao2 < 2) {
                codigoVerificador2 = 0;
            } else {
                codigoVerificador2 = 11 - restoDivisao2;
            }

            if (verificador1 == codigoVerificador1 && verificador2 == codigoVerificador2) {
                System.out.println("CPF VALIDO!");
            } else {
                System.out.println("CPF INVALIDO!");
            }

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Digite Somente Numeros Inteiros!");
        } catch (Exception erro) {
            System.out.printf("Erro: %s ", erro);
        } finally {
            teclado.close();
        }

    }
}