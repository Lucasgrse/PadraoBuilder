public class Diretor {
  private ContatoBuilder contatoBuilder;

  public void setContatoBuilder(ContatoBuilder builder) {
    this.contatoBuilder = builder;
  }

  public Contato getContato() {
    return (Contato) getContato();
}

  public void construirContato(ContatoBuilder builder, String nome, String endereco, String telefone, String email) {
    builder.buildNome(nome);
    builder.buildEndereco(endereco);
    builder.buildTelefone(telefone);
    builder.buildEmail(email);
    }
}
