public class ContatoTelefoneBuilder extends ContatoBuilder {
    private ContatoBuilder contatoBuilder;

    public void setContatoBuilder(ContatoBuilder contatoBuilder) {
        this.contatoBuilder = contatoBuilder;
    }

    public Cliente getContato() {
        return contatoBuilder.getContato();
    }

    public void construirContato() {
        contatoBuilder.createContato();
        contatoBuilder.buildNome(null);
        contatoBuilder.buildEndereco(null);
        contatoBuilder.buildTelefone(null);
        contatoBuilder.buildEmail(null);
    }

    @Override
    public void buildNome(String nome) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void buildEndereco(String endereco) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void buildTelefone(String telefone) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void buildEmail(String email) {
        // TODO Auto-generated method stub
        
    } 
}
