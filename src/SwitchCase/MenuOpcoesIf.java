package SwitchCase;

import java.util.Scanner;

public class MenuOpcoesIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("MENU:");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Editar usuário");
            System.out.println("4 - Remover usuário");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
    
            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar usuário");
                    // aqui futuramente teremos os comandos para cadastrar o usuário
                    break;
                case 2:
                    System.out.println("Listar usuários");
                    // aqui futuramente teremos os comandos para listar o usuário
                    break;
                case 3:
                    System.out.println("Editar usuário");
                    // aqui futuramente teremos os comandos para editar o usuário
                    break;
                case 4:
                    System.out.println("Remover usuário");
                    // aqui futuramente teremos os comandos para remover o usuário
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } catch (Exception e) {
            System.out.printf("Erro: %s", e);
        }

        scanner.close();
    }
}