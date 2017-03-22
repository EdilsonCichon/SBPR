/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.endereco;

/**
 *
 * @author Chrysthian
 */
public class Cep {
    
    private String cep;
    private Logradouro logradouro;

    public Cep(String cep, Logradouro logradouro) {
        this.cep = cep;
        this.logradouro = logradouro;
    }  

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }
}
