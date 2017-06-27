
import cci.CIProdutor;
import cdp.Produtor;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class CIProdutorTest {
    CIProdutor ciProdutor;
            
    public CIProdutorTest() {
        ciProdutor = new CIProdutor(null);
    }
    
    @Test
    public void testCadastrarDadosCorretos() {
        Produtor produtorEsperado = new Produtor("Moizes", "13953108743", new Date("10/10/1992"), "1234567891", "5463405", "12345678911", 'M');
//        Produtor produtor = ciProdutor.cadastrarProdutor("Moizes", "13953108743", "10/10/1992", "1234567891", "5463405", "12345678911", 'M');
        
        //FAZER UMA BUSCA PRA VERIFICAR SE ESTÁ NO BANCO.
        
//        assertEquals(produtorEsperado, produtor);
    }
    
    @Test
    public void testCadastrarDadosIncorretos() {
//        Produtor produtor = ciProdutor.cadastrarProdutor("Moizes", "23953108743", "1992/10/10", "1234567890", "4463405", "12345678910", 'M');
//        assertNull(produtor);
    }
    
    @Test
    public void testAlterar() {
        
    }
    
    @Test
    public void testConsultar() {
        List<Produtor> listaConsultada = ciProdutor.filtrarProdutor("CPF", "");
        assertNotNull(listaConsultada);
    }
    
    @Test
    public void testExcluir() {
        Produtor produtorCadastrado = new Produtor("Moizes", "13953108743", new Date("10/10/1992"), "1234567890", "4463405", "12345678910", 'M');
        //assertTrue( ciProdutor.excluirProdutor(produtorCadastrado) );
//        assertTrue( ciProdutor.excluirProdutor(produtorCadastrado) );
        // Testar outros fluxos alternativos desse caso de uso...
    }
}
