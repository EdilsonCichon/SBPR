package cih.funcionario;

import javax.swing.ImageIcon;

import cci.CIInterface;
import cci.util.Cenario;
import cci.util.JTableUtil;
import cdp.Funcionario;
import com.sun.glass.events.KeyEvent;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;

public class JDPesquisaFuncionario extends javax.swing.JDialog {

    private CIInterface ciInterface;
    private int CENARIO;
    private Frame pai;

    public JDPesquisaFuncionario(java.awt.Frame parent, boolean modal, CIInterface ciInterface, int CENARIO) {
        super(parent, modal);
        this.ciInterface = ciInterface;
        this.CENARIO = CENARIO;
        this.pai = parent;
        initComponents();
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPesquisarFuncionario = new javax.swing.JPanel();
        jLabelFiltrar = new javax.swing.JLabel();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        jTextFieldFiltro = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();
        jButtonFiltrar = new javax.swing.JButton();
        jPanelRodape = new javax.swing.JPanel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtro de Funcionário");
        setResizable(false);

        jPanelPesquisarFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabelFiltrar.setText("Filtrar por:");

        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF", "RG", "Cargo" }));

        jTextFieldFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFiltroKeyPressed(evt);
            }
        });

        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "RG", "Data Nasc."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(jTableFuncionario);

        jButtonFiltrar.setText("...");
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

        javax.swing.GroupLayout jPanelPesquisarFuncionarioLayout = new javax.swing.GroupLayout(jPanelPesquisarFuncionario);
        jPanelPesquisarFuncionario.setLayout(jPanelPesquisarFuncionarioLayout);
        jPanelPesquisarFuncionarioLayout.setHorizontalGroup(
            jPanelPesquisarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                    .addGroup(jPanelPesquisarFuncionarioLayout.createSequentialGroup()
                        .addComponent(jLabelFiltrar)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFiltrar)))
                .addContainerGap())
        );
        jPanelPesquisarFuncionarioLayout.setVerticalGroup(
            jPanelPesquisarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarFuncionarioLayout.createSequentialGroup()
                .addGroup(jPanelPesquisarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFiltrar)
                    .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
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
            .addComponent(jPanelPesquisarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPesquisarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed

        String tipoFiltro = (String)jComboBoxFiltro.getSelectedItem().toString().toLowerCase();
        String texto = jTextFieldFiltro.getText();
        
        List<Funcionario> listaFuncionarios = ciInterface.getCiFuncionario().filtrarFuncionario(tipoFiltro, texto);
        JTableUtil.limparTabela(jTableFuncionario);
        
        listaFuncionarios.forEach((funcionario) -> {
            JTableUtil.addLinha(jTableFuncionario, funcionario.toArray() );
        });
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        
        try {
            Funcionario funcionarioSelecionado = (Funcionario) JTableUtil.getDadosLinhaSelecionada(jTableFuncionario);
            
            if(CENARIO == Cenario.SELECIONAR){
                ciInterface.getCiFuncionario().setFuncionarioSelecionado(funcionarioSelecionado);
                dispose();
            }else
                ciInterface.getCiFuncionario().instanciarTelaCadastroFuncionario(funcionarioSelecionado, pai, CENARIO);
                      
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Selecione um funcionário", "ERRO", JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

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
            jButtonFiltrarKeyPressed(null);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JLabel jLabelFiltrar;
    private javax.swing.JPanel jPanelPesquisarFuncionario;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTableFuncionario;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
