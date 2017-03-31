/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import windows.FrmValidarAcesso;
import windows.JPCrud;
import windows.JPServico;
import windows.funcionario.JDCadastroFuncionario;
import windows.produtor.JDCadastroProdutor;
import windows.produtor.JDPesquisaProdutor;
import windows.propriedade.JDCadastroPropriedade;
import windows.propriedade.JDPesquisaPropriedade;
import windows.servico.JDCadastroServico;
import windows.servico.JDPesquisaServico;
import javax.swing.UnsupportedLookAndFeelException;
import windows.tipoServico.JDCadastroTipoServico;
import windows.tipoServico.JDPesquisaTipoServico;
import windows.funcionario.JDPesquisaFuncionario;

/**
 *
 * @author Chrysthian
 */
public class ControladoraInterfaces {

    public static void main(String args[]){

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }   
        }catch(InstantiationException e){
            
        }catch (ClassNotFoundException e){
            
        }catch (IllegalAccessException e){
            
        }catch(UnsupportedLookAndFeelException e){
            
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmValidarAcesso().setVisible(true);
            }   
        });
    }
    
    public static void identificarInicio(JFrame pai, int codInicio, int codCrud) {

        switch (codInicio) {

            case 0: gerenciarServico(codCrud, pai); break;
            case 1: gerenciarProdutor(codCrud, pai); break;
            case 2: gerenciarPropriedade(codCrud, pai); break;
            case 3: gerenciarMaquina(codCrud, pai); break;
            case 4: gerenciarFuncionario(codCrud, pai); break;
            case 5: gerenciarTipoServico(codCrud, pai); break;
            case 6: gerenciarTipoMaquina(codCrud, pai); break;
            default: break;
        }
    }

    public static void gerenciarServico(int codCrud, JFrame pai) {

        if (codCrud == 0) {
            JDCadastroServico agendarServico = new JDCadastroServico(pai, true);
            agendarServico.setVisible(true);
        } else if (codCrud == 1) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, codCrud);
            consultarServico.setVisible(true);
        } else if (codCrud == 2) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, codCrud);
            consultarServico.setVisible(true);
        } else if (codCrud == 3) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, codCrud);
            consultarServico.setVisible(true);
        } else if (codCrud == 4) {
            JDPesquisaServico consultarServico = new JDPesquisaServico(pai, true, codCrud);
            consultarServico.setVisible(true);
        }
    }

    public static void gerenciarTipoServico(int codCrud, JFrame pai) {
        JDCadastroTipoServico cadastroTipoServico;
        JDPesquisaTipoServico pesquisaTipoServico;

        if (codCrud == 0) {
            cadastroTipoServico = new JDCadastroTipoServico(pai, true);
            cadastroTipoServico.setVisible(true);
        } else if (codCrud > 0) {
            pesquisaTipoServico = new JDPesquisaTipoServico(pai, true);
            pesquisaTipoServico.setVisible(true);
        }
//        } else if (codCrud == 2) {
//            pesquisaFuncionario = new JDPesquisaFuncionario(pai, true);
//            pesquisaFuncionario.setVisible(true);
//        } else if (codCrud == 3) {
//            pesquisaFuncionario = new JDPesquisaFuncionario(pai, true);
//            pesquisaFuncionario.setVisible(true);
//        }
    }
    
    public static void gerenciarProdutor(int codCrud, JFrame pai) {
        
        JDCadastroProdutor cadastroProdutor;
        JDPesquisaProdutor pesquisaProdutor;

        if (codCrud == 0) {
            cadastroProdutor = new JDCadastroProdutor(pai, true);
            cadastroProdutor.setVisible(true);
        } else if (codCrud == 1) {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true);
            pesquisaProdutor.setVisible(true);
        } else if (codCrud == 2) {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true);
            pesquisaProdutor.setVisible(true);
        } else if (codCrud == 3) {
            pesquisaProdutor = new JDPesquisaProdutor(pai, true);
            pesquisaProdutor.setVisible(true);
        }
    }

    public static void gerenciarPropriedade(int codCrud, JFrame pai) {
        
        JDCadastroPropriedade cadastroPropriedade;
        JDPesquisaPropriedade pesquisaPropriedade;
        
        if (codCrud == 0) {
            cadastroPropriedade = new JDCadastroPropriedade(pai, true);
            cadastroPropriedade.setVisible(true);
        } else if (codCrud == 1) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true);
            pesquisaPropriedade.setVisible(true);
        } else if (codCrud == 2) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true);
            pesquisaPropriedade.setVisible(true);
        } else if (codCrud == 3) {
            pesquisaPropriedade = new JDPesquisaPropriedade(pai, true);
            pesquisaPropriedade.setVisible(true);
        }

    }

    public static void gerenciarMaquina(int codCrud, JFrame pai) {

    }

    public static void gerenciarFuncionario(int codCrud, JFrame pai) {
        
        JDCadastroFuncionario cadastroFuncionario;
        JDPesquisaFuncionario pesquisaFuncionario;

        if (codCrud == 0) {
            cadastroFuncionario = new JDCadastroFuncionario(pai, true);
            cadastroFuncionario.setVisible(true);
        } else if (codCrud > 0) {
            pesquisaFuncionario = new JDPesquisaFuncionario(pai, true);
            pesquisaFuncionario.setVisible(true);
        }
//        } else if (codCrud == 2) {
//            pesquisaFuncionario = new JDPesquisaFuncionario(pai, true);
//            pesquisaFuncionario.setVisible(true);
//        } else if (codCrud == 3) {
//            pesquisaFuncionario = new JDPesquisaFuncionario(pai, true);
//            pesquisaFuncionario.setVisible(true);
//        }
    }

    public static void gerenciarTipoMaquina(int codCrud, JFrame pai) {

    }

    public static void iniciarCrud(int codInicio, JPCrud crud) {

        switch (codInicio) {

            case 1: setarAtributosCrud(crud, "Produtores", "produtor"); break;
            case 2: setarAtributosCrud(crud, "Propriedades", "propriedade"); break;
            case 3: setarAtributosCrud(crud, "Máquinas", "maquina"); break;
            case 4: setarAtributosCrud(crud, "Funcionários", "funcionario"); break;
            case 5: setarAtributosCrud(crud, "Tipos de Serviço", "servico"); break;
            case 6: setarAtributosCrud(crud, "Tipos de Máquina", "maquina"); break;
            default: break;
        }
    }
    
    public static void setarAtributosCrud(JPCrud crud, String titulo, String tipo){
 
        crud.setIconCadastrar(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-cadastrar-reduzido.png"));
        crud.setIconAlterar(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-alterar-reduzido.png"));
        crud.setIconConsultar(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-consultar-reduzido.png"));
        crud.setIconExcluir(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-excluir-reduzido.png"));
        crud.setBorder(BorderFactory.createTitledBorder("Gerenciar " +titulo));
    }
    
    public static void setarAtributosServico(JPServico serv, String titulo, String tipo){
 
        serv.setIconAgendar(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-cadastrar-reduzido.png"));
        serv.setIconAlterar(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-alterar-reduzido.png"));
        serv.setIconConsultar(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-consultar-reduzido.png"));
        serv.setIconConcluir(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-concluido-reduzido.png"));
        serv.setIconCancelar(new ImageIcon("build/classes/windows/icones/icone-" +tipo + "-excluir-reduzido.png"));
        serv.setBorder(BorderFactory.createTitledBorder("Gerenciar " +titulo));
    }
}
