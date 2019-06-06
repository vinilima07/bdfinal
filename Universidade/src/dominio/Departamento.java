package dominio;

import java.util.ArrayList;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.94EBF6CF-2BA7-AC2B-E0E9-5F31F9EA055F]
// </editor-fold> 
public class Departamento {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FBD3A5C7-FBB5-289B-9691-3513247074D0]
    // </editor-fold> 
    private String nomeDepto;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4A09D0D1-2D23-371F-9E5D-A704BEB5F20E]
    // </editor-fold> 
    private String siglaDepto;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F993A1C1-DC68-EC48-5792-B3E0E5ED6762]
    // </editor-fold> 
    private ArrayList<Professor> mProfessor;
    private int codigoDepto;



    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7DA6AD8D-B7EB-9668-F1EE-D9F82842BA2A]
    // </editor-fold> 
    public Departamento () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3019524B-1532-3861-8B70-191A453F626C]
    // </editor-fold> 
    public ArrayList<Professor> getProfessor () {
        return mProfessor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B6C1540F-EB5A-E5A9-2C4D-744F4E8878D0]
    // </editor-fold> 
    public void setProfessor (ArrayList<Professor> val) {
        this.mProfessor = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2DA9828B-CB28-7ABB-2791-C83889C5A9F0]
    // </editor-fold> 
    public String getNomeDepto () {
        return nomeDepto;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.489F05E4-3630-B96B-81EC-D64CF1C5A047]
    // </editor-fold> 
    public void setNomeDepto (String val) {
        this.nomeDepto = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.33CF1C2D-D0FA-6EF2-BEE4-490A82F99667]
    // </editor-fold> 
    public String getSiglaDepto () {
        return siglaDepto;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D580E9F8-8D85-F328-2E3D-1D6ABDB2CC37]
    // </editor-fold> 
    public void setSiglaDepto (String val) {
        this.siglaDepto = val;
    }

      public int getCodigoDepto() {
        return codigoDepto;
    }

    public void setCodigoDepto(int codigoDepto) {
        this.codigoDepto = codigoDepto;
    }

}

