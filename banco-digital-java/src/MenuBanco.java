import java.util.Scanner;

public class MenuBanco {
  Scanner scanner = new Scanner(System.in);
  int operacao;
  boolean continuar = true;
  double valor;
  int opcaoConta;
  Conta contaDestinataria;

  public void menu(Conta conta) {
    System.out.println(
      "Digite a operação desejada" + "\n" +
      "=== === === === === ===" + "\n" +
      "1 - Extrato" + "\n" +
      "2 - Sacar" + "\n" +
      "3 - Depositar" + "\n" +
      "4 - Transferir" + "\n" +
      "0 - Sair"
    );

    operacao = scanner.nextInt();

    do {
      switch(operacao) {
        case 1:
          conta.imprimirExtrato();
          break;
        case 2:
          System.out.println("Qual o valor do saque?");
          valor = scanner.nextDouble();
          conta.sacar(valor);
          break;
        case 3:
          System.out.println("Qual o valor do depósito?");
          valor = scanner.nextDouble();
          break;
        case 4:
          System.out.println("Qual a conta destinatária?");
          opcaoConta = scanner.nextInt();
                    
        case 0:
          continuar = false;
      }
    } while(continuar == true);
  }
}
