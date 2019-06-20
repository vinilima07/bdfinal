package servicosTecnicos;

import dominio.Autor;
import dominio.Autoria;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AutoriaDAO {
    private Conexao con;
    
    public AutoriaDAO(){
        con = new Conexao();
    }
    
    public Autor consultaAutor(int id_livro) {
        Autor autor = new Autor();
        String sql = "SELECT * FROM autor NATURAL JOIN autoria WHERE id_livro = "+id_livro+" LIMIT 1";
        try {
            Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stm.execute(sql);
            ResultSet rs = stm.getResultSet();
            while(rs.next()) {
                autor = new Autor(rs.getInt("id_autor"), rs.getString("nm_autor"), rs.getString("nm_citacao"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.fechaConexao();
        }
        
        return autor;
    }
}
