package cdp.endereco;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Endereco implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String complemento;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cep_id", nullable = false)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Cep cep;

    public Endereco() {
    }

    public Endereco(int id, String numero, String complemento, Cep cep) {
        this.id = id;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public Endereco(String numero, String complemento, Cep cep) {
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
