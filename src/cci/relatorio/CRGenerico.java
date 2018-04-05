package cci.relatorio;

import cgt.util.SBPRException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JDialog;
/*import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;*/

public abstract class CRGenerico {
    
    public CRGenerico() {
    }
   /* 
    public void listar(String caminho, List lista) throws JRException, SBPRException {
        
        JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório", true);
        viewer.setSize(1000, 700);
        viewer.setLocationRelativeTo(null);
        
        InputStream rel = getClass().getResourceAsStream(caminho);
        Map parametros = new HashMap();
        JRBeanCollectionDataSource dados = new JRBeanCollectionDataSource(lista);
        JasperPrint print;
        print = JasperFillManager.fillReport(rel, parametros, dados);
        JasperViewer jasperView = new JasperViewer(print, true);
        viewer.getContentPane().add(jasperView.getContentPane());
        
        if ( print.getPages().size() > 0 )
            viewer.setVisible(true);
        else
            throw new SBPRException(100);
    }*/
}
