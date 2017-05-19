package cgd;

import cdp.TipoMaquina;
import java.util.LinkedList;
import java.util.List;

public class GDTipoMaquina extends GDGenerico{
    
    public List<TipoMaquina> consultar(){
        
        LinkedList<TipoMaquina> tipoMaquinas = new LinkedList<>();
        tipoMaquinas.add(new TipoMaquina("Escavadeira", "Máquina que executa escavações em geral."));
        tipoMaquinas.add(new TipoMaquina("Trepadeira", "Máquina que trepa em barrancos."));
        tipoMaquinas.add(new TipoMaquina("Assadeira", "Máquina que assa pães em geral."));
        tipoMaquinas.add(new TipoMaquina("No no no", "Minha criatividade acabou. :D"));
        return tipoMaquinas;
    }
}
