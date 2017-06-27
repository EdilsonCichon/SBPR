package cgt;

import cdp.endereco.Cep;
import cgd.GDEndereco;
import cgt.webServices.WebServiceCep;

public class GTEndereco {
    
    private GDEndereco gdEndereco;
    private WebServiceCep webServiceCep;

    public GTEndereco() {
        gdEndereco = new GDEndereco();
    }

    public Cep consultarCepBanco(String cep) {
        return gdEndereco.consultarCep(cep.replace("-", ""));
    }

    public WebServiceCep consultarCepWeb(String cep) {
        webServiceCep = WebServiceCep.searchCep(cep.replace("-", ""));
        return webServiceCep;
    } 
}
