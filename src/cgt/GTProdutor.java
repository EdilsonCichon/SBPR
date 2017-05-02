package cgt;

import cci.SBPRException;
import cdp.Produtor;
import cgd.GDProdutor;
import java.util.Date;
import java.util.LinkedList;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GTProdutor {

    private GDProdutor gdProdutor;

    public GTProdutor() {
        gdProdutor = new GDProdutor();
    }

    public void cadastrarProdutor(String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo) throws ParseException, Exception {
            
        validarCampos(nome, cpf, data_nasc);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(data_nasc);
        
        Produtor produtor = new Produtor(nome, cpf, data, inscricao, rg, telefone, sexo);
        gdProdutor.cadastrar(produtor);
    }

    public void alterarProdutor(String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo) throws Exception {
        
        validarCampos(nome, cpf, data_nasc);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(data_nasc);
        
        Produtor produtor = new Produtor(nome, cpf, data, inscricao, rg, telefone, sexo);
        gdProdutor.alterar();   
    }

    public LinkedList<Produtor> filtrarProdutores(String colunaFiltro, String valorFiltro) {
        return gdProdutor.filtrar(colunaFiltro, valorFiltro);
    }

    public void consultarProdutor() {
        gdProdutor.consultar();    
    }

    public void excluirProdutor(Produtor produtor) {
        gdProdutor.excluir(produtor);
    }

    private void validarCampos(String nome, String cpf, String data) throws Exception {
        
        if(!GTValidaCampos.validarNome(nome))
            throw new SBPRException(1);
        if(!GTValidaCampos.validarCpf(cpf))
            throw new SBPRException(2);
        if(!GTValidaCampos.validarDataNasc(data))
            throw new SBPRException(3);            
    }
}
