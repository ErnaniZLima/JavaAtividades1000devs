
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) throws Exception {

        // Faça um Programa que leia um número inteiro menor que 1000 e imprima a
        // quantidade de centenas, dezenas e unidades do mesmo. Observando os termos no
        // plural a colocação do "e", da vírgula entre outros. Exemplo:
        // 326 = 3 centenas, 2 dezenas e 6 unidades
        // 12 = 1 dezena e 2 unidades
        // Testar com: 326, 300, 100, 320, 310, 305, 301, 101, 311, 111, 25, 20, 10, 21,
        // 11, 1, 7 e 16

        Scanner Teclado = new Scanner(System.in);
        int numero, valores;
        try {
            System.out.print("Digite um valor inteiro: ");
            numero = Teclado.nextInt();
            if (numero <= 1000) {
                valores = numero / 100;
                numero = numero % 100;
                if (valores > 1 && valores < 11) {
                    System.out.printf("%s Centenas\n", valores);
                } else if (valores == 1) {
                    System.out.printf("%s Centena\n", valores);
                }
                valores = numero / 10;
                numero = numero % 10;
                if (valores > 1 && valores < 9) {
                    System.out.printf("%d Dezenas\n", valores);
                } else if (valores == 1)
                    System.out.printf("%d Dezena\n", valores);
                valores = numero / 1;
                numero = numero % 1;
                if (valores > 1 && valores < 9) {
                    System.out.printf("%d Unidades\n", valores);
                } else if (valores == 1) {
                    System.out.printf("%d Unidade\n", valores);
                }
            } else {
                System.out.println("O valor deve ser no maximo 1000! ");
            }
        } catch (InputMismatchException e) {
            System.out.printf("O valor deve ser um inteiro!, Erro: %s", e);
        } catch (Exception erro) {
            System.out.printf("Erro: %s", erro);
        } finally {
            Teclado.close();
        }
    }
}
