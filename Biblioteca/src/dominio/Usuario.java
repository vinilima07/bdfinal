package dominio;

import java.util.Date;

public class Usuario {
    private int id_usuario;
    private String telefone;
    private String cpf;
    private String nm_usuario;
    private Date dt_nascimento;
    private boolean status;
    
    public Usuario() {
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNm_usuario() {
        return nm_usuario;
    }

    public void setNm_usuario(String nm_usuario) {
        this.nm_usuario = nm_usuario;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public boolean isStatus() {
        return status;
    }
    

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public boolean getCpf() {
        return status;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
