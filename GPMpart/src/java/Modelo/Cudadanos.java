package Modelo;

/**
 *
 * @author Azael
 */
public class Cudadanos {
    
    private String RFC;
    private String CURP;
    private String Nombre;
    private String Calle;
    private int NumExt;
    private int NumInt;
    private String Colonia;
    private String Poblacion;
    private int CP;
    private String Municipio;
    private String Edo;
    private String Pais;
    private String Estatus;
    private int id;

    public Cudadanos() {
        this.RFC = "";
        this.CURP = "";
        this.Nombre = "";
        this.Calle = "";
        this.NumExt = -1;
        this.NumInt = -1;
        this.Colonia = "";
        this.Poblacion = "";
        this.CP = -1;
        this.Municipio = "";
        this.Edo = "";
        this.Pais = "";
        this.Estatus = "";
        this.id=-1;
        
    }
    
    public Cudadanos(String RFC, String CURP, String Nombre, String Calle, int NumExt, int NumInt, String Colonia, String Poblacion, int CP, String Municipio, String Edo, String Pais, String Estatus, int id) {
        this.RFC = RFC;
        this.CURP = CURP;
        this.Nombre = Nombre;
        this.Calle = Calle;
        this.NumExt = NumExt;
        this.NumInt = NumInt;
        this.Colonia = Colonia;
        this.Poblacion = Poblacion;
        this.CP = CP;
        this.Municipio = Municipio;
        this.Edo = Edo;
        this.Pais = Pais;
        this.Estatus = Estatus;
        this.id=id;
    }
    
    public String toString(){
        return "Ciudadanos{"+ ", RFC=" + RFC + ", CURP=" + CURP + ", Nombre=" + Nombre + ", Calle=" + Calle + ", NumExt=" +
                NumExt + ", NumInt=" + NumInt + ", Colonia=" + Colonia + ", Poblacion=" + Poblacion + ", CP=" + CP + 
                ", Municipio=" + Municipio + ", Estado=" + Edo + ", Pais=" +  Pais + ", Estatus=" + Estatus +'}';
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public int getNumExt() {
        return NumExt;
    }

    public void setNumExt(int NumExt) {
        this.NumExt = NumExt;
    }

    public int getNumInt() {
        return NumInt;
    }

    public void setNumInt(int NumInt) {
        this.NumInt = NumInt;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String Poblacion) {
        this.Poblacion = Poblacion;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getEdo() {
        return Edo;
    }

    public void setEdo(String Edo) {
        this.Edo = Edo;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
