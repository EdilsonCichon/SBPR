package cih;

import cci.CIInterface;

public class JPInicio extends javax.swing.JPanel {
    
    private final int servico = 0;
    private final int produtor = 1;
    private final int propriedade = 2;
    private final int maquina = 3;
    private final int funcionario = 4;
    private final int tipoServico = 5;
    private final int tipoMaquina = 6;
    
    private CIInterface ciInterface;
    private FrmPrincipal frmPrincipal;

    public JPInicio(FrmPrincipal frmPrincipal, CIInterface ciInterface) {
        initComponents();
        this.ciInterface = ciInterface;
        this.frmPrincipal = frmPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonProdutor = new javax.swing.JButton();
        jButtonServico = new javax.swing.JButton();
        jButtonMaquina = new javax.swing.JButton();
        jButtonTipoMaquina = new javax.swing.JButton();
        jButtonPropriedade = new javax.swing.JButton();
        jButtonTipoServico = new javax.swing.JButton();
        jButtonFuncionario = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(2, 4, 5, 5));

        jButtonProdutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-produtor-reduzido.png"))); // NOI18N
        jButtonProdutor.setText("Produtor");
        jButtonProdutor.setToolTipText("");
        jButtonProdutor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonProdutor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonProdutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutorActionPerformed(evt);
            }
        });
        add(jButtonProdutor);

        jButtonServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-serviço-reduzido.png"))); // NOI18N
        jButtonServico.setText("Serviços");
        jButtonServico.setToolTipText("");
        jButtonServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonServico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServicoActionPerformed(evt);
            }
        });
        add(jButtonServico);

        jButtonMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-maquina-reduzido.png"))); // NOI18N
        jButtonMaquina.setText("Máquinas");
        jButtonMaquina.setToolTipText("");
        jButtonMaquina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMaquina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaquinaActionPerformed(evt);
            }
        });
        add(jButtonMaquina);

        jButtonTipoMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-tipo-maquina-reduzido.png"))); // NOI18N
        jButtonTipoMaquina.setText("Tipos de Máquinas");
        jButtonTipoMaquina.setToolTipText("");
        jButtonTipoMaquina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTipoMaquina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonTipoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTipoMaquinaActionPerformed(evt);
            }
        });
        add(jButtonTipoMaquina);

        jButtonPropriedade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-propriedade-reduzido.png"))); // NOI18N
        jButtonPropriedade.setText("Propriedades");
        jButtonPropriedade.setToolTipText("");
        jButtonPropriedade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPropriedade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPropriedadeActionPerformed(evt);
            }
        });
        add(jButtonPropriedade);

        jButtonTipoServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-tipo-servico-reduzido.png"))); // NOI18N
        jButtonTipoServico.setText("Tipos de Serviços");
        jButtonTipoServico.setToolTipText("");
        jButtonTipoServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTipoServico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTipoServicoActionPerformed(evt);
            }
        });
        add(jButtonTipoServico);

        jButtonFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-funcionario-reduzido.png"))); // NOI18N
        jButtonFuncionario.setText("Funcionários");
        jButtonFuncionario.setToolTipText("");
        jButtonFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuncionarioActionPerformed(evt);
            }
        });
        add(jButtonFuncionario);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPropriedadeActionPerformed
        frmPrincipal.trocarPanel(new JPCrud(frmPrincipal, propriedade, ciInterface));
    }//GEN-LAST:event_jButtonPropriedadeActionPerformed

    private void jButtonServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonServicoActionPerformed
        frmPrincipal.trocarPanel(new JPServico(frmPrincipal, servico, ciInterface));
    }//GEN-LAST:event_jButtonServicoActionPerformed

    private void jButtonTipoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTipoMaquinaActionPerformed
        frmPrincipal.trocarPanel(new JPCrud(frmPrincipal, tipoMaquina, ciInterface));
    }//GEN-LAST:event_jButtonTipoMaquinaActionPerformed

    private void jButtonFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncionarioActionPerformed
        frmPrincipal.trocarPanel(new JPCrud(frmPrincipal, funcionario, ciInterface));
    }//GEN-LAST:event_jButtonFuncionarioActionPerformed

    private void jButtonMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaquinaActionPerformed
        frmPrincipal.trocarPanel(new JPCrud(frmPrincipal, maquina, ciInterface));
    }//GEN-LAST:event_jButtonMaquinaActionPerformed

    private void jButtonTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTipoServicoActionPerformed
       frmPrincipal.trocarPanel(new JPCrud(frmPrincipal, tipoServico, ciInterface));
    }//GEN-LAST:event_jButtonTipoServicoActionPerformed

    private void jButtonProdutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutorActionPerformed
        frmPrincipal.trocarPanel(new JPCrud(frmPrincipal, produtor, ciInterface));
    }//GEN-LAST:event_jButtonProdutorActionPerformed

    public void setjButtonProdutor(java.awt.event.ActionEvent evt) {
        jButtonProdutorActionPerformed(evt);
    }
    
    public void setjButtonPropriedade(java.awt.event.ActionEvent evt) {
        jButtonPropriedadeActionPerformed(evt);
    }

    public void setjButtonFuncionario(java.awt.event.ActionEvent evt) {
        jButtonFuncionarioActionPerformed(evt);
    }

    public void setjButtonMaquina(java.awt.event.ActionEvent evt) {
        jButtonMaquinaActionPerformed(evt);
    }

    public void setjButtonServico(java.awt.event.ActionEvent evt) {
        jButtonServicoActionPerformed(evt);
    }

    public void setjButtonTipoMaquina(java.awt.event.ActionEvent evt) {
        jButtonTipoMaquinaActionPerformed(evt);
    }

    public void setjButtonTipoServico(java.awt.event.ActionEvent evt) {
        jButtonTipoServicoActionPerformed(evt);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFuncionario;
    private javax.swing.JButton jButtonMaquina;
    private javax.swing.JButton jButtonProdutor;
    private javax.swing.JButton jButtonPropriedade;
    private javax.swing.JButton jButtonServico;
    private javax.swing.JButton jButtonTipoMaquina;
    private javax.swing.JButton jButtonTipoServico;
    // End of variables declaration//GEN-END:variables
}
