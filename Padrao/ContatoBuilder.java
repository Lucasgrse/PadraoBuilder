abstract class ContatoBuilder {
     protected Cliente contato;

    public Cliente getContato() {
        return contato;
    }

    public void createContato() {
        contato = new Cliente(null, null, null, null);
    }

    public abstract void buildNome(String nome);
    public abstract void buildEndereco(String endereco);
    public abstract void buildTelefone(String telefone);
    public abstract void buildEmail(String email);
}