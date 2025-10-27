package EstruturaDeDecisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) throws Exception {
        // Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
        // descontos são do Imposto de Renda,
        // que depende dosalário bruto (conforme tabela abaixo) e 3% para o Sindicato e
        // que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a
        // empresa que deposita).
        // O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa
        // deverá pedir ao usuário o valor da sua hora e a quantidade de horas
        // trabalhadas no mês.
        // Desconto do IR:
        // Salário Bruto até 900 (inclusive) - isento
        // Salário Bruto até 1500 (inclusive) - desconto de 5%
        // Salário Bruto até 2500 (inclusive) - desconto de 10%
        // Salário Bruto acima de 2500 - desconto de 20%

        // Imprima na tela as informações, dispostas conforme o exemplo abaixo.

        // Exemplo:
        // QTDE de Horas Trabalhadas: 5
        // Valor da hora trabalhada R$: 220.00
        // Salário Bruto: (5 * 220) : R$ 1.100,00
        // (-) IR (5%) : R$ 55,00
        // (-) INSS ( 10%) : R$ 110,00
        // (-) Sindicato (3%) : R$ 33,00
        // FGTS (11%) : R$ 121,00
        // Total de descontos : R$ 198,00
        // Salário Liquido : R$ 902,00
        Scanner Teclado = new Scanner(System.in);
        float salarioBruto, descontoIR, descontoSindicato, fgts, inss, valorHora, horasTrabalhadas, totalDescontos;

        descontoIR = 0f;
        inss = 0.1f;
        fgts = 0.11f;
        descontoSindicato = 0.03f;

        try {
            System.out.print("Quanto voce recebe por hora: ");
            valorHora = Teclado.nextFloat();

            System.out.print("Quantas horas voce trabalhou: ");
            horasTrabalhadas = Teclado.nextFloat();

            salarioBruto = valorHora * horasTrabalhadas;

            if (salarioBruto <= 900) {

                totalDescontos = (descontoSindicato * salarioBruto) + (inss * salarioBruto);
                System.out.printf("QTDS de Horas Trabalhadas: %s \n", horasTrabalhadas);
                System.out.printf("Valor da Horas Trabalhada: R$ %s \n", valorHora);
                System.out.printf("Salario Bruto: R$ %s\n", salarioBruto);
                System.out.printf("(-) IR (Isento): R$ 0\n");
                System.out.printf("(-) INSS (%.0f %%): R$ %s\n", (inss * 100), (inss * salarioBruto));
                System.out.printf("(-) Sindicato (%.0f %%): R$ %s\n", (descontoSindicato * 100),
                        (descontoSindicato * salarioBruto));
                System.out.printf("FGTS (%.0f %%): R$ %s \n", (fgts * 100), (fgts * salarioBruto));
                System.out.printf("Total Descontos: R$ %s \n", totalDescontos);
                System.out.printf("Salario Liquido: R$ %s", salarioBruto - totalDescontos);

            } else if (salarioBruto <= 1500) {

                totalDescontos = (descontoSindicato * salarioBruto) + (inss * salarioBruto)
                        + ((descontoIR + 0.05f) * salarioBruto);
                System.out.printf("QTDS de Horas Trabalhadas: %s \n", horasTrabalhadas);
                System.out.printf("Valor da Horas Trabalhada: R$ %s \n", valorHora);
                System.out.printf("Salario Bruto: R$ %s\n", salarioBruto);
                System.out.printf("(-) IR (%.0f %%): R$ %s\n ", (descontoIR + 0.05f * 100),
                        (salarioBruto * (descontoIR + 0.05f)));
                System.out.printf("(-) INSS (%.0f %%): R$ %s\n", (inss * 100), (inss * salarioBruto));
                System.out.printf("(-) Sindicato (%.0f %%): R$ %s\n", (descontoSindicato * 100),
                        (descontoSindicato * salarioBruto));
                System.out.printf("FGTS (%.0f %%): R$ %s \n", (fgts * 100), (fgts * salarioBruto));
                System.out.printf("Total Descontos: R$ %s \n", totalDescontos);
                System.out.printf("Salario Liquido: R$ %s", salarioBruto - totalDescontos);

            } else if (salarioBruto <= 2500) {

                totalDescontos = (descontoSindicato * salarioBruto) + (inss * salarioBruto)
                        + ((descontoIR + 0.10f) * salarioBruto);
                System.out.printf("QTDS de Horas Trabalhadas: %s \n", horasTrabalhadas);
                System.out.printf("Valor da Horas Trabalhada: R$ %s \n", valorHora);
                System.out.printf("Salario Bruto: R$ %s\n", salarioBruto);
                System.out.printf("(-) IR (%.0f %%): R$ %s\n ", (descontoIR + 0.10f * 100),
                        (salarioBruto * (descontoIR + 0.10f)));
                System.out.printf("(-) INSS (%.0f %%): R$ %s\n", (inss * 100), (inss * salarioBruto));
                System.out.printf("(-) Sindicato (%.0f %%): R$ %s\n", (descontoSindicato * 100),
                        (descontoSindicato * salarioBruto));
                System.out.printf("FGTS (%.0f %%): R$ %s \n", (fgts * 100), (fgts * salarioBruto));
                System.out.printf("Total Descontos: R$ %s \n", totalDescontos);
                System.out.printf("Salario Liquido: R$ %s", salarioBruto - totalDescontos);

            } else {

                totalDescontos = (descontoSindicato * salarioBruto) + (inss * salarioBruto)
                        + ((descontoIR + 0.20f) * salarioBruto);
                System.out.printf("QTDS de Horas Trabalhadas: %s \n", horasTrabalhadas);
                System.out.printf("Valor da Horas Trabalhada: R$ %s \n", valorHora);
                System.out.printf("Salario Bruto: R$ %s\n", salarioBruto);
                System.out.printf("(-) IR (%.0f %%): R$ %s\n ", (descontoIR + 0.20f * 100),
                        (salarioBruto * (descontoIR + 0.20f)));
                System.out.printf("(-) INSS (%.0f %%): R$ %s\n", (inss * 100), (inss * salarioBruto));
                System.out.printf("(-) Sindicato (%.0f %%): R$ %s\n", (descontoSindicato * 100),
                        (descontoSindicato * salarioBruto));
                System.out.printf("FGTS (%.0f %%): R$ %s \n", (fgts * 100), (fgts * salarioBruto));
                System.out.printf("Total Descontos: R$ %s \n", totalDescontos);
                System.out.printf("Salario Liquido: R$ %s", salarioBruto - totalDescontos);
            }

        } catch (InputMismatchException erro) {

            System.out.printf("O valor deve ser um inteiro, e nao utilizar pontos! \n Erro : %s", erro);

        } catch (Exception e) {

            System.out.printf("Erro: %s", e);

        } finally {

            Teclado.close();
        }
    }
}
