package cih.produtor;

import cdp.Produtor;
import cdp.Propriedade;
import cci.CIInterface;
import cci.util.Cenario;
import cci.util.JTableUtil;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JDCadastroProdutor extends javax.swing.JDialog {
    
    private CIInterface ciInterface;
    private JFrame pai;
    private int CENARIO;
    private Produtor produtor, produtorAtual;

    public JDCadastroProdutor(java.awt.Frame pai, boolean modal, CIInterface ciInterface, int CENARIO, Produtor produtor) {
        super(pai, modal);
        this.CENARIO = CENARIO;
        this.produtor = produtor; // Informe NULL caso o cenário seja cadastro.
        this.ciInterface = ciInterface;
        this.pai = (JFrame) pai;
        initComponents();
        this.setLocationRelativeTo(pai);
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
        identificarCenario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonGroupSexo = new javax.swing.ButtonGroup();
        jPanelDadosPessoais = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelDataNascimento = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelRg = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelInscricaoEstadual = new javax.swing.JLabel();
        jRadioButtonFeminino = new javax.swing.JRadioButton();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRg = new javax.swing.JFormattedTextField();
        jFormattedTextFieldInscricaoEstadual = new javax.swing.JFormattedTextField();
        jPanelPropriedades = new javax.swing.JPanel();
        jButtonAdicionar = new javax.swing.JButton();
        jScrollPanePropriedades = new javax.swing.JScrollPane();
        jTablePropriedades = new javax.swing.JTable();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jPanelRodape = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produtor");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanelDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais"));

        jLabelNome.setText("Nome:");

        jLabelDataNascimento.setText("Data Nasc:");

        jLabelTelefone.setText("Telefone:");

        jLabelRg.setText("RG:");

        jLabelCpf.setText("CPF:");

        jLabelSexo.setText("Sexo:");

        jLabelInscricaoEstadual.setText("Inscrição Estadual:");

        jButtonGroupSexo.add(jRadioButtonFeminino);
        jRadioButtonFeminino.setMnemonic('f');
        jRadioButtonFeminino.setSelected(true);
        jRadioButtonFeminino.setText("Feminino");

        jButtonGroupSexo.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setMnemonic('m');
        jRadioButtonMasculino.setText("Masculino");

        try {
            jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldInscricaoEstadual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.####-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelDadosPessoais);
        jPanelDadosPessoais.setLayout(jPanelDadosPessoaisLayout);
        jPanelDadosPessoaisLayout.setHorizontalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelCpf)
                    .addComponent(jLabelTelefone)
                    .addComponent(jLabelSexo))
                .addGap(22, 22, 22)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldTelefone))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataNascimento)
                            .addComponent(jLabelRg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldDataNascimento))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jRadioButtonFeminino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonMasculino)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelInscricaoEstadual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldRg)
                            .addComponent(jFormattedTextFieldInscricaoEstadual, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelDadosPessoaisLayout.setVerticalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelCpf))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDataNascimento)
                            .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelRg)
                        .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonMasculino)
                        .addComponent(jLabelInscricaoEstadual)
                        .addComponent(jFormattedTextFieldInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSexo)
                        .addComponent(jRadioButtonFeminino)))
                .addGap(0, 0, 0))
        );

        getContentPane().add(jPanelDadosPessoais);

        jPanelPropriedades.setBorder(javax.swing.BorderFactory.createTitledBorder("Propriedades"));

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jTablePropriedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Referência"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPanePropriedades.setViewportView(jTablePropriedades);

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPropriedadesLayout = new javax.swing.GroupLayout(jPanelPropriedades);
        jPanelPropriedades.setLayout(jPanelPropriedadesLayout);
        jPanelPropriedadesLayout.setHorizontalGroup(
            jPanelPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropriedadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPanePropriedades, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPropriedadesLayout.setVerticalGroup(
            jPanelPropriedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropriedadesLayout.createSequentialGroup()
                .addComponent(jButtonAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExcluir)
                .addContainerGap())
            .addComponent(jScrollPanePropriedades, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelPropriedades);

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
                .addContainerGap(87, Short.MAX_VALUE))
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

        getContentPane().add(jPanelRodape);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
    
        String nome = jTextFieldNome.getText();
        String cpf = jFormattedTextFieldCpf.getText().replace(".", "").replace("-", "");
        String data_nasc = jFormattedTextFieldDataNascimento.getText();
        String inscricao = jFormattedTextFieldInscricaoEstadual.getText().replace(".", "").replace("-", "");
        String rg = jFormattedTextFieldRg.getText().replace(".", "");
        String telefone = jFormattedTextFieldTelefone.getText().replace("(", "").replace(")", "").replace("-", "");
        char sexo = (char) jButtonGroupSexo.getSelection().getMnemonic();
        
        try {
            
            validarCampos(nome, cpf, data_nasc, inscricao, rg, telefone);
            
            if(CENARIO == Cenario.CADASTRAR){
                produtorAtual = ciInterface.getCiProdutor().cadastrarProdutor(nome, cpf, data_nasc, inscricao, rg, telefone, sexo);
                if(produtorAtual != null){
                    jButtonConfirmar.setEnabled(false);
                    jButtonCancelar.setText("Sair");
                    modoSomenteLeitura(true);
                    habilitarBotoesPropriedade(true);
                }
                                   
            } else if (CENARIO == Cenario.ALTERAR){
                produtorAtual = ciInterface.getCiProdutor().alterarProdutor(nome, cpf, data_nasc, inscricao, rg, telefone, sexo);
                
                if(produtorAtual != null){
                    jButtonConfirmar.setEnabled(false);
                    jButtonCancelar.setText("Sair");
                    modoSomenteLeitura(true);
                    habilitarBotoesPropriedade(true);
                }
                
            } else if(CENARIO == Cenario.CONSULTAR){
                this.dispose();
                
            } else if(CENARIO == Cenario.EXCLUIR){
               JOptionPane.showConfirmDialog(this, "Confirmar Exclusão ?", "Excluir", WIDTH);
                boolean resposta = ciInterface.getCiProdutor().excluirProdutor(produtor);
                if(resposta)
                    this.dispose();
            }          
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
    
        jTextFieldNome.setText("");
        jFormattedTextFieldCpf.setText("");
        jFormattedTextFieldDataNascimento.setText("");
        jFormattedTextFieldInscricaoEstadual.setText("");
        jFormattedTextFieldRg.setText("");
        jFormattedTextFieldTelefone.setText("");
        jRadioButtonFeminino.setSelected(true);
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    public void identificarCenario() {
        
        switch (CENARIO) {
            
            case Cenario.CADASTRAR:
                habilitarBotoesPropriedade(false);
                break;
            case Cenario.ALTERAR:
                modoSomenteLeitura(false);
                habilitarBotoesPropriedade(true);
                setarCamposComInstancia(produtor);
                break;
            case Cenario.CONSULTAR:
                modoSomenteLeitura(true);
                habilitarBotoesPropriedade(false);
                setarCamposComInstancia(produtor);
                jButtonConfirmar.setEnabled(false);
                jButtonCancelar.setText("Sair");
                break;
            default://EXCLUIR
                modoSomenteLeitura(true);
                habilitarBotoesPropriedade(false);
                setarCamposComInstancia(produtor);
                break;
        }
    }
    
    public void modoSomenteLeitura(boolean condicao) {
        condicao = !condicao;
        jTextFieldNome.setEditable(condicao);
        jFormattedTextFieldCpf.setEditable(condicao);
        jFormattedTextFieldRg.setEditable(condicao);
        jFormattedTextFieldInscricaoEstadual.setEditable(condicao);
        jFormattedTextFieldDataNascimento.setEditable(condicao);
        jFormattedTextFieldTelefone.setEditable(condicao);
        jRadioButtonFeminino.setEnabled(condicao);
        jRadioButtonMasculino.setEnabled(condicao);
        jButtonLimpar.setEnabled(condicao);
    }
    
    public void setarCamposComInstancia(Produtor produtor) {
        jTextFieldNome.setText(produtor.getNome());
        jFormattedTextFieldCpf.setText(produtor.getCpf());
        jFormattedTextFieldRg.setText(produtor.getRg());
        jFormattedTextFieldInscricaoEstadual.setText(produtor.getInscricao_estadual());
        jFormattedTextFieldDataNascimento.setText(produtor.getDt_nasc("dd/MM/yyyy"));
        jFormattedTextFieldTelefone.setText(produtor.getTelefone());
        if ( produtor.getSexo() == 'M' )
            jRadioButtonMasculino.setSelected(true);
        
        produtor.getPropriedades().forEach((propriedade) -> {
            JTableUtil.addLinha(jTablePropriedades, propriedade.toArray());
        });
    }
    
    public void habilitarBotoesPropriedade(boolean resposta){
        jButtonAdicionar.setEnabled(resposta);
        jButtonAlterar.setEnabled(resposta);
        jButtonExcluir.setEnabled(resposta);
    }
    
    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        Propriedade propriedadeVazia = ciInterface.getCiPropriedade().instanciarPropriedadeVazia(produtorAtual);
        ciInterface.getCiPropriedade().instanciarTelaCadastroPropriedade(propriedadeVazia, pai, Cenario.ADICIONAR);
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            Propriedade propriedade = (Propriedade) JTableUtil.getDadosLinhaSelecionada(jTablePropriedades);
            ciInterface.getCiPropriedade().instanciarTelaCadastroPropriedade(propriedade, pai, Cenario.ALTERAR);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: "+ e.getMessage(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        
        try {
            
            Propriedade propriedade = (Propriedade) JTableUtil.getDadosLinhaSelecionada(jTablePropriedades);
            ciInterface.getCiPropriedade().excluirPropriedade(propriedade);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "ERRO Alterar", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_jButtonExcluirActionPerformed
   
    public void validarCampos(String nome, String cpf, String data_nasc, String inscricao, String rg, String telefone) throws Exception{
        if (nome.equals("") || cpf.equals("") || data_nasc.equals("") || inscricao.equals("") || rg.equals("") || telefone.equals(""))
            throw new Exception("Campos Vazios");
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.ButtonGroup jButtonGroupSexo;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldInscricaoEstadual;
    private javax.swing.JFormattedTextField jFormattedTextFieldRg;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelInscricaoEstadual;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelDadosPessoais;
    private javax.swing.JPanel jPanelPropriedades;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JScrollPane jScrollPanePropriedades;
    private javax.swing.JTable jTablePropriedades;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
