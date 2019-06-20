package dominio;

public class Exemplar {
    private int id_exemplar;
    private boolean status;
    private Livro id_livro;

    public Exemplar(){
    }
    
    public Exemplar(int id_exemplar, Livro id_livro) {
        this.id_exemplar = id_exemplar;
        this.id_livro = id_livro;
    }

    public int getId_exemplar() {
        return id_exemplar;
    }

    public void setId_exemplar(int id_exemplar) {
        this.id_exemplar = id_exemplar;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Livro getId_livro() {
        return id_livro;
    }

    public void setId_livro(Livro id_livro) {
        this.id_livro = id_livro;
    }
}
