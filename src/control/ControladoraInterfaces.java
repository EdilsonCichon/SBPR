/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import windows.JPCrud;
import windows.produtor.JDCadastroProdutor;
import windows.propriedade.JDCadastrarPropriedade;
import windows.servico.JDAgendarServico;
import windows.servico.JDConsultarServico;

/**
 *
 * @author Chrysthian
 */
public class ControladoraInterfaces {

    public static void identificarInicio(JFrame pai, int codInicio, int codCrud) {

        switch (codInicio) {

            case 0:
                gerenciarServico(codCrud, pai);
                break;
            case 1:
                gerenciarProdutor(codCrud, pai);
                break;
            case 2:
                gerenciarPropriedade(codCrud, pai);
                break;
            case 3:
                gerenciarMaquina(codCrud, pai);
                break;
            case 4:
                gerenciarFuncionario(codCrud, pai);
                break;
            case 5:
                gerenciarTipoServico(codCrud, pai);
                break;
            case 6:
                gerenciarTipoMaquina(codCrud, pai);
                break;
            default:
                break;
        }
    }

    public static void gerenciarServico(int codCrud, JFrame pai) {

        if (codCrud == 0) {
            JDAgendarServico agendarServico = new JDAgendarServico(pai, true);
            agendarServico.setVisible(true);
        } else if (codCrud == 1) {
            JDConsultarServico consultarServico = new JDConsultarServico(pai, true);
            consultarServico.setVisible(true);
        } else if (codCrud == 2) {
            JDConsultarServico consultarServico = new JDConsultarServico(pai, true);
            consultarServico.setVisible(true);
        } else if (codCrud == 3) {
            JDConsultarServico consultarServico = new JDConsultarServico(pai, true);
            consultarServico.setVisible(true);
        } else if (codCrud == 4) {
            JDConsultarServico consultarServico = new JDConsultarServico(pai, true);
            consultarServico.setVisible(true);
        }
    }

    public static void gerenciarProdutor(int codCrud, JFrame pai) {

        if (codCrud == 0) {

            JDCadastroProdutor cadastroProdutor = new JDCadastroProdutor(pai, true);
            cadastroProdutor.setVisible(true);

        } else if (codCrud == 1) {

        } else if (codCrud == 2) {

        } else if (codCrud == 3) {

        }
    }

    public static void gerenciarPropriedade(int codCrud, JFrame pai) {

    }

    public static void gerenciarMaquina(int codCrud, JFrame pai) {

    }

    public static void gerenciarFuncionario(int codCrud, JFrame pai) {

    }

    public static void gerenciarTipoServico(int codCrud, JFrame pai) {

    }

    public static void gerenciarTipoMaquina(int codCrud, JFrame pai) {

    }

    public static void setarTitulo(int codInicio, JPCrud crud) {

        switch (codInicio) {

            case 1:
                crud.setBorder(BorderFactory.createTitledBorder("Gerenciar Produtores"));
                break;
            case 2:
                crud.setBorder(BorderFactory.createTitledBorder("Gerenciar Propriedades"));
                break;
            case 3:
                crud.setBorder(BorderFactory.createTitledBorder("Gerenciar Máquinas"));
                break;
            case 4:
                crud.setBorder(BorderFactory.createTitledBorder("Gerenciar Funcionários"));
                break;
            case 5:
                crud.setBorder(BorderFactory.createTitledBorder("Gerenciar Tipos de Serviços"));
                break;
            case 6:
                crud.setBorder(BorderFactory.createTitledBorder("Gerenciar Tipos de Máquinas"));
                break;
            default:
                break;
        }
    }
}
