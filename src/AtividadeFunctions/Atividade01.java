package AtividadeFunctions;

public class Atividade01 {
    public static void main(String[] args) throws Exception{
        System.out.println(somar(8, 1.8));

    }

    public static double somar(double kg, double preco) {
        double valor = (kg > 5)? (preco - 0.30): preco;
        double precoFinal = kg * valor;
        return precoFinal;
    }

}
