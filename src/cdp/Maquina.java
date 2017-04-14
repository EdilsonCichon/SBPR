package cdp;

public class Maquina {
    
    private int id;
    private String modelo;
    private String placa;
    private TipoMaquina tipoMaquina;

    public Maquina(int id, String modelo, String placa, TipoMaquina tipoMaquina) {
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
        this.tipoMaquina = tipoMaquina;
    }

    public Maquina(String modelo, String placa, TipoMaquina tipoMaquina) {
        this.modelo = modelo;
        this.placa = placa;
        this.tipoMaquina = tipoMaquina;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoMaquina getTipoMaquina() {
        return tipoMaquina;
    }

    public void setTipoMaquina(TipoMaquina tipoMaquina) {
        this.tipoMaquina = tipoMaquina;
    }
}
