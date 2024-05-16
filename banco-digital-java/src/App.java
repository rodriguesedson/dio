import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Banco pequeno = new Banco("Pequeno", "11.111.111/1111-11");
        Cliente clientePoucaPosse = new Cliente("Pouca Posse", "000.000.000-00");
        Conta cc = new ContaCorrente(clientePoucaPosse);
        Conta cp = new ContaPoupanca(clientePoucaPosse);
        double valor;
        int conta_opcao;
        Conta conta_operacao1;
        Conta conta_operacao2;
        boolean sistema_ativo = true;

        System.out.println("Bem-vindo(a) ao Banco " + pequeno.getNome() + ".");

        do {
            System.out.println(
                "Qual operação deseja realizar?" + "\n" +
                "1 - Depositar" + "\n" +
                "2 - Sacar" + "\n" +
                "3 - Transferir" + "\n" +
                "4 - Extrato" + "\n" +
                "0 - Sair"
            );

            int opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Qual o valor a depositar?");
                    valor = scanner.nextDouble();
                    System.out.println("Qual a conta a receber o depósito?" + "\n" + "1 = Corrente / 2 = Poupança");
                    conta_opcao = scanner.nextInt();
                    conta_operacao1 = (conta_opcao == 1) ? cc : cp;
                    conta_operacao1.depositar(valor);
                    break;
                case 2:
                    System.out.println("Qual o valor a sacar?");
                    valor = scanner.nextDouble();
                    System.out.println("Qual de saque?" + "\n" + "1 = Corrente / 2 = Poupança");
                    conta_opcao = scanner.nextInt();
                    conta_operacao1 = (conta_opcao == 1) ? cc : cp;
                    conta_operacao1.sacar(valor);
                    break;
                case 3:
                    System.out.println("Qual o valor a transferir?");
                    valor = scanner.nextDouble();
                    System.out.println("Qual a conta de origem?" + "\n" + "1 = Corrente / 2 = Poupança");
                    conta_opcao = scanner.nextInt();
                    conta_operacao1 = (conta_opcao == 1) ? cc : cp;
                    System.out.println("Qual a conta de destino?" + "\n" + "1 = Corrente / 2 = Poupança");
                    conta_opcao = scanner.nextInt();
                    conta_operacao2 = (conta_opcao == 1) ? cc : cp;
                    conta_operacao1.transferir(valor, conta_operacao2);
                    break;
                case 4:
                    System.out.println("Qual a conta do extrato?" + "\n" + "1 = Corrente / 2 = Poupança");
                    conta_opcao = scanner.nextInt();
                    conta_operacao1 = (conta_opcao == 1) ? cc : cp;
                    conta_operacao1.imprimirExtrato();
                    break;
                case 0:
                    System.out.println("Fechando o sistema.");
                    sistema_ativo = false;
                    break;
            }
        } while (sistema_ativo);
    }
}