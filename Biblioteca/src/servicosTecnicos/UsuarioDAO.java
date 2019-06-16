/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicosTecnicos;

import dominio.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Vinicius
 */
public class UsuarioDAO {
    Conexao con;
    public UsuarioDAO(){
        con = new Conexao(); 
    }

    public Usuario consultarUsuario(int cpf){
        Usuario usuario = null;
        String sql = "SELECT * FROM usuario WHERE cpf = '"+cpf+"' LIMIT 1";
        try{
            Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stm.execute(sql);
            ResultSet rs = stm.getResultSet();
            if(rs.next())
                usuario = new Usuario(rs.getInt("id_usuario"), rs.getString("telefone"), 
                        Integer.toString(cpf), rs.getString("nm_usuario"), 
                        rs.getDate("dt_nascimento"), rs.getBoolean("status"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.fechaConexao();
        }
        return usuario;
    }
}
