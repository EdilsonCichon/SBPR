package cdp;

import javax.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Propriedade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String referencia;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "produtor_id", nullable = false)
    //@JoinColumns (foreignKey = @ForeignKey(name = "produtor_id"), value = { @JoinColumn(referencedColumnName = "id") })
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private Produtor responsavel;

    public Propriedade() {
    }

    public Propriedade(int id, String nome_propriedade, String referencia, Produtor responsavel) {
        this.id = id;
        this.nome = nome_propriedade;
        this.referencia = referencia;
        this.responsavel = responsavel;
    }

    public Propriedade(String nome_propriedade, String referencia, Produtor responsavel) {
        this.nome = nome_propriedade;
        this.referencia = referencia;
        this.responsavel = responsavel;
    }    

    public int getId() {
        return id;
    }

    public String getNome_propriedade() {
        return nome;
    }

    public String getReferencia() {
        return referencia;
    }

    public Produtor getResponsavel() {
        return responsavel;
    }
    
    @Override
    public String toString() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome_propriedade(String nome_propriedade) {
        this.nome = nome_propriedade;
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
