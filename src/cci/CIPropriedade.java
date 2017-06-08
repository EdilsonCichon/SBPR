package cci;

import cdp.Produtor;
import cdp.Propriedade;
import cgt.GTPropriedade;
import cci.util.Cenario;
import cih.propriedade.JDCadastroPropriedade;
import cih.propriedade.JDPesquisaPropriedade;
import java.awt.Frame;
import javax.swing.JFrame;
import java.util.List;
import javax.swing.JOptionPane;

public class CIPropriedade {

    private CIInterface ciInterface;
    private GTPropriedade gtPropriedade;
    private JDCadastroPropriedade cadastroPropriedade;
    private JDPesquisaPropriedade pesquisaPropriedade;

    public CIPropriedade(CIInterface ciInterface) {
        this.ciInterface = ciInterface;
        gtPropriedade = new GTPropriedade();
    }

    public void gerenciarPropriedade(int CENARIO, JFrame pai) {

        if (CENARIO == Cenario.CADASTRAR)
            instanciarTelaCadastroPropriedade(null, pai, CENARIO);
        else
            instanciarTelaFiltroPropriedade(pai, CENARIO);
    }

    public void instanciarTelaCadastroPropriedade(Propriedade propriedade, Frame pai, int CENARIO) {
        cadastroPropriedade = new JDCadastroPropriedade(pai, true, ciInterface, CENARIO, propriedade);
        cadastroPropriedade.setVisible(true);
    }

    public void instanciarTelaFiltroPropriedade(Frame pai, int CENARIO) {
        pesquisaPropriedade = new JDPesquisaPropriedade(pai, true, ciInterface, CENARIO);
        pesquisaPropriedade.setVisible(true);
    }

    public boolean cadastrarPropriedade(Produtor responsavel, String nome, String referencia) {

        try {
            gtPropriedade.cadastrarPropriedade(responsavel, nome, referencia);
            JOptionPane.showMessageDialog(null, "Cadastrada com sucesso!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
            return false;
        }
    }

    public Propriedade instanciarPropriedadeVazia(Produtor produtor) {
        return gtPropriedade.instanciarPropriedadeVazia(produtor);
    }

    public boolean alterarPropriedade(Propriedade propriedade, Produtor produtorSelecionado) {
        try {
            gtPropriedade.alterarPropriedade(propriedade, produtorSelecionado);
            JOptionPane.showMessageDialog(cadastroPropriedade, "Alterada com sucesso!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(cadastroPropriedade, "Erro ao alterar: " + e.getMessage());
            return false;
        }
    }

    public boolean excluirPropriedade(Propriedade propriedade) {
        try {
            gtPropriedade.excluirPropriedade(propriedade);
            JOptionPane.showMessageDialog(null, "Propriedade excluída com sucesso");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir propriedade: " + e.getMessage());
            return false;
        }
    }

    public List<Propriedade> filtrarPropriedades(String colunaFiltro, String filtro) {
        return gtPropriedade.filtrarPropriedades(colunaFiltro, filtro);
    }
    
    public List<Propriedade> filtrarPorProdutor(String colunaFiltro, int filtro) {
        return gtPropriedade.filtrarPorProdutor(colunaFiltro, filtro);
    }
  
}