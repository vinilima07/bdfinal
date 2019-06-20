package dominio;

import java.util.Date;

public class Aluguel {
    private Usuario id_usuario;
    private Exemplar id_exemplar;
    private Livro id_livro;
    private Date dt_aluguel;
    private Date dt_entrega;

    public Aluguel(){
    }
    
    public Aluguel(Usuario id_usuario, Exemplar id_exemplar, Livro id_livro, Date dt_aluguel, Date dt_entrega) {
        this.id_usuario = id_usuario;
        this.id_exemplar = id_exemplar;
        this.id_livro = id_livro;
        this.dt_aluguel = dt_aluguel;
        this.dt_entrega = dt_entrega;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Exemplar getId_exemplar() {
        return id_exemplar;
    }

    public void setId_exemplar(Exemplar id_exemplar) {
        this.id_exemplar = id_exemplar;
    }

    public Livro getId_livro() {
        return id_livro;
    }

    public void setId_livro(Livro id_livro) {
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
