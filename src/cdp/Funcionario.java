package cdp;

import cdp.endereco.Endereco;
import java.util.Date;
import java.util.LinkedList;

public class Funcionario extends Pessoa {
    
    private Endereco endereco;
    private Habilitacao habilitacao;
    private Usuario usuario;
    private String email;
    private Cargo cargo;
    private LinkedList<TipoServico> tipoServicos;

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

    public LinkedList<TipoServico> getTipoServicos() {
        return tipoServicos;
    }

    public void setTipoServicos(LinkedList<TipoServico> tipoServicos) {
        this.tipoServicos = tipoServicos;
    }
    
    public Object[] toArray() {
        return new Object[] { this, getCpf(), getRg(), getDt_nasc("dd/MM/yyyy") };
    }
}
