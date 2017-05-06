package cdp;

import javax.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Maquina {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String modelo;
    
    @Column(nullable = false)
    private String placa;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipo_maquina_id", nullable = false)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
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
}
