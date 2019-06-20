package servicosTecnicos;

import dominio.Livro;
import dominio.Exemplar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ExemplarDAO {
    private Conexao con;
    
    public ExemplarDAO(){
        con = new Conexao();
    }
    
    public List<Exemplar> listarExemplares() {
        List<Exemplar> exemplares = new ArrayList<Exemplar>();
        String sql = "SELECT * FROM livro NATURAL JOIN exemplar WHERE status = TRUE";
        try {
            Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stm.execute(sql);
            ResultSet rs = stm.getResultSet();
            
            while(rs.next()) {
                Livro livro = new Livro(rs.getInt("id_livro"), rs.getInt("nu_edicao"), rs.getString("nm_titulo"), rs.getString("nm_genero"));
                exemplares.add(new Exemplar(rs.getInt("id_exemplar"), livro));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.fechaConexao();
        }
        
        return exemplares;
    }
}
