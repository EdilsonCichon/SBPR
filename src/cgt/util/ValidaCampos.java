package cgt.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ValidaCampos {
    
    public static boolean validarCpf(String cpf) {
      
        char digito_1, digito_2;
        
        int soma, posicao, resto, peso, posicaoAtual;
        
        if (cpf == null || cpf.length() != 11 || (cpfPadrao(cpf))){
            return false;
        }
        
        try { 
            
            soma = 0; peso = 10; resto = 0;
            
            for (posicao = 0; posicao < 9; posicao++) {
                posicaoAtual = (int)(cpf.charAt(posicao) - 48);
                soma = soma + (posicaoAtual * peso);
                peso--;
            }
            
            // VALIDAÇÃO DO PRIMEIRO DIGITO
            
            resto = (int) ((soma * 10) % 11);
            
            if ((resto == 10) || (resto == 11)){
                digito_1 = '0';
            }else {
                digito_1 = (char)(resto + 48);
            }
           
            soma = 0; peso = 11; resto = 0;
            
            for(posicao = 0; posicao < 10; posicao++) {
                posicaoAtual = (int)(cpf.charAt(posicao) - 48);
                soma = soma + (posicaoAtual * peso);
                peso--;
            }

            // VALIDAÇÃO DO SEGUNDO DIGITO
            
            resto = (int) ((soma * 10) % 11);
            
            if ((resto == 10) || (resto == 11)){
                digito_2 = '0';
            }else {
                digito_2 = (char)(resto + 48);
            }
            
            if ((digito_1 == cpf.charAt(9)) && (digito_2 == cpf.charAt(10))){
                return true;
            }else{
                return false;
            }
        } catch (InputMismatchException erro) {
            return(false);
        }
    }
   
    private static boolean cpfPadrao(String cpf) {
        
        String s = "";
        for(int posicao = 0; posicao < 10; posicao++){
            String str = String.valueOf(posicao);
             s = str + str + str + str + str + str + str + str + str + str + str;
            if(cpf.equals(s)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean validarNome(String nome){

        if (nome.equals("")) 
            return false;
        if (!validarPadraoNome(nome, "[!-@]"))
            return false;
        
        return true;
    }
    
    public static boolean validarPadraoNome(String nome, String pattern){
        
        Pattern padrao;
        Matcher cambinacao;
        
        padrao = Pattern.compile(pattern);
        cambinacao = padrao.matcher(nome);
        
        if (cambinacao.find()) {
            return false;
        }
        
        return true;
    }

    public static boolean validarDataNasc(String data_nasc) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        formato.setLenient(false);
        try {
            data = (Date) formato.parse(data_nasc);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public static boolean validarRg(String rg){
        if ( rg.length() == 7 )
            return true;
        return false;
    }
    
    public static boolean validarTelefone(String telefone){
        if(telefone.length() == 11)    
            return true;
        return false;
    }
    
    public static boolean validarInscricaoEstadual(String inscricao){
        if(inscricao.length() == 10)    
            return true;
        return false;
    }
}
