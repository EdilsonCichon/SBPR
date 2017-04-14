package cdp;

public class Habilitacao {
    
    private int id;
    private String categoria;

    public Habilitacao(int id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public Habilitacao(String categoria) {
        this.categoria = categoria;
    }
}
