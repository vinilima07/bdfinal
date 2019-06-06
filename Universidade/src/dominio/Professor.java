package dominio;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.1E2EDB68-D960-72BC-6EB9-DDE6B9E0A1A6]
// </editor-fold> 
public class Professor extends Pessoa {

    /**
 * Setter of the property <tt>disciplina</tt>
 *
 * @param disciplina The disciplina to set.
 *
 */


	// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.117E2D09-A21D-E2B5-36FB-FB3D645E259E]
    // </editor-fold> 
    private String formacao;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A64D311F-0FC0-7FF0-31D5-5A11E1D2FED8]
    // </editor-fold> 
    public Professor () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C96B5456-93AD-9B3B-857D-5588D04D0E1B]
    // </editor-fold> 
    public String getFormacao () {
        return formacao;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.11208690-693B-C0AF-EB12-0B89FD5DC784]
    // </editor-fold> 
    public void setFormacao (String val) {
        this.formacao = val;
    }

}

