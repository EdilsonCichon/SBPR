package cih.principal;

import cci.CIInterface;
import cci.util.JTableUtil;
import cdp.Cargo;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JDCargo extends javax.swing.JDialog {

    private CIInterface ciInterface;

    public JDCargo(java.awt.Frame parent, boolean modal, CIInterface ciInterface) {
        super(parent, modal);
        initComponents();
        this.ciInterface = ciInterface;
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
        preencherTabela();
    }

    public void preencherTabela() {
        JTableUtil.limparTabela(jTableCargo);
        List<Cargo> listaCargos = ciInterface.getCiGeral().consultarCargos();

        listaCargos.forEach((cargo) -> {
            JTableUtil.addLinha(jTableCargo, cargo.toArray());
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCargo = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCargo = new javax.swing.JTable();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cargo");
        setResizable(false);

        jPanelCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Cargo"));

        jLabelNome.setText("Cargo:");

        jTableCargo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCargo);

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCargoLayout = new javax.swing.GroupLayout(jPanelCargo);
        jPanelCargo.setLayout(jPanelCargoLayout);
        jPanelCargoLayout.setHorizontalGroup(
            jPanelCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCargoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCargoLayout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCadastrar))
                    .addGroup(jPanelCargoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCargoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelCargoLayout.setVerticalGroup(
            jPanelCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCargoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNome)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSair)
                .addGap(3, 3, 3))
        );

        getContentPane().add(jPanelCargo, java.awt.BorderLayout.CENTER);
        jPanelCargo.getAccessibleContext().setAccessibleParent(jPanelCargo);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        
        String nomeCargo = jTextFieldNome.getText();
        try {
            validarCampos(nomeCargo);
            boolean resposta = ciInterface.getCiGeral().cadastrarCargo(nomeCargo);
            if (resposta) {
                jTextFieldNome.setText("");
                preencherTabela();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed
    
    public void validarCampos(String nomeCargo) throws Exception{ 
        if(nomeCargo.equals("")){
            throw new Exception("Cargo Inválido");
        }       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanelCargo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCargo;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
