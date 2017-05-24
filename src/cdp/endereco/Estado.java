package cdp.endereco;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Estado implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false, unique = true)
    private String nome;

    public Estado() {
    }

    public Estado(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Estado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
