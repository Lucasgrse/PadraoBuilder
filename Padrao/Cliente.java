import java.util.Scanner;

public class Cliente {
  private String nome;
  private String endereco;
  private String telefone;
  private static String email;

  public Cliente(String nome, String endereco, String telefone, String email) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.email = email;
  }
  public void setNome(String nome) {
    this.nome = nome;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}

public void setEmail(String email) {
    this.email = email;
}

public String getNome() {
    return nome;
}

public String getEndereco() {
    return endereco;
}

public String getTelefone() {
    return telefone;
}

public String getEmail() {
    return email;
}

  public static void main(String[] args) {
        Diretor director = new Diretor();
        ContatoBuilder contatoInternet = new ContatoInternetBuilder();
        ContatoTelefoneBuilder contatoTelefone = new ContatoTelefoneBuilder();
        ContatoBuilder contatoCompleto = new ContatoCompletoBuilder();

        // Criar contato na internet
        director.setContatoBuilder(contatoInternet);
        director.construirContato(contatoCompleto, "John Doe", "johndoe@email.com", email, email);
        Contato contatoInternetConstuido = director.getContato();
        System.out.println(contatoInternetConstuido.toString());

        // Criar contato por telefone
        director.setContatoBuilder(contatoTelefone);
        director.construirContato(contatoCompleto, "Jane Doe", "123456789", email, email);
        Contato contatoTelefoneConstuido = director.getContato();
        System.out.println(contatoTelefoneConstuido.toString());

        // Criar contato completo
        director.setContatoBuilder(contatoCompleto);
        director.construirContato(contatoCompleto, "Jim Doe", "jimdoe@email.com", "987654321", "Rua ABC, 123");
        Contato contatoCompletoConstuido = director.getContato();
        System.out.println(contatoCompletoConstuido.toString());
    }

  public Contato getContato() {
    return null;
  }
}