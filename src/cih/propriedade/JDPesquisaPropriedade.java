package cih.propriedade;

import cci.CIInterface;
import cdp.Propriedade;
import cci.util.JTableUtil;
import com.sun.glass.events.KeyEvent;
import java.awt.Frame;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class JDPesquisaPropriedade extends javax.swing.JDialog {
    
    private CIInterface ciInterface;
    private Frame pai;
    private int CENARIO;
    
    public JDPesquisaPropriedade(java.awt.Frame parent, boolean modal, CIInterface ciInterface, int CENARIO) {
        super(parent, modal);
        this.ciInterface = ciInterface;
        this.pai = (JFrame) parent;
        this.CENARIO = CENARIO;
        initComponents();
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPesquisarPropriedade = new javax.swing.JPanel();
        jLabelFiltrar = new javax.swing.JLabel();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        jTextFieldFiltro = new javax.swing.JTextField();
        jScrollPanePropriedades = new javax.swing.JScrollPane();
        jTablePropriedades = new javax.swing.JTable();
        jButtonFiltrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtro de Propriedade");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanelPesquisarPropriedade.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabelFiltrar.setText("Filtrar por:");

        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "ID Produtor" }));

        jTextFieldFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFiltroKeyPressed(evt);
            }
        });

        jTablePropriedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Referência", "Responsável"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPanePropriedades.setViewportView(jTablePropriedades);

        jButtonFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-pesquisar-reduzido.png"))); // NOI18N
        jButtonFiltrar.setToolTipText("Buscar");
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });
        jButtonFiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonFiltrarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisarPropriedadeLayout = new javax.swing.GroupLayout(jPanelPesquisarPropriedade);
        jPanelPesquisarPropriedade.setLayout(jPanelPesquisarPropriedadeLayout);
        jPanelPesquisarPropriedadeLayout.setHorizontalGroup(
            jPanelPesquisarPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarPropriedadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPanePropriedades)
                    .addGroup(jPanelPesquisarPropriedadeLayout.createSequentialGroup()
                        .addComponent(jLabelFiltrar)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButtonFiltrar)))
                .addContainerGap())
        );
        jPanelPesquisarPropriedadeLayout.setVerticalGroup(
            jPanelPesquisarPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarPropriedadeLayout.createSequentialGroup()
                .addGroup(jPanelPesquisarPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFiltrar)
                    .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPanePropriedades, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        jButtonConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonConfirmarKeyPressed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jButtonCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCancelarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPesquisarPropriedade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPesquisarPropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        
        String colunaFiltro = jComboBoxFiltro.getSelectedItem().toString().toLowerCase();
        String filtro = jTextFieldFiltro.getText();
        
        List<Propriedade> listaPropriedades = null;
        
        if(jComboBoxFiltro.getSelectedIndex() == 1){
            if(jTextFieldFiltro.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Insira um ID de produtor", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            }else{
                listaPropriedades = listaPropriedades = ciInterface.getCiPropriedade().filtrarPropriedades(colunaFiltro, filtro); 
            }       
        }else{
            listaPropriedades = listaPropriedades = ciInterface.getCiPropriedade().filtrarPropriedades(colunaFiltro, filtro);
        }
        
        JTableUtil.limparTabela(jTablePropriedades);
        
        if(listaPropriedades != null){
            listaPropriedades.forEach((propriedade) -> {
            JTableUtil.addLinha(jTablePropriedades, propriedade.toArray() );
            });
        }
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        
        try { 
            Propriedade propriedade = (Propriedade) JTableUtil.getDadosLinhaSelecionada(jTablePropriedades);
            ciInterface.getCiPropriedade().instanciarTelaCadastroPropriedade(propriedade, pai, CENARIO);
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Selecione uma propriedade", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jTextFieldFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFiltroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonFiltrarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldFiltroKeyPressed

    private void jButtonFiltrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonFiltrarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonFiltrarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonFiltrarKeyPressed

    private void jButtonConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonConfirmarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonConfirmarKeyPressed

    private void jButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonCancelarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonCancelarKeyPressed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        jButtonFiltrarActionPerformed(null);
    }//GEN-LAST:event_formWindowGainedFocus

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JLabel jLabelFiltrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelPesquisarPropriedade;
    private javax.swing.JScrollPane jScrollPanePropriedades;
    private javax.swing.JTable jTablePropriedades;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
