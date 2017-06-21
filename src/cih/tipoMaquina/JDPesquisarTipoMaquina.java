package cih.tipoMaquina;

import cci.CIInterface;
import cci.util.Cenario;
import cci.util.JTableUtil;
import cdp.TipoMaquina;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JDPesquisarTipoMaquina extends javax.swing.JDialog {
    
    private CIInterface ciInterface;
    private int CENARIO;
    private Frame pai;
    
    public JDPesquisarTipoMaquina(Frame pai, boolean modal, int CENARIO, CIInterface ciInterface) {
        super(pai, modal);
        initComponents();
        this.ciInterface = ciInterface;
        this.CENARIO = CENARIO;
        this.pai = pai;
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTipoMaquina = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTipoDeMaquina = new javax.swing.JTable();
        jTextFieldFiltro = new javax.swing.JTextField();
        jButtonFiltrar = new javax.swing.JButton();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtro de Tipo de Máquina");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanelTipoMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jTableTipoDeMaquina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(jTableTipoDeMaquina);

        jTextFieldFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFiltroKeyPressed(evt);
            }
        });

        jButtonFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-pesquisar-reduzido.png"))); // NOI18N
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

        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome" }));

        javax.swing.GroupLayout jPanelTipoMaquinaLayout = new javax.swing.GroupLayout(jPanelTipoMaquina);
        jPanelTipoMaquina.setLayout(jPanelTipoMaquinaLayout);
        jPanelTipoMaquinaLayout.setHorizontalGroup(
            jPanelTipoMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoMaquinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addGroup(jPanelTipoMaquinaLayout.createSequentialGroup()
                        .addComponent(jComboBoxFiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelTipoMaquinaLayout.setVerticalGroup(
            jPanelTipoMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTipoMaquinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiltrar)
                    .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar)
                .addContainerGap())
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTipoMaquina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTipoMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        try {
            
            TipoMaquina tipoMaquina = (TipoMaquina) JTableUtil.getDadosLinhaSelecionada(jTableTipoDeMaquina);
            
            if(CENARIO == Cenario.SELECIONAR){
                ciInterface.getCiTipoMaquina().setTipoMaquinaSelecionada(tipoMaquina);
                dispose();
            }else
               ciInterface.getCiTipoMaquina().instanciarTelaCadastroTipoMaquina(tipoMaquina, pai, CENARIO);     
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Selecione um Tipo de Maquina", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        
        String colunaFiltro = jComboBoxFiltro.getSelectedItem().toString().toLowerCase();
        String filtro = jTextFieldFiltro.getText();
        
        List<TipoMaquina> listaTiposMaquinas = ciInterface.getCiTipoMaquina().filtrarTipoMaquina(colunaFiltro, filtro);
        JTableUtil.limparTabela(jTableTipoDeMaquina);
        
        listaTiposMaquinas.forEach((tipoMaquina) -> {
            JTableUtil.addLinha(jTableTipoDeMaquina, tipoMaquina.toArray() );
        });
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            this.dispose();
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
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelTipoMaquina;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTipoDeMaquina;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
