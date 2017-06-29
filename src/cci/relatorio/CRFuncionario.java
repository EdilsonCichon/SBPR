package cci.relatorio;

import cgt.util.SBPRException;
import net.sf.jasperreports.engine.JRException;
import java.util.List;

public class CRFuncionario extends CRGenerico{
    
    public void listar(List lista) {
        try {
            gerarRelatorio("../../cih/funcionario/JRListaFuncionario.jasper", lista);
        } catch (JRException ex) {
            System.out.println( ex.getMessage() );
        } catch (SBPRException ex) {
            System.out.println( ex.getMessage() );
        }
    }
    
}