public class Atividade02 {
    public static void main(String[] args) {
        double nota1 = 5.6;
        double nota2 = 9.8;
        //CALCULA A MÉDIA DAS DUAS NOTAS
        double media = (nota1 + nota2) / 2;
        System.out.println("A média das notas são: " + media);

        //FAZ O CASTING PARA RECEBER A MEDIA INTEIRA
        int mediaInteira = (int) media;
        System.out.println("A média inteira é: " + mediaInteira);

        //CONCATENA AS DUAS VARIAVEIS PARA EXIBIR A RESPOSTA CORRETA
        char letra = 'A';
        String palavra = "A resposta correta é a Letra: ";
        System.out.println(palavra + letra);

        //CALCULA O VALOR TOTAL DE UMA COMPRA
        double precoProduto = 15.75;
        int quantitade = 10;
        double valorTotal = precoProduto * quantitade;
        System.out.println(String.format("O valor total é: R$%.2f",valorTotal));

        //CONVERTE DÓLARES PARA REAIS
        double valorEmDolares = 5.6;
        double valorEmReais = valorEmDolares * 4.94;
        System.out.println(String.format("%.2f dólares equivale a %.2f reais",valorEmDolares,valorEmReais));

        //CALCULA VALOR FINAL COM DESCONTO
        double precoOriginal = 20;
        double percentualDesconto = 10;
        double DescontoEmDecimal = percentualDesconto / 100;
        double precoDescontado = precoOriginal - (precoOriginal * DescontoEmDecimal);
        System.out.println("O valor final é: " + precoDescontado);
    }
}
