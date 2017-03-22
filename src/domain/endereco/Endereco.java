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
public class Endereco {
    
    private String numero;
    private String tipo;
    private String complemento;
    private Cep cep;

    public Endereco(String numero, String tipo, String complemento, Cep cep) {
        this.numero = numero;
        this.tipo = tipo;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }
}
