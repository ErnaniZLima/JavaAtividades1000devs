
import java.util.Scanner;
import java.util.InputMismatchException;

public class Atividade07 {
    public static void main(String[] args) throws Exception {
        // Faça um programa que lê as duas notas parciais obtidas por um aluno numa
        // disciplina ao longo de um semestre,
        // e calcule a suamédia apresentando na tela qual o conceito obtido. A
        // atribuição de conceitos obedece à tabela abaixo:

        // Média de Aproveitamento
        // Intervalo dos Valores Conceito
        // Entre 9 e 10 A
        // Entre 7.5 e 9 B
        // Entre 6 e 7.5 C
        // Entre 4 e 6 D
        // Entre 0 e 4 E
        Scanner Teclado = new Scanner(System.in);
        float nota1, nota2, media;

        try {
            System.out.print("Digite a nota 1: ");
            nota1 = Teclado.nextFloat();

            System.out.print("Digite a nota 2: ");
            nota2 = Teclado.nextFloat();

            media = ((nota1 + nota2) / 2);

            if (media >= 9f && media <= 10) {
                System.out.print("A");
            } else if (media >= 7.5f && media < 9f) {
                System.out.print("B");
            } else if (media >= 6f && media < 7.5f) {
                System.out.print("C");
            } else if (media >= 4f && media < 6f) {
                System.out.print("D");
            } else if (media >= 0f && media < 4) {
                System.out.print("E");
            }
        } catch (InputMismatchException erro) {

            System.out.printf("O valor deve ser um float, nao utilize pontos! \n Erro: %s", erro);

        } catch (Exception e) {

            System.out.printf("Erro: %s ", e);

        } finally {

            Teclado.close();

        }
    }
}
