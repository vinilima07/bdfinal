package dominio;

public class Autor {
    private int id_autor;
    private String nm_autor;
    private String nm_citacao;
    
    public Autor() {
    }

    public Autor(int id_autor, String nm_autor, String nm_citacao) {
        this.id_autor = id_autor;
        this.nm_autor = nm_autor;
        this.nm_citacao = nm_citacao;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getNm_autor() {
        return nm_autor;
    }

    public void setNm_autor(String nm_autor) {
        this.nm_autor = nm_autor;
    }

    public String getNm_citacao() {
        return nm_citacao;
    }

    public void setNm_citacao(String nm_citacao) {
        this.nm_citacao = nm_citacao;
    }
}
