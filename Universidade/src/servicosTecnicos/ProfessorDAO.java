/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servicosTecnicos;

import dominio.Professor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Luciana
 */
public class ProfessorDAO {
    private Conexao con;

    public ProfessorDAO(){
        con = new Conexao();
    }

    public ArrayList<Professor> consultaProfDepto(String numDepto){
        ArrayList<Professor> professores = new ArrayList<Professor>();
        Professor professor = null;
        String sql = "SELECT * FROM PROFESSOR WHERE ID_DEPTO IN ("+numDepto+")";
        try{
            Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stm.execute(sql);
            ResultSet rs = stm.getResultSet();
            rs.last();
            int i = rs.getRow();
            if (rs.getRow() > 0){
                rs.beforeFirst();
                while(rs.next()){
                    professor = new Professor();
                    professor.setFormacao(rs.getString("nm_formacao"));
                    professor.setNomePessoa(rs.getString("nm_pessoa"));
                    professor.setNumCpf(Integer.valueOf(rs.getString("nu_cpf")));
                    professores.add(professor);
                 }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.fechaConexao();
        }
        return professores;
    }

}
