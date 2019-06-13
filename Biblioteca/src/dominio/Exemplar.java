package dominio;

public class Exemplar {
    private int id_exemplar;
    private int nu_quantidade;
    private Livro id_livro;
    
    public Exemplar() {
    }

    public int getId_exemplar() {
        return id_exemplar;
    }

    public void setId_exemplar(int id_exemplar) {
        this.id_exemplar = id_exemplar;
    }

    public int getNu_quantidade() {
        return nu_quantidade;
    }

    public void setNu_quantidade(int nu_quantidade) {
        this.nu_quantidade = nu_quantidade;
    }

    public Livro getId_livro() {
        return id_livro;
    }

    public void setId_livro(Livro id_livro) {
        this.id_livro = id_livro;
    }
}
