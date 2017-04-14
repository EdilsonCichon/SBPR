package cdp.endereco;

import java.util.LinkedList;

public class Logradouro {
    
    private int id;
    private String nome;
    private String tipo;
    private LinkedList<Bairro> bairros;

    public Logradouro(int id, String nome, String tipo, LinkedList<Bairro> bairros) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.bairros = bairros;
    }

    public Logradouro(String nome, String tipo, LinkedList<Bairro> bairros) {
        this.nome = nome;
        this.tipo = tipo;
        this.bairros = bairros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LinkedList<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(LinkedList<Bairro> bairros) {
        this.bairros = bairros;
    } 
}
