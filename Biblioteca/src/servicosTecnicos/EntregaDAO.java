package servicosTecnicos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import dominio.Aluguel;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EntregaDAO {
    private Conexao con;

    public EntregaDAO(){
        con = new Conexao();
    }

    public void registrarEntrega(Aluguel aluguel){
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd");
	LocalDateTime agora = LocalDateTime.now();
        String sql1 = "UPDATE aluguel SET dt_entrega = '"+agora+
            "' WHERE id_usuario = '"+aluguel.getId_usuario().getId_usuario()+"' AND id_exemplar = '"+aluguel.getId_exemplar().getId_exemplar()+
            "' AND id_livro = '"+aluguel.getId_livro().getId_livro()+"' AND dt_aluguel = '"+aluguel.getDt_aluguel()+"'";
        
        String sql2 = "UPDATE exemplar SET status = TRUE WHERE"
                +" id_exemplar = "+aluguel.getId_exemplar().getId_exemplar()+" AND id_livro = "+aluguel.getId_livro().getId_livro();
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
