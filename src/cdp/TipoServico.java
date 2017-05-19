package cdp;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "tipo_servico")
public class TipoServico implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String descricao;
    
    @Column(nullable = false, precision = 2)
    private double valor_hr;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipo_maquina_id", nullable = false)
    private TipoMaquina tipoMaquina;

    public TipoServico() {
    }
   
    public TipoServico(int id, String nome, String descricao, double valor_hr, TipoMaquina tipoMaquina) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor_hr = valor_hr;
        this.tipoMaquina = tipoMaquina;
    }

    public TipoServico(String nome, String descricao, double valor_hr, TipoMaquina tipoMaquina) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor_hr = valor_hr;
        this.tipoMaquina = tipoMaquina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor_hr() {
        return valor_hr;
    }

    public void setValor_hr(double valor_hr) {
        this.valor_hr = valor_hr;
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
