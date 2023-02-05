public class ContatoInternetBuilder extends ContatoBuilder{
    public void buildNome(String nome) {
        contato.setNome(nome);
    }

    public void buildEmail(String email) {
        contato.setEmail(email);
    }

    public void buildEndereco(String endereco) {
        // Não faz nada, pois não precisamos de endereço para esse tipo de contato
    }

    public void buildTelefone(String telefone) {
        // Não faz nada, pois não precisamos de telefone para esse tipo de contato
    }
}
