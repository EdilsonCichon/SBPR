package cgt;

import cci.SBPRException;
import cdp.Cargo;
import cdp.Usuario;
import cdp.Funcionario;
import cdp.Habilitacao;
import cdp.TipoServico;
import cdp.endereco.*;
import cgd.GDEndereco;
import cgd.GDFuncionario;
import cgt.util.ValidaCampos;
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
        Date dtNascFormatada = new Date(data_nasc);
        
        String numeroCep = nCep.replace("-", "");
        Endereco endereco;
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
                endereco = new Endereco(numero, complemento, cep);

            }else{  
                cidade = gdEndereco.consultarCidade(nomeCidade);
                
                if (cidade == null){
                    cidade = new Cidade(nomeCidade, estado);
                    bairro = new Bairro(nomeBairro, cidade);
                    logradouro = new Logradouro(nomeLogradouro, tipoLogradouro, bairro);
                    cep = new Cep(numeroCep, logradouro);
                    endereco = new Endereco(numero, complemento, cep);
                    
                }else{
                    
                    bairro = gdEndereco.consultarBairroCidade(nomeBairro, cidade.getId());
                    if(bairro == null){
                        bairro = new Bairro(nomeBairro, cidade);
                        logradouro = new Logradouro(nomeLogradouro, tipoLogradouro, bairro);
                        cep = new Cep(numeroCep, logradouro);
                        endereco = new Endereco(numero, complemento, cep);
                        
                    }else{
                        
                        logradouro = gdEndereco.consultarLogradouroBairro(nomeLogradouro, bairro.getId());
                        if(logradouro == null){
                            logradouro = new Logradouro(nomeLogradouro, tipoLogradouro, bairro);
                            cep = new Cep(numeroCep, logradouro);
                            endereco = new Endereco(numero, complemento, cep);
                        }else{
                            cep = new Cep(numeroCep, logradouro);
                            endereco = new Endereco(numero, complemento, cep);
                        }
                    }
                }
            }
        }else{
            endereco = new Endereco(numero, complemento, cepAtual);
        }
       
        List<TipoServico> tipoServicos = pTiposServicos;
        
        Funcionario funcionario = new Funcionario(endereco, habilitacao, usuario, email, cargo, nome, dtNascFormatada, cpf, rg, sexo, telefone, tipoServicos);
        gdFuncionario.cadastrar(funcionario);
    }
    
    public void alterarFuncionario(Funcionario funcionario, String nome, String cpf, String rg, String email, 
            String data_nasc, String telefone, char sexo, Cargo cargo,
            Habilitacao habilitacao, String login, String senha,
            String numeroCep, String nomeLogradouro, String numero,
            String nomeBairro, String nomeCidade, String nomeEstado, String tipoLogradouro, String complemento, Cep cepAtual, List tipoServicos ) throws Exception {
        
        validarCampos(nome, cpf, data_nasc, rg, telefone);
        Date dtNascFormatada = new Date(data_nasc);
        Usuario usuario = (funcionario.getUsuario() != null) ? funcionario.getUsuario() : new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(senha);
        
        funcionario.setCargo(cargo);
        funcionario.setCpf(cpf);
        funcionario.setDt_nasc(dtNascFormatada);
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
        
        Estado estado;
        Cidade cidade;
        Bairro bairro;
        Logradouro logradouro;
        Cep cep;
        
        if(cepAtual == null){
            
            estado = gdEndereco.consultarEstado(nomeEstado);
            if (estado == null) {
                
                estado = new Estado(nomeEstado);
                cidade = new Cidade(nomeCidade, estado);
                bairro = new Bairro(nomeBairro, cidade);
                logradouro = new Logradouro(nomeLogradouro, tipoLogradouro, bairro);
                cep = new Cep(numeroCep, logradouro);
                funcionario.getEndereco().setCep(cep);

            }else{  
                cidade = gdEndereco.consultarCidade(nomeCidade);
                
                if (cidade == null){
                    cidade = new Cidade(nomeCidade, estado);
                    bairro = new Bairro(nomeBairro, cidade);
                    logradouro = new Logradouro(nomeLogradouro, tipoLogradouro, bairro);
                    cep = new Cep(numeroCep, logradouro);
                    funcionario.getEndereco().setCep(cep);
                    
                }else{
                    
                    bairro = gdEndereco.consultarBairroCidade(nomeBairro, cidade.getId());
                    if(bairro == null){
                        bairro = new Bairro(nomeBairro, cidade);
                        logradouro = new Logradouro(nomeLogradouro, tipoLogradouro, bairro);
                        cep = new Cep(numeroCep, logradouro);
                        funcionario.getEndereco().setCep(cep);
                        
                    }else{
                        
                        logradouro = gdEndereco.consultarLogradouroBairro(nomeLogradouro, bairro.getId());
                        if(logradouro == null){
                            logradouro = new Logradouro(nomeLogradouro, tipoLogradouro, bairro);
                            cep = new Cep(numeroCep, logradouro);
                            funcionario.getEndereco().setCep(cep);
                        }else{
                            cep = new Cep(numeroCep, logradouro);
                            funcionario.getEndereco().setCep(cep);
                        }
                    }
                }
            }         
        }else{
            funcionario.getEndereco().setCep(cepAtual);
        }
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
