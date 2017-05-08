
package cgd;

import cdp.Funcionario;
import java.util.Date;
import java.util.LinkedList;

public class GDFuncionario {
    
    public void cadastrar(Funcionario funcionario){
          
    }
    
    public void alterar(Funcionario funcionario){
       
    }
    
    public LinkedList<Funcionario> consultar(String tipoFiltro, String texto){
        
         LinkedList<Funcionario> listaFuncionarios = new LinkedList();
        
        Funcionario chrysthian = new Funcionario(null, null, null, "chrysthianmoizes@gmail.com", null, "Chrysthian Moizes", new Date("21/06/1997"), "15273771722", "3588210", 'M', "27992853318", null);
        Funcionario erick = new Funcionario(null, null, null, "felixpax13@gmail.com", null, "Erick Zanoni Borghi", new Date("21/06/1997"), "45226578953", "4265359", 'M', "27998533044", null);
        Funcionario edilson = new Funcionario(null, null, null, "edilsoncichon@gmail.com", null, "Edilson Cichon", new Date("10/04/1992"), "15234698862", "1254685", 'M', "27998465782", null);
        
        listaFuncionarios.add(chrysthian);
        listaFuncionarios.add(erick);
        listaFuncionarios.add(edilson);
        
        return listaFuncionarios;
    }
    
    public void excluir(Funcionario funcionario){
       
    } 
}
