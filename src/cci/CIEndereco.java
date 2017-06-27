package cci;

import cdp.endereco.Cep;
import cgt.GTEndereco;
import cgt.webServices.WebServiceCep;

public class CIEndereco {
    
    private GTEndereco gtEndereco;
    private String estado;
    private String cidade;
    private String bairro;
    private String tipoLogradouro;
    private String logradouro;
    
    public CIEndereco() {
        gtEndereco = new GTEndereco();
    }
    
    public Cep consultarCepBanco(String cep) {
        return gtEndereco.consultarCepBanco(cep);
    }

    public boolean consultarCepWeb(String cep) {
        
        WebServiceCep webServiceCep = gtEndereco.consultarCepWeb(cep);
        
        if (webServiceCep.wasSuccessful()){
            
            setEstado(webServiceCep.getUf());
            setCidade(webServiceCep.getCidade());
            setBairro(webServiceCep.getBairro());
            setTipoLogradouro(webServiceCep.getLogradouroType());
            setLogradouro(webServiceCep.getLogradouro());
            
            return true;
        }else{
            return false;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
