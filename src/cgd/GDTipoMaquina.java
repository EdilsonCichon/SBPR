
package cgd;

import cdp.TipoMaquina;
import java.util.LinkedList;

public class GDTipoMaquina {
    
    public void cadastrar(TipoMaquina tipoMaquina) throws Exception {
        // LÓGICA PRA INSERIR NO BANCO O OBJETO DO DOMINIO...
            // CASO OCORRA EXCESSAO ACIMA, SERÁ DISPARADA.
        tipoMaquina.setId(10);
    }
    
    public void alterar(TipoMaquina tipoMaquina){
       
    }
    
    public LinkedList<TipoMaquina> consultar(String nomePesquisado){
        //EXECUTA A CONSULTA COM O PARAMETRO INFORMADO.
        //E POPULA O ARRAY COMO ABAIXO.
        LinkedList<TipoMaquina> tipoMaquinas = new LinkedList<>();
        tipoMaquinas.add(new TipoMaquina("Escavadeira", "Máquina que executa escavações em geral."));
        tipoMaquinas.add(new TipoMaquina("Trepadeira", "Máquina que trepa em barrancos."));
        tipoMaquinas.add(new TipoMaquina("Assadeira", "Máquina que assa pães em geral."));
        tipoMaquinas.add(new TipoMaquina("No no no", "Minha criatividade acabou. :D"));
        return tipoMaquinas;
    }
    
    public void excluir(TipoMaquina tipoMaquina) {
       
    }
}
