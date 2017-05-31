import cgt.util.ValidaCampos;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidacaoTest {
    
    public ValidacaoTest() {}
    
     @Test
     public void validarCpfCorreto() {
         assertTrue( ValidaCampos.validarCpf("13953108743") );
     }
     
     @Test
     public void validarCpfIncorreto() {
         assertFalse(ValidaCampos.validarCpf("23953108744") );
     }
     
     @Test
     public void validarRgCorreto() {
         assertTrue( ValidaCampos.validarRg("3177905") );
     }
     
     @Test
     public void validarRgIncorreto() {
         assertFalse(ValidaCampos.validarRg("13953108743") );
     }
     
     @Test
     public void validarTelefoneCorreto() {
         assertTrue( ValidaCampos.validarTelefone("27998423044") );
     }
     
     @Test
     public void validarTelefoneIncorreto() {
         assertFalse(ValidaCampos.validarTelefone("279984230") );
     }
     
     @Test
     public void validarNomeCorreto() {
         assertTrue( ValidaCampos.validarNome("Edilson Cichon") );
     }
     
     @Test
     public void validarNomeVazio() {
         assertFalse(ValidaCampos.validarNome("") );
     }
}
