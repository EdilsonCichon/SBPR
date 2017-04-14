package cdp.endereco;

public class Estado {
    
    private int id;
    private String nome;

    public Estado(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Estado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}
