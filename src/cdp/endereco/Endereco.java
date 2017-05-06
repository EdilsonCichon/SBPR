package cdp.endereco;

import javax.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String numero;
    
    @Column(nullable = false)
    private String tipo;
    
    @Column(nullable = false)
    private String complemento;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cep_id", nullable = false)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private Cep cep;

    public Endereco() {
    }

    public Endereco(int id, String numero, String tipo, String complemento, Cep cep) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.complemento = complemento;
        this.cep = cep;
    }

    public Endereco(String numero, String tipo, String complemento, Cep cep) {
        this.numero = numero;
        this.tipo = tipo;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
