package cgt;

import cdp.Funcionario;
import cgd.GDFuncionario;
import java.util.LinkedList;

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
    
    public LinkedList<Funcionario> consultarFuncionario(String tipoFiltro, String texto){
        return gdFuncionario.consultar(tipoFiltro, texto);
    }
    
    public int excluirFuncionario(Funcionario funcionario){
        gdFuncionario.excluir(funcionario);
        return 0;
    } 
}
