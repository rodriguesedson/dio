import java.util.List;

/**
 * Banco
 */
public class Banco {
  private String nome;
  private String CNPJ;
  private List<Conta> contas;

  public Banco(String nome, String CNPJ) {
    this.nome = nome;
    this.CNPJ = CNPJ;
    this.contas = contas;
  }

  public String getNome() {
    return nome;
  }

  public String getCNPJ() {
    return CNPJ;
  }

  public List<Conta> getContas() {
    return contas;
  }

  public void adicionarConta(Conta conta) {
    contas.add(conta);
  }

  @Override
  public String toString() {
    return 
      "Banco " + nome + "\n" +
      "CNPJ: " + CNPJ;
  }
}