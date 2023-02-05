public class ContatoCompletoBuilder extends ContatoBuilder{
    
    public void buildNome(String nome) {
        contato.setNome(nome);
    }

    public void buildEndereco(String endereco) {
        contato.setEndereco(endereco);
    }

    public void buildTelefone(String telefone) {
        contato.setTelefone(telefone);
    }

    public void buildEmail(String email) {
        contato.setEmail(email);
    }
}
