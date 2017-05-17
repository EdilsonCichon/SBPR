package cdp.endereco;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Bairro implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String nome;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cidade_id", nullable = false)
    private Cidade cidade;

    //NAO CRIAMOS UMA LISTA DE LOGRADOUROS POIS NAO QUEREMOS UMA NAVEGABILIDADE DUPLA
    
    public Bairro() {
    }
    
    public Bairro(int id, String nome, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
    }

    public Bairro(String nome, Cidade cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
