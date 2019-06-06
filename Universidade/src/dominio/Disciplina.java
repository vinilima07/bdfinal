package dominio;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.6B62F905-0516-D7EE-4674-5AE576568D6E]
// </editor-fold> 
public class Disciplina {

    /**
 * Setter of the property <tt>professor</tt>
 *
 * @param professor The professor to set.
 *
 */


	// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3F5A55E4-7F9A-CE51-6022-3F171C662F4A]
    // </editor-fold> 
    private String nomeDisc;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7FE62F10-CA2D-412B-EC30-79BF9A49607C]
    // </editor-fold> 
    private double cargaHoraria;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.60465EE5-1497-35B3-82BF-5E8220BDF268]
    // </editor-fold> 
    private int numCreditos;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B84D9EDA-68EA-2159-1C3B-9A092D67A8CC]
    // </editor-fold> 
    private int periodo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AA94F952-771F-054E-A503-31C88ED36281]
    // </editor-fold> 
    private Disciplina mDisciplina;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7AF89474-7AC8-086C-F79E-7002D071A1BE]
    // </editor-fold> 
    public Disciplina () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AD63F281-B0D9-6015-96A7-6070CCBD8339]
    // </editor-fold> 
    public double getCargaHoraria () {
        return cargaHoraria;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B3C4C080-6738-2310-777F-993E3BF22C58]
    // </editor-fold> 
    public void setCargaHoraria (double val) {
        this.cargaHoraria = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C7E91A90-29B5-00ED-3D5B-7C26AA920F30]
    // </editor-fold> 
    public Disciplina getDisciplina () {
        return mDisciplina;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A397CC06-F14F-C700-208D-87C392C96FF6]
    // </editor-fold> 
    public void setDisciplina (Disciplina val) {
        this.mDisciplina = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.ED1644B4-ECE1-91AF-ED0F-F613FB41F384]
    // </editor-fold> 
    public String getNomeDisc () {
        return nomeDisc;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EC25EBB1-4DD8-0636-8D8A-5EF3EDBFA1DB]
    // </editor-fold> 
    public void setNomeDisc (String val) {
        this.nomeDisc = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1E741A93-5523-C1C7-814D-A748D0A92E41]
    // </editor-fold> 
    public int getNumCreditos () {
        return numCreditos;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.515615CA-A581-02B7-B2AB-AB8FAFC5E492]
    // </editor-fold> 
    public void setNumCreditos (int val) {
        this.numCreditos = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9DDBA9E2-FFDE-C9F8-D36F-37220678A72C]
    // </editor-fold> 
    public int getPeriodo () {
        return periodo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E3B56ECB-D517-0C42-7028-6389BD4E562A]
    // </editor-fold> 
    public void setPeriodo (int val) {
        this.periodo = val;
    }

}

