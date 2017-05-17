package cdp.endereco;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

@Entity
public class Logradouro implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String tipo;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "logradouro_bairro", 
        joinColumns =@JoinColumn(name = "logradouro_id"), 
        inverseJoinColumns =@JoinColumn(name = "bairro_id"))
    private Collection<Bairro> bairros;

    public Logradouro() {
    }

    public Logradouro(int id, String nome, String tipo, Collection<Bairro> bairros) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.bairros = bairros;
    }

    public Logradouro(String nome, String tipo, Collection<Bairro> bairros) {
        this.nome = nome;
        this.tipo = tipo;
        this.bairros = bairros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Collection<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(Collection<Bairro> bairros) {
        this.bairros = bairros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
