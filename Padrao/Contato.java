public abstract class Contato {
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String email;

    public Contato(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    

    public abstract void construirNome(String nome);

    public abstract void construirEndereco(String endereco);

    public abstract void construirTelefone(String telefone);

    public abstract void construirEmail(String email);

    @Override
    public String toString() {
        return "Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\nEmail: " + email;
    }
    
}
