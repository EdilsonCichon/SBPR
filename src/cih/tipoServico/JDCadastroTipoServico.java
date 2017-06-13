package cih.tipoServico;

import javax.swing.ImageIcon;
import cci.CIInterface;
import cci.util.Cenario;
import cdp.TipoMaquina;
import cdp.TipoServico;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class JDCadastroTipoServico extends javax.swing.JDialog {
    
    private CIInterface ciInterface;
    private int CENARIO;
    private TipoServico tipoServicoAtual;
    private TipoMaquina tipoMaquinaSelecionada;
    private Frame pai;
    
    public JDCadastroTipoServico(java.awt.Frame FramePai, boolean modal, CIInterface ciInterface, int CENARIO, TipoServico tipoServicoInformado) {
        super(FramePai, modal);
        this.ciInterface = ciInterface;
        this.CENARIO = CENARIO;
        this.tipoServicoAtual = tipoServicoInformado;
        this.pai = FramePai;
        initComponents();
        this.setLocationRelativeTo(FramePai);
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
        identificarCenario();
    }
    
    public void identificarCenario() {
        switch ( CENARIO ) {
            case Cenario.CADASTRAR:
                break;
            case Cenario.ALTERAR:
                setTitle("Alterar Tipo de Serviço");
                setarCamposComInstancia(tipoServicoAtual);
                jButtonConfirmar.setText("Alterar");
                break;
            case Cenario.CONSULTAR:
                setTitle("Consultar Tipo de Serviço");
                modoSomenteLeitura(true);
                setarCamposComInstancia(tipoServicoAtual);
                jButtonConfirmar.setEnabled(false);
                break;
            case Cenario.EXCLUIR:
                setTitle("Excluir Tipo de Serviço");
                modoSomenteLeitura(true);
                setarCamposComInstancia(tipoServicoAtual);
                break;
            default: 
                break;
        }
    }
    
    public void modoSomenteLeitura(boolean condicao) {
        condicao = !condicao;
        jTextFieldNome.setEditable(condicao);
        jTextFieldValorHora.setEditable(condicao);
        jTextAreaDescricao.setEditable(condicao);
        jButtonLimpar.setEnabled(condicao);
    }
    
    public void setarCamposComInstancia(TipoServico tipoServico) {
        jTextFieldNome.setText(tipoServico.getNome());
        jTextFieldValorHora.setText( String.valueOf(tipoServico.getValor_hr()) );
        jTextAreaDescricao.setText(tipoServico.getDescricao());
        if (tipoServico.getTipoMaquina() != null)
            jTextFieldTipoMaquina.setText( tipoServico.getTipoMaquina().getNome() );
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
        jLabelValorHora = new javax.swing.JLabel();
        jTextFieldValorHora = new javax.swing.JTextField();
        jLabelTipoMaquina = new javax.swing.JLabel();
        jTextFieldTipoMaquina = new javax.swing.JTextField();
        jButtonSelecionarTipoMaquina = new javax.swing.JButton();
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
        jTextAreaDescricao.setLineWrap(true);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        jLabelNomePropriedade.setText("Descrição:");

        jLabelValorHora.setText("Valor Hora:");

        jLabelTipoMaquina.setText("Tipo de máquina:");

        jTextFieldTipoMaquina.setEditable(false);

        jButtonSelecionarTipoMaquina.setText("...");
        jButtonSelecionarTipoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarTipoMaquinaActionPerformed(evt);
            }
        });
        jButtonSelecionarTipoMaquina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSelecionarTipoMaquinaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTipoServicoLayout = new javax.swing.GroupLayout(jPanelTipoServico);
        jPanelTipoServico.setLayout(jPanelTipoServicoLayout);
        jPanelTipoServicoLayout.setHorizontalGroup(
            jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelTipoServicoLayout.createSequentialGroup()
                        .addComponent(jLabelTipoMaquina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTipoMaquina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSelecionarTipoMaquina))
                    .addGroup(jPanelTipoServicoLayout.createSequentialGroup()
                        .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelResponsavel)
                            .addComponent(jLabelValorHora)
                            .addComponent(jLabelNomePropriedade))
                        .addGap(38, 38, 38)
                        .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(jLabelValorHora)
                    .addComponent(jTextFieldValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoMaquina)
                    .addComponent(jTextFieldTipoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSelecionarTipoMaquina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNomePropriedade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelRodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(57, 23));
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

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setPreferredSize(new java.awt.Dimension(57, 23));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jButtonLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonLimparKeyPressed(evt);
            }
        });

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
        tipoMaquinaSelecionada = ciInterface.getCiTipoMaquina().getTipoMaquinaSelecionada();
        
        try {
            switch (CENARIO) {
                
                case Cenario.CADASTRAR:
                    validarCampos(nome, valor, descricao);
                    cadastrarTipoServico(nome, valor, descricao);
                    break;
                    
                case Cenario.ALTERAR:
                    validarCampos(nome, valor, descricao);
                    alterarTipoServico(nome, valor, descricao);
                    break;
                    
                case Cenario.EXCLUIR:
                    excluirTipoServico();
                    break;
                
                default:
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }

    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSelecionarTipoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarTipoMaquinaActionPerformed
        ciInterface.getCiTipoMaquina().instanciarTelaFiltroTipoMaquina(pai, Cenario.SELECIONAR);
        tipoMaquinaSelecionada = ciInterface.getCiTipoMaquina().getTipoMaquinaSelecionada();
        if ( tipoMaquinaSelecionada != null )
            jTextFieldTipoMaquina.setText(tipoMaquinaSelecionada.getNome());
    }//GEN-LAST:event_jButtonSelecionarTipoMaquinaActionPerformed

    private void jButtonSelecionarTipoMaquinaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSelecionarTipoMaquinaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonSelecionarTipoMaquinaActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonSelecionarTipoMaquinaKeyPressed

    private void jButtonConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonConfirmarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonConfirmarKeyPressed

    private void jButtonLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLimparKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonLimparActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonLimparKeyPressed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldNome.setText("");
        jTextFieldValorHora.setText("");
        jTextFieldTipoMaquina.setText("");
        jTextAreaDescricao.setText("");
        ciInterface.getCiTipoServico().setTipoServicoSelecionado(null);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCancelarKeyPressed

    private void cadastrarTipoServico(String nome, String valor, String descricao){
        
        try {
            ciInterface.getCiTipoServico().cadastrarTipoServico(nome, valor, descricao, tipoMaquinaSelecionada);
            modoSomenteLeitura(true);
            jButtonConfirmar.setEnabled(false);
            jButtonCancelar.setText("Sair");
            JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar: " + e.getMessage());
        }
    }
    
    private void alterarTipoServico(String nome, String valor, String descricao){
        try {
            ciInterface.getCiTipoServico().alterarTipoServico(tipoServicoAtual, tipoMaquinaSelecionada, nome, valor, descricao);
            jButtonConfirmar.setEnabled(false);
            jButtonCancelar.setText("Sair");
            modoSomenteLeitura(true);
            JOptionPane.showMessageDialog(this, "Alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao alterar: " + e.getMessage());
        }
    }
    
    private void excluirTipoServico(){
        try{
            int confirmacao = JOptionPane.showConfirmDialog(this, "Confirmar Exclusão ?", "Excluir", JOptionPane.YES_NO_OPTION);
            if ( confirmacao == 0 ) {
                ciInterface.getCiTipoServico().excluirTipoServico(tipoServicoAtual);
                JOptionPane.showMessageDialog(this, "Excluído com sucesso!");
                this.dispose();
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao excluir " + e.getMessage());
        }
    }
    
    private void validarCampos(String nome, String valor, String descricao) throws Exception {
        
        if(nome.equals("") || (valor.equals("")) || (descricao.equals(""))){
            throw new Exception("Verifique se todos os campos estão preenchidos!");
        }
        if(tipoMaquinaSelecionada == null){
            throw new Exception ("Selecione um Tipo de Máquina");
        }
        
        try {
            Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            throw new Exception ("Valor inválido!");
        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSelecionarTipoMaquina;
    private javax.swing.JLabel jLabelNomePropriedade;
    private javax.swing.JLabel jLabelResponsavel;
    private javax.swing.JLabel jLabelTipoMaquina;
    private javax.swing.JLabel jLabelValorHora;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JPanel jPanelTipoServico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTipoMaquina;
    private javax.swing.JTextField jTextFieldValorHora;
    // End of variables declaration//GEN-END:variables
}
