
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) throws Exception {
        // Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As
        // perguntas são:
        // "Telefonou para a vítima?"
        // "Esteve no local do crime?"
        // "Mora perto da vítima?"
        // "Devia para a vítima?"
        // "Já trabalhou com a vítima?"

        // O usuário deve responder em cada pergunta: 1 para sim ou 0 para não. O
        // programa deve no final emitir uma classificação sobre a participação da
        // pessoa no crime. Se a pessoa responder sim em 2 questões ela deve ser
        // classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
        // "Assassino". Caso contrário, ele será classificado como "Inocente".
        Scanner Teclado = new Scanner(System.in);
        int pergunta1, pergunta2, pergunta3, pergunta4, pergunta5, totalRespostas;

        try {
            System.out.println("Responda 1 para SIM e 0 para NAO! ");
            System.out.println("Telefonou para a vitima? ");
            pergunta1 = Teclado.nextInt();
            if (pergunta1 != 0 && pergunta1 != 1) {
                System.out.println("Opcao Invalida!");
                System.exit(0);
            }

            System.out.println("Esteve no local do crime? ");
            pergunta2 = Teclado.nextInt();
            if (pergunta2 != 0 && pergunta2 != 1) {
                System.out.println("Opcao Invalida!");
                System.exit(0);
            }

            System.out.println("Mora perto da vítima? ");
            pergunta3 = Teclado.nextInt();
            if (pergunta3 != 0 && pergunta3 != 1) {
                System.out.println("Opcao Invalida!");
                System.exit(0);
            }

            System.out.println("Devia para a vítima? ");
            pergunta4 = Teclado.nextInt();
            if (pergunta4 != 0 && pergunta4 != 1) {
                System.out.println("Opcao Invalida!");
                System.exit(0);
            }

            System.out.println("Já trabalhou com a vítima? ");
            pergunta5 = Teclado.nextInt();
            if (pergunta5 != 0 && pergunta5 != 1) {
                System.out.println("Opcao Invalida!");
                System.exit(0);
            }

            totalRespostas = pergunta1 + pergunta2 + pergunta3 + pergunta4 + pergunta5;
            if (totalRespostas == 2) {
                System.out.println("A pessoa e suspeita!");
            } else if (totalRespostas == 3 || totalRespostas == 4) {
                System.out.println("A pessoa e cumplice!");
            } else if (totalRespostas == 5) {
                System.out.println("A pessoa e o assassino");
            } else {
                System.out.println("Inocente!");
            }

        } catch (InputMismatchException error) {
            System.out.printf("Forneca somente um inteiro! \n Erro: %s", error);
        } catch (Exception e) {
            System.out.printf("Erro: %s ", e);
        } finally {
            Teclado.close();
        }

    }
}
