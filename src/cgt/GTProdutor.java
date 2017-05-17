package cgt;

import cdp.Produtor;
import cgd.GDProdutor;
import cci.SBPRException;
import cgt.util.ValidaCampos;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GTProdutor {

    private final GDProdutor gdProdutor;

    public GTProdutor() {
        gdProdutor = new GDProdutor();
    }
    
    public Produtor instanciarProdutorVazio(){    
        Produtor produtor = new Produtor();
        return produtor;     
    }
    
     public void setarCamposProdutorSelecionado(Produtor produtorAtual, Produtor produtorSelecionado){
         
        produtorAtual.setId(produtorSelecionado.getId());
        produtorAtual.setCpf(produtorSelecionado.getCpf());
        produtorAtual.setDt_nasc(produtorSelecionado.getDt_nasc());
        produtorAtual.setRg(produtorSelecionado.getRg());
        produtorAtual.setInscricao_estadual(produtorSelecionado.getInscricao_estadual());
        produtorAtual.setNome(produtorSelecionado.getNome());
        produtorAtual.setTelefone(produtorSelecionado.getTelefone());
        produtorAtual.setSexo(produtorSelecionado.getSexo());
        produtorAtual.setPropriedades(produtorSelecionado.getPropriedades());
    }

    public Produtor cadastrarProdutor(String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo) throws ParseException, Exception {
            
        validarCampos(nome, cpf, data_nasc, rg, telefone, inscricao);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(data_nasc);
        
        Produtor produtor = new Produtor(nome, cpf, data, inscricao, rg, telefone, sexo);
        gdProdutor.cadastrar(produtor);
        
        return produtor;

    }

    public void alterarProdutor(Produtor produtor, String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone, char sexo) throws ParseException, Exception {
        
        validarCampos(nome, cpf, data_nasc, rg, telefone, inscricao);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(data_nasc);
        
        produtor.setCpf(cpf);
        produtor.setDt_nasc(data);
        produtor.setInscricao_estadual(inscricao);
        produtor.setNome(nome);
        produtor.setRg(rg);
        produtor.setSexo(sexo);
        produtor.setTelefone(telefone);
        
        gdProdutor.alterar(produtor);
    }

    public LinkedList<Produtor> consultarProdutor(String colunaFiltro, String valorFiltro) {
        return gdProdutor.consultar(colunaFiltro, valorFiltro);
    }

    public void excluirProdutor(Produtor produtor) throws SQLException, ClassNotFoundException {
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
