package cgt;

import cci.SBPRException;
import cdp.Cargo;
import cdp.Usuario;
import cdp.Funcionario;
import cdp.Habilitacao;
import cdp.TipoServico;
import cdp.endereco.*;
import cgd.GDFuncionario;
import cgt.util.ValidaCampos;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class GTFuncionario {
    
    private GDFuncionario gdFuncionario;

    public GTFuncionario() {
        gdFuncionario = new GDFuncionario();
    }
    
    public Usuario instanciarUsuario(String login, String senha){
        Usuario usuario = new Usuario(login, senha);
        return usuario;
    }
    
    public void cadastrarFuncionario(
            String nome, String cpf, String rg, String email,
            String data_nasc, String telefone, char sexo, Cargo cargo,
            Habilitacao habilitacao, Usuario usuario,
            String pCep, String logradouro, String numero,
            String pBairro, String cidade, String estado, String tipoLogradouro, String complemento) throws Exception {
        
        validarCampos(nome, cpf, data_nasc, rg, telefone);
        
        Date dtNascFormatada = new Date(data_nasc);
        
        Estado estate = new Estado(estado);
        Cidade city = new Cidade(cidade, estate);
        Bairro bairro = new Bairro(pBairro, city);
        Logradouro rua = new Logradouro(logradouro, tipoLogradouro, bairro);
        Cep cep = new Cep(pCep, rua);
        Endereco endereco = new Endereco(numero, complemento, cep);
       
        LinkedList<TipoServico> tipoServicos = new LinkedList<>();
        tipoServicos.add(new TipoServico());
        
        Funcionario funcionario = new Funcionario(endereco, habilitacao, usuario, email, cargo, nome, dtNascFormatada, cpf, rg, sexo, telefone, tipoServicos);
        gdFuncionario.cadastrar(funcionario);
    }
    
    public void alterarFuncionario(Funcionario funcionario, String nome, String cpf, String rg, String email, 
            String data_nasc, String telefone, char sexo, Cargo cargo,
            Habilitacao habilitacao, String login, String senha,
            String cep, String logradouro, String numero,
            String bairro, String cidade, String estado, String tipoLogradouro, String complemento) throws Exception {
        
        validarCampos(nome, cpf, data_nasc, rg, telefone);
        Date dtNascFormatada = new Date(data_nasc);
        
        funcionario.setCargo(cargo);
        funcionario.setCpf(cpf);
        funcionario.setDt_nasc(dtNascFormatada);
        funcionario.setEmail(email);
        funcionario.setHabilitacao(habilitacao);
        funcionario.setNome(nome);
        funcionario.setRg(rg);
        funcionario.setSexo(sexo);
        funcionario.setTelefone(telefone);
        funcionario.getUsuario().setLogin(login);
        funcionario.getUsuario().setSenha(senha);
        
        funcionario.getEndereco().setNumero(numero);
        funcionario.getEndereco().getCep().setNome(cep);
        funcionario.getEndereco().setComplemento(complemento);
        funcionario.getEndereco().getCep().getLogradouro().setNome(logradouro);
        funcionario.getEndereco().getCep().getLogradouro().setTipo(tipoLogradouro);
        funcionario.getEndereco().getCep().getLogradouro().getBairro().setNome(bairro);
        funcionario.getEndereco().getCep().getLogradouro().getBairro().getCidade().setNome(cidade);
        funcionario.getEndereco().getCep().getLogradouro().getBairro().getCidade().getEstado().setNome(estado);

        gdFuncionario.alterar(funcionario);
    }
    
    public List filtrarFuncionario(String tipoFiltro, String valorInformadoFiltro){
        return gdFuncionario.filtrar(tipoFiltro, valorInformadoFiltro);
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
