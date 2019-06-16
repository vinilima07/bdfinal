package servicosTecnicos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import dominio.Aluguel;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinicius
 */
public class EntregaDAO {
    private Conexao con;

    public EntregaDAO(){
        con = new Conexao();
    }

    public void registrarEntrega(Aluguel aluguel){
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd");
	LocalDateTime agora = LocalDateTime.now();
        String sql = "UPDATE aluguel SET dt_entrega = "+dtf.format(agora)+
                " WHERE id_usuario = '"+aluguel.getId_usuario()+"' AND id_exemplar = '"+aluguel.getId_exemplar()+
                "' AND id_livro = '"+aluguel.getId_livro()+"' AND dt_aluguel = '"+dtf.format(aluguel.getDt_aluguel())+"'";
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
