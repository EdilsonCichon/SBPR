package cdp;

import cdp.endereco.Endereco;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Funcionario extends Pessoa implements Serializable {
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "endereco_id", nullable = false)
    @Cascade(CascadeType.ALL)
    private Endereco endereco;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "habilitacao_id", nullable = true)
    private Habilitacao habilitacao;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id", nullable = true)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Usuario usuario;
        
    @Column(nullable = false)
    private String email;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cargo_id", nullable = false)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Cargo cargo;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "funcionario_tipo_servico",
            joinColumns = @JoinColumn(name = "funcionario_id", nullable = true),
            inverseJoinColumns = @JoinColumn(name = "tipo_servico_id"))
    @Cascade(CascadeType.SAVE_UPDATE)
    private Collection<TipoServico> tipoServicos;

    public Funcionario() {
    }

    public Funcionario(Endereco endereco, Habilitacao habilitacao, Usuario usuario, 
            String email, Cargo cargo, LinkedList<TipoServico> tipoServicos, int id, 
            String nome, Date dt_nasc, String cpf, String rg, char sexo, String telefone) {
        
        super(id, nome, dt_nasc, cpf, rg, sexo, telefone);
        this.endereco = endereco;
        this.habilitacao = habilitacao;
        this.usuario = usuario;
        this.email = email;
        this.cargo = cargo;
        this.tipoServicos = tipoServicos;
    }
   
    public Funcionario(Endereco endereco, Habilitacao habilitacao, Usuario usuario, 
            String email, Cargo cargo, String nome, Date dt_nasc, String cpf, String rg, 
            char sexo, String telefone, LinkedList<TipoServico> tipoServicos) {
        
        super(nome, dt_nasc, cpf, rg, sexo, telefone);
        this.endereco = endereco;
        this.habilitacao = habilitacao;
        this.usuario = usuario;
        this.cargo = cargo;
        this.email = email;
        this.tipoServicos = tipoServicos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Habilitacao getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(Habilitacao habilitacao) {
        this.habilitacao = habilitacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Collection<TipoServico> getTipoServicos() {
        return tipoServicos;
    }

    public void setTipoServicos(LinkedList<TipoServico> tipoServicos) {
        this.tipoServicos = tipoServicos;
    }
    
    public Object[] toArray() {
        return new Object[] { this, getCpf(), getRg(), getDt_nasc("dd/MM/yyyy") };
    } 
}
