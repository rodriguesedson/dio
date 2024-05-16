/**
 * ContaPoupanca
 */
public class ContaPoupanca extends Conta {
  public ContaPoupanca(Cliente cliente) {
    super(cliente);
  }
  
  public void imprimirExtrato() {
    System.out.println(
      "Extrato Conta Poupança" + "\n" +
      this.toString() + "\n" +
      "Saldo atual: " + this.getSaldo()
    );
  }
}