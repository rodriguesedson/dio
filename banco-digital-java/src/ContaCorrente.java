/**
 * ContaCorrente
 */
public class ContaCorrente extends Conta {
  public ContaCorrente(Cliente cliente) {
    super(cliente);
  }

  public void imprimirExtrato() {
    System.out.println(
      "Extrato Conta Corrente" + "\n" +
      this.toString() + "\n" +
      "Saldo atual: " + this.getSaldo()
    );
  }
}