package cdp.endereco;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Cep implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String cep;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "cep_logradouro", 
        joinColumns =@JoinColumn(name = "cep_id"), 
        inverseJoinColumns =@JoinColumn(name = "logradouro_id"))
    @Cascade(CascadeType.SAVE_UPDATE)
    private Collection<Logradouro> logradouros;

    public Cep() {
    }
    
    public Cep(int id, String cep, Collection<Logradouro> logradouros) {
        this.id = id;
        this.cep = cep;
        this.logradouros = logradouros;
    }
    
    public Cep(String cep, Collection<Logradouro> logradouros) {
        this.cep = cep;
        this.logradouros = logradouros;
    }  

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Collection<Logradouro> getLogradouros() {
        return logradouros;
    }

    public void setLogradouros(Collection<Logradouro> logradouros) {
        this.logradouros = logradouros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
