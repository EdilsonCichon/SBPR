package cih.funcionario;

import javax.swing.ImageIcon;

import cci.CIInterface;
import cci.util.Cenario;
import cdp.Cargo;
import cdp.Funcionario;
import cdp.Habilitacao;
import cdp.Usuario;
import cdp.endereco.Cep;
import csw.WebServiceCep;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JDCadastroFuncionario extends javax.swing.JDialog {

    private CIInterface ciInterface;
    private int CENARIO;
    private boolean resposta;
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
        jCheckBoxAcessarSistema = new javax.swing.JCheckBox();
        jPanelAcessarSistema = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPanelEndereco = new javax.swing.JPanel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelLogradouro = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
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
        jRadioButtonFeminino.setText("Feminino");

        jButtonGroupSexo.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setSelected(true);
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

        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Atendente", "Motorista", "Mecânico", " " }));
        jComboBoxCargo.setSelectedIndex(1);
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

        jCheckBoxAcessarSistema.setText("Permitir Acesso ao Sistema");
        jCheckBoxAcessarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAcessarSistemaActionPerformed(evt);
            }
        });

        jPanelAcessarSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Acesso ao Sistema"));

        jLabelUsuario.setText("Usuário:");

        jTextFieldUsuario.setEnabled(false);

        jLabelSenha.setText("Senha:");

        jPasswordFieldSenha.setEnabled(false);

        javax.swing.GroupLayout jPanelAcessarSistemaLayout = new javax.swing.GroupLayout(jPanelAcessarSistema);
        jPanelAcessarSistema.setLayout(jPanelAcessarSistemaLayout);
        jPanelAcessarSistemaLayout.setHorizontalGroup(
            jPanelAcessarSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAcessarSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAcessarSistemaLayout.setVerticalGroup(
            jPanelAcessarSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAcessarSistemaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAcessarSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout jPanelDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelDadosPessoais);
        jPanelDadosPessoais.setLayout(jPanelDadosPessoaisLayout);
        jPanelDadosPessoaisLayout.setHorizontalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
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
                                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                                .addComponent(jLabelHabilitacao)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBoxHabilitacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jCheckBoxAcessarSistema)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanelAcessarSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAcessarSistema)
                .addGap(5, 5, 5)
                .addComponent(jPanelAcessarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        getContentPane().add(jPanelDadosPessoais);

        jPanelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabelNumero.setText("Nº:");

        jLabelLogradouro.setText("Logradouro:");

        jLabelBairro.setText("Bairro:");

        jLabelCep.setText("CEP:");

        jLabelCidade.setText("Cidade:");

        jLabelEstado.setText("UF:");

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

        javax.swing.GroupLayout jPanelEnderecoLayout = new javax.swing.GroupLayout(jPanelEndereco);
        jPanelEndereco.setLayout(jPanelEnderecoLayout);
        jPanelEnderecoLayout.setHorizontalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBairro)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabelComplemento)
                    .addComponent(jLabelLogradouro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldLogradouro)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jTextFieldCidade))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabelNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabelEstado)
                                .addGap(9, 9, 9)))
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(jTextFieldNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanelEnderecoLayout.setVerticalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogradouro)
                    .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBairro)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCep)
                    .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(84, Short.MAX_VALUE))
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
        boolean isEnabled = jTextFieldUsuario.isEnabled();
        jTextFieldUsuario.setEnabled(!isEnabled);
        jPasswordFieldSenha.setEnabled(!isEnabled);
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

        String cep = webServiceCep.getCep();
        String numero = jTextFieldNumero.getText();
        String tipoLogradouro = webServiceCep.getLogradouroType();
        String logradouro = webServiceCep.getLogradouro();
        String bairro = webServiceCep.getBairro();
        String cidade = webServiceCep.getCidade();
        String estado = webServiceCep.getUf();
        String complemento = jTextFieldComplemento.getText();

        try {

            validarCampos(nome, cpf, data_nasc, rg, telefone, email, cep, numero, login, senha);

            switch (CENARIO) {

                case Cenario.CADASTRAR: {

                    Usuario usuario = null;
                    if (jCheckBoxAcessarSistema.isSelected()) {
                        usuario = ciInterface.getCiFuncionario().instanciarUsuario(login, senha);
                    }

                    resposta = ciInterface.getCiFuncionario().cadastrarFuncionario(
                            nome, cpf, rg, email, data_nasc, telefone, sexo, cargo,
                            habilitacao, usuario, cep, logradouro, numero,
                            bairro, cidade, estado, tipoLogradouro, complemento, cepAtual);

                    if (resposta) {
                        modoConcluido(resposta);
                    }

                    break;
                }
                case Cenario.CONSULTAR:
                    this.dispose();
                    break;

                case Cenario.ALTERAR:
                    resposta = ciInterface.getCiFuncionario().alterarFuncionario(funcionarioAtual,
                            nome, cpf, rg, email, data_nasc, telefone, sexo, cargo,
                            habilitacao, login, senha, cep, logradouro, numero,
                            bairro, cidade, estado, tipoLogradouro, complemento, cepAtual);

                    if (resposta) {
                        modoConcluido(resposta);
                    }

                case Cenario.EXCLUIR:
                    JOptionPane.showConfirmDialog(this, "Confirmar Exclusão ?", "Excluir", WIDTH);
                    resposta = ciInterface.getCiFuncionario().excluirFuncionario(funcionarioAtual);
                    if (resposta) {
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

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String cepp = jFormattedTextFieldCep.getText();
            cepAtual = ciInterface.getCiGeral().consultarCep(cepp);
            
            if (cepAtual == null) {
                webServiceCep = WebServiceCep.searchCep(cepp);
                
                if (webServiceCep.wasSuccessful()) 
                    preencherEnderecoWeb(webServiceCep);
                else
                    JOptionPane.showMessageDialog(this, "CEP INVÁLIDO");
                    limparEndereco();
            }else{
                preencherEnderecoCep(cepAtual);
            }
        }
    }//GEN-LAST:event_jFormattedTextFieldCepKeyPressed

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
                modoSomenteLeitura(true);
                setarCamposComInstancia(funcionarioAtual);
                jButtonConfirmar.setEnabled(false);
                jButtonCancelar.setText("Sair");
                jButtonLimpar.setEnabled(false);
                break;
            default: //EXCLUIR
                setTitle("Excluir Funcionário");
                jButtonLimpar.setEnabled(false);
                modoSomenteLeitura(true);
                setarCamposComInstancia(funcionarioAtual);
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
            jCheckBoxAcessarSistemaActionPerformed(null);
            jTextFieldUsuario.setText(funcionario.getUsuario().getLogin());
            jPasswordFieldSenha.setText(funcionario.getUsuario().getSenha());
        }

        if (funcionario.getSexo() == 'M') {
            jRadioButtonMasculino.setSelected(true);
        }

        jTextFieldNumero.setText(funcionario.getEndereco().getNumero());
        jTextFieldComplemento.setText(funcionario.getEndereco().getComplemento());
        preencherEnderecoCep(funcionario.getEndereco().getCep());
    }
    
    public void preencherEnderecoCep(Cep cep){
        jTextFieldBairro.setText(cep.getLogradouro().getBairro().getNome());
        jTextFieldCidade.setText(cep.getLogradouro().getBairro().getCidade().getNome());
        jTextFieldEstado.setText(cep.getLogradouro().getBairro().getCidade().getEstado().getNome());
        jTextFieldLogradouro.setText(cep.getLogradouro().toString());
        jFormattedTextFieldCep.setText(cep.getNome());
    }

    public void preencherEnderecoWeb(WebServiceCep webServiceCep) {
        jTextFieldBairro.setText(webServiceCep.getBairro());
        jTextFieldCidade.setText(webServiceCep.getCidade());
        jTextFieldLogradouro.setText(webServiceCep.getLogradouroFull());
        jTextFieldEstado.setText(webServiceCep.getUf());
    }
    
    public void limparEndereco(){
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEstado.setText("");
        jTextFieldLogradouro.setText("");
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
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.ButtonGroup jButtonGroupSexo;
    private javax.swing.JButton jButtonLimpar;
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
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
