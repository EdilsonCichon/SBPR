/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp.endereco;

/**
 *
 * @author Chrysthian
 */
public class Logradouro {
    
    private String nome;
    private String tipo;
    private Bairro bairro;

    public Logradouro(String nome, String tipo, Bairro bairro) {
        this.nome = nome;
        this.tipo = tipo;
        this.bairro = bairro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    } 
}
