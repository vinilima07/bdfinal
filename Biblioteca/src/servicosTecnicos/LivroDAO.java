package servicosTecnicos;

import dominio.Aluguel;
import dominio.Exemplar;
import dominio.Livro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {
    private Conexao con;
    
    public LivroDAO(){
        con = new Conexao();
    }
    
    public List<Livro> consultaLivro(String livro){
        List<Livro> livros = new ArrayList<Livro>();
        String sql = "SELECT * FROM livro WHERE nm_titulo ILIKE '%"+livro+"%'";
        try{
            Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stm.execute(sql);
            ResultSet rs = stm.getResultSet();
            
            while(rs.next()){
                livros.add(new Livro(rs.getInt("id_livro"), rs.getInt("nu_edicao"), rs.getString("nm_titulo"), rs.getString("nm_genero")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.fechaConexao();
        }
        return livros;
    }
    
    public Exemplar alugaExemplar(int id_livro){
        String sql1 = "SELECT exemplar.id_livro, COUNT(*) AS nexemplares "
                + "FROM livro INNER JOIN exemplar ON livro.id_livro = exemplar.id_livro "
                + "WHERE exemplar.id_livro = "+id_livro+" AND status = TRUE "
                + "GROUP BY exemplar.id_livro HAVING COUNT(*) > 0";
        try{
            Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stm.execute(sql1);
            ResultSet rsCount = stm.getResultSet();
            if(rsCount.next()){
                if(rsCount.getInt("nexemplares") > 0){
                    String sql2 = "SELECT * FROM exemplar "
                            + "WHERE id_livro = "+id_livro+" LIMIT 1";
                    stm.execute(sql2);
                    ResultSet rsExemplar = stm.getResultSet();
                    String sql3 = "UPDATE exemplar SET status = FALSE "
                            + "WHERE id_exemplar = "+rsExemplar.getInt("id_exemplar");
                    stm.execute(sql3);
                }
            }
                
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.fechaConexao();
        }
        return null;
    }
    
    
    public void entregaExemplar(Aluguel aluguel){
        String sql = "UPDATE exemplar SET status = TRUE "
                    + "WHERE id_exemplar = "+aluguel.getId_exemplar();
        try{
            Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stm.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.fechaConexao();
        }
    }
}
