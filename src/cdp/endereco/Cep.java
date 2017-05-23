package cdp.endereco;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Cep implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false, unique = true)
    private String nome;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "logradouro_id", nullable = false)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Logradouro logradouro;

    public Cep() {
    }
    
    public Cep(int id, String cep, Logradouro logradouro) {
        this.id = id;
        this.nome = cep;
        this.logradouro = logradouro;
    }
    
    public Cep(String cep, Logradouro logradouro) {
        this.nome = cep;
        this.logradouro = logradouro;
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String cep) {
        this.nome = cep;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
