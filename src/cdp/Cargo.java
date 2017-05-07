package cdp;

import javax.persistence.*;

@Entity
public class Cargo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String nome;

    public Cargo() {
    }

    public Cargo(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public Cargo(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
