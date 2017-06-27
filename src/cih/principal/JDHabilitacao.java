package cih.principal;

import cci.CIInterface;
import cci.util.JTableUtil;
import cdp.Habilitacao;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.ImageIcon;

public class JDHabilitacao extends javax.swing.JDialog {

    private CIInterface ciInterface;
    
    public JDHabilitacao(java.awt.Frame parent, boolean modal, CIInterface ciInterface) {
        super(parent, modal);
        initComponents();
        this.ciInterface = ciInterface;
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
        preencherTabela();
    }
    
    public void preencherTabela() {
        JTableUtil.limparTabela(jTableHabilitacao);
        List<Habilitacao> listaHabilitacoes = ciInterface.getCiGeral().consultarHabilitacoes();

        listaHabilitacoes.forEach((habilitacao) -> {
            JTableUtil.addLinha(jTableHabilitacao, habilitacao.toArray());
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHabilitacao = new javax.swing.JPanel();
        jLabelHabilitacao = new javax.swing.JLabel();
        jTextFieldHabilitacao = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHabilitacao = new javax.swing.JTable();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Habilitação");

        jPanelHabilitacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Habilitação"));

        jLabelHabilitacao.setText("Categoria:");

        jTextFieldHabilitacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldHabilitacaoKeyPressed(evt);
            }
        });

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jButtonCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCadastrarKeyPressed(evt);
            }
        });

        jTableHabilitacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableHabilitacao);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jButtonSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSairKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHabilitacaoLayout = new javax.swing.GroupLayout(jPanelHabilitacao);
        jPanelHabilitacao.setLayout(jPanelHabilitacaoLayout);
        jPanelHabilitacaoLayout.setHorizontalGroup(
            jPanelHabilitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHabilitacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHabilitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHabilitacaoLayout.createSequentialGroup()
                        .addComponent(jLabelHabilitacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldHabilitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar))
                    .addGroup(jPanelHabilitacaoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHabilitacaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelHabilitacaoLayout.setVerticalGroup(
            jPanelHabilitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHabilitacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHabilitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHabilitacao)
                    .addComponent(jTextFieldHabilitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelHabilitacao, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        
        String categoria = jTextFieldHabilitacao.getText();
        try {
            validarCampos(categoria);
            boolean resposta = ciInterface.getCiGeral().cadastrarHabilitacao(categoria);
            if (resposta) {
                jTextFieldHabilitacao.setText("");
                preencherTabela();
            }
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(this, e.getMessage());
        }
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldHabilitacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHabilitacaoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonCadastrarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldHabilitacaoKeyPressed

    private void jButtonCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCadastrarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonCadastrarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonCadastrarKeyPressed

    private void jButtonSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSairKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.dispose();
        }
    }//GEN-LAST:event_jButtonSairKeyPressed

    public void validarCampos(String categoria) throws Exception{ 
        if(categoria.equals("")){
            throw new Exception("Habilitação Inválida");
        }       
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelHabilitacao;
    private javax.swing.JPanel jPanelHabilitacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHabilitacao;
    private javax.swing.JTextField jTextFieldHabilitacao;
    // End of variables declaration//GEN-END:variables
}
