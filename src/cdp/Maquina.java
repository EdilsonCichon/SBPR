package cdp;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Maquina implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String modelo;
    
    @Column(nullable = false)
    private String placa;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipo_maquina_id", nullable = false)
    private TipoMaquina tipoMaquina;

    public Maquina() {
    }

    public Maquina(int id, String modelo, String placa, TipoMaquina tipoMaquina) {
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
        this.tipoMaquina = tipoMaquina;
    }

    public Maquina(String modelo, String placa, TipoMaquina tipoMaquina) {
        this.modelo = modelo;
        this.placa = placa;
        this.tipoMaquina = tipoMaquina;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoMaquina getTipoMaquina() {
        return tipoMaquina;
    }

    public void setTipoMaquina(TipoMaquina tipoMaquina) {
        this.tipoMaquina = tipoMaquina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getModelo();
    }
  
     public Object[] toArray() {
        return new Object[] { this, getPlaca()};
    }
}
