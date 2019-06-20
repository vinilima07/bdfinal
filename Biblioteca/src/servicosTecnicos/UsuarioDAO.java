package servicosTecnicos;

import dominio.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO {
    private Conexao con;
    
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
    
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        String sql = "SELECT * FROM usuario";
        try {
            Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stm.execute(sql);
            ResultSet rs = stm.getResultSet();
            
            while(rs.next()) {
                usuarios.add(new Usuario(rs.getInt("id_usuario"), rs.getString("telefone"), rs.getString("cpf"), rs.getString("nm_usuario"), rs.getDate("dt_nascimento"), rs.getBoolean("status")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.fechaConexao();
        }
        
        return usuarios;
    }
}
