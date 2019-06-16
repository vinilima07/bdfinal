/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicosTecnicos;

import dominio.Exemplar;
import dominio.Livro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinicius
 */
public class LivroDAO {
    Conexao con;
    
    public LivroDAO(){
        con = new Conexao();
    }
    
    public List<Livro> consultaLivro(String livro){
        List<Livro> livros = new ArrayList<Livro>();
        String sql = "SELECT * FROM livro WHERE nm_titulo ILIKE '%"+livro+"%'";
        try{
            Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stm.execute(livro);
            ResultSet rs = stm.getResultSet();
            
            while(rs.next()){
                livros.add(new Livro(rs.getInt("id_livro"), rs.getInt("nu_editora"),rs.getString("nm_titulo"),
                rs.getString("nm_genero")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.fechaConexao();
        }
        return livros;
    }
    
    public Exemplar geraExemplar(){
        return null;
    }
}
