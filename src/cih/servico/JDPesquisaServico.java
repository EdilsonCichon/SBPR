package cih.servico;

import javax.swing.ImageIcon;
import cci.CIInterface;
import cci.CIServico;
import cci.util.Cenario;
import cci.util.JTableUtil;
import cdp.Produtor;
import cdp.Propriedade;
import cdp.Servico;
import cdp.ServicoAgendado;
import cdp.ServicoCancelado;
import cdp.ServicoConcluido;
import cdp.TipoServico;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class JDPesquisaServico extends javax.swing.JDialog {

    private CIInterface ciInterface;
    private CIServico ciServico;
    private Produtor produtorSelecionado;
    private TipoServico tipoServicoSelecionado;
    private Propriedade propriedadeSelecionada;
    private List<Servico> listaServicos;
    private int CENARIO;
    private Frame pai;

    public JDPesquisaServico(java.awt.Frame parent, boolean modal, CIInterface ciInterface, int CENARIO) {
        super(parent, modal);
        this.ciInterface = ciInterface;
        this.ciServico = ciInterface.getCiServico();
        this.CENARIO = CENARIO;
        this.pai = parent;
        initComponents();
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
        identificarCenario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPesquisarProdutor = new javax.swing.JPanel();
        jTextFieldNomeProdutor = new javax.swing.JTextField();
        jLabelFiltrarPor = new javax.swing.JLabel();
        jButtonFiltrarProdutor = new javax.swing.JButton();
        jCheckBoxFiltroProdutor = new javax.swing.JCheckBox();
        jPanelSelecaoPropriedade = new javax.swing.JPanel();
        jLabelPropriedade = new javax.swing.JLabel();
        jComboBoxPropriedades = new javax.swing.JComboBox<>();
        jCheckBoxFiltroPropriedade = new javax.swing.JCheckBox();
        jPanelPesquisarServico = new javax.swing.JPanel();
        jLabelTipoServico = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableServico = new javax.swing.JTable();
        jLabelSituacaoServico = new javax.swing.JLabel();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jCheckBoxFiltroServico = new javax.swing.JCheckBox();
        jTextFieldTipoServico = new javax.swing.JTextField();
        jButtonFiltrarTipoServico = new javax.swing.JButton();
        jPanelRodape = new javax.swing.JPanel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtro de Serviço");

        jPanelPesquisarProdutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtor"));

        jTextFieldNomeProdutor.setEnabled(false);

        jLabelFiltrarPor.setText("Produtor:");

        jButtonFiltrarProdutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-pesquisar-reduzido.png"))); // NOI18N
        jButtonFiltrarProdutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarProdutorActionPerformed(evt);
            }
        });

        jCheckBoxFiltroProdutor.setSelected(true);
        jCheckBoxFiltroProdutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFiltroProdutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisarProdutorLayout = new javax.swing.GroupLayout(jPanelPesquisarProdutor);
        jPanelPesquisarProdutor.setLayout(jPanelPesquisarProdutorLayout);
        jPanelPesquisarProdutorLayout.setHorizontalGroup(
            jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisarProdutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFiltrarPor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNomeProdutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonFiltrarProdutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxFiltroProdutor)
                .addContainerGap())
        );
        jPanelPesquisarProdutorLayout.setVerticalGroup(
            jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarProdutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBoxFiltroProdutor)
                    .addGroup(jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNomeProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelFiltrarPor)
                        .addComponent(jButtonFiltrarProdutor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSelecaoPropriedade.setBorder(javax.swing.BorderFactory.createTitledBorder("Propriedade"));

        jLabelPropriedade.setText("Propriedade:");

        jComboBoxPropriedades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma propriedade..." }));
        jComboBoxPropriedades.setToolTipText("");
        jComboBoxPropriedades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxPropriedadesItemStateChanged(evt);
            }
        });

        jCheckBoxFiltroPropriedade.setSelected(true);
        jCheckBoxFiltroPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFiltroPropriedadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSelecaoPropriedadeLayout = new javax.swing.GroupLayout(jPanelSelecaoPropriedade);
        jPanelSelecaoPropriedade.setLayout(jPanelSelecaoPropriedadeLayout);
        jPanelSelecaoPropriedadeLayout.setHorizontalGroup(
            jPanelSelecaoPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSelecaoPropriedadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPropriedade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPropriedades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxFiltroPropriedade)
                .addContainerGap())
        );
        jPanelSelecaoPropriedadeLayout.setVerticalGroup(
            jPanelSelecaoPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelecaoPropriedadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSelecaoPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxFiltroPropriedade)
                    .addGroup(jPanelSelecaoPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPropriedade)
                        .addComponent(jComboBoxPropriedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPesquisarServico.setBorder(javax.swing.BorderFactory.createTitledBorder("Serviço"));

        jLabelTipoServico.setText("Tipo de Serviço:");

        jTableServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo do Serviço", "Data Conclusão", "Tempo previsto", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableServico);

        jLabelSituacaoServico.setText("Situação:");

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "AGENDADO", "CONCLUIDO", "CANCELADO" }));
        jComboBoxSituacao.setSelectedIndex(1);
        jComboBoxSituacao.setEnabled(false);
        jComboBoxSituacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxSituacaoItemStateChanged(evt);
            }
        });

        jCheckBoxFiltroServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFiltroServicoActionPerformed(evt);
            }
        });

        jTextFieldTipoServico.setEnabled(false);

        jButtonFiltrarTipoServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cih/icones/icone-pesquisar-reduzido.png"))); // NOI18N
        jButtonFiltrarTipoServico.setEnabled(false);
        jButtonFiltrarTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarTipoServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisarServicoLayout = new javax.swing.GroupLayout(jPanelPesquisarServico);
        jPanelPesquisarServico.setLayout(jPanelPesquisarServicoLayout);
        jPanelPesquisarServicoLayout.setHorizontalGroup(
            jPanelPesquisarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(jPanelPesquisarServicoLayout.createSequentialGroup()
                        .addComponent(jLabelTipoServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTipoServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFiltrarTipoServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxFiltroServico)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSituacaoServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelPesquisarServicoLayout.setVerticalGroup(
            jPanelPesquisarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPesquisarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTipoServico)
                        .addComponent(jLabelSituacaoServico)
                        .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonFiltrarTipoServico))
                    .addComponent(jCheckBoxFiltroServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelRodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.setMaximumSize(new java.awt.Dimension(105, 23));
        jButtonConfirmar.setMinimumSize(new java.awt.Dimension(105, 23));
        jButtonConfirmar.setPreferredSize(new java.awt.Dimension(105, 23));
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

        jButtonImprimir.setText("Imprimir");
        jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRodapeLayout = new javax.swing.GroupLayout(jPanelRodape);
        jPanelRodape.setLayout(jPanelRodapeLayout);
        jPanelRodapeLayout.setHorizontalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonImprimir)
                .addContainerGap())
        );
        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonImprimir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPesquisarProdutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPesquisarServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRodape, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelSelecaoPropriedade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPesquisarProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSelecaoPropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPesquisarServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFiltrarProdutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarProdutorActionPerformed
        identificarCenario();
        ciInterface.getCiProdutor().instanciarTelaFiltroProdutor(pai, Cenario.SELECIONAR);
        produtorSelecionado = ciInterface.getCiProdutor().getProdutorSelecionado();
        if (produtorSelecionado != null) {
            jTextFieldNomeProdutor.setText(produtorSelecionado.getNome());

            if (produtorSelecionado.getPropriedades() != null) {
                jComboBoxPropriedades.setModel(new DefaultComboBoxModel(produtorSelecionado.getPropriedades().toArray()));
                identificarPropriedadeSelecionada();
            } else {
                jComboBoxPropriedades.setEnabled(false);
                ciInterface.getCiMensagem().exibirMensagemAviso(this, "PRODUTOR SEM PROPRIEDADES");
            }
        } 
    }//GEN-LAST:event_jButtonFiltrarProdutorActionPerformed

    private void jComboBoxPropriedadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxPropriedadesItemStateChanged
        
        if(evt.getStateChange() == ItemEvent.SELECTED){
            identificarPropriedadeSelecionada();       
        }   
    }//GEN-LAST:event_jComboBoxPropriedadesItemStateChanged

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        
        if(jCheckBoxFiltroProdutor.getSelectedObjects() != null && jTextFieldNomeProdutor.getText() == null){
            ciInterface.getCiMensagem().exibirMensagemAviso(this, "Selecione um produtor.");
        }else if(jCheckBoxFiltroPropriedade.getSelectedObjects() != null && jComboBoxPropriedades.getSelectedObjects() == null){
            ciInterface.getCiMensagem().exibirMensagemAviso(this, "Selecione uma propriedade.");
            
        }else{
            
            if(jCheckBoxFiltroServico.getSelectedObjects() != null && jTextFieldTipoServico.getText() == null ){
                ciInterface.getCiMensagem().exibirMensagemAviso(this, "Selecione um tipo de serviço.");
                
            }else{
                
                try {
                    Servico servico = (Servico) JTableUtil.getDadosLinhaSelecionada(jTableServico);
                    ciServico.instanciarTelaCadastroServico(servico, pai, CENARIO);
                    
                    if(jCheckBoxFiltroServico.isSelected())
                        selecionarTipoServico();
                    else    
                        identificarPropriedadeSelecionada();
            
                } catch (Exception ex) {
                    ciInterface.getCiMensagem().exibirMensagemErro(this, ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jCheckBoxFiltroProdutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFiltroProdutorActionPerformed
        
        if(jCheckBoxFiltroProdutor.getSelectedObjects() != null){
            jCheckBoxFiltroPropriedade.setSelected(true);
            jCheckBoxFiltroServico.setSelected(false);
            tratarClickCheck(true);
        }else{
            jCheckBoxFiltroPropriedade.setSelected(false);
            jCheckBoxFiltroServico.setSelected(true);
            tratarClickCheck(false);
        }
    }//GEN-LAST:event_jCheckBoxFiltroProdutorActionPerformed

    private void jCheckBoxFiltroPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFiltroPropriedadeActionPerformed
        
        if(jCheckBoxFiltroPropriedade.getSelectedObjects() != null){
            jCheckBoxFiltroProdutor.setSelected(true);
            jCheckBoxFiltroServico.setSelected(false);
            tratarClickCheck(true);
        }else{
            jCheckBoxFiltroProdutor.setSelected(false);
            jCheckBoxFiltroServico.setSelected(true);
            tratarClickCheck(false);
        }
    }//GEN-LAST:event_jCheckBoxFiltroPropriedadeActionPerformed

    private void jCheckBoxFiltroServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFiltroServicoActionPerformed
        
        JTableUtil.limparTabela(jTableServico);
        if(jCheckBoxFiltroServico.getSelectedObjects() != null){
            jCheckBoxFiltroProdutor.setSelected(false);
            jCheckBoxFiltroPropriedade.setSelected(false);
            tratarClickCheck(false);
        }else{
            jCheckBoxFiltroProdutor.setSelected(true);
            jCheckBoxFiltroPropriedade.setSelected(true);
            tratarClickCheck(true);
        }
    }//GEN-LAST:event_jCheckBoxFiltroServicoActionPerformed

    private void jButtonFiltrarTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarTipoServicoActionPerformed
        identificarCenario();
        ciInterface.getCiTipoServico().instanciarTelaFiltroTipoServico(pai, Cenario.SELECIONAR);
        selecionarTipoServico();
    }//GEN-LAST:event_jButtonFiltrarTipoServicoActionPerformed

    private void jComboBoxSituacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSituacaoItemStateChanged
        
        if(evt.getStateChange() == ItemEvent.SELECTED){
            identificarSituacao();
        } 
    }//GEN-LAST:event_jComboBoxSituacaoItemStateChanged

    private void jButtonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirActionPerformed
        List listTable = JTableUtil.toList(jTableServico);
        if (listTable.isEmpty())
            ciInterface.getCiMensagem().exibirMensagemErro(this, "Não existem dados para impressão!");
        else {
            try {
                //ciInterface.getCRServico().listar("../../cih/servico/JRListaServico.jasper", listTable);
            } catch (Exception e) {
                ciInterface.getCiMensagem().exibirMensagemErro(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonImprimirActionPerformed

    public void identificarPropriedadeSelecionada(){
        propriedadeSelecionada = (Propriedade) jComboBoxPropriedades.getSelectedItem();
        
        int id = propriedadeSelecionada.getId();
        String coluna = "propriedade.id";
        
        listaServicos = ciInterface.getCiServico().filtrarServico(coluna, id, Servico.class);
        identificarSituacao();
    }
    
    public void selecionarTipoServico(){
        tipoServicoSelecionado = ciInterface.getCiTipoServico().getTipoServicoSelecionado();
        
        if(tipoServicoSelecionado != null){
            jTextFieldTipoServico.setText(tipoServicoSelecionado.getNome());
            identificarTipoServicoSelecionado();      
        } 
    }
    
    public void identificarTipoServicoSelecionado(){
        
        int id = tipoServicoSelecionado.getId();
        String coluna = "tipoServico.id";
        
        listaServicos = ciInterface.getCiServico().filtrarServico(coluna, id, Servico.class);
        identificarSituacao();
    }
    
    public void identificarSituacao(){
        
        switch (jComboBoxSituacao.getSelectedIndex()) {

            case 0: preencherTabelaServico(0); break;

            case 1: preencherTabelaServico(1); break;

            case 2: preencherTabelaServico(2); break;

            case 3: preencherTabelaServico(3); break;

            default:
                break;
        }
    }
    
    public void identificarCenario() {
       
        if(CENARIO == Cenario.CONSULTAR){
            jComboBoxSituacao.setSelectedIndex(0);
            jComboBoxSituacao.setEnabled(true);
        }
    }
    
    public void preencherTabelaServico(int situacao){

        if (listaServicos != null) {
            JTableUtil.limparTabela(jTableServico);
            
            listaServicos.forEach((servico) -> {
               
                switch (situacao) {
                    
                    case 0:
                        if (servico.getClass() == ServicoAgendado.class) {
                            JTableUtil.addLinha(jTableServico, servico.toArray("AGENDADO"));
                        } else if (servico.getClass() == ServicoConcluido.class) {
                            JTableUtil.addLinha(jTableServico, servico.toArray("CONCLUÍDO"));
                        } else {
                            JTableUtil.addLinha(jTableServico, servico.toArray("CANCELADO"));
                        }   break;
                    case 1:
                        if (servico.getClass() == ServicoAgendado.class)
                            JTableUtil.addLinha(jTableServico, servico.toArray("AGENDADO"));
                        break;
                    case 2:
                        if (servico.getClass() == ServicoConcluido.class)
                            JTableUtil.addLinha(jTableServico, servico.toArray("CONCLUÍDO"));
                        break;
                    default:
                        if (servico.getClass() == ServicoCancelado.class)
                            JTableUtil.addLinha(jTableServico, servico.toArray("CANCELADO"));
                        break;
                }
            });
        }      
    }

    public void tratarClickCheck(boolean habilita){
        
        jComboBoxPropriedades.setEnabled(habilita);
        jButtonFiltrarTipoServico.setEnabled(!habilita);
        
        if(habilita){
            jButtonFiltrarProdutor.setEnabled(habilita);
            jComboBoxPropriedades.setEnabled(habilita);
            jTextFieldTipoServico.removeAll();
        }else{
            jTextFieldNomeProdutor.removeAll();
            jButtonFiltrarProdutor.setEnabled(habilita);
            jComboBoxPropriedades.removeAllItems();
            jComboBoxPropriedades.setEnabled(habilita);
        }
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonFiltrarProdutor;
    private javax.swing.JButton jButtonFiltrarTipoServico;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JCheckBox jCheckBoxFiltroProdutor;
    private javax.swing.JCheckBox jCheckBoxFiltroPropriedade;
    private javax.swing.JCheckBox jCheckBoxFiltroServico;
    private javax.swing.JComboBox<String> jComboBoxPropriedades;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JLabel jLabelFiltrarPor;
    private javax.swing.JLabel jLabelPropriedade;
    private javax.swing.JLabel jLabelSituacaoServico;
    private javax.swing.JLabel jLabelTipoServico;
    private javax.swing.JPanel jPanelPesquisarProdutor;
    private javax.swing.JPanel jPanelPesquisarServico;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JPanel jPanelSelecaoPropriedade;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableServico;
    private javax.swing.JTextField jTextFieldNomeProdutor;
    private javax.swing.JTextField jTextFieldTipoServico;
    // End of variables declaration//GEN-END:variables
}
