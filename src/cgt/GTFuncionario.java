package cgt;

import cgd.GDFuncionario;

public class GTFuncionario {
    
    private GDFuncionario gdFuncionario;

    public GTFuncionario() {
        gdFuncionario = new GDFuncionario();
    }
    
    public int cadastrarFuncionario(){
        gdFuncionario.cadastrar();
        return 0;
    }
    
    public int alterarFuncionario(){
        gdFuncionario.alterar();
        return 0;
    }
    
    public int consultarFuncionario(){
        gdFuncionario.consultar();
        return 0;
    }
    
    public int excluirFuncionario(){
        gdFuncionario.excluir();
        return 0;
    } 
}
