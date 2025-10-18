import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Gabriel Beltrame";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        System.out.println("************************************************");
        System.out.println("Nome:               " + nome);
        System.out.println("Tipo Conta:         " + tipoConta);
        System.out.println("Saldo Inicial:      R$ " + saldo);
        System.out.println("************************************************");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        String menu = """
                Qual operação deseja realizar?
                
                
                1- Consultar saldo
                2- Receber Valor
                3- Transferir Valor
                4- Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Seu saldo bancário é: R$ " + saldo);
                case 2:
                    System.out.println("Qual valor irá receber?");
                    double valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("Valor recebido! Seu novo saldo é R$ " + saldo);
                case 3:
                    System.out.println("Qual valor irá transferir?");
                    double valorTransferido = leitura.nextDouble();

                    if (valorTransferido > saldo){
                        System.out.println("Saldo indisponível para transferência!");
                    } else {
                        saldo -= valorTransferido;
                        System.out.println("Valor transferido! Seu novo saldo é R$ "+saldo);
                    }
                case 4:
                    break;
                default:
                    System.out.println("Essa opção não existe. Selecione uma opção válida!");;
            }
        }

    }
}
