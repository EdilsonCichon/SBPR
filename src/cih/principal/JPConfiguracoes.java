package cih.principal;

import cci.CIInterface;
import javax.swing.JFrame;

public class JPConfiguracoes extends javax.swing.JPanel {

    private JFrame pai;
    private CIInterface ciInterface;
    
    public JPConfiguracoes(JFrame pai, CIInterface ciInterface) {
        initComponents();
        this.pai = pai;
        this.ciInterface = ciInterface;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCargo = new javax.swing.JButton();
        jButtonHabilitacao = new javax.swing.JButton();
        jButtonEndereco = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Configurações"));
        setLayout(new java.awt.GridLayout(2, 3, 5, 5));

        jButtonCargo.setText("Cargo");
        jButtonCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargoActionPerformed(evt);
            }
        });
        add(jButtonCargo);

        jButtonHabilitacao.setText("Habilitação");
        jButtonHabilitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHabilitacaoActionPerformed(evt);
            }
        });
        add(jButtonHabilitacao);

        jButtonEndereco.setText("Endereço");
        jButtonEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnderecoActionPerformed(evt);
            }
        });
        add(jButtonEndereco);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargoActionPerformed
        ciInterface.getCiGeral().instanciarTelaCadastroCargo(pai);
    }//GEN-LAST:event_jButtonCargoActionPerformed

    private void jButtonHabilitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHabilitacaoActionPerformed
        ciInterface.getCiGeral().instanciarTelaCadastroHabilitacao(pai);
    }//GEN-LAST:event_jButtonHabilitacaoActionPerformed

    private void jButtonEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnderecoActionPerformed
        ciInterface.getCiGeral().instanciarTelaCadastroEndereco(pai);
    }//GEN-LAST:event_jButtonEnderecoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargo;
    private javax.swing.JButton jButtonEndereco;
    private javax.swing.JButton jButtonHabilitacao;
    // End of variables declaration//GEN-END:variables
}
