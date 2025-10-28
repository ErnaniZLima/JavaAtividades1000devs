package OperadorTernario;

import java.util.Scanner;

public class Codigo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            // Lê a nota informada pelo usuário
            System.out.print("Digite a nota do aluno: ");
            int nota = teclado.nextInt();
    
            String status;
    
            // Verifica se a nota é maior ou igual a 70
            // Se for, o aluno está aprovado; caso contrário, reprovado
            status = (nota >= 70) ? "Aprovado" : "Reprovado";
    
            // Exibe o status final do aluno
            System.out.println("Status do aluno: " + status);
        } catch (Exception e) {
            System.out.printf("Erro: %s", e);
        }finally{
            teclado.close();
        }

    }
}