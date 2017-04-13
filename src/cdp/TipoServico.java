package cdp;

public class TipoServico {
    
    public String nome;
    public String descricao;
    public double valor_hr;
    public TipoMaquina tipoMaquina;

    public TipoServico(String nome, String descricao, double valor_hr, TipoMaquina tipoMaquina) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor_hr = valor_hr;
        this.tipoMaquina = tipoMaquina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor_hr() {
        return valor_hr;
    }

    public void setValor_hr(double valor_hr) {
        this.valor_hr = valor_hr;
    }

    public TipoMaquina getTipoMaquina() {
        return tipoMaquina;
    }

    public void setTipoMaquina(TipoMaquina tipoMaquina) {
        this.tipoMaquina = tipoMaquina;
    }    
}
