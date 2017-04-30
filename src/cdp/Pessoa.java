package cdp;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
    
    private int id;
    private String nome;
    private Date dt_nasc;
    private String cpf;
    private String rg;
    private char sexo;
    private String telefone;

    public Pessoa(int id, String nome, Date dt_nasc, String cpf, String rg, char sexo, String telefone) {
        this.id = id;
        this.nome = nome;
        this.dt_nasc = dt_nasc;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public Pessoa(String nome, Date dt_nasc, String cpf, String rg, char sexo, String telefone) {
        this.nome = nome;
        this.dt_nasc = dt_nasc;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDt_nasc() {
        return dt_nasc;
    }
    
    public String getDt_nasc(String formato) {
        SimpleDateFormat fmt = new SimpleDateFormat(formato);
        return fmt.format(getDt_nasc());
    }

    public void setDt_nasc(Date dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nome;
    }
}
