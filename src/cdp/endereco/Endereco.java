package cdp.endereco;

public class Endereco {
    
    private int id;
    private String numero;
    private String tipo;
    private String complemento;
    private Cep cep;

    public Endereco(int id, String numero, String tipo, String complemento, Cep cep) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.complemento = complemento;
        this.cep = cep;
    }

    public Endereco(String numero, String tipo, String complemento, Cep cep) {
        this.numero = numero;
        this.tipo = tipo;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }
}
