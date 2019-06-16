/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicosTecnicos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import dominio.Aluguel;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.ArrayList;
import java.util.Date;  
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author olive
 */
public class AluguelDAO {
    private Conexao con;

    public AluguelDAO(){
        con = new Conexao();
    }

    public Aluguel consultaAlguel( int id_usuario, int id_exemplar, int id_livro, int dt_aluguel){
        String sql = "SELECT * FROM Aluguel WHERE id_usuario = '"+id_usuario+"AND  id_exemplar = '"+id_exemplar+"'"
                + "AND  id_livro = '"+id_livro+"AND  dt_aluguel = '"+dt_aluguel+"'";
        Aluguel alug = null;
        try{
            Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stm.execute(sql);
            ResultSet rs = stm.getResultSet();
            rs.last();
            int i = rs.getRow();
            alug = new Aluguel();
            if (rs.getRow() > 0){
                rs.beforeFirst();
                while(rs.next()){  
                    Date date1;  
                    try {
                        date1 = new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString("id_exemplar"));
                        alug.setDt_aluguel(date1);
                    } catch (ParseException ex) {
                        Logger.getLogger(AluguelDAO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //alug.(Date.valueOf(rs.getString("dt_aluguel")));
                    alug.setId_exemplar(Integer.valueOf(rs.getString("id_exemplar")));
                    alug.setId_livro(Integer.valueOf(rs.getString("id_livro")));
                    alug.setId_usuario(Integer.valueOf(rs.getString("id_usuario")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.fechaConexao();
        }
        return alug;
    }
    
    public List<Aluguel> consultarAlugueis(int id_usuario){
        String sql = "SELECT * FROM Aluguel WHERE id_usuario = '"+id_usuario+"' WHERE dt_entrega = NULL";
        List<Aluguel> alugueis = new ArrayList<Aluguel>();
        try{
            Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stm.execute(sql);
            ResultSet rs = stm.getResultSet();
            
            while(rs.next()){
                alugueis.add(new Aluguel(rs.getInt("id_usuario"),
                        rs.getInt("id_exemplar"), rs.getInt("id_livro"),
                        rs.getDate("dt_aluguel"), rs.getDate("dt_aluguel")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.fechaConexao();
        }
        return alugueis;
        }

    public String[] getAlgueis(){
        return null;
    }

    public boolean inserirAluguel(Aluguel novoAluguel){
        return false;
    }
}
