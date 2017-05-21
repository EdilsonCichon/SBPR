package cih.tipoServico;

import javax.swing.ImageIcon;
import cci.CIInterface;
import cci.util.Cenario;
import cdp.TipoServico;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;

public class JDCadastroTipoServico extends javax.swing.JDialog {
    
    private CIInterface ciInterface;
    private int CENARIO;
    private TipoServico tipoServicoAtual;
    private boolean resposta;
    
    public JDCadastroTipoServico(java.awt.Frame parent, boolean modal, CIInterface ciInterface, int CENARIO, TipoServico tipoServico) {
        super(parent, modal);
        this.ciInterface = ciInterface;
        initComponents();
        this.setLocationRelativeTo(parent);
        this.CENARIO = CENARIO;
        this.tipoServicoAtual = tipoServico;
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
        identificarCenario();
    }
    
    public void identificarCenario(){
        
        switch ( CENARIO ) {
            case Cenario.CADASTRAR:
                break;
            case Cenario.ALTERAR:
                break;
            case Cenario.CONSULTAR:
                break;
            default://EXCLUIR
                break;
        }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTipoServico = new javax.swing.JPanel();
        jLabelResponsavel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNomePropriedade = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldValorHora = new javax.swing.JTextField();
        jPanelRodape = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Tipo de Serviço");
        setResizable(false);

        jPanelTipoServico.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar"));

        jLabelResponsavel.setText("Nome:");

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        jLabelNomePropriedade.setText("Descrição:");

        jLabel1.setText("Valor Hora:");

        javax.swing.GroupLayout jPanelTipoServicoLayout = new javax.swing.GroupLayout(jPanelTipoServico);
        jPanelTipoServico.setLayout(jPanelTipoServicoLayout);
        jPanelTipoServicoLayout.setHorizontalGroup(
            jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTipoServicoLayout.createSequentialGroup()
                        .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTipoServicoLayout.createSequentialGroup()
                                .addComponent(jLabelResponsavel)
                                .addGap(41, 41, 41)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTipoServicoLayout.createSequentialGroup()
                                .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabelNomePropriedade))
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanelTipoServicoLayout.setVerticalGroup(
            jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoServicoLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResponsavel)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabelNomePropriedade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelRodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(57, 23));

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setPreferredSize(new java.awt.Dimension(57, 23));

        javax.swing.GroupLayout jPanelRodapeLayout = new javax.swing.GroupLayout(jPanelRodape);
        jPanelRodape.setLayout(jPanelRodapeLayout);
        jPanelRodapeLayout.setHorizontalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTipoServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        
        String nome = jTextFieldNome.getText();
        String valor = jTextFieldValorHora.getText();
        String descricao = jTextAreaDescricao.getText();
        
        try {
            switch (CENARIO) {
                case Cenario.CADASTRAR:
                    
                    validarCampos(nome, valor, descricao);
                    resposta = ciInterface.getCiTipoServico().cadastrarTipoServico(nome, valor, descricao);
                    if (resposta) {
                        jButtonConfirmar.setEnabled(false);
                        jButtonCancelar.setText("Sair");
                    }
                    break;
                    
                default: break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }

    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    public void validarCampos(String nome, String valor, String descricao) throws Exception {
        
        if(nome.equals("") || (valor.equals("")) || (descricao.equals(""))){
            throw new Exception("Verifique se todos os campos estão preenchidos!");
        }    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNomePropriedade;
    private javax.swing.JLabel jLabelResponsavel;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JPanel jPanelTipoServico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldValorHora;
    // End of variables declaration//GEN-END:variables
}
