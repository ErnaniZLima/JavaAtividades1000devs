package AtividadeForca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Forca {
    public static void main(String[] args) throws Exception {
        int vidas = 6; // quantidade inicial de vidas
        char letraChutada; // letra digitada pelo jogador
        Scanner Teclado = new Scanner(System.in); // scanner para entrada do teclado

        try {
            Random random = new Random(); // objeto para gerar número aleatório
            File arquivo = new File("Z:\\Java\\Atividades\\Java-atividades-1000devs\\src\\AtividadeForca\\dados.txt");
            // caminho do arquivo com as palavras possíveis

            Scanner leitor = new Scanner(arquivo); // scanner para ler o arquivo

            List<Character> chute = new ArrayList<>(); // lista para armazenar as letras já chutadas
            List<String> linhas = new ArrayList<>(); // lista para armazenar todas as palavras do arquivo

            // lê todas as linhas (palavras) do arquivo e armazena na lista
            while (leitor.hasNextLine()) {
                linhas.add(leitor.nextLine());
            }

            // escolhe uma palavra aleatória da lista
            int indiceAleatorio = random.nextInt(linhas.size());
            String PalavraSecreta = linhas.get(indiceAleatorio).toLowerCase(); // transforma em minúsculas

            // cria a máscara inicial com “___” para cada letra da palavra
            String[] mascara = new String[PalavraSecreta.length()];
            for (int i = 0; i < mascara.length; i++) {
                mascara[i] = "___";
            }

            // loop principal do jogo — continua enquanto o jogador tiver vidas
            while (vidas != 0) {

                // tenta limpar o console (funciona apenas no Windows)
                try {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (Exception e) {
                    // se não for Windows, apenas imprime várias linhas em branco
                    for (int i = 0; i < 50; i++)
                        System.out.println();
                }

                // mostra o desenho atual do boneco conforme as vidas restantes
                System.out.println(Vidas.valor(vidas));

                // exibe a palavra atual (com acertos e underlines)
                System.out.println("\nPalavra:");
                for (String parte : mascara) {
                    System.out.print(parte + " ");
                }
                System.out.println("\n");

                // mostra letras que já foram chutadas
                System.out.print("Letras chutadas: ");
                for (char c : chute) {
                    System.out.print(c + " ");
                }
                System.out.println("\n");

                // solicita uma nova letra ao jogador
                System.out.print("Digite uma letra: ");
                letraChutada = Character.toLowerCase(Teclado.next().charAt(0)); // pega a letra e converte para
                                                                                // minúscula

                // se a letra já foi chutada, avisa e continua
                if (chute.contains(letraChutada)) {
                    System.out.println("Você já chutou essa letra!");
                    Thread.sleep(1000); // pausa 1 segundo
                    continue; // volta ao início do while
                }

                chute.add(letraChutada); // adiciona a letra chutada à lista

                boolean acertou = false; // controla se o jogador acertou pelo menos uma letra

                // percorre a palavra secreta e revela as letras corretas na máscara
                for (int i = 0; i < PalavraSecreta.length(); i++) {
                    if (PalavraSecreta.charAt(i) == letraChutada) {
                        mascara[i] = " " + letraChutada + " ";
                        acertou = true;
                    }
                }

                // se não acertou nenhuma letra, perde uma vida
                if (!acertou) {
                    vidas--;
                }

                // verifica se o jogador já completou a palavra
                boolean ganhou = true;
                for (int i = 0; i < mascara.length; i++) {
                    if (mascara[i].equals("___")) {
                        ganhou = false;
                        break;
                    }
                }

                // se todas as letras foram reveladas, encerra o jogo com vitória
                if (ganhou) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("Parabéns! Você acertou a palavra: " + PalavraSecreta.toUpperCase());
                    break;
                }

                // se acabaram as vidas, encerra o jogo com derrota
                if (vidas == 0) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println(Vidas.valor(1)); // mostra boneco completo
                    System.out.println("Fim de jogo!");
                    System.out.println("A palavra era: " + PalavraSecreta.toUpperCase());
                }
            }

            leitor.close(); // fecha o leitor do arquivo

        } catch (FileNotFoundException e) {
            // caso o arquivo não seja encontrado
            System.out.println("Arquivo Nao Encontrado!");
        } finally {
            // garante que o Scanner do teclado será fechado
            Teclado.close();
        }
    }
}
