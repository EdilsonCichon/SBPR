package cih.propriedade;

import cci.CIInterface;
import cci.util.Cenario;
import cdp.Produtor;
import cdp.Propriedade;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JDCadastroPropriedade extends javax.swing.JDialog {

    private int CENARIO;
    private JFrame pai;
    private CIInterface ciInterface;
    private Propriedade propriedade;
    Produtor produtorSelecionado;

    public JDCadastroPropriedade(Frame parent, boolean modal, CIInterface ciInterface, int CENARIO, Propriedade propriedade) {
        super(parent, modal);
        this.ciInterface = ciInterface;
        initComponents();
        this.setLocationRelativeTo(parent);
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
        this.propriedade = propriedade;
        this.CENARIO = CENARIO;
        identificarCenario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPropriedade = new javax.swing.JPanel();
        jLabelResponsavel = new javax.swing.JLabel();
        jTextFieldResponsavel = new javax.swing.JTextField();
        jLabelNomePropriedade = new javax.swing.JLabel();
        jTextFieldNomePropriedade = new javax.swing.JTextField();
        jLabelReferencia = new javax.swing.JLabel();
        jScrollPaneReferencia = new javax.swing.JScrollPane();
        jTextAreaReferencia = new javax.swing.JTextArea();
        jButtonPesquisarProdutor = new javax.swing.JButton();
        jPanelRodape = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Propriedade");
        setResizable(false);

        jPanelPropriedade.setBorder(javax.swing.BorderFactory.createTitledBorder("Propriedade"));

        jLabelResponsavel.setText("Responsável:");

        jTextFieldResponsavel.setEditable(false);

        jLabelNomePropriedade.setText("Nome da Propriedadade:");

        jLabelReferencia.setText("Referência:");

        jTextAreaReferencia.setColumns(20);
        jTextAreaReferencia.setRows(5);
        jScrollPaneReferencia.setViewportView(jTextAreaReferencia);

        jButtonPesquisarProdutor.setText("...");
        jButtonPesquisarProdutor.setEnabled(false);
        jButtonPesquisarProdutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarProdutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPropriedadeLayout = new javax.swing.GroupLayout(jPanelPropriedade);
        jPanelPropriedade.setLayout(jPanelPropriedadeLayout);
        jPanelPropriedadeLayout.setHorizontalGroup(
            jPanelPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropriedadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPropriedadeLayout.createSequentialGroup()
                        .addComponent(jLabelNomePropriedade)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNomePropriedade))
                    .addComponent(jScrollPaneReferencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                    .addGroup(jPanelPropriedadeLayout.createSequentialGroup()
                        .addComponent(jLabelReferencia)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelPropriedadeLayout.createSequentialGroup()
                        .addComponent(jLabelResponsavel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldResponsavel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPesquisarProdutor)))
                .addContainerGap())
        );
        jPanelPropriedadeLayout.setVerticalGroup(
            jPanelPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropriedadeLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanelPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResponsavel)
                    .addComponent(jTextFieldResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarProdutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomePropriedade)
                    .addComponent(jTextFieldNomePropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelReferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelRodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(57, 23));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setPreferredSize(new java.awt.Dimension(57, 23));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRodapeLayout = new javax.swing.GroupLayout(jPanelRodape);
        jPanelRodape.setLayout(jPanelRodapeLayout);
        jPanelRodapeLayout.setHorizontalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPropriedade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRodape, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed

        String responsavel = jTextFieldResponsavel.getText();
        String nome = jTextFieldNomePropriedade.getText();
        String referencia = jTextAreaReferencia.getText();

        try {
            validarCampos(nome, referencia);
            if (CENARIO == Cenario.CADASTRAR) {
                Produtor produtorVazio = new Produtor();
                boolean resposta = ciInterface.getCiPropriedade().cadastrarPropriedade(produtorVazio, nome, referencia);
                if (resposta) {
                    this.dispose();
                }
            } else if (CENARIO == Cenario.ALTERAR) {
                boolean alterado = ciInterface.getCiPropriedade().alterarPropriedade(propriedade);
                if (alterado) {
                    this.dispose();
                }
            } else if (CENARIO == Cenario.CONSULTAR) {
                this.dispose();
            } else if (CENARIO == Cenario.EXCLUIR) {
                boolean excluido = ciInterface.getCiPropriedade().excluirPropriedade(propriedade);
                if (excluido) {
                    this.dispose();
                }
            } else if (CENARIO == Cenario.ADICIONAR) {
                boolean resposta = ciInterface.getCiPropriedade().cadastrarPropriedade(propriedade.getResponsavel(), nome, referencia);
                if (resposta) {
                    this.dispose();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldNomePropriedade.setText("");
        jTextAreaReferencia.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPesquisarProdutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarProdutorActionPerformed
        produtorSelecionado = ciInterface.getCiProdutor().instanciarTelaFiltroProdutor(pai, CENARIO);
        jTextFieldResponsavel.setText("PRODUTOR NULO 2");
        if (produtorSelecionado != null) {
            jTextFieldResponsavel.setText(produtorSelecionado.getNome());
        }
    }//GEN-LAST:event_jButtonPesquisarProdutorActionPerformed

    private void identificarCenario() {

        if (propriedade != null) {

            if (propriedade.getResponsavel() != null) {
                
                if (CENARIO == Cenario.CONSULTAR) {
                    setarCamposComInstancia();
                    modoSomenteLeitura(true);
                    
                } else if (CENARIO == Cenario.ALTERAR) {
                    setarCamposComInstancia();
                    
                } else if (CENARIO == Cenario.CADASTRAR) {
                    jButtonPesquisarProdutor.setEnabled(true);
                    
                } else if (CENARIO == Cenario.EXCLUIR) {
                    setarCamposComInstancia();
                    modoSomenteLeitura(true);
                } else if (CENARIO == Cenario.ADICIONAR) {
                    jTextFieldResponsavel.setText(propriedade.getResponsavel().getNome());
                }
            } else {
                jTextFieldResponsavel.setText("PRODUTOR NULO");
            }
        } else {
            jButtonPesquisarProdutor.setEnabled(true);
        }
    }

    public void setarCamposComInstancia() {
        jTextFieldResponsavel.setText(propriedade.getResponsavel().getNome());
        jTextFieldNomePropriedade.setText(propriedade.getNome_propriedade());
        jTextAreaReferencia.setText(propriedade.getReferencia());
    }

    public void modoSomenteLeitura(boolean condicao) {
        condicao = !condicao;
        jTextFieldNomePropriedade.setEditable(condicao);
        jTextFieldResponsavel.setEditable(condicao);
        jTextAreaReferencia.setEditable(condicao);
        jButtonPesquisarProdutor.setEnabled(condicao);
        jButtonLimpar.setEnabled(condicao);
    }

    public void validarCampos(String nome, String referencia) throws Exception {

        if (nome.equals("") || referencia.equals("")) {
            throw new Exception("Campos Vazios");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisarProdutor;
    private javax.swing.JLabel jLabelNomePropriedade;
    private javax.swing.JLabel jLabelReferencia;
    private javax.swing.JLabel jLabelResponsavel;
    private javax.swing.JPanel jPanelPropriedade;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JScrollPane jScrollPaneReferencia;
    private javax.swing.JTextArea jTextAreaReferencia;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    private javax.swing.JTextField jTextFieldResponsavel;
    // End of variables declaration//GEN-END:variables
}
