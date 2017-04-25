
package cih.servico;

import javax.swing.ImageIcon;
import cci.CIInterface;

public class JDPesquisaServico extends javax.swing.JDialog {
    
    private CIInterface ciInterface;
    
    public JDPesquisaServico(java.awt.Frame parent, boolean modal, CIInterface ciInterface) {
        super(parent, modal);
        this.ciInterface = ciInterface;
        initComponents();
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPesquisarProdutor = new javax.swing.JPanel();
        jTextFieldNomeProdutor = new javax.swing.JTextField();
        jLabelFiltrarPor = new javax.swing.JLabel();
        jComboBoxChavePesquisa = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableResultadoProdutor = new javax.swing.JTable();
        jPanelSelecaoPropriedade = new javax.swing.JPanel();
        jLabelPropriedade = new javax.swing.JLabel();
        jComboBoxSelecaoPropriedade = new javax.swing.JComboBox<>();
        jPanelPesquisarServico = new javax.swing.JPanel();
        jLabelTipoServico = new javax.swing.JLabel();
        jComboBoxSelecaoServico = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableResultadoServico = new javax.swing.JTable();
        jPanelRodape = new javax.swing.JPanel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtro de Serviço");

        jPanelPesquisarProdutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtor"));

        jLabelFiltrarPor.setText("Filtrar por:");

        jComboBoxChavePesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF", "RG" }));
        jComboBoxChavePesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxChavePesquisaActionPerformed(evt);
            }
        });

        jTableResultadoProdutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "RG", "Data Nasc."
            }
        ));
        jScrollPane2.setViewportView(jTableResultadoProdutor);

        javax.swing.GroupLayout jPanelPesquisarProdutorLayout = new javax.swing.GroupLayout(jPanelPesquisarProdutor);
        jPanelPesquisarProdutor.setLayout(jPanelPesquisarProdutorLayout);
        jPanelPesquisarProdutorLayout.setHorizontalGroup(
            jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarProdutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(jPanelPesquisarProdutorLayout.createSequentialGroup()
                        .addComponent(jLabelFiltrarPor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxChavePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeProdutor)))
                .addContainerGap())
        );
        jPanelPesquisarProdutorLayout.setVerticalGroup(
            jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarProdutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFiltrarPor)
                    .addComponent(jComboBoxChavePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSelecaoPropriedade.setBorder(javax.swing.BorderFactory.createTitledBorder("Propriedade"));

        jLabelPropriedade.setText("Propriedade:");

        jComboBoxSelecaoPropriedade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a propriedade...", "Propriedade 1" }));

        javax.swing.GroupLayout jPanelSelecaoPropriedadeLayout = new javax.swing.GroupLayout(jPanelSelecaoPropriedade);
        jPanelSelecaoPropriedade.setLayout(jPanelSelecaoPropriedadeLayout);
        jPanelSelecaoPropriedadeLayout.setHorizontalGroup(
            jPanelSelecaoPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelecaoPropriedadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPropriedade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSelecaoPropriedade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelSelecaoPropriedadeLayout.setVerticalGroup(
            jPanelSelecaoPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelecaoPropriedadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSelecaoPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPropriedade)
                    .addComponent(jComboBoxSelecaoPropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPesquisarServico.setBorder(javax.swing.BorderFactory.createTitledBorder("Serviço"));

        jLabelTipoServico.setText("Tipo de Serviço:");

        jComboBoxSelecaoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Serviço...", "Patrolagem", "Escavação", "Arado" }));

        jTableResultadoServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo do Serviço", "Data Conclusão", "Tempo previsto", "Situação"
            }
        ));
        jScrollPane3.setViewportView(jTableResultadoServico);

        javax.swing.GroupLayout jPanelPesquisarServicoLayout = new javax.swing.GroupLayout(jPanelPesquisarServico);
        jPanelPesquisarServico.setLayout(jPanelPesquisarServicoLayout);
        jPanelPesquisarServicoLayout.setHorizontalGroup(
            jPanelPesquisarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanelPesquisarServicoLayout.createSequentialGroup()
                        .addComponent(jLabelTipoServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSelecaoServico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPesquisarServicoLayout.setVerticalGroup(
            jPanelPesquisarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarServicoLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanelPesquisarServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoServico)
                    .addComponent(jComboBoxSelecaoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelRodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.setMaximumSize(new java.awt.Dimension(105, 23));
        jButtonConfirmar.setMinimumSize(new java.awt.Dimension(105, 23));
        jButtonConfirmar.setPreferredSize(new java.awt.Dimension(105, 23));

        jButtonCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanelRodapeLayout = new javax.swing.GroupLayout(jPanelRodape);
        jPanelRodape.setLayout(jPanelRodapeLayout);
        jPanelRodapeLayout.setHorizontalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPesquisarProdutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelSelecaoPropriedade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPesquisarServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRodape, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPesquisarProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSelecaoPropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPesquisarServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxChavePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxChavePesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxChavePesquisaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JComboBox<String> jComboBoxChavePesquisa;
    private javax.swing.JComboBox<String> jComboBoxSelecaoPropriedade;
    private javax.swing.JComboBox<String> jComboBoxSelecaoServico;
    private javax.swing.JLabel jLabelFiltrarPor;
    private javax.swing.JLabel jLabelPropriedade;
    private javax.swing.JLabel jLabelTipoServico;
    private javax.swing.JPanel jPanelPesquisarProdutor;
    private javax.swing.JPanel jPanelPesquisarServico;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JPanel jPanelSelecaoPropriedade;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableResultadoProdutor;
    private javax.swing.JTable jTableResultadoServico;
    private javax.swing.JTextField jTextFieldNomeProdutor;
    // End of variables declaration//GEN-END:variables
}
