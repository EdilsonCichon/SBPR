package cih.maquina;

import javax.swing.ImageIcon;
import cci.CIInterface;
import cci.util.Cenario;
import cci.util.JTableUtil;
import cdp.Maquina;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

public class JDPesquisarMaquina extends javax.swing.JDialog {
    
    private CIInterface ciInterface;
    private int CENARIO;
    private Frame pai;
    
    public JDPesquisarMaquina(java.awt.Frame parent, boolean modal, CIInterface ciInterface, int CENARIO) {
        super(parent, modal);
        initComponents();
        this.ciInterface = ciInterface;
        this.pai = parent;
        this.CENARIO = CENARIO;
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPesquisa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMaquina = new javax.swing.JTable();
        jLabelFiltro = new javax.swing.JLabel();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        jTextFieldFiltro = new javax.swing.JTextField();
        jButtonPesquisarMaquina = new javax.swing.JButton();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtro de Máquinas");

        jPanelPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        jTableMaquina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Placa"
            }
        ));
        jScrollPane1.setViewportView(jTableMaquina);

        jLabelFiltro.setText("Filtrar por:");

        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modelo", "Placa" }));

        jTextFieldFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFiltroKeyPressed(evt);
            }
        });

        jButtonPesquisarMaquina.setText("...");
        jButtonPesquisarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarMaquinaActionPerformed(evt);
            }
        });
        jButtonPesquisarMaquina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonPesquisarMaquinaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisaLayout = new javax.swing.GroupLayout(jPanelPesquisa);
        jPanelPesquisa.setLayout(jPanelPesquisaLayout);
        jPanelPesquisaLayout.setHorizontalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                        .addComponent(jLabelFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPesquisarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelPesquisaLayout.setVerticalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFiltro)
                    .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarMaquina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar)
                .addGap(9, 9, 9))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        
        try {
            Maquina maquinaSelecionada = (Maquina) JTableUtil.getDadosLinhaSelecionada(jTableMaquina);
            
            if(CENARIO == Cenario.SELECIONAR){
                ciInterface.getCiMaquina().setMaquinaSelecionada(maquinaSelecionada);
                this.dispose();
            }else
                ciInterface.getCiMaquina().instanciarTelaCadastroMaquina(maquinaSelecionada, pai, CENARIO);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Selecione uma máquina", "ERRO", JOptionPane.ERROR_MESSAGE);
        }         
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonPesquisarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarMaquinaActionPerformed
        
        String colunaFiltro = jComboBoxFiltro.getSelectedItem().toString().toLowerCase();
        String filtro = jTextFieldFiltro.getText();
        
        List<Maquina> listaMaquinas = ciInterface.getCiMaquina().filtrarMaquina(colunaFiltro, filtro);
        JTableUtil.limparTabela(jTableMaquina);
        
        listaMaquinas.forEach ((maquina) -> {
            JTableUtil.addLinha(jTableMaquina, maquina.toArray());
        });       
    }//GEN-LAST:event_jButtonPesquisarMaquinaActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFiltroKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonPesquisarMaquinaActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldFiltroKeyPressed

    private void jButtonPesquisarMaquinaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonPesquisarMaquinaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonPesquisarMaquinaKeyPressed(null);
        }
    }//GEN-LAST:event_jButtonPesquisarMaquinaKeyPressed

    private void jButtonConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonConfirmarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonConfirmarKeyPressed

    private void jButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCancelarKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonPesquisarMaquina;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JLabel jLabelFiltro;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMaquina;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
