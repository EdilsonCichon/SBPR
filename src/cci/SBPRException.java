package cci;

public class SBPRException extends Exception {

    int codErro;
    String [] msgsErro;

    public SBPRException(int cod) {
        
        super("SBPR erro genérico.");
        msgsErro = new String[500];
        this.codErro = cod;

        msgsErro[0] = "Código de erro inválido!";
        
        // Erros de produtor: 1-19
        msgsErro[1] = "Campo NOME inválido";
        msgsErro[2] = "Campo CPF inválido";
        msgsErro[3] = "Campo DATA inválido";  
        
    }
    
    @Override
    public String getMessage() {        
        return msgsErro[codErro];
    }  
}
