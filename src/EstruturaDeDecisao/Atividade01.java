package EstruturaDeDecisao;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) throws Exception {

        // Faça um programa para a leitura de duas notas parciais de um aluno. O
        // programa deve calcular a média alcançada por aluno e apresentar:
        // A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        // A mensagem "Reprovado", se a média for menor do que sete;
        // A mensagem "Aprovado com Distinção", se a média for igual a dez.
        float nota1, nota2, media;
        Scanner Teclado = new Scanner(System.in);

        try {
            System.out.printf("Digite a nota 1: ");
            nota1 = Teclado.nextFloat();

            System.out.printf("Digite a nota 1: ");
            nota2 = Teclado.nextFloat();

            media = (nota1 + nota2) / 2;

            if (media >= 7) {
                System.out.printf("Aprovado  \n  Nota:  %s", media);
            } else if (media == 10) {
                System.out.printf("Aprovado Com Distincao  \n  Nota:  %s", media);
            } else {
                System.out.printf("Reprovado \n Nota: %s ", media);
            }

        } catch (Exception error) {
            System.out.printf("Erro: %s", error);
        } finally {
            Teclado.close();
        }
    }
}
