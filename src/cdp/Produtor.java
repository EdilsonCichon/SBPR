/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

import java.util.List;

/**
 *
 * @author Chrysthian
 */
public class Produtor extends Pessoa{
    
    private String inscricao_estadual;
    //private List<Propriedade> prop;

    public Produtor(String inscricao_estadual, String nome, String dt_nasc, String cpf, String rg, char sexo) {
        super(nome, dt_nasc, cpf, rg, sexo);
        this.inscricao_estadual = inscricao_estadual;
    }
}
