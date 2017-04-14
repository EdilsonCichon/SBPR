package cdp;

public class Propriedade {
    
    private int id;
    private String nome_propriedade;
    private String referencia;

    public Propriedade(int id, String nome_propriedade, String referencia) {
        this.id = id;
        this.nome_propriedade = nome_propriedade;
        this.referencia = referencia;
    }

    public Propriedade(String nome_propriedade, String referencia) {
        this.nome_propriedade = nome_propriedade;
        this.referencia = referencia;
    }    
}
