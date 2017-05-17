package cgd;

import cdp.TipoMaquina;
import java.util.LinkedList;

public class GDTipoMaquina extends GDGenerico{
    
    public LinkedList<TipoMaquina> consultar(){
        //EXECUTA A CONSULTA COM O PARAMETRO INFORMADO.
        //E POPULA O ARRAY COMO ABAIXO.
        LinkedList<TipoMaquina> tipoMaquinas = new LinkedList<>();
        tipoMaquinas.add(new TipoMaquina("Escavadeira", "Máquina que executa escavações em geral."));
        tipoMaquinas.add(new TipoMaquina("Trepadeira", "Máquina que trepa em barrancos."));
        tipoMaquinas.add(new TipoMaquina("Assadeira", "Máquina que assa pães em geral."));
        tipoMaquinas.add(new TipoMaquina("No no no", "Minha criatividade acabou. :D"));
        return tipoMaquinas;
    }
}
