package cdp;

import java.util.Collection;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Produtor extends Pessoa {
    
    @Column(nullable = false, length = 10, unique = true)
    private String inscricao_estadual;
    
    @OneToMany(mappedBy = "responsavel", fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private Collection<Propriedade> propriedades;

    public Produtor() {
    }
    
    public Produtor(String inscricao_estadual, Collection<Propriedade> propriedades, int id, 
            String nome, Date dt_nasc, String cpf, String rg, char sexo, String telefone) {
        
        super(id, nome, dt_nasc, cpf, rg, sexo, telefone);
        this.inscricao_estadual = inscricao_estadual;
        this.propriedades = propriedades;
    }

    public Produtor(String inscricao_estadual, String nome, Date dt_nasc, String cpf, 
            String rg, char sexo, String telefone, Collection<Propriedade> propriedades) {
        
        super(nome, dt_nasc, cpf, rg, sexo, telefone);
        this.inscricao_estadual = inscricao_estadual;
        this.propriedades = propriedades;
    }

    public Produtor(String nome, String cpf, Date dt_nasc, String inscricao_estadual, String rg, String telefone, char sexo) {
        super(nome, dt_nasc, cpf, rg, sexo, telefone);
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }

    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public Collection<Propriedade> getPropriedades() {
        return propriedades;
    }

    public void setPropriedades(Collection<Propriedade> propriedades) {
        this.propriedades = propriedades;
    }
    
    public Object[] toArray() {
        return new Object[] { this, getCpf(), getRg(), getDt_nasc("dd/MM/yyyy") };
    }
}
