package dominio;

public class Editora {
    private int id_editora;
    private String nm_editora;
    private String logradouro;
    private String estado;
    private String cidade;
    
    public Editora() {   
    }

    public int getId_editora() {
        return id_editora;
    }

    public void setId_editora(int id_editora) {
        this.id_editora = id_editora;
    }

    public String getNm_editora() {
        return nm_editora;
    }

    public void setNm_editora(String nm_editora) {
        this.nm_editora = nm_editora;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
