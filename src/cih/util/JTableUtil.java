package cih.util;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Coleção de comandos úteis para trabalhar com JTables do Java.
 * 
 * Isso não seria necessário se a sintaxe do JTable não fosse horrível!
 * 
 * @author Edilson Cichon
 */
public class JTableUtil extends JTable {
    
    public static DefaultTableModel getModel(JTable jTable) {
        return ((DefaultTableModel) jTable.getModel());
    }
    
    public static int getRowIndexSelected(JTable jTable) {
        return jTable.getSelectedRow();
    }
    
    public static Object getRowDataSelected(JTable jTable) throws Exception {
        int rowSelected = jTable.getSelectedRow();
        if ( rowSelected < 0 )
            throw new Exception("Nenhuma linha selecionada.");
        return getModel(jTable).getValueAt(rowSelected, 0);
    }
    
    public static void addRow(JTable jTable, Object[] rowData) {
        getModel(jTable).addRow(rowData);
    }
    
    public static void cleanAll(JTable jTable) {
        int qtdLinhas = jTable.getRowCount() - 1;
        for (int i = qtdLinhas; i >= 0; i--)
            getModel(jTable).removeRow(i);
    }
}
