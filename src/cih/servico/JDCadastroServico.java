package cih.servico;

import cci.CIInterface;
import cci.util.Cenario;
import cdp.Funcionario;
import cdp.Maquina;
import cdp.Produtor;
import cdp.Propriedade;
import cdp.Servico;
import cdp.ServicoAgendado;
import cdp.ServicoCancelado;
import cdp.ServicoConcluido;
import cdp.TipoServico;
import cih.exception.ValidacaoException;
import java.util.Date;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JDCadastroServico extends javax.swing.JDialog {
    private CIInterface ciInterface;
    private int CENARIO;
    private Produtor produtorSelecionado;
    private Propriedade propriedadeSelecionada;
    private TipoServico tipoServicoSelecionado;
    private Funcionario funcionarioSelecionado;
    private Maquina maquinaSelecionada;
    private Servico servico;

    public JDCadastroServico(Frame framePai, boolean modal, CIInterface ciInterface, int CENARIO, Servico servico) {
        super(framePai, modal);
        this.ciInterface = ciInterface;
        this.CENARIO = CENARIO;
        this.servico = servico;
        initComponents();
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
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
        jLabelQtdPrevistaHrs = new javax.swing.JLabel();
        jFormattedTextFieldQtHrsPrevista = new javax.swing.JFormattedTextField();
        jLabelValorHora = new javax.swing.JLabel();
        jTextFieldValorHora = new javax.swing.JTextField();
        jTextFieldTipoServico = new javax.swing.JTextField();
        jButtonSelecionarTipoSevico = new javax.swing.JButton();
        jPanelConcluir = new javax.swing.JPanel();
        jLabelDataConclusao = new javax.swing.JLabel();
        jFormattedTextFieldDataConclusao = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldQtHrsReais = new javax.swing.JFormattedTextField();
        jLabelValorTotal = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jLabelExecutor = new javax.swing.JLabel();
        jTextFieldExecutor = new javax.swing.JTextField();
        jButtonFuncionario = new javax.swing.JButton();
        jLabelMaquina = new javax.swing.JLabel();
        jTextFieldMaquina = new javax.swing.JTextField();
        jButtonMaquina = new javax.swing.JButton();
        jPanelCancelar = new javax.swing.JPanel();
        jLabelDataCancelamento = new javax.swing.JLabel();
        jFormattedTextFieldDataCancelamento = new javax.swing.JFormattedTextField();
        jLabelValorMulta = new javax.swing.JLabel();
        jTextFieldValorMulta = new javax.swing.JTextField();
        jPanelRodape = new javax.swing.JPanel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

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
        jButtonSelecionarProdutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSelecionarProdutorKeyPressed(evt);
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
                .addComponent(jButtonSelecionarProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jComboBoxPropriedades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        jLabelQtdPrevistaHrs.setText("Quantidade prevista de horas:");

        try {
            jFormattedTextFieldQtHrsPrevista.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#:##")));
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
        jButtonSelecionarTipoSevico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSelecionarTipoSevicoKeyPressed(evt);
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
                        .addComponent(jFormattedTextFieldDataPrevista, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabelQtdPrevistaHrs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldQtHrsPrevista))
                    .addGroup(jPanelAgendarLayout.createSequentialGroup()
                        .addComponent(jLabelTipoServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSelecionarTipoSevico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabelValorHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValorHora)))
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
                    .addComponent(jLabelQtdPrevistaHrs)
                    .addComponent(jFormattedTextFieldQtHrsPrevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
            jFormattedTextFieldQtHrsReais.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldQtHrsReais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldQtHrsReaisKeyPressed(evt);
            }
        });

        jLabelValorTotal.setText("Valor total:");

        jTextFieldValorTotal.setEnabled(false);

        jLabelExecutor.setText("Executor:");

        jTextFieldExecutor.setEnabled(false);

        jButtonFuncionario.setText("...");
        jButtonFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuncionarioActionPerformed(evt);
            }
        });
        jButtonFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonFuncionarioKeyPressed(evt);
            }
        });

        jLabelMaquina.setText("Máquina:");

        jTextFieldMaquina.setEnabled(false);

        jButtonMaquina.setText("...");
        jButtonMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaquinaActionPerformed(evt);
            }
        });
        jButtonMaquina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonMaquinaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConcluirLayout = new javax.swing.GroupLayout(jPanelConcluir);
        jPanelConcluir.setLayout(jPanelConcluirLayout);
        jPanelConcluirLayout.setHorizontalGroup(
            jPanelConcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConcluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConcluirLayout.createSequentialGroup()
                        .addComponent(jLabelExecutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldExecutor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelMaquina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanelConcluirLayout.createSequentialGroup()
                        .addComponent(jLabelDataConclusao)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextFieldDataConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(jFormattedTextFieldQtHrsReais, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jFormattedTextFieldQtHrsReais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValorTotal)
                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelConcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExecutor)
                    .addComponent(jTextFieldExecutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFuncionario)
                    .addComponent(jLabelMaquina)
                    .addComponent(jTextFieldMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMaquina))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldDataCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jButtonConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonConfirmarKeyPressed(evt);
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
        jButtonLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonLimparKeyPressed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
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

        javax.swing.GroupLayout jPanelRodapeLayout = new javax.swing.GroupLayout(jPanelRodape);
        jPanelRodape.setLayout(jPanelRodapeLayout);
        jPanelRodapeLayout.setHorizontalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
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
        jComboBoxPropriedades.removeAllItems();
        jTextFieldNomeProdutor.setText(produtorSelecionado.getNome());
        if (produtorSelecionado.getPropriedades() != null) {
            jComboBoxPropriedades.setEnabled(true);
            produtorSelecionado.getPropriedades()
                    .forEach((propriedade) -> {
                        jComboBoxPropriedades.addItem(propriedade.toString());
                    });
            jComboBoxPropriedadesItemStateChanged(null);
        } else {
            jComboBoxPropriedades.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonSelecionarProdutorActionPerformed

    private void jButtonSelecionarTipoSevicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarTipoSevicoActionPerformed
        ciInterface.getCiTipoServico().instanciarTelaFiltroTipoServico((Frame) getOwner(), Cenario.SELECIONAR);
        tipoServicoSelecionado = ciInterface.getCiTipoServico().getTipoServicoSelecionado();
        jTextFieldTipoServico.setText(tipoServicoSelecionado.getNome());
        jTextFieldValorHora.setText(String.valueOf(tipoServicoSelecionado.getValor_hr()));
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
                agendarServico(dtPrevistaConclusao, qtdHrsPrevista);
                break;

            case Cenario.ALTERAR:
                alterarServico(dtPrevistaConclusao, qtdHrsPrevista);
                break;

            case Cenario.CONSULTAR:
                this.dispose();
                break;

            case Cenario.CANCELAR:
                cancelarServico();
                break;

            case Cenario.CONCLUIR:
                concluirServico();
                break;
                
            default: break;    
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jComboBoxPropriedadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxPropriedadesItemStateChanged
        if ( jComboBoxPropriedades.getItemCount() > 0 )
            produtorSelecionado.getPropriedades().forEach((propriedade) -> {
                if (jComboBoxPropriedades.getSelectedItem().toString() == propriedade.getNome_propriedade())
                    propriedadeSelecionada = propriedade;
            });
    }//GEN-LAST:event_jComboBoxPropriedadesItemStateChanged

    private void jFormattedTextFieldQtHrsReaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldQtHrsReaisKeyPressed
       
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           calcularValorTotal();
        }
    }//GEN-LAST:event_jFormattedTextFieldQtHrsReaisKeyPressed
	
    private void jButtonFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncionarioActionPerformed
        ciInterface.getCiFuncionario().instanciarTelaFiltroFuncionario((Frame) getOwner(), Cenario.SELECIONAR);
        funcionarioSelecionado = ciInterface.getCiFuncionario().getFuncionarioSelecionado();
        jTextFieldExecutor.setText(funcionarioSelecionado.getNome());
    }//GEN-LAST:event_jButtonFuncionarioActionPerformed

    private void jButtonMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaquinaActionPerformed
        ciInterface.getCiMaquina().instanciarTelaFiltroMaquina((Frame) getOwner(), Cenario.SELECIONAR);
        maquinaSelecionada = ciInterface.getCiMaquina().getMaquinaSelecionada();
        jTextFieldMaquina.setText(maquinaSelecionada.getPlaca());
    }//GEN-LAST:event_jButtonMaquinaActionPerformed

    private void jButtonSelecionarProdutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSelecionarProdutorKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonSelecionarProdutorActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonSelecionarProdutorKeyPressed

    private void jButtonSelecionarTipoSevicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSelecionarTipoSevicoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonSelecionarTipoSevicoActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonSelecionarTipoSevicoKeyPressed

    private void jButtonFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonFuncionarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonFuncionarioActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonFuncionarioKeyPressed

    private void jButtonMaquinaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonMaquinaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonMaquinaActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonMaquinaKeyPressed

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

    private void jButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCancelarKeyPressed

    private void agendarServico(String dtPrevistaConclusao, String qtdHrsPrevista) {
        
        try {
            validacoesAgendar();
            ciInterface.getCiServico().cadastrarServico(produtorSelecionado, propriedadeSelecionada, tipoServicoSelecionado, dtPrevistaConclusao, qtdHrsPrevista);
            JOptionPane.showMessageDialog(this, "Serviço agendado com sucesso!");
            modoSomenteLeituraAgendado(true);
            jButtonCancelar.setText("Sair");
        } catch (ValidacaoException ve) {
            JOptionPane.showMessageDialog(this, ve.getMessage(), "Validação dos dados", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao Agendar Serviço: " + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void alterarServico(String dtPrevistaConclusao, String qtdHrsPrevista) {
        
        try {
            validacoesAgendar();
            ciInterface.getCiServico().alterarServico(servico, produtorSelecionado, propriedadeSelecionada, tipoServicoSelecionado, dtPrevistaConclusao, qtdHrsPrevista);
            modoSomenteLeituraAgendado(true);
            jButtonCancelar.setText("Sair");
            JOptionPane.showMessageDialog(this, "Serviço alterado com sucesso!");
        } catch (ValidacaoException ve) {
            JOptionPane.showMessageDialog(this, ve.getMessage(), "Validação dos dados", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao Alterar Serviço: " + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void concluirServico() {
        
        String dataConclusao = jFormattedTextFieldDataConclusao.getText();
        String qtdHoras = jFormattedTextFieldQtHrsReais.getText().replace(":", ".");
        String total = jTextFieldValorTotal.getText();

        try {
            validacoesConcluir();
            calcularValorTotal();
            ciInterface.getCiServico().concluirServico(((ServicoAgendado) servico), dataConclusao, qtdHoras, total, funcionarioSelecionado, maquinaSelecionada);
            modoSomenteLeituraConcluido(true);
            jButtonConfirmar.setEnabled(false);
            jButtonCancelar.setText("Sair");
            JOptionPane.showMessageDialog(this, "Serviço concluído com sucesso!");
        } catch (ValidacaoException ve) {
            JOptionPane.showMessageDialog(this, ve.getMessage(), "Validação dos dados", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao Concluir Serviço: " + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cancelarServico() {
        
        String dataCancelamento = jFormattedTextFieldDataCancelamento.getText();
        String valorMulta = jTextFieldValorMulta.getText();

        try {
            validacoesCancelar();
            ciInterface.getCiServico().cancelarServico(((ServicoAgendado) servico), dataCancelamento, valorMulta);
            modoSomenteLeituraCancelado(true);
            jButtonCancelar.setText("Sair");
            jButtonConfirmar.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Serviço cancelado com sucesso!");
        } catch (ValidacaoException ve) {
            JOptionPane.showMessageDialog(this, ve.getMessage(), "Validação dos dados", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao Cancelar Serviço: " + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void calcularValorTotal(){
        
        double valor_hr = servico.getTipoServico().getValor_hr();
        String qt_hrs_reais = jFormattedTextFieldQtHrsReais.getText().replace(":", ".");
        double qt_horas = Double.parseDouble(qt_hrs_reais);
        double total = valor_hr * qt_horas;
        jTextFieldValorTotal.setText(String.valueOf(total));
    }
    
    private void identificarCenario() {

        switch (CENARIO) {
            case Cenario.AGENDAR:
                redimensionarJanelaCenario();
                break;

            case Cenario.ALTERAR:
                this.setTitle("Alterar Serviço");
                setarCamposServicoAgendado(servico);
                redimensionarJanelaCenario();
                break;

            case Cenario.CONSULTAR:
                this.setTitle("Consultar Serviço");
                jButtonCancelar.setText("Sair");
                modoSomenteLeituraAgendado(true);
                setarCamposServicoAgendado(servico);
                identificarServicoFilho(servico);
                redimensionarJanelaCenario();
                break;

            case Cenario.CANCELAR:
                this.setTitle("Cancelar Serviço");
                jPanelCancelar.setVisible(true);
                modoSomenteLeituraAgendado(true);
                setarCamposServicoAgendado(servico);
                jButtonConfirmar.setEnabled(true);
                redimensionarJanelaCenario();
                break;

            case Cenario.CONCLUIR:
                this.setTitle("Concluir Serviço");
                jPanelConcluir.setVisible(true);
                modoSomenteLeituraAgendado(true);
                setarCamposServicoAgendado(servico);
                jButtonConfirmar.setEnabled(true);
                redimensionarJanelaCenario();
                break;
        }
    }

    private void redimensionarJanelaCenario() {
	JPanel[] paineisCenario = new JPanel[]{jPanelAgendar, jPanelCancelar, jPanelConcluir};
        int alturaPaineis = 0;
        for (JPanel painel : paineisCenario)
            alturaPaineis += painel.getHeight();
        int alturaSemPaineis = getHeight() - alturaPaineis;
        setBounds(getX(), getY(), getWidth(), alturaSemPaineis);

        for (JPanel paineil : paineisCenario)
            if ( paineil.isVisible() )
                setBounds(getX(), getY(), getWidth(), alturaSemPaineis += paineil.getHeight());
    }

    private void setarCamposServicoAgendado(Servico servico) {
        
        produtorSelecionado = servico.getProdutor();
        propriedadeSelecionada = servico.getPropriedade();
        tipoServicoSelecionado = servico.getTipoServico();
        
        jTextFieldNomeProdutor.setText(servico.getProdutor().getNome());
        jComboBoxPropriedades.setModel(new DefaultComboBoxModel(servico.getProdutor().getPropriedades().toArray()));
        jComboBoxPropriedades.setSelectedItem(servico.getPropriedade());
        jTextFieldTipoServico.setText(servico.getTipoServico().getNome());
        jTextFieldValorHora.setText(String.valueOf(servico.getTipoServico().getValor_hr()));
        jFormattedTextFieldDataPrevista.setText(servico.getData_prevista_conclusao("dd/MM/yyyy"));
        String horas = String.valueOf(servico.getQtd_hrs_prevista());
        jFormattedTextFieldQtHrsPrevista.setText(horas.replace(".", ""));
    }
    
    private void setarCamposServicoConcluido(ServicoConcluido servico){
        jTextFieldValorTotal.setText(String.valueOf(servico.getValor_total()));
        jTextFieldExecutor.setText(servico.getFuncionario().getNome());
        jTextFieldMaquina.setText(servico.getMaquina().getPlaca());
        jFormattedTextFieldDataConclusao.setText(String.valueOf(servico.getData_conclusao("dd/MM/yyyy")));
        String horas = String.valueOf(servico.getQtd_hrs_real());
        jFormattedTextFieldQtHrsReais.setText(String.valueOf(horas.replace(".", "")));
    }
    
    private void setarCamposServicoCancelado(ServicoCancelado servico){
        jFormattedTextFieldDataCancelamento.setText(String.valueOf(servico.getData_cancelamento("dd/MM/yyyy")));
        jTextFieldValorMulta.setText(String.valueOf(servico.getValor_multa()));
    }

    private void identificarServicoFilho(Servico servico) {
        if (servico.getClass() == ServicoConcluido.class) {
            modoSomenteLeituraConcluido(true);
            setarCamposServicoConcluido((ServicoConcluido) servico);
        } else if (servico.getClass() == ServicoCancelado.class) {
            modoSomenteLeituraCancelado(true);
            setarCamposServicoCancelado((ServicoCancelado) servico);
        }
    }

    private void modoSomenteLeituraConcluido(boolean condicao) {
        condicao = !condicao;
        jPanelConcluir.setVisible(!condicao);
        jTextFieldValorTotal.setEnabled(condicao);
        jFormattedTextFieldDataConclusao.setEnabled(condicao);
        jFormattedTextFieldQtHrsReais.setEnabled(condicao);
        jButtonFuncionario.setEnabled(condicao);
        jButtonMaquina.setEnabled(condicao);
    }

    private void modoSomenteLeituraCancelado(boolean condicao) {
        condicao = !condicao;
        jPanelCancelar.setVisible(!condicao);
        jFormattedTextFieldDataCancelamento.setEnabled(condicao);
        jTextFieldValorMulta.setEnabled(condicao);
    }

    private void modoSomenteLeituraAgendado(boolean condicao) {
        condicao = !condicao;
        jFormattedTextFieldDataPrevista.setEnabled(condicao);
        jFormattedTextFieldQtHrsPrevista.setEnabled(condicao);
        jComboBoxPropriedades.setEnabled(condicao);
        jButtonSelecionarProdutor.setEnabled(condicao);
        jButtonSelecionarTipoSevico.setEnabled(condicao);
        jButtonConfirmar.setEnabled(condicao);
        jButtonLimpar.setEnabled(condicao);
    }
    
    private void validacoesAgendar() throws ValidacaoException {
        String dtPrevConclusao = jFormattedTextFieldDataPrevista.getText();
        String qtdPrevHoras = jFormattedTextFieldQtHrsPrevista.getText().replace(":", "").trim();
        if ( produtorSelecionado == null )
            throw new ValidacaoException("Favor informar um Produtor!");
        if ( propriedadeSelecionada == null )
            throw new ValidacaoException("Favor informar uma Propriedade!");
        if ( tipoServicoSelecionado == null )
            throw new ValidacaoException("Favor informar um Tipo de Serviço!");
        if ( dtPrevConclusao.replace("/", "").trim().equals("") )
            throw new ValidacaoException("Favor informar a data prevista de conclusão!");
        Date dataPrevConclusaoDate = new Date(dtPrevConclusao);
        Date dataHoje = Calendar.getInstance().getTime();
        if ( !dataPrevConclusaoDate.after(dataHoje) )
            throw new ValidacaoException("Data Prevista de conclusão menor que a data atual!");
        if ( qtdPrevHoras.equals("") )
            throw new ValidacaoException("Favor informar a tempo previsto de duração!");
    }
    
    private void validacoesCancelar() throws ValidacaoException {
        
        if ( jFormattedTextFieldDataCancelamento.getText().replace("/", "").trim().equals("") )
            throw new ValidacaoException("Favor informar a data de cancelamento!");
        if ( jTextFieldValorMulta.getText().equals("") )
            throw new ValidacaoException("Favor informar o valor da multa!");
        Date dataCancelamento = new Date(jFormattedTextFieldDataCancelamento.getText());
        if ( !dataCancelamento.after(servico.getData_agendamento()) )
            throw new ValidacaoException("Data de cancelamento não pode ser menor que a data do agendamento!");
    }
    
    private void validacoesConcluir() throws ValidacaoException {
        
        if ( jFormattedTextFieldDataConclusao.getText().replace("/", "").trim().equals("") )
            throw new ValidacaoException("Favor informar a data de conclusão!");
        if ( jFormattedTextFieldQtHrsReais.getText().replace(":", "").trim().equals("") )
            throw new ValidacaoException("Favor informar a quantidade de horas gastas!");
        Date dataConclusao = new Date(jFormattedTextFieldDataConclusao.getText());
        if ( !dataConclusao.after(servico.getData_agendamento()) )
            throw new ValidacaoException("Data de conclusão não pode ser menor que a data do agendamento!");
        if ( funcionarioSelecionado == null )
            throw new ValidacaoException("Favor informar o funcionário que executou o serviço!");
        if ( maquinaSelecionada == null )
            throw new ValidacaoException("Favor informar a máquina que executou o serviço!");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonFuncionario;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMaquina;
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
    private javax.swing.JLabel jLabelExecutor;
    private javax.swing.JLabel jLabelMaquina;
    private javax.swing.JLabel jLabelNomeProdutor;
    private javax.swing.JLabel jLabelPropriedade;
    private javax.swing.JLabel jLabelQtdPrevistaHrs;
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
    private javax.swing.JTextField jTextFieldExecutor;
    private javax.swing.JTextField jTextFieldMaquina;
    private javax.swing.JTextField jTextFieldNomeProdutor;
    private javax.swing.JTextField jTextFieldTipoServico;
    private javax.swing.JTextField jTextFieldValorHora;
    private javax.swing.JTextField jTextFieldValorMulta;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables
}
