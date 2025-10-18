import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int quantidadeAvaliacoes = 0;
        boolean continuar = true;


        while (continuar) {
            System.out.println("Diga sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
            quantidadeAvaliacoes++;

            System.out.println("Deseja inserir outra avaliação? [S/N]");
            String pergunta = leitura.nextLine();
            if (pergunta.equals("N")){
                continuar = false;
            }
        }

        mediaAvaliacao = mediaAvaliacao / quantidadeAvaliacoes;

        System.out.println("A média de avaliação do filme é: " + mediaAvaliacao);

    }
}

