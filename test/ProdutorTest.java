import cdp.Produtor;
import cgd.GDProdutor;
import cgt.GTProdutor;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutorTest {
    
    GTProdutor gtProdutor;
    GDProdutor gdProdutor;
            
    public ProdutorTest() {
        gtProdutor = new GTProdutor();
        gdProdutor = new GDProdutor();
    }
    
    @Test
    public void testCadastrarDadosCorretos(){  
        Produtor produtorCadastrado = null;
        Produtor produtorBanco = null; 
        try {
            produtorCadastrado = gtProdutor.cadastrarProdutor("Teste", "17624769670", "10/10/1992", "1234567891", "5463405", "12345678911", 'M');
            produtorBanco = gdProdutor.filtrarProdutorUnico("CPF", "17624769670");
            assertEquals(produtorCadastrado, produtorBanco);
        } catch (Exception ex) {
            if(produtorBanco == null){
                System.out.println("NAO CADASTROU NO BANCO");    
            }
        }
    }
    
    @Test
    public void testCadastrarDadosIncorretos() {
        Produtor produtor = null;
        try {
            produtor = gtProdutor.cadastrarProdutor("Moizes", "12345678911", "1992/10/10", "1234567890", "4463405", "12345678910", 'M');
        } catch (Exception ex) {
        }
        assertNull(produtor);
    }
    
    @Test
    public void testAlterar() {
        
    }
    
    @Test
    public void testConsultar() {
        List<Produtor> listaConsultada = gtProdutor.filtrarProdutor("CPF", "");
        assertNotNull(listaConsultada);
    }
    
    @Test
    public void testExcluir() {
        Produtor produtorCadastrado = new Produtor("Teste", "13953108743", new Date("10/10/1992"), "1234567890", "4463405", "12345678910", 'M');
    }
}
