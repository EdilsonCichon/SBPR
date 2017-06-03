package cih.servico;

import cci.CIInterface;
import cci.CIServico;
import cci.util.Cenario;
import cdp.Produtor;
import cdp.Propriedade;
import cdp.Servico;
import cdp.ServicoAgendado;
import cdp.TipoServico;
import java.awt.Frame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JDCadastroServico extends javax.swing.JDialog {
    
    private CIInterface ciInterface;
    private CIServico ciServico;
    private int CENARIO;
    private Produtor produtorSelecionado;
    private Propriedade propriedadeSelecionada;
    private TipoServico tipoServicoSelecionado;
    private Servico servico;
   
    public JDCadastroServico(Frame framePai, boolean modal, CIInterface ciInterface, int CENARIO, Servico servico) {
        super(framePai, modal);
        this.ciInterface = ciInterface;
        this.ciServico = ciInterface.getCiServico();
        this.CENARIO = CENARIO;
        this.servico = servico;
        initComponents();
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
        jPanelAgendar.setVisible(false);
        jPanelConcluir.setVisible(false);
        jPanelCancelar.setVisible(false);
        identificarCenario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPesquisarProdutor = new javax.swing.JPanel();
        jTextFieldNomeProdutor = new javax.swing.JTextField();
        jLabelNomeProdutor = new javax.swing.JLabel();
        jButtonSelecionarProdutor = new javax.swing.JButton();
        jPanelSelecaoPropriedade = new javax.swing.JPanel();
        jLabelPropriedade = new javax.swing.JLabel();
        jComboBoxPropriedades = new javax.swing.JComboBox<>();
        jPanelAgendar = new javax.swing.JPanel();
        jLabelTipoServico = new javax.swing.JLabel();
        jLabelDataPrevista = new javax.swing.JLabel();
        jFormattedTextFieldDataPrevista = new javax.swing.JFormattedTextField();
        jLabelDuracao = new javax.swing.JLabel();
        jFormattedTextFieldQtHrsPrevista = new javax.swing.JFormattedTextField();
        jLabelValorHora = new javax.swing.JLabel();
        jTextFieldValorHora = new javax.swing.JTextField();
        jTextFieldTipoServico = new javax.swing.JTextField();
        jButtonSelecionarTipoSevico = new javax.swing.JButton();
        jPanelRodape = new javax.swing.JPanel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanelConcluir = new javax.swing.JPanel();
        jLabelDataConclusao = new javax.swing.JLabel();
        jFormattedTextFieldDataConclusao = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldQtHrsReais = new javax.swing.JFormattedTextField();
        jLabelValorTotal = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jPanelCancelar = new javax.swing.JPanel();
        jLabelDataCancelamento = new javax.swing.JLabel();
        jFormattedTextFieldDataCancelamento = new javax.swing.JFormattedTextField();
        jLabelValorMulta = new javax.swing.JLabel();
        jTextFieldValorMulta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendar Serviço");

        jPanelPesquisarProdutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtor"));

        jTextFieldNomeProdutor.setEditable(false);

        jLabelNomeProdutor.setText("Produtor:");

        jButtonSelecionarProdutor.setText("...");
        jButtonSelecionarProdutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarProdutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisarProdutorLayout = new javax.swing.GroupLayout(jPanelPesquisarProdutor);
        jPanelPesquisarProdutor.setLayout(jPanelPesquisarProdutorLayout);
        jPanelPesquisarProdutorLayout.setHorizontalGroup(
            jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarProdutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomeProdutor)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNomeProdutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSelecionarProdutor)
                .addContainerGap())
        );
        jPanelPesquisarProdutorLayout.setVerticalGroup(
            jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarProdutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeProdutor)
                    .addComponent(jButtonSelecionarProdutor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSelecaoPropriedade.setBorder(javax.swing.BorderFactory.createTitledBorder("Propriedade"));

        jLabelPropriedade.setText("Propriedade:");

        jComboBoxPropriedades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a propriedade..." }));
        jComboBoxPropriedades.setToolTipText("");
        jComboBoxPropriedades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxPropriedadesItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelSelecaoPropriedadeLayout = new javax.swing.GroupLayout(jPanelSelecaoPropriedade);
        jPanelSelecaoPropriedade.setLayout(jPanelSelecaoPropriedadeLayout);
        jPanelSelecaoPropriedadeLayout.setHorizontalGroup(
            jPanelSelecaoPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelecaoPropriedadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPropriedade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPropriedades, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSelecaoPropriedadeLayout.setVerticalGroup(
            jPanelSelecaoPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelecaoPropriedadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSelecaoPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPropriedade)
                    .addComponent(jComboBoxPropriedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAgendar.setBorder(javax.swing.BorderFactory.createTitledBorder("Agendar"));

        jLabelTipoServico.setText("Tipo de Serviço:");

        jLabelDataPrevista.setText("Data prevista para conclusão:");

        try {
            jFormattedTextFieldDataPrevista.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelDuracao.setText("Duração:");

        try {
            jFormattedTextFieldQtHrsPrevista.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelValorHora.setText("Valor por hora:");

        jTextFieldValorHora.setEditable(false);
        jTextFieldValorHora.setText(" ");

        jTextFieldTipoServico.setEditable(false);

        jButtonSelecionarTipoSevico.setText("...");
        jButtonSelecionarTipoSevico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarTipoSevicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAgendarLayout = new javax.swing.GroupLayout(jPanelAgendar);
        jPanelAgendar.setLayout(jPanelAgendarLayout);
        jPanelAgendarLayout.setHorizontalGroup(
            jPanelAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgendarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAgendarLayout.createSequentialGroup()
                        .addComponent(jLabelDataPrevista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataPrevista, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabelDuracao))
                    .addGroup(jPanelAgendarLayout.createSequentialGroup()
                        .addComponent(jLabelTipoServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSelecionarTipoSevico)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAgendarLayout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldQtHrsPrevista, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelAgendarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelValorHora)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelAgendarLayout.setVerticalGroup(
            jPanelAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgendarLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanelAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoServico)
                    .addComponent(jLabelValorHora)
                    .addComponent(jTextFieldValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSelecionarTipoSevico))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanelAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataPrevista)
                    .addComponent(jFormattedTextFieldDataPrevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDuracao)
                    .addComponent(jFormattedTextFieldQtHrsPrevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelRodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.setMaximumSize(new java.awt.Dimension(75, 23));
        jButtonConfirmar.setMinimumSize(new java.awt.Dimension(75, 23));
        jButtonConfirmar.setPreferredSize(new java.awt.Dimension(75, 23));
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setMaximumSize(new java.awt.Dimension(75, 23));
        jButtonLimpar.setMinimumSize(new java.awt.Dimension(75, 23));
        jButtonLimpar.setPreferredSize(new java.awt.Dimension(75, 23));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRodapeLayout = new javax.swing.GroupLayout(jPanelRodape);
        jPanelRodape.setLayout(jPanelRodapeLayout);
        jPanelRodapeLayout.setHorizontalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelConcluir.setBorder(javax.swing.BorderFactory.createTitledBorder("Concluir"));

        jLabelDataConclusao.setText("Data de conclusão:");

        try {
            jFormattedTextFieldDataConclusao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Quantidade de Horas:");

        try {
            jFormattedTextFieldQtHrsReais.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelValorTotal.setText("Valor total:");

        javax.swing.GroupLayout jPanelConcluirLayout = new javax.swing.GroupLayout(jPanelConcluir);
        jPanelConcluir.setLayout(jPanelConcluirLayout);
        jPanelConcluirLayout.setHorizontalGroup(
            jPanelConcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConcluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelConcluirLayout.createSequentialGroup()
                        .addComponent(jLabelDataConclusao)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextFieldDataConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelConcluirLayout.createSequentialGroup()
                        .addComponent(jLabelValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldValorTotal)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jFormattedTextFieldQtHrsReais, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelConcluirLayout.setVerticalGroup(
            jPanelConcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConcluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataConclusao)
                    .addComponent(jFormattedTextFieldDataConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextFieldQtHrsReais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelConcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorTotal)
                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCancelar.setBorder(javax.swing.BorderFactory.createTitledBorder("Cancelar"));

        jLabelDataCancelamento.setText("Data de cancelamento:");

        try {
            jFormattedTextFieldDataCancelamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelValorMulta.setText("Valor da multa:");

        javax.swing.GroupLayout jPanelCancelarLayout = new javax.swing.GroupLayout(jPanelCancelar);
        jPanelCancelar.setLayout(jPanelCancelarLayout);
        jPanelCancelarLayout.setHorizontalGroup(
            jPanelCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDataCancelamento)
                .addGap(18, 18, 18)
                .addComponent(jFormattedTextFieldDataCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelValorMulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldValorMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCancelarLayout.setVerticalGroup(
            jPanelCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataCancelamento)
                    .addComponent(jFormattedTextFieldDataCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValorMulta)
                    .addComponent(jTextFieldValorMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPesquisarProdutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelSelecaoPropriedade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelConcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPesquisarProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSelecaoPropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSelecionarProdutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarProdutorActionPerformed
        ciInterface.getCiProdutor().instanciarTelaFiltroProdutor((Frame) getOwner(), Cenario.SELECIONAR);
        produtorSelecionado = ciInterface.getCiProdutor().getProdutorSelecionado();
        jTextFieldNomeProdutor.setText(produtorSelecionado.getNome());
        
        if (produtorSelecionado.getPropriedades() != null)
            produtorSelecionado.getPropriedades()
                    .forEach((propriedade) -> {
                        jComboBoxPropriedades.addItem(propriedade.toString());
                    });
    }//GEN-LAST:event_jButtonSelecionarProdutorActionPerformed

    private void jButtonSelecionarTipoSevicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarTipoSevicoActionPerformed
        ciInterface.getCiTipoServico().instanciarTelaFiltroTipoServico((Frame) getOwner(), Cenario.SELECIONAR);
        tipoServicoSelecionado = ciInterface.getCiTipoServico().getTipoServicoSelecionado();
        jTextFieldTipoServico.setText(tipoServicoSelecionado.getNome());
        jTextFieldValorHora.setText( String.valueOf(tipoServicoSelecionado.getValor_hr()) );
    }//GEN-LAST:event_jButtonSelecionarTipoSevicoActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldNomeProdutor.setText("");
        jTextFieldTipoServico.setText("");
        jTextFieldValorHora.setText("");
        jTextFieldValorMulta.setText("");
        jTextFieldValorTotal.setText("");
        jFormattedTextFieldDataPrevista.setText("");
        jFormattedTextFieldQtHrsPrevista.setText("");
        jFormattedTextFieldDataCancelamento.setText("");
        jFormattedTextFieldDataConclusao.setText("");
        jFormattedTextFieldQtHrsReais.setText("");
        jComboBoxPropriedades.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
       
        String dtPrevistaConclusao = jFormattedTextFieldDataPrevista.getText();
        String qtdHrsPrevista = jFormattedTextFieldQtHrsPrevista.getText().replace(':', '.');
        
        switch (CENARIO) {
            
            case Cenario.AGENDAR:
                ServicoAgendado servicoAgendado = ciServico.cadastrarServico(produtorSelecionado, propriedadeSelecionada, 
                        tipoServicoSelecionado, dtPrevistaConclusao, qtdHrsPrevista);
                if (servicoAgendado != null) {
                    JOptionPane.showMessageDialog(this, "Serviço agendado com sucesso!");
                    modoSomenteLeitura(true);
                    jButtonCancelar.setText("Sair");
                }
                break;
                
            case Cenario.ALTERAR:
                
                boolean alterado = ciServico.alterarServico(servico, produtorSelecionado, propriedadeSelecionada, 
                        tipoServicoSelecionado, dtPrevistaConclusao, qtdHrsPrevista);
                
                if(alterado){
                    modoSomenteLeitura(true); 
                    jButtonCancelar.setText("Sair");
                }break;
                
            case Cenario.CONSULTAR:
                break;
                
            case Cenario.CANCELAR: 
                break;
                
            case Cenario.CONCLUIR:
                break;
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jComboBoxPropriedadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxPropriedadesItemStateChanged
        produtorSelecionado.getPropriedades().forEach((propriedade) -> {
            if (jComboBoxPropriedades.getSelectedItem().toString() == propriedade.getNome_propriedade())
                propriedadeSelecionada = propriedade;
        });
    }//GEN-LAST:event_jComboBoxPropriedadesItemStateChanged

    private void identificarCenario() {
        switch (CENARIO) {
            case Cenario.AGENDAR:
                jPanelAgendar.setVisible(true);
                redimensionarJanelaCenario();
                break;
            case Cenario.ALTERAR:
                jPanelAgendar.setVisible(true);
                setarCamposComInstancia(servico);
                break;
            case Cenario.CANCELAR:
                setTitle("Cancelar Serviço");
                jPanelCancelar.setVisible(true);
                redimensionarJanelaCenario();
                break;
            case Cenario.CONSULTAR:
                
                break;
                
            case Cenario.CONCLUIR:
                setTitle("Concluir Serviço");
                jPanelConcluir.setVisible(true);
                redimensionarJanelaCenario();
                break;
        }
    }
    
    private void redimensionarJanelaCenario() {
        JPanel[] paineisCenario = new JPanel[] { jPanelAgendar, jPanelCancelar, jPanelConcluir };
        int alturaPaineis = 0;
        for (JPanel painel : paineisCenario)
            alturaPaineis += painel.getHeight();
        int alturaSemPaineis = getHeight() - alturaPaineis;
        setBounds(getX(), getY(), getWidth(), alturaSemPaineis);
        for (JPanel paineil : paineisCenario)
            if ( paineil.isEnabled() )
                setBounds(getX(), getY(), getWidth(), alturaSemPaineis + paineil.getHeight());
    }
    
    public void setarCamposComInstancia(Servico servico){
        jTextFieldNomeProdutor.setText(servico.getProdutor().getNome());
        jComboBoxPropriedades.setSelectedItem(servico.getPropriedade());
        jTextFieldTipoServico.setText(servico.getTipoServico().getNome());
        jTextFieldValorHora.setText(String.valueOf(servico.getTipoServico().getValor_hr()));
        jFormattedTextFieldDataPrevista.setText(String.valueOf(servico.getData_prevista_conclusao()));
        jFormattedTextFieldQtHrsPrevista.setText(String.valueOf(servico.getQtd_hrs_prevista()));
        
        
    }
    
    public void modoSomenteLeitura(boolean condicao) {
        condicao = !condicao;
        jFormattedTextFieldDataPrevista.setEnabled(condicao);
        jFormattedTextFieldQtHrsPrevista.setEnabled(condicao);
        jComboBoxPropriedades.setEnabled(condicao);
        jButtonSelecionarProdutor.setEnabled(condicao);
        jButtonSelecionarTipoSevico.setEnabled(condicao);
        jButtonConfirmar.setEnabled(condicao);
        jButtonLimpar.setEnabled(condicao);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSelecionarProdutor;
    private javax.swing.JButton jButtonSelecionarTipoSevico;
    private javax.swing.JComboBox<String> jComboBoxPropriedades;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCancelamento;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataConclusao;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataPrevista;
    private javax.swing.JFormattedTextField jFormattedTextFieldQtHrsPrevista;
    private javax.swing.JFormattedTextField jFormattedTextFieldQtHrsReais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDataCancelamento;
    private javax.swing.JLabel jLabelDataConclusao;
    private javax.swing.JLabel jLabelDataPrevista;
    private javax.swing.JLabel jLabelDuracao;
    private javax.swing.JLabel jLabelNomeProdutor;
    private javax.swing.JLabel jLabelPropriedade;
    private javax.swing.JLabel jLabelTipoServico;
    private javax.swing.JLabel jLabelValorHora;
    private javax.swing.JLabel jLabelValorMulta;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JPanel jPanelAgendar;
    private javax.swing.JPanel jPanelCancelar;
    private javax.swing.JPanel jPanelConcluir;
    private javax.swing.JPanel jPanelPesquisarProdutor;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JPanel jPanelSelecaoPropriedade;
    private javax.swing.JTextField jTextFieldNomeProdutor;
    private javax.swing.JTextField jTextFieldTipoServico;
    private javax.swing.JTextField jTextFieldValorHora;
    private javax.swing.JTextField jTextFieldValorMulta;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables
}
