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
public class TipoServico {
    
    public String nome;
    public String descricao;
    public double valor_hr;

    public TipoServico(String nome, String descricao, double valor_hr) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor_hr = valor_hr;
    }
}
