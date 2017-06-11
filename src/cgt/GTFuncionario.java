package cgt;

import cgt.util.*;
import cdp.Cargo;
import cdp.Usuario;
import cdp.Funcionario;
import cdp.Habilitacao;
import cdp.TipoServico;
import cdp.endereco.*;
import cgd.GDEndereco;
import cgd.GDFuncionario;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class GTFuncionario {
    
    private GDFuncionario gdFuncionario;
    private GDEndereco gdEndereco;

    public GTFuncionario() {
        gdFuncionario = new GDFuncionario();
        gdEndereco = new GDEndereco();
    }
    
    public Usuario instanciarUsuario(String login, String senha){
        Usuario usuario = new Usuario(login, senha);
        return usuario;
    }
    
    public void cadastrarFuncionario(
            String nome, String cpf, String rg, String email,
            String data_nasc, String telefone, char sexo, Cargo cargo,
            Habilitacao habilitacao, Usuario usuario,
            String nCep, String nomeLogradouro, String numero,
            String nomeBairro, String nomeCidade, String nomeEstado, 
            String tipoLogradouro, String complemento, Cep cepAtual, 
            List pTiposServicos) throws Exception {
        
        validarCampos(nome, cpf, data_nasc, rg, telefone);
        Date data = Uteis.formatarData("dd/MM/yyyy", data_nasc);
        
        String numeroCep = nCep.replace("-", "");

        Endereco endereco = construirEndereco(cepAtual, null, nomeEstado, nomeCidade, nomeBairro, nomeLogradouro, tipoLogradouro, numeroCep, numero, complemento);
        List<TipoServico> tipoServicos = pTiposServicos;
        
        Funcionario funcionario = new Funcionario(endereco, habilitacao, usuario, email, cargo, nome, data, cpf, rg, sexo, telefone, tipoServicos);
        gdFuncionario.cadastrar(funcionario);
    }
    
    public void alterarFuncionario(Funcionario funcionario, String nome, String cpf, String rg, String email, 
            String data_nasc, String telefone, char sexo, Cargo cargo,
            Habilitacao habilitacao, String login, String senha,
            String numeroCep, String nomeLogradouro, String numero,
            String nomeBairro, String nomeCidade, String nomeEstado, String tipoLogradouro, String complemento, Cep cepAtual, List tipoServicos ) throws Exception {
        
        validarCampos(nome, cpf, data_nasc, rg, telefone);
        Date data = Uteis.formatarData("dd/MM/yyyy", data_nasc);
        Usuario usuario = (funcionario.getUsuario() != null) ? funcionario.getUsuario() : new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(senha);
        
        funcionario.setCargo(cargo);
        funcionario.setCpf(cpf);
        funcionario.setDt_nasc(data);
        funcionario.setEmail(email);
        funcionario.setHabilitacao(habilitacao);
        funcionario.setNome(nome);
        funcionario.setRg(rg);
        funcionario.setSexo(sexo);
        funcionario.setTelefone(telefone);
        funcionario.setUsuario(usuario);
        funcionario.getEndereco().setNumero(numero);
        funcionario.getEndereco().setComplemento(complemento);
        funcionario.setTipoServicos(tipoServicos);
        
        Endereco endereco = construirEndereco(cepAtual, funcionario, nomeEstado, nomeCidade, nomeBairro, nomeLogradouro, tipoLogradouro, numeroCep, numero, complemento);
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
    
    private Endereco construirEndereco(Cep cepAtual, Funcionario funcionario, String nomeEstado, String nomeCidade, String nomeBairro, 
            String nomeLogradouro, String tipoLogradouro, String numeroCep, String numero, String complemento) {
        
        Estado estado;
        Cidade cidade;
        Bairro bairro;
        Logradouro logradouro;
        Cep cep;
        
        if (cepAtual == null) {

            estado = gdEndereco.consultarEstado(nomeEstado);

            if (estado == null) {

                estado = new Estado(nomeEstado);
                cidade = new Cidade(nomeCidade, estado);
                bairro = new Bairro(nomeBairro, cidade);
                logradouro = new Logradouro(nomeLogradouro, tipoLogradouro, bairro);
                cep = new Cep(numeroCep, logradouro);  
                return identificarEndereco(funcionario, cep, numero, complemento);

            } else {

                cidade = gdEndereco.consultarCidade(nomeCidade);

                if (cidade == null) {
                    cidade = new Cidade(nomeCidade, estado);
                    bairro = new Bairro(nomeBairro, cidade);
                    logradouro = new Logradouro(nomeLogradouro, tipoLogradouro, bairro);
                    cep = new Cep(numeroCep, logradouro);
                    return identificarEndereco(funcionario, cep, numero, complemento);

                } else {

                    bairro = gdEndereco.consultarBairroCidade(nomeBairro, cidade.getId());
                    if (bairro == null) {
                        bairro = new Bairro(nomeBairro, cidade);
                        logradouro = new Logradouro(nomeLogradouro, tipoLogradouro, bairro);
                        cep = new Cep(numeroCep, logradouro);
                        return identificarEndereco(funcionario, cep, numero, complemento);

                    } else {

                        logradouro = gdEndereco.consultarLogradouroBairro(nomeLogradouro, bairro.getId());
                        if (logradouro == null) {
                            logradouro = new Logradouro(nomeLogradouro, tipoLogradouro, bairro);
                            cep = new Cep(numeroCep, logradouro);
                            return identificarEndereco(funcionario, cep, numero, complemento);

                        } else {
                            cep = new Cep(numeroCep, logradouro);
                            return identificarEndereco(funcionario, cep, numero, complemento);
                        }
                    }
                }
            }
        } else {
            return identificarEndereco(funcionario, cepAtual, numero, complemento);
        }
    }
    
    private Endereco identificarEndereco(Funcionario funcionario, Cep cep, String numero, String complemento){
        
        if(funcionario == null){
            Endereco endereco = new Endereco(numero, complemento, cep);
            return endereco;
        }else{
            funcionario.getEndereco().setCep(cep);
            return null;
        }
    }
}
