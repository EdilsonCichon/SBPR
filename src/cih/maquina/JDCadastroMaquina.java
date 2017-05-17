package cih.maquina;

import javax.swing.ImageIcon;
import cci.CIInterface;
import cci.util.Cenario;
import cdp.Maquina;
import cdp.TipoMaquina;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public final class JDCadastroMaquina extends javax.swing.JDialog {

    private final CIInterface ciInterface; 
    private final int CENARIO;
    private Maquina maquinaAtual;
    private TipoMaquina tipoMaquina;
    
    public JDCadastroMaquina(java.awt.Frame parent, boolean modal, CIInterface ciInterface, int CENARIO, Maquina maquina) {
        super(parent, modal);
        initComponents();
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
        this.ciInterface = ciInterface;
        this.CENARIO = CENARIO;
        this.maquinaAtual = maquina;
        identificarCenario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTipo = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jComboBoxTipoMaquina = new javax.swing.JComboBox<>();
        jLabelDescricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanelInformacao = new javax.swing.JPanel();
        jLabelModelo = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabelPlaca = new javax.swing.JLabel();
        jFormattedTextFieldPlaca = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Máquina");

        jPanelTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        jLabelNome.setText("Nome:");

        jComboBoxTipoMaquina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um tipo de máquina...", "Retro Escavadeira" }));
        jComboBoxTipoMaquina.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTipoMaquinaItemStateChanged(evt);
            }
        });

        jLabelDescricao.setText("Descrição:");

        jTextAreaDescricao.setEditable(false);
        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jTextAreaDescricao.setEnabled(false);
        jScrollPane2.setViewportView(jTextAreaDescricao);

        javax.swing.GroupLayout jPanelTipoLayout = new javax.swing.GroupLayout(jPanelTipo);
        jPanelTipo.setLayout(jPanelTipoLayout);
        jPanelTipoLayout.setHorizontalGroup(
            jPanelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTipoLayout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTipoMaquina, 0, 334, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTipoLayout.createSequentialGroup()
                        .addComponent(jLabelDescricao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelTipoLayout.setVerticalGroup(
            jPanelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jComboBoxTipoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
        );

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar)
                .addContainerGap())
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        jPanelInformacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        jLabelModelo.setText("Modelo:");

        jLabelPlaca.setText("Placa:");

        try {
            jFormattedTextFieldPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelInformacaoLayout = new javax.swing.GroupLayout(jPanelInformacao);
        jPanelInformacao.setLayout(jPanelInformacaoLayout);
        jPanelInformacaoLayout.setHorizontalGroup(
            jPanelInformacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPlaca)
                .addGap(18, 18, 18)
                .addComponent(jFormattedTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanelInformacaoLayout.setVerticalGroup(
            jPanelInformacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInformacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelModelo)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPlaca)
                    .addComponent(jFormattedTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelInformacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        
        TipoMaquina tipoMaquina = (TipoMaquina) jComboBoxTipoMaquina.getSelectedItem();
        String modelo = jTextFieldModelo.getText();
        String placa = jFormattedTextFieldPlaca.getText();
        
        try {
            
            validarCampos(tipoMaquina, modelo, placa);
            //CADASTRAR ESTÁ INCORRETO - maquinaAtual foi criada para o cenário de alterar, não deve ser usado no cadastro
            switch (CENARIO) {
                case Cenario.CADASTRAR:
                    maquinaAtual.setTipoMaquina(tipoMaquina);
                    maquinaAtual.setModelo(modelo);
                    maquinaAtual.setPlaca(placa);
                    maquinaAtual = ciInterface.getCiMaquina().cadastrarMaquina(maquinaAtual);
                    if ( maquinaAtual != null ) {
                        jButtonConfirmar.setEnabled(false);
                        jButtonCancelar.setText("Sair");
                        modoSomenteLeitura(true);
                    }
                    break;
                case Cenario.ALTERAR:
                    maquinaAtual.setTipoMaquina(tipoMaquina);
                    maquinaAtual.setModelo(modelo);
                    maquinaAtual.setPlaca(placa);
                    boolean resposta = ciInterface.getCiMaquina().alterarMaquina(maquinaAtual);
                    if(resposta){
                        modoSomenteLeitura(true);
                        jButtonConfirmar.setEnabled(false);
                        jButtonCancelar.setText("Sair");
                    }   break;
                case Cenario.CONSULTAR:
                    this.dispose();
                    break;
            //EXCLUIR
                default:
                    break;               
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }      
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxTipoMaquinaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTipoMaquinaItemStateChanged
            tipoMaquina = (TipoMaquina) jComboBoxTipoMaquina.getSelectedItem();
            jTextAreaDescricao.setText(tipoMaquina.getDescricao());
    }//GEN-LAST:event_jComboBoxTipoMaquinaItemStateChanged

    public void identificarCenario(){
        
        switch (CENARIO) {
            
            case Cenario.CADASTRAR:
                LinkedList<TipoMaquina> listaTipoMaquina = ciInterface.getCiTipoMaquina().consultarTipoMaquina("");
                jComboBoxTipoMaquina.setModel( new DefaultComboBoxModel( listaTipoMaquina.toArray()));
                break;  
            case Cenario.ALTERAR:
                setarCamposComInstancia(maquinaAtual);
                break; 
            case Cenario.CONSULTAR:  
                break;
            default: //EXCLUIR
                break;
        }
    }
    
    public void setarCamposComInstancia(Maquina maquinaAtual){
        jComboBoxTipoMaquina.setSelectedItem(maquinaAtual.getTipoMaquina());
        jTextAreaDescricao.setText(maquinaAtual.getTipoMaquina().getDescricao());
        jTextFieldModelo.setText(maquinaAtual.getModelo());
        jFormattedTextFieldPlaca.setText(maquinaAtual.getPlaca()); 
    }
    
    public void modoSomenteLeitura(boolean condicao) {
        condicao = !condicao;
        jComboBoxTipoMaquina.setEnabled(condicao);
        jTextFieldModelo.setEditable(condicao);
        jFormattedTextFieldPlaca.setEnabled(condicao);
    }
    
    private void validarCampos( TipoMaquina tpMaquina, String modelo, String placa) throws Exception {
        if (tpMaquina == null || modelo.equals("") || placa.equals(""))
            throw new Exception("Verifique se todos os campos estão preenchidos!");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JComboBox<String> jComboBoxTipoMaquina;
    private javax.swing.JFormattedTextField jFormattedTextFieldPlaca;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelInformacao;
    private javax.swing.JPanel jPanelTipo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldModelo;
    // End of variables declaration//GEN-END:variables
}
