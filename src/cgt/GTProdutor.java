package cgt;

import cdp.Produtor;
import cgd.GDProdutor;
import cci.SBPRException;
import cgt.util.ValidaCampos;
import java.util.Date;
import java.util.LinkedList;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GTProdutor {

    private GDProdutor gdProdutor;

    public GTProdutor() {
        gdProdutor = new GDProdutor();
    }
    
    public Produtor instanciarProdutorVazio(){    
        Produtor produtor = new Produtor();
        return produtor;     
    }

    public Produtor cadastrarProdutor(String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo) throws ParseException, Exception {
            
        validarCampos(nome, cpf, data_nasc, rg, telefone, inscricao);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(data_nasc);
        
        Produtor produtor = new Produtor(nome, cpf, data, inscricao, rg, telefone, sexo);
        gdProdutor.cadastrar(produtor);
        
        return produtor;

    }

    public Produtor alterarProdutor(String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo) throws ParseException, Exception {
        
        validarCampos(nome, cpf, data_nasc, rg, telefone, inscricao);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(data_nasc);
        
        Produtor produtor = new Produtor(nome, cpf, data, inscricao, rg, telefone, sexo);
        gdProdutor.alterar(produtor);
        return produtor;
    }

    public LinkedList<Produtor> consultarProdutor(String colunaFiltro, String valorFiltro) {
        return gdProdutor.consultar(colunaFiltro, valorFiltro);
    }

    public void excluirProdutor(Produtor produtor) {
        gdProdutor.excluir(produtor);
    }

    private void validarCampos(String nome, String cpf, String data, String rg, String telefone, String inscricao) throws Exception {
        
        if(!ValidaCampos.validarNome(nome))
            throw new SBPRException(1);
        if(!ValidaCampos.validarCpf(cpf))
            throw new SBPRException(2);
        if(!ValidaCampos.validarDataNasc(data))
            throw new SBPRException(3);
        if(!ValidaCampos.validarRg(rg))
            throw new SBPRException(4);
        if(!ValidaCampos.validarTelefone(telefone))
            throw new SBPRException(5);
        if(!ValidaCampos.validarInscricaoEstadual(inscricao))
            throw new SBPRException(6);
    }
}
