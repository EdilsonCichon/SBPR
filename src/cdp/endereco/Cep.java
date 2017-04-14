package cdp.endereco;

import java.util.LinkedList;

public class Cep {
    
    private int id;
    private String cep;
    private LinkedList<Logradouro> logradouros;

    public Cep(int id, String cep, LinkedList<Logradouro> logradouros) {
        this.id = id;
        this.cep = cep;
        this.logradouros = logradouros;
    }
    
    public Cep(String cep, LinkedList<Logradouro> logradouros) {
        this.cep = cep;
        this.logradouros = logradouros;
    }  

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public LinkedList<Logradouro> getLogradouros() {
        return logradouros;
    }

    public void setLogradouros(LinkedList<Logradouro> logradouros) {
        this.logradouros = logradouros;
    }
}
