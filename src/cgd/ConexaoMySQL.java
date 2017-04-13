/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Chrysthian
 */
public class ConexaoMySQL {

    private static Connection conexao;

    public static Connection getConexao() throws ClassNotFoundException, SQLException {
        
        String url = "";
        String login = "root";
        String senha = "root";
        String ip = "172.16.32.55:3306"; 
        String nomeBanco = "jeanxfome";
        
        // jdbc:mysql://ip:porta/nome do banco
        url = "jdbc:mysql://" + ip + "/" + nomeBanco;
        
        
        Class.forName("com.mysql.jdbc.Driver");
        conexao = DriverManager.getConnection(url, login, senha);
        return conexao;
    }
    
}
