package cdp;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

@MappedSuperclass
public abstract class Pessoa implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String nome;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dt_nasc;
    
    @Column(nullable = false, unique = true, length = 11)
    private String cpf;
    
    @Column(nullable = false, unique = true, length = 7)
    private String rg;
    
    @Column(nullable = false, length = 1)
    private char sexo;
    
    @Column(nullable = false, length = 11, unique = true)
    private String telefone;

    public Pessoa() {
    }
 
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
   
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.dt_nasc, other.dt_nasc)) {
            return false;
        }
        return true;
    }
    
    
}
