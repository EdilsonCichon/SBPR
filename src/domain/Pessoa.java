/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Chrysthian
 */
public class Pessoa {
    
    private String nome;
    private String dt_nasc;
    private String cpf;
    private String rg;
    private char sexo;

    public Pessoa(String nome, String dt_nasc, String cpf, String rg, char sexo) {
        this.nome = nome;
        this.dt_nasc = dt_nasc;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
    }  
}
