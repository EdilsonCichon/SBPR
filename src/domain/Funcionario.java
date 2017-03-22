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
public class Funcionario extends Pessoa{
    
    public String rua;
    public String bairro;
    public String numero;
    public String cidade;
    public String estado;
    public String cep;
    public String habilitacao;

    public Funcionario(String rua, String bairro, String numero, String cidade, String estado, String cep, String habilitacao, String nome, String dt_nasc, String cpf, String rg, char sexo) {
        super(nome, dt_nasc, cpf, rg, sexo);
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.habilitacao = habilitacao;
    }
}
