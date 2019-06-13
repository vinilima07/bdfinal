package dominio;

public class Livro {
    private int id_livro;
    private int nu_edicao;
    private String nm_titulo;
    private String nm_genero;
    private Editora id_editora;
    
    public Livro() {
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public int getNu_edicao() {
        return nu_edicao;
    }

    public void setNu_edicao(int nu_edicao) {
        this.nu_edicao = nu_edicao;
    }

    public String getNm_titulo() {
        return nm_titulo;
    }

    public void setNm_titulo(String nm_titulo) {
        this.nm_titulo = nm_titulo;
    }

    public String getNm_genero() {
        return nm_genero;
    }

    public void setNm_genero(String nm_genero) {
        this.nm_genero = nm_genero;
    }

    public Editora getId_editora() {
        return id_editora;
    }

    public void setId_editora(Editora id_editora) {
        this.id_editora = id_editora;
    }
}
