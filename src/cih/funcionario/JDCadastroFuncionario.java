package cih.funcionario;

import javax.swing.ImageIcon;

import cci.CIInterface;
import cci.util.Cenario;
import cci.util.JTableUtil;
import cdp.Cargo;
import cdp.Funcionario;
import cdp.Habilitacao;
import cdp.TipoServico;
import cdp.Usuario;
import cdp.endereco.Cep;
import csw.WebServiceCep;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JDCadastroFuncionario extends javax.swing.JDialog {

    private CIInterface ciInterface;
    private int CENARIO;
    private Funcionario funcionarioAtual;
    private Cargo cargo;
    private Habilitacao habilitacao;
    private WebServiceCep webServiceCep;
    private Cep cepAtual;

    public JDCadastroFuncionario(java.awt.Frame parent, boolean modal, CIInterface ciInterface, int CENARIO, Funcionario funcionario) {
        super(parent, modal);
        this.ciInterface = ciInterface;
        this.CENARIO = CENARIO;
        this.funcionarioAtual = funcionario;
        initComponents();
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
        jLabelEmail = new javax.swing.JLabel();
        jLabelCargo = new javax.swing.JLabel();
        jLabelHabilitacao = new javax.swing.JLabel();
        jRadioButtonFeminino = new javax.swing.JRadioButton();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jFormattedTextFieldRg = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        jComboBoxHabilitacao = new javax.swing.JComboBox<>();
        jPanelLoginTipoServico = new javax.swing.JPanel();
        jPanelAcessarSistema = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jCheckBoxAcessarSistema = new javax.swing.JCheckBox();
        jPanelTiposServicos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTiposServicos = new javax.swing.JTable();
        jButtonRemoverTipoServico = new javax.swing.JButton();
        jButtonAddTipoServico = new javax.swing.JButton();
        jPanelEndereco = new javax.swing.JPanel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelLogradouro = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jTextFieldTipoLogradouro = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jPanelRodape = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Funcionário");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanelDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais"));

        jLabelNome.setText("Nome:");

        jLabelDataNascimento.setText("Data Nasc:");

        jLabelTelefone.setText("Telefone:");

        jLabelRg.setText("RG:");

        jLabelCpf.setText("CPF:");

        jLabelSexo.setText("Sexo:");

        jLabelEmail.setText("Email:");

        jLabelCargo.setText("Cargo:");

        jLabelHabilitacao.setText("Habilitação:");

        jButtonGroupSexo.add(jRadioButtonFeminino);
        jRadioButtonFeminino.setMnemonic('f');
        jRadioButtonFeminino.setSelected(true);
        jRadioButtonFeminino.setText("Feminino");

        jButtonGroupSexo.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setMnemonic('m');
        jRadioButtonMasculino.setText("Masculino");

        try {
            jFormattedTextFieldRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

        jComboBoxCargo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCargoItemStateChanged(evt);
            }
        });

        jComboBoxHabilitacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxHabilitacaoItemStateChanged(evt);
            }
        });

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
                    .addComponent(jLabelSexo)
                    .addComponent(jLabelCargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldTelefone))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelRg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextFieldRg))
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelDataNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextFieldDataNascimento))))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jRadioButtonFeminino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelEmail)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelHabilitacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxHabilitacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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
                        .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTelefone)
                        .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonMasculino)
                        .addComponent(jLabelEmail)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSexo)
                        .addComponent(jRadioButtonFeminino)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelHabilitacao)
                        .addComponent(jComboBoxHabilitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCargo)
                        .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanelDadosPessoais);

        jPanelAcessarSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Acesso ao Sistema"));

        jLabelUsuario.setText("Usuário:");

        jTextFieldUsuario.setEnabled(false);

        jLabelSenha.setText("Senha:");

        jPasswordFieldSenha.setEnabled(false);

        jCheckBoxAcessarSistema.setText("Permitir Acesso ao Sistema");
        jCheckBoxAcessarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAcessarSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAcessarSistemaLayout = new javax.swing.GroupLayout(jPanelAcessarSistema);
        jPanelAcessarSistema.setLayout(jPanelAcessarSistemaLayout);
        jPanelAcessarSistemaLayout.setHorizontalGroup(
            jPanelAcessarSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAcessarSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAcessarSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAcessarSistemaLayout.createSequentialGroup()
                        .addComponent(jLabelUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAcessarSistemaLayout.createSequentialGroup()
                        .addComponent(jLabelSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBoxAcessarSistema))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanelAcessarSistemaLayout.setVerticalGroup(
            jPanelAcessarSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAcessarSistemaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jCheckBoxAcessarSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAcessarSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAcessarSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTiposServicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipos de Serviços"));

        jTableTiposServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipos de Serviço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTiposServicos);

        jButtonRemoverTipoServico.setText("Remover");
        jButtonRemoverTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverTipoServicoActionPerformed(evt);
            }
        });
        jButtonRemoverTipoServico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonRemoverTipoServicoKeyPressed(evt);
            }
        });

        jButtonAddTipoServico.setText("Adicionar");
        jButtonAddTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTipoServicoActionPerformed(evt);
            }
        });
        jButtonAddTipoServico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAddTipoServicoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTiposServicosLayout = new javax.swing.GroupLayout(jPanelTiposServicos);
        jPanelTiposServicos.setLayout(jPanelTiposServicosLayout);
        jPanelTiposServicosLayout.setHorizontalGroup(
            jPanelTiposServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTiposServicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTiposServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAddTipoServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRemoverTipoServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelTiposServicosLayout.setVerticalGroup(
            jPanelTiposServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTiposServicosLayout.createSequentialGroup()
                .addGroup(jPanelTiposServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTiposServicosLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButtonAddTipoServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoverTipoServico))
                    .addGroup(jPanelTiposServicosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelLoginTipoServicoLayout = new javax.swing.GroupLayout(jPanelLoginTipoServico);
        jPanelLoginTipoServico.setLayout(jPanelLoginTipoServicoLayout);
        jPanelLoginTipoServicoLayout.setHorizontalGroup(
            jPanelLoginTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginTipoServicoLayout.createSequentialGroup()
                .addComponent(jPanelAcessarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTiposServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLoginTipoServicoLayout.setVerticalGroup(
            jPanelLoginTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginTipoServicoLayout.createSequentialGroup()
                .addGroup(jPanelLoginTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelAcessarSistema, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTiposServicos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelLoginTipoServico);

        jPanelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabelNumero.setText("Nº:");

        jLabelLogradouro.setText("Logradouro:");

        jLabelBairro.setText("Bairro:");

        jLabelCep.setText("CEP:");

        jLabelCidade.setText("Cidade:");

        jTextFieldLogradouro.setEnabled(false);

        jTextFieldBairro.setEnabled(false);

        jTextFieldEstado.setEnabled(false);

        jTextFieldCidade.setEnabled(false);

        try {
            jFormattedTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldCepKeyPressed(evt);
            }
        });

        jLabelComplemento.setText("Complemento:");

        jTextFieldTipoLogradouro.setEnabled(false);

        jLabelEstado.setText("UF:");

        javax.swing.GroupLayout jPanelEnderecoLayout = new javax.swing.GroupLayout(jPanelEndereco);
        jPanelEndereco.setLayout(jPanelEnderecoLayout);
        jPanelEnderecoLayout.setHorizontalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBairro)
                    .addComponent(jLabelComplemento)
                    .addComponent(jLabelLogradouro)
                    .addComponent(jLabelCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldComplemento)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabelCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEstado)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnderecoLayout.createSequentialGroup()
                        .addComponent(jTextFieldTipoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addGap(284, 284, 284)
                                .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldLogradouro)))))
                .addContainerGap())
        );
        jPanelEnderecoLayout.setVerticalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCep)
                    .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogradouro)
                    .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTipoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBairro)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComplemento)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelEndereco);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxAcessarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAcessarSistemaActionPerformed
        if(jCheckBoxAcessarSistema.isSelected()){
            jTextFieldUsuario.setEnabled(true);
            jPasswordFieldSenha.setEnabled(true);
        }else{
            jTextFieldUsuario.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jTextFieldUsuario.setText("");
            jPasswordFieldSenha.setText("");
        }    
    }//GEN-LAST:event_jCheckBoxAcessarSistemaActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEstado.setText("");
        jTextFieldLogradouro.setText("");
        jTextFieldNumero.setText("");
        jFormattedTextFieldCep.setText("");
        jFormattedTextFieldCpf.setText("");
        jFormattedTextFieldRg.setText("");
        jFormattedTextFieldDataNascimento.setText("");
        jFormattedTextFieldTelefone.setText("");
        jRadioButtonMasculino.setSelected(true);
        jCheckBoxAcessarSistema.setSelected(false);
        jTextFieldUsuario.setText("");
        jPasswordFieldSenha.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed

        String nome = jTextFieldNome.getText();
        String cpf = jFormattedTextFieldCpf.getText().replace(".", "").replace("-", "").replace(" ", "");
        String rg = jFormattedTextFieldRg.getText().replace(".", "").replace("-", "").replace(" ", "");
        String data_nasc = jFormattedTextFieldDataNascimento.getText();
        String telefone = jFormattedTextFieldTelefone.getText().replace("(", "").replace(")", "").replace("-", "");
        char sexo = (char) jButtonGroupSexo.getSelection().getMnemonic();
        String email = jTextFieldEmail.getText();
        String login = jTextFieldUsuario.getText();
        String senha = jPasswordFieldSenha.getText();
        String numero = jTextFieldNumero.getText();
        String complemento = jTextFieldComplemento.getText();
        
        cargo = (Cargo) jComboBoxCargo.getSelectedItem();
        habilitacao = (Habilitacao) jComboBoxHabilitacao.getSelectedItem();
        List tiposServicos = JTableUtil.toList(jTableTiposServicos);
        String cep = "";
        String tipoLogradouro = "";
        String logradouro = "";
        String bairro = "";
        String cidade = "";
        String estado = "";
        boolean cenarioExecutado = false;

        try {

            switch (CENARIO) {

                case Cenario.CADASTRAR: {

                    Usuario usuario = null;
                    if (jCheckBoxAcessarSistema.isSelected()) {
                        usuario = ciInterface.getCiFuncionario().instanciarUsuario(login, senha);
                    }

                    cep = jFormattedTextFieldCep.getText();
                    tipoLogradouro = jTextFieldTipoLogradouro.getText();
                    logradouro = jTextFieldLogradouro.getText();
                    bairro = jTextFieldBairro.getText();
                    cidade = jTextFieldCidade.getText();
                    estado = jTextFieldEstado.getText();
                    
                    validarCampos(nome, cpf, data_nasc, rg, telefone, email, cep, numero, login, senha);
                    consultarCep();
                    cenarioExecutado = ciInterface.getCiFuncionario().cadastrarFuncionario(
                            nome, cpf, rg, email, data_nasc, telefone, sexo, cargo,
                            habilitacao, usuario, cep, logradouro, numero,
                            bairro, cidade, estado, tipoLogradouro, complemento, cepAtual, tiposServicos);

                    if (cenarioExecutado) {
                        modoConcluido(cenarioExecutado);
                    }

                    break;
                }
                case Cenario.CONSULTAR:
                    this.dispose();
                    break;

                case Cenario.ALTERAR:

                    cep = jFormattedTextFieldCep.getText();
                    tipoLogradouro = jTextFieldTipoLogradouro.getText();
                    logradouro = jTextFieldLogradouro.getText();
                    bairro = jTextFieldBairro.getText();
                    cidade = jTextFieldCidade.getText();
                    estado = jTextFieldEstado.getText();

                    validarCampos(nome, cpf, data_nasc, rg, telefone, email, cep, numero, login, senha);
                    consultarCep();
                    cenarioExecutado = ciInterface.getCiFuncionario().alterarFuncionario(funcionarioAtual,
                            nome, cpf, rg, email, data_nasc, telefone, sexo, cargo,
                            habilitacao, login, senha, cep, logradouro, numero,
                            bairro, cidade, estado, tipoLogradouro, complemento, cepAtual, tiposServicos);

                    if (cenarioExecutado) {
                        modoConcluido(cenarioExecutado);
                    }
                    break;

                case Cenario.EXCLUIR:
                    int confirmacao = JOptionPane.showConfirmDialog(this, "Confirmar Exclusão ?", "Excluir", JOptionPane.YES_NO_OPTION);
                    if (confirmacao == 0) {
                        cenarioExecutado = ciInterface.getCiFuncionario().excluirFuncionario(funcionarioAtual);
                    }

                    if (cenarioExecutado) {
                        this.dispose();
                    }
                    break;

                default:
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxHabilitacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxHabilitacaoItemStateChanged
        habilitacao = (Habilitacao) jComboBoxHabilitacao.getSelectedItem();
    }//GEN-LAST:event_jComboBoxHabilitacaoItemStateChanged

    private void jComboBoxCargoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCargoItemStateChanged
        cargo = (Cargo) jComboBoxCargo.getSelectedItem();
    }//GEN-LAST:event_jComboBoxCargoItemStateChanged

    private void jFormattedTextFieldCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCepKeyPressed

        if ((evt.getKeyCode() == KeyEvent.VK_ENTER) || (evt.getKeyCode() == KeyEvent.VK_TAB)) {
            try {
                consultarCep();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jFormattedTextFieldCepKeyPressed

    private void jButtonConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonConfirmarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonConfirmarKeyPressed

    private void jButtonLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLimparKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonLimparActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonLimparKeyPressed

    private void jButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonCancelarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonCancelarKeyPressed

    private void jButtonAddTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTipoServicoActionPerformed
        ciInterface.getCiTipoServico().instanciarTelaFiltroTipoServico((Frame)getOwner(), Cenario.SELECIONAR);
        TipoServico tipoServicoSelecionado = ciInterface.getCiTipoServico().getTipoServicoSelecionado();
        if (tipoServicoSelecionado == null)
            return;
        ciInterface.getCiTipoServico().setTipoServicoSelecionado(null);
        boolean jaVinculado = false;
        
        for (Object tipoServicoFuncionario : JTableUtil.toList(jTableTiposServicos))
            if ( tipoServicoFuncionario.equals(tipoServicoSelecionado) )
                jaVinculado = true;
        if ( !jaVinculado )
            JTableUtil.addLinha(jTableTiposServicos, tipoServicoSelecionado.toArray());
        else
            JOptionPane.showMessageDialog(this, "Tipo de Serviço já selecionado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonAddTipoServicoActionPerformed

    private void jButtonRemoverTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverTipoServicoActionPerformed
        JTableUtil.removeLinhaSelecionada(jTableTiposServicos);
    }//GEN-LAST:event_jButtonRemoverTipoServicoActionPerformed

    private void jButtonAddTipoServicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAddTipoServicoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonAddTipoServicoActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonAddTipoServicoKeyPressed

    private void jButtonRemoverTipoServicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonRemoverTipoServicoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonRemoverTipoServicoActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonRemoverTipoServicoKeyPressed

    public void identificarCenario() {

        switch (CENARIO) {

            case Cenario.CADASTRAR:
                preencherComboCargo();
                preencherComboHabilitacao();
                jComboBoxHabilitacaoItemStateChanged(null);
                jComboBoxCargoItemStateChanged(null);
                break;
            case Cenario.ALTERAR:
                setTitle("Alterar Funcionário");
                preencherComboCargo();
                preencherComboHabilitacao();
                setarCamposComInstancia(funcionarioAtual);
                modoSomenteLeitura(false);
                break;
            case Cenario.CONSULTAR:
                setTitle("Consultar Funcionário");
                setarCamposComInstancia(funcionarioAtual);
                modoSomenteLeitura(true);
                jButtonConfirmar.setEnabled(false);
                jButtonCancelar.setText("Sair");
                jButtonLimpar.setEnabled(false);
                break;
            default: //EXCLUIR
                setTitle("Excluir Funcionário");
                jButtonLimpar.setEnabled(false);
                setarCamposComInstancia(funcionarioAtual);
                modoSomenteLeitura(true);
                break;
        }
    }

    public void modoSomenteLeitura(boolean condicao) {
        condicao = !condicao;
        jTextFieldNome.setEditable(condicao);
        jTextFieldEmail.setEditable(condicao);
        jTextFieldBairro.setEditable(condicao);
        jTextFieldCidade.setEditable(condicao);
        jTextFieldEstado.setEditable(condicao);
        jTextFieldLogradouro.setEditable(condicao);
        jTextFieldComplemento.setEditable(condicao);
        jTextFieldNumero.setEditable(condicao);
        jTextFieldEmail.setEditable(condicao);
        jFormattedTextFieldCep.setEditable(condicao);
        jFormattedTextFieldCpf.setEditable(condicao);
        jFormattedTextFieldRg.setEditable(condicao);
        jFormattedTextFieldDataNascimento.setEditable(condicao);
        jFormattedTextFieldTelefone.setEditable(condicao);
        jRadioButtonFeminino.setEnabled(condicao);
        jRadioButtonMasculino.setEnabled(condicao);
        jCheckBoxAcessarSistema.setEnabled(condicao);
        jComboBoxCargo.setEnabled(condicao);
        jComboBoxHabilitacao.setEnabled(condicao);
        jButtonLimpar.setEnabled(condicao);
        jTextFieldUsuario.setEditable(condicao);
        jPasswordFieldSenha.setEditable(condicao);
        jTextFieldUsuario.setEnabled(condicao);
        jPasswordFieldSenha.setEnabled(condicao);
        jTableTiposServicos.setEnabled(condicao);
        jButtonAddTipoServico.setEnabled(condicao);
        jButtonRemoverTipoServico.setEnabled(condicao);
    }

    public void modoConcluido(boolean resposta) {
        jButtonConfirmar.setEnabled(!resposta);
        jButtonCancelar.setText("Sair");
        modoSomenteLeitura(resposta);
    }

    public void setarCamposComInstancia(Funcionario funcionario) {

        jTextFieldNome.setText(funcionario.getNome());
        jFormattedTextFieldCpf.setText(funcionario.getCpf());
        jFormattedTextFieldRg.setText(funcionario.getRg());
        jFormattedTextFieldDataNascimento.setText(funcionario.getDt_nasc("dd/MM/yyyy"));
        jFormattedTextFieldTelefone.setText(funcionario.getTelefone());
        jTextFieldEmail.setText(funcionario.getEmail());
        jComboBoxCargo.setSelectedItem(funcionario.getCargo());
        jComboBoxHabilitacao.setSelectedItem(funcionario.getHabilitacao());

        if (funcionario.getUsuario() != null) {
            jCheckBoxAcessarSistema.setSelected(true);
            jCheckBoxAcessarSistemaActionPerformed(null);
            jTextFieldUsuario.setText(funcionario.getUsuario().getLogin());
            jPasswordFieldSenha.setText(funcionario.getUsuario().getSenha());
        }

        if (funcionario.getSexo() == 'M')
            jRadioButtonMasculino.setSelected(true);

        jTextFieldNumero.setText(funcionario.getEndereco().getNumero());
        jTextFieldComplemento.setText(funcionario.getEndereco().getComplemento());
        preencherEnderecoCep(funcionario.getEndereco().getCep());
        
        funcionario.getTipoServicos().forEach( (tipoServico) -> {
            JTableUtil.addLinha(jTableTiposServicos, tipoServico.toArray());
        });
    }

    public void preencherEnderecoCep(Cep cep) {
        jTextFieldBairro.setText(cep.getLogradouro().getBairro().getNome());
        jTextFieldCidade.setText(cep.getLogradouro().getBairro().getCidade().getNome());
        jTextFieldEstado.setText(cep.getLogradouro().getBairro().getCidade().getEstado().getNome());
        jTextFieldTipoLogradouro.setText(cep.getLogradouro().getTipo());
        jTextFieldLogradouro.setText(cep.getLogradouro().getNome());
        jFormattedTextFieldCep.setText(cep.getNome());
    }

    public void preencherEnderecoWeb(WebServiceCep webServiceCep) {
        jTextFieldBairro.setText(webServiceCep.getBairro());
        jTextFieldCidade.setText(webServiceCep.getCidade());
        jTextFieldTipoLogradouro.setText(webServiceCep.getLogradouroType());
        jTextFieldLogradouro.setText(webServiceCep.getLogradouro());
        jTextFieldEstado.setText(webServiceCep.getUf());
    }

    public void limparEndereco() {
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEstado.setText("");
        jTextFieldTipoLogradouro.setText("");
        jTextFieldLogradouro.setText("");
    }

    public void consultarCep() throws Exception {

        String numeroCep = jFormattedTextFieldCep.getText().replace("-", "");
        cepAtual = ciInterface.getCiGeral().consultarCep(numeroCep);

        if (cepAtual == null) {
            webServiceCep = WebServiceCep.searchCep(numeroCep);

            if (webServiceCep.wasSuccessful()) {
                preencherEnderecoWeb(webServiceCep);
            } else {
                limparEndereco();
                throw new Exception("CEP INVÁLIDO");    
            }
        } else {
            preencherEnderecoCep(cepAtual);
        }
    }

    public void preencherComboCargo() {
        List<Cargo> listaCargos = ciInterface.getCiGeral().consultarCargos();
        jComboBoxCargo.setModel(new DefaultComboBoxModel(listaCargos.toArray()));
    }

    public void preencherComboHabilitacao() {
        List<Habilitacao> listaHabilitacoes = ciInterface.getCiGeral().consultarHabilitacoes();
        jComboBoxHabilitacao.setModel(new DefaultComboBoxModel(listaHabilitacoes.toArray()));
    }

    public void validarCampos(
            String nome, String cpf, String data_nasc, String rg, String telefone, String email,
            String cep, String numero, String usuario, String senha) throws Exception {

        if (nome.equals("") || cpf.equals("")
                || data_nasc.equals("") || rg.equals("")
                || telefone.equals("") || email.equals("")
                || cep.equals("") || numero.equals("")) {
            throw new Exception("Verifique se todos os campos estão preenchidos!");
        }

        if (jCheckBoxAcessarSistema.isSelected() && (usuario.equals("") || senha.equals(""))) {
            jTextFieldUsuario.requestFocus();
            throw new Exception("Favor informar usuário e senha!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddTipoServico;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.ButtonGroup jButtonGroupSexo;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonRemoverTipoServico;
    private javax.swing.JCheckBox jCheckBoxAcessarSistema;
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JComboBox<String> jComboBoxHabilitacao;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldRg;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelHabilitacao;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelAcessarSistema;
    private javax.swing.JPanel jPanelDadosPessoais;
    private javax.swing.JPanel jPanelEndereco;
    private javax.swing.JPanel jPanelLoginTipoServico;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JPanel jPanelTiposServicos;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTiposServicos;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldTipoLogradouro;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
