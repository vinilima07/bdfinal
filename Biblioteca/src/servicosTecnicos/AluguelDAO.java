package servicosTecnicos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import dominio.Aluguel;
import dominio.Exemplar;
import dominio.Livro;
import dominio.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.ArrayList;
import java.util.Date;  
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AluguelDAO {
    private Conexao con;

    public AluguelDAO(){
        con = new Conexao();
    }
    
    public List<Aluguel> consultarAlugueis(int id_usuario){
        String sql = "SELECT * FROM aluguel NATURAL JOIN exemplar NATURAL JOIN livro"
                +" WHERE id_usuario = "+id_usuario+" AND dt_entrega IS NULL";
        List<Aluguel> alugueis = new ArrayList<Aluguel>();
        try{
            Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stm.execute(sql);
            ResultSet rs = stm.getResultSet();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                Livro livro = new Livro(rs.getInt("id_livro"), rs.getInt("nu_edicao"), rs.getString("nm_titulo"), rs.getString("nm_genero"));
                Exemplar exemplar = new Exemplar(rs.getInt("id_exemplar"), livro);
                Aluguel aluguel = new Aluguel(usuario, exemplar, livro, rs.getDate("dt_aluguel"), null);
                
                alugueis.add(aluguel);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.fechaConexao();
        }
        return alugueis;
    }
    
    public void registrarAluguel(Usuario usuario, Exemplar exemplar){
        String sql1 = "INSERT INTO aluguel (id_usuario, id_exemplar, id_livro) VALUES ("
            +usuario.getId_usuario()+","+exemplar.getId_exemplar()+","+exemplar.getId_livro().getId_livro()+")";
        
        String sql2 = "UPDATE exemplar SET status = FALSE"
                +" WHERE id_exemplar = "+exemplar.getId_exemplar()+" AND id_livro = "+exemplar.getId_livro().getId_livro();
        try{
            Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stm.execute(sql1);
            stm.execute(sql2);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.fechaConexao();
        }
    }
}
