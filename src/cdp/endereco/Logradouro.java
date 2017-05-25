package cdp.endereco;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Logradouro implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String tipo;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bairro_id", nullable = false)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Bairro bairro;

    public Logradouro() {
    }

    public Logradouro(int id, String nome, String tipo, Bairro bairro) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.bairro = bairro;
    }

    public Logradouro(String nome, String tipo, Bairro bairro) {
        this.nome = nome;
        this.tipo = tipo;
        this.bairro = bairro;
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

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
