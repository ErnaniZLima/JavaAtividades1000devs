
import  java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) throws Exception{
//  Um empresa resolveu dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que 
//  calcularáos reajustes. Faça um programa que recebe o salário de um colaborador e faça o reajuste segundo o 
//  seguinte critério, baseado no salário atual:

// - salários até R$ 280,00 (incluindo) : aumento de 20%
// - salários entre R$ 280,00 e R$ 700,00: aumento de 15%
// - salários entre R$ 700,00 e R$ 1500,00: aumento de 10%
// - salários de R$ 1500,00 em diante: aumento de 5%

// Após o aumento ser realizado, informe na tela:

// - o salário antes do reajuste;
// - o percentual de aumento aplicado;
// - o valor do aumento;
// - o novo salário, após o aumento.

    float salario, reajuste20, reajuste15, reajuste10, reajuste5, salarioNovo, valorAumento;
    Scanner Teclado = new Scanner(System.in);
    
    reajuste20 =  0.20f;
    reajuste15 =  0.15f;
    reajuste10 = 0.10f;
    reajuste5 = 0.05f;
        try{
            System.out.print("Qual e o seu salario:  ");
            salario = Teclado.nextFloat();

            if(salario <= 280){
                valorAumento = salario * reajuste20;
                salarioNovo = valorAumento + salario;

                System.out.printf("Valor do salario antes do aumento: R$ %s \n", salario);
                System.out.printf("Valor do percentual de aumento:  %.2f %% \n", reajuste20 * 100); 
                System.out.printf("Valor do aumento: R$ %s \n", valorAumento); 
                System.out.printf("Valor do novo salario: R$ %s ", salarioNovo); 

            }else if(salario <= 700){
                valorAumento = salario * reajuste15;
                salarioNovo = valorAumento + salario;

                System.out.printf("Valor do salario antes do aumento: R$ %s \n", salario);
                System.out.printf("Valor do percentual de aumento:  %.2f %% \n", reajuste15 * 100); 
                System.out.printf("Valor do aumento: R$ %s \n", valorAumento); 
                System.out.printf("Valor do novo salario: R$ %s ", salarioNovo); 

            }else if(salario <= 1500){
                valorAumento = salario * reajuste10;
                salarioNovo = valorAumento + salario;

                System.out.printf("Valor do salario antes do aumento: R$ %s \n", salario);
                System.out.printf("Valor do percentual de aumento:  %.2f %% \n", reajuste10 * 100); 
                System.out.printf("Valor do aumento: R$ %s \n", valorAumento); 
                System.out.printf("Valor do novo salario: R$ %s ", salarioNovo); 
            }else{
                valorAumento = salario * reajuste5;
                salarioNovo = valorAumento + salario;

                System.out.printf("Valor do salario antes do aumento: R$ %s \n", salario);
                System.out.printf("Valor do percentual de aumento:  %.2f %% \n", reajuste5 * 100); 
                System.out.printf("Valor do aumento: R$ %s \n", valorAumento); 
                System.out.printf("Valor do novo salario: R$ %s ", salarioNovo);    
            }
        }catch(Exception erro){
            System.out.printf("Erro: ", erro);
        }finally{
            Teclado.close();
        }
    }
}
