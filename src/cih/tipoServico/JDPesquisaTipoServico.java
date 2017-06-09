package cih.tipoServico;

import javax.swing.ImageIcon;
import cci.CIInterface;
import cci.util.Cenario;
import cci.util.JTableUtil;
import cdp.TipoServico;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

public class JDPesquisaTipoServico extends javax.swing.JDialog {
    
    private CIInterface ciInterface;
    private int CENARIO;
    private Frame framePai;
    
    public JDPesquisaTipoServico(Frame framePai, boolean modal, CIInterface ciInterface, int CENARIO) {
        super(framePai, modal);
        this.framePai = framePai;
        this.ciInterface = ciInterface;
        this.CENARIO = CENARIO;
        initComponents();
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPesquisarTipoServico = new javax.swing.JPanel();
        jLabelFiltrar = new javax.swing.JLabel();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        jTextFieldFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTipoServico = new javax.swing.JTable();
        jButtonFiltrarTipoServico = new javax.swing.JButton();
        jPanelRodape = new javax.swing.JPanel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtro de Tipo de Serviço");
        setResizable(false);

        jPanelPesquisarTipoServico.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabelFiltrar.setText("Filtrar por:");

        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Valor Hora" }));

        jTextFieldFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFiltroKeyPressed(evt);
            }
        });

        jTableTipoServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Valor Hora", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTipoServico);

        jButtonFiltrarTipoServico.setText("...");
        jButtonFiltrarTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarTipoServicoActionPerformed(evt);
            }
        });
        jButtonFiltrarTipoServico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonFiltrarTipoServicoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisarTipoServicoLayout = new javax.swing.GroupLayout(jPanelPesquisarTipoServico);
        jPanelPesquisarTipoServico.setLayout(jPanelPesquisarTipoServicoLayout);
        jPanelPesquisarTipoServicoLayout.setHorizontalGroup(
            jPanelPesquisarTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarTipoServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPesquisarTipoServicoLayout.createSequentialGroup()
                        .addComponent(jLabelFiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFiltrarTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPesquisarTipoServicoLayout.setVerticalGroup(
            jPanelPesquisarTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarTipoServicoLayout.createSequentialGroup()
                .addGroup(jPanelPesquisarTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFiltrar)
                    .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiltrarTipoServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelRodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout jPanelRodapeLayout = new javax.swing.GroupLayout(jPanelRodape);
        jPanelRodape.setLayout(jPanelRodapeLayout);
        jPanelRodapeLayout.setHorizontalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonConfirmar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPesquisarTipoServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPesquisarTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        try {
            TipoServico tipoServicoSelecionado = (TipoServico) JTableUtil.getDadosLinhaSelecionada(jTableTipoServico);
            if (CENARIO == Cenario.SELECIONAR) {
                ciInterface.getCiTipoServico().setTipoServicoSelecionado(tipoServicoSelecionado);
                dispose();
            }
            else
                ciInterface.getCiTipoServico().instanciarTelaCadastroTipoServico(tipoServicoSelecionado, framePai, CENARIO);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de serviço", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonFiltrarTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarTipoServicoActionPerformed
        String colunaFiltro = jComboBoxFiltro.getSelectedItem().toString().toLowerCase();
        String filtro = jTextFieldFiltro.getText();
        if ( colunaFiltro.equals("valor hora") )  {
            try {
                Double.parseDouble(filtro);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor da hora deve ser numerico!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        List<TipoServico> listaTipoServicos = ciInterface.getCiTipoServico().filtrarTipoServico(colunaFiltro, filtro);
        JTableUtil.limparTabela(jTableTipoServico);
        
        listaTipoServicos.forEach((tipoServico) -> {
            JTableUtil.addLinha(jTableTipoServico, tipoServico.toArray() );
        });
    }//GEN-LAST:event_jButtonFiltrarTipoServicoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFiltroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonFiltrarTipoServicoActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldFiltroKeyPressed

    private void jButtonFiltrarTipoServicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonFiltrarTipoServicoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonFiltrarTipoServicoActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonFiltrarTipoServicoKeyPressed

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
    private javax.swing.JButton jButtonFiltrarTipoServico;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JLabel jLabelFiltrar;
    private javax.swing.JPanel jPanelPesquisarTipoServico;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTipoServico;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
