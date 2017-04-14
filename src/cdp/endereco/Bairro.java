package cdp.endereco;

public class Bairro {
    
    private int id;
    private String nome;
    private Cidade cidade;

    public Bairro(int id, String nome, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
    }

    public Bairro(String nome, Cidade cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
