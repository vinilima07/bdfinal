package dominio;

import java.util.Date;

public class Aluguel {
    private int id_usuario;
    private int id_exemplar;
    private int id_livro;
    private Date dt_aluguel;
    private Date dt_entrega;

    public Aluguel(){
    }
    
    public Aluguel(int id_usuario, int id_exemplar, int id_livro, Date dt_aluguel, Date dt_entrega) {
        this.id_usuario = id_usuario;
        this.id_exemplar = id_exemplar;
        this.id_livro = id_livro;
        this.dt_aluguel = dt_aluguel;
        this.dt_entrega = dt_entrega;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_exemplar() {
        return id_exemplar;
    }

    public void setId_exemplar(int id_exemplar) {
        this.id_exemplar = id_exemplar;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public Date getDt_aluguel() {
        return dt_aluguel;
    }

    public void setDt_aluguel(Date dt_aluguel) {
        this.dt_aluguel = dt_aluguel;
    }

    public Date getDt_entrega() {
        return dt_entrega;
    }

    public void setDt_entrega(Date dt_entrega) {
        this.dt_entrega = dt_entrega;
    }
}
