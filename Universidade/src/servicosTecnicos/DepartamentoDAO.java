/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servicosTecnicos;

import dominio.Departamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Luciana
 */
public class DepartamentoDAO {
    private Conexao con;

    public DepartamentoDAO(){
        con = new Conexao();
    }

    public Departamento consultaDepartamento(String nomeDepto){
        String sql = "SELECT * FROM DEPARTAMENTO WHERE NM_DEPTO = '"+nomeDepto+"'";
        Departamento depto = null;
        ProfessorDAO profs = new ProfessorDAO();
        try{
            Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stm.execute(sql);
            ResultSet rs = stm.getResultSet();
            rs.last();
            int i = rs.getRow();
            depto = new Departamento();
            if (rs.getRow() > 0){
                rs.beforeFirst();
                while(rs.next()){
                    depto.setCodigoDepto(Integer.valueOf(rs.getString("id_depto")));
                    depto.setNomeDepto(rs.getString("nm_depto"));
                    depto.setSiglaDepto(rs.getString("sg_depto"));
                    depto.setProfessor(profs.consultaProfDepto(rs.getString("id_depto")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.fechaConexao();
        }
        return depto;
    }

    public String[] getDepartamentos(){
        String[] depto = null;
	String sql = "SELECT * FROM DEPARTAMENTO ORDER BY NM_DEPTO";
	try {
		Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		stm.execute(sql);
		ResultSet rs = stm.getResultSet();
		rs.last();
                int i = rs.getRow();
                depto = new String[i];
                int j = 0;
		if (rs.getRow() > 0){
			rs.beforeFirst();
                        while(rs.next()){
                            depto[j]=(rs.getString("nm_depto"));
                            j++;
                        }
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
                con.fechaConexao();
        }
        return depto;
    }

    public boolean inserirDepartamento(Departamento novoDepto){
        boolean retorno = false;
        String sql = "INSERT INTO DEPARTAMENTO (NM_DEPTO, SG_DEPTO) VALUES ('"+novoDepto.getNomeDepto()+"','"+novoDepto.getSiglaDepto()+"')";
        try {
            Statement stm;
            stm = con.getCon().createStatement();
            stm.execute(sql);
            
            retorno = true;
        } catch (SQLException ex) {
           System.out.println("eeeeeeeeeeeeeerooo!!!");
        } finally {
             con.fechaConexao();
        }
        return retorno;
    }

}
