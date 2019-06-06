package dominio;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.356C5505-C8F1-A0FB-0E81-3FA4D46EFC21]
// </editor-fold> 
public class Aluno extends Pessoa {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B5BA535F-851A-D926-0066-D72BE0E773D5]
    // </editor-fold> 
    private int matricula;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D3FD737B-C85D-2CF4-D09C-F072028D90BE]
    // </editor-fold> 
    private int anoIngresso;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AC236B5B-A50E-5125-D2F7-E3AA6F2DBC3D]
    // </editor-fold> 
    public Aluno () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F73A899D-E704-F871-CDE7-D861EC658247]
    // </editor-fold> 
    public int getAnoIngresso () {
        return anoIngresso;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9B026B48-71E0-D920-D1BA-F0C7B67F8432]
    // </editor-fold> 
    public void setAnoIngresso (int val) {
        this.anoIngresso = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8D3A0235-441B-095B-A490-2A7CC1EF1156]
    // </editor-fold> 
    public int getMatricula () {
        return matricula;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.16947A7B-88E0-0F48-7B60-F23DF7CEEBB6]
    // </editor-fold> 
    public void setMatricula (int val) {
        this.matricula = val;
    }

}

