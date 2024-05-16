/**
 * Cliente
 */
public class Cliente {
  protected String nome;
  protected final String CPF;

  public Cliente(String nome, String CPF) {
    this.nome = nome;
    this.CPF = CPF;
  }

  public String getNome() {
    return this.nome;
  }

  public String getCPF() {
    return this.CPF;
  }

  @Override
  public String toString() {
    return
      this.nome + "\n" +
      "CPF: " + this.CPF;
  } 
}