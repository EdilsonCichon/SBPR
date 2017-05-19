package cci.util;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableUtil {
    
    /**
     * Retorna o model do jTable convertido para (DefaultTableModel).
     * @param jTable
     * @return (DefaultTableModel) model
     */
    public static DefaultTableModel getModel(JTable jTable) {
        return ((DefaultTableModel) jTable.getModel());
    }
    
    /**
     * Obtem o indice da linha selecionada.
     * @param jTable
     * @return int
     */
    public static int getIndiceLinhaSelecionada(JTable jTable) {
        return jTable.getSelectedRow();
    }
    
    /**
     * Obtem os dados (Object) da linha selecionada.
     * @param jTable
     * @return Object
     * @throws Exception 
     */
    public static Object getDadosLinhaSelecionada(JTable jTable) throws Exception {
        int linhaSelecionada = jTable.getSelectedRow();
        int coluna = 0;
        if ( linhaSelecionada < 0 )
            throw new Exception("Nenhuma linha selecionada.");
        return getModel(jTable).getValueAt(linhaSelecionada, coluna);
    }
    
    /**
     * Insere uma nova linha no final da jTable.
     * @param jTable
     * @param dadosLinha 
     */
    public static void addLinha(JTable jTable, Object[] dadosLinha) {
        getModel(jTable).addRow(dadosLinha);
    }
    
    /**
     * Apaga todas as linhas da tabela.
     * @param jTable 
     */
    public static void limparTabela(JTable jTable) {
        int qtdLinhas = jTable.getRowCount() - 1;
        for (int i = qtdLinhas; i >= 0; i--)
            getModel(jTable).removeRow(i);
    }
}
