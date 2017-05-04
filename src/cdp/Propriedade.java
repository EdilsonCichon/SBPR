package cdp;

public class Propriedade {
    
    private int id;
    private String nome_propriedade;
    private String referencia;
    private Produtor responsavel;

    public Propriedade(int id, String nome_propriedade, String referencia, Produtor responsavel) {
        this.id = id;
        this.nome_propriedade = nome_propriedade;
        this.referencia = referencia;
        this.responsavel = responsavel;
    }

    public Propriedade(String nome_propriedade, String referencia, Produtor responsavel) {
        this.nome_propriedade = nome_propriedade;
        this.referencia = referencia;
        this.responsavel = responsavel;
    }    

    public int getId() {
        return id;
    }

    public String getNome_propriedade() {
        return nome_propriedade;
    }

    public String getReferencia() {
        return referencia;
    }

    public Produtor getResponsavel() {
        return responsavel;
    }
    
    @Override
    public String toString() {
        return nome_propriedade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome_propriedade(String nome_propriedade) {
        this.nome_propriedade = nome_propriedade;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setResponsavel(Produtor responsavel) {
        this.responsavel = responsavel;
    }
     
    public Object[] toArray() {
        return new Object[] { this, referencia, responsavel };
    }
}
