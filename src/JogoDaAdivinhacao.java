import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {

        int numeroGerado = new Random().nextInt(100);
        int quantidadeTentativas = 0;
        boolean correto = false;
        Scanner leitura = new Scanner(System.in);


        while (quantidadeTentativas < 5 && correto != true) {
            System.out.println("Tente adivinhar o número gerado");
            int tentativa = leitura.nextInt();

            if (tentativa == numeroGerado){
                correto = true;
            } else if (tentativa < numeroGerado) {
                System.out.println("O número aleatório é maior do que sua tentativa");
            } else {
                System.out.println("O número aleatório é menor do que sua tentativa");
            }
        }

        if (correto){
            System.out.println("Parabéns, você acertou o número");
        } else {
            System.out.println("Infelizmente você não conseguiu acertar em 5 tentativas");
        }

    }
}
