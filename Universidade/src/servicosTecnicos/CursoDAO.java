/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servicosTecnicos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Luciana
 */
public class CursoDAO {
 private Conexao con;

 public CursoDAO(){
     con = new Conexao();
 }
 public String[] getCursos(){
        String[] curso = null;
	String sql = "SELECT * FROM CURSO";
	try {
		Statement stm = con.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		stm.execute(sql);
		ResultSet rs = stm.getResultSet();
		rs.last();
                int i = rs.getRow();
                curso = new String[i];
                int j = 0;
		if (rs.getRow() > 0){
			rs.beforeFirst();
			rs.next();
                        while(rs.next()){
                            curso[j]=(rs.getString("nm_curso"));
                            j++;
                        }
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
                con.fechaConexao();
        }
        return curso;
    }

}


