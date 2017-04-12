package cih;

import cci.ControlInterface;
import javax.swing.JPanel;

/**
 *
 * @author Edilson Cichon
 */
public class FrmPrincipal extends javax.swing.JFrame {    
    JPInicio inicio; 
    JDAjuda ajuda;
    JDRelatorio relatorio;
    JDSuporte suporte;
    
    private ControlInterface controlInterface;

    /**
     * Creates new form JanelaPrincipal
     */
    public FrmPrincipal(ControlInterface controlInterfaces) {
        this.controlInterface = controlInterfaces;
        initComponents();
        //controlInterfaces.getControlGeral().abrirInicio(this); 
        jButtonInicioActionPerformed(null);
    }
    
    public void trocarPanel(JPanel jPanel) {
        jPanelPrincipal.removeAll();
        jPanelPrincipal.add(jPanel);
        jPanelPrincipal.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuPrincipal = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonInicio = new javax.swing.JButton();
        jButtonProdutor = new javax.swing.JButton();
        jButtonPropriedade = new javax.swing.JButton();
        jButtonServico = new javax.swing.JButton();
        jButtonMaquina = new javax.swing.JButton();
        jButtonTipoMaquina = new javax.swing.JButton();
        jButtonTipoServico = new javax.swing.JButton();
        jButtonFuncionario = new javax.swing.JButton();
        jButtonRelatorio = new javax.swing.JButton();
        jButtonAssistencia = new javax.swing.JButton();
        jButtonAjuda = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelInfoSistema = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelVersao = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelNomeUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(705, 495));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanelMenuPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelMenuPrincipal.setLayout(new java.awt.GridLayout(1, 0));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-home-reduzido.png"))); // NOI18N
        jButtonInicio.setToolTipText("Início");
        jButtonInicio.setFocusable(false);
        jButtonInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonInicio);

        jButtonProdutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-produtor-reduzido.png"))); // NOI18N
        jButtonProdutor.setToolTipText("Produtor");
        jButtonProdutor.setFocusable(false);
        jButtonProdutor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonProdutor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonProdutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutorActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonProdutor);

        jButtonPropriedade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-propriedade-reduzido.png"))); // NOI18N
        jButtonPropriedade.setToolTipText("Propriedades");
        jButtonPropriedade.setFocusable(false);
        jButtonPropriedade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPropriedade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPropriedadeActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonPropriedade);

        jButtonServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-serviço-reduzido.png"))); // NOI18N
        jButtonServico.setToolTipText("Serviços");
        jButtonServico.setFocusable(false);
        jButtonServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonServico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServicoActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonServico);
        jButtonServico.getAccessibleContext().setAccessibleDescription("");

        jButtonMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-maquina-reduzido.png"))); // NOI18N
        jButtonMaquina.setToolTipText("Máquinas");
        jButtonMaquina.setFocusable(false);
        jButtonMaquina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMaquina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaquinaActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonMaquina);

        jButtonTipoMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-tipo-maquina-reduzido.png"))); // NOI18N
        jButtonTipoMaquina.setToolTipText("Tipos de Máquinas");
        jButtonTipoMaquina.setFocusable(false);
        jButtonTipoMaquina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTipoMaquina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonTipoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTipoMaquinaActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonTipoMaquina);

        jButtonTipoServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-tipo-servico-reduzido.png"))); // NOI18N
        jButtonTipoServico.setToolTipText("Tipos de Serviços");
        jButtonTipoServico.setFocusable(false);
        jButtonTipoServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTipoServico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTipoServicoActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonTipoServico);

        jButtonFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-funcionario-reduzido.png"))); // NOI18N
        jButtonFuncionario.setToolTipText("Funcionários");
        jButtonFuncionario.setFocusable(false);
        jButtonFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuncionarioActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonFuncionario);

        jButtonRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-relatorio-reduzido.png"))); // NOI18N
        jButtonRelatorio.setToolTipText("Relatórios");
        jButtonRelatorio.setFocusable(false);
        jButtonRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatorioActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonRelatorio);

        jButtonAssistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-suporte-reduzido.png"))); // NOI18N
        jButtonAssistencia.setToolTipText("Comunicação");
        jButtonAssistencia.setFocusable(false);
        jButtonAssistencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAssistencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAssistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAssistenciaActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonAssistencia);

        jButtonAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-ajuda-reduzido.png"))); // NOI18N
        jButtonAjuda.setToolTipText("Ajuda");
        jButtonAjuda.setFocusable(false);
        jButtonAjuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAjuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjudaActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonAjuda);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-sair-reduzido.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.setFocusable(false);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonSair);

        jPanelMenuPrincipal.add(jToolBar1);

        getContentPane().add(jPanelMenuPrincipal);

        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPrincipal.setMinimumSize(new java.awt.Dimension(684, 300));
        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(684, 300));
        jPanelPrincipal.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jPanelPrincipal);

        jPanelInfoSistema.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInfoSistema.setMinimumSize(new java.awt.Dimension(684, 94));
        jPanelInfoSistema.setPreferredSize(new java.awt.Dimension(684, 94));

        jLabelUsuario.setText("Usuário:");

        jLabelVersao.setText("SBPR v.1.0");

        jLabelData.setText("00/00/0000");

        jLabelHora.setText("00:00");

        jLabelNomeUsuario.setText("Usuário");

        javax.swing.GroupLayout jPanelInfoSistemaLayout = new javax.swing.GroupLayout(jPanelInfoSistema);
        jPanelInfoSistema.setLayout(jPanelInfoSistemaLayout);
        jPanelInfoSistemaLayout.setHorizontalGroup(
            jPanelInfoSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoSistemaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelInfoSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelInfoSistemaLayout.createSequentialGroup()
                        .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNomeUsuario))
                    .addComponent(jLabelVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInfoSistemaLayout.createSequentialGroup()
                        .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelHora)))
                .addContainerGap())
        );
        jPanelInfoSistemaLayout.setVerticalGroup(
            jPanelInfoSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelHora))
                .addContainerGap())
        );

        getContentPane().add(jPanelInfoSistema);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        inicio = controlInterface.getControlGeral().abrirInicio(this);
        trocarPanel(inicio);
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jButtonProdutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutorActionPerformed
       inicio.setjButtonProdutor(evt);
    }//GEN-LAST:event_jButtonProdutorActionPerformed

    private void jButtonPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPropriedadeActionPerformed
        inicio.setjButtonPropriedade(evt);
    }//GEN-LAST:event_jButtonPropriedadeActionPerformed

    private void jButtonServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonServicoActionPerformed
        inicio.setjButtonServico(evt);
    }//GEN-LAST:event_jButtonServicoActionPerformed

    private void jButtonMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaquinaActionPerformed
        inicio.setjButtonMaquina(evt);
    }//GEN-LAST:event_jButtonMaquinaActionPerformed

    private void jButtonTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTipoServicoActionPerformed
        inicio.setjButtonTipoServico(evt);
    }//GEN-LAST:event_jButtonTipoServicoActionPerformed

    private void jButtonTipoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTipoMaquinaActionPerformed
        inicio.setjButtonTipoMaquina(evt);
    }//GEN-LAST:event_jButtonTipoMaquinaActionPerformed

    private void jButtonFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncionarioActionPerformed
        inicio.setjButtonFuncionario(evt);
    }//GEN-LAST:event_jButtonFuncionarioActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        controlInterface.getControlGeral().encerrarSessao();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjudaActionPerformed
        controlInterface.getControlGeral().abrirAjuda(this);    
    }//GEN-LAST:event_jButtonAjudaActionPerformed

    private void jButtonRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatorioActionPerformed
        controlInterface.getControlGeral().abrirRelatorio(this);    
    }//GEN-LAST:event_jButtonRelatorioActionPerformed

    private void jButtonAssistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAssistenciaActionPerformed
        controlInterface.getControlGeral().abrirSuporte(this);    
    }//GEN-LAST:event_jButtonAssistenciaActionPerformed

    public JPanel getjPanelPrincipal() {
        return jPanelPrincipal;
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjuda;
    private javax.swing.JButton jButtonAssistencia;
    private javax.swing.JButton jButtonFuncionario;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonMaquina;
    private javax.swing.JButton jButtonProdutor;
    private javax.swing.JButton jButtonPropriedade;
    private javax.swing.JButton jButtonRelatorio;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonServico;
    private javax.swing.JButton jButtonTipoMaquina;
    private javax.swing.JButton jButtonTipoServico;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelVersao;
    private javax.swing.JPanel jPanelInfoSistema;
    private javax.swing.JPanel jPanelMenuPrincipal;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
