package cci.relatorio;

import cgt.util.SBPRException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public abstract class CRGenerico {
    
    public CRGenerico() {
    }
    
    public void gerarRelatorio(String caminho, List lista) throws JRException, SBPRException {
        InputStream rel = getClass().getResourceAsStream(caminho);
        Map parametros = new HashMap();
        JRBeanCollectionDataSource dados = new JRBeanCollectionDataSource(lista);
        JasperPrint print;
        print = JasperFillManager.fillReport(rel, parametros, dados);
        JasperViewer janela = new JasperViewer(print, true);
        if ( print.getPages().size() > 0 )
            janela.setVisible(true);
        else
            throw new SBPRException(100);
    }
}
