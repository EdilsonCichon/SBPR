package cdp;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Habilitacao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String categoria;

    public Habilitacao() {
    }

    public Habilitacao(int id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public Habilitacao(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString() {
        return categoria;
    }
    
    public Object[] toArray() {
        return new Object[] {getId(), this};
    } 
}
