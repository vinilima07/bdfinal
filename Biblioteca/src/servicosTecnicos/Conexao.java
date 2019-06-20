package servicosTecnicos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    private Connection con= null;

    public Conexao(){
        try {
            Class.forName( "org.postgresql.Driver" );
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/biblioteca", "sistema", "123");
        } 
        catch (SQLException e) {
            System.out.println("Erro na conexao");
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada");
            e.printStackTrace();
        }
    }

    public void fechaConexao(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getCon() {
        return con;
    }
}
