package dominio;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.3200A180-88F4-F567-FC64-51EF853D27FA]
// </editor-fold> 
public class Curso {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.129CF95B-BE2A-CBDC-EAE1-5AF5F90229EC]
    // </editor-fold> 
    private String nomeCurso;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B4DFC901-3FB5-D564-52EF-29C637DD46BB]
    // </editor-fold> 
    private Disciplina mDisciplina;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7E36A823-AD02-C4F0-9D82-D923E3DBDA87]
    // </editor-fold> 
    public Curso () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2EBABB09-4C30-BB91-D1F5-B909CB8EE628]
    // </editor-fold> 
    public Disciplina getDisciplina () {
        return mDisciplina;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.000CCE26-BB7E-AC94-CB60-D9ABED959286]
    // </editor-fold> 
    public void setDisciplina (Disciplina val) {
        this.mDisciplina = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.151C4219-C104-03D2-EA95-CFEAD6B69303]
    // </editor-fold> 
    public String getNomeCurso () {
        return nomeCurso;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.22B61FFB-1342-8234-FD32-C71E42060E6E]
    // </editor-fold> 
    public void setNomeCurso (String val) {
        this.nomeCurso = val;
    }

}

