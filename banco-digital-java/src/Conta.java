/**
 * Conta
 */
public abstract class Conta implements IConta {
  private static final int AGENCIA = 1;
  private static int SEQUENCIAL = 1;

  private int agencia;
  private int numero;
  private double saldo;
  private Cliente titular;

  public Conta(Cliente titular) {
    this.agencia = agencia;
    this.numero = SEQUENCIAL++;
    this.titular = titular;
  }

  public void sacar(double valor) {
    this.saldo -= valor;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void transferir(double valor, Conta contaDestino) {
    this.saldo -= valor;
    contaDestino.depositar(valor);
  }

  public Cliente getTitular() {
    return titular;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  @Override
  public String toString() {
    return
      "Titular: " + this.titular + "\n" +
      "Agência: " + this.agencia + "\n" +
      "Número: " + this.numero;
  } 
}