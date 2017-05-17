package cgt;

import cci.SBPRException;
import cdp.Cargo;
import cdp.Usuario;
import cdp.Funcionario;
import cdp.Habilitacao;
import cdp.TipoServico;
import cdp.endereco.Endereco;
import cgd.GDFuncionario;
import cgt.util.ValidaCampos;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class GTFuncionario {
    
    private final GDFuncionario gdFuncionario;

    public GTFuncionario() {
        gdFuncionario = new GDFuncionario();
    }
    
    public void cadastrarFuncionario(
            String nome, String cpf, String rg, String email,
            String data_nasc, String telefone, char sexo, String pCargo,
            String pHabilitacao, String pUsuario, String senha,
            String cep, String logradouro, String numero,
            String bairro, String cidade, String estado) throws Exception {
        
        validarCampos(nome, cpf, data_nasc, rg, telefone);
        Date dtNascFormatada = new Date(data_nasc);
        
        Endereco endereco = new Endereco(numero, "casa", numero, null);
        Habilitacao habilitacao = new Habilitacao(pHabilitacao);
        Usuario usuario = new Usuario(pUsuario, senha);
        Cargo cargo = new Cargo(pCargo);
        LinkedList<TipoServico> tipoServicos = new LinkedList<>();
        tipoServicos.add(new TipoServico());
        
        Funcionario funcionario = new Funcionario(endereco, habilitacao, usuario, email, cargo, nome, dtNascFormatada, cpf, rg, sexo, telefone, tipoServicos);
        gdFuncionario.cadastrar(funcionario);
    }
    
    public void alterarFuncionario(Funcionario funcionario, String nome, String cpf, String rg, String email, 
            String data_nasc, String telefone, char sexo, String pCargo,
            String pHabilitacao, String pUsuario, String senha,
            String cep, String logradouro, String numero,
            String bairro, String cidade, String estado) throws Exception {
        
        validarCampos(nome, cpf, data_nasc, rg, telefone);
        Date dtNascFormatada = new Date(data_nasc);
        
        Endereco endereco = new Endereco(numero, "casa", numero, null);
        Habilitacao habilitacao = new Habilitacao(pHabilitacao);
        Usuario usuario = new Usuario(pUsuario, senha);
        Cargo cargo = new Cargo(pCargo);
        LinkedList<TipoServico> tipoServicos = new LinkedList<>();
        tipoServicos.add(new TipoServico());
        
        funcionario.setCargo(cargo);
        funcionario.setCpf(cpf);
        funcionario.setDt_nasc(dtNascFormatada);
        funcionario.setEmail(email);
        funcionario.setEndereco(endereco);
        funcionario.setHabilitacao(habilitacao);
        funcionario.setNome(nome);
        funcionario.setRg(rg);
        funcionario.setSexo(sexo);
        funcionario.setTelefone(telefone);
        funcionario.setTipoServicos(tipoServicos);
        funcionario.setUsuario(usuario);

        gdFuncionario.alterar(funcionario);
    }
    
    public List consultarFuncionario(String tipoFiltro, String valorInformadoFiltro){
        return gdFuncionario.consultar(tipoFiltro, valorInformadoFiltro);
    }
    
    public void excluirFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException{
        gdFuncionario.excluir(funcionario);
    } 
    
    private void validarCampos(String nome, String cpf, String data, String rg, String telefone) throws Exception {
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
    }
}
