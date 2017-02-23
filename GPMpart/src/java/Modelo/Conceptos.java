package Modelo;

/**
 *
 * @author Azael
 */
public class Conceptos {
    private String descripcion;
    private String CRIAnteriores;
    private String CRIVigente;
    private float costoMetro;
    private float cuotafija;

    public Conceptos() {
        this.descripcion = "";
        this.CRIAnteriores = "";
        this.CRIVigente = "";
        this.costoMetro = -1;
        this.cuotafija = -1;
    }

    public Conceptos(String descripcion, String CRIAnteriores, String CRIVigente, float costoMetro, float cuotafija) {
        this.descripcion = descripcion;
        this.CRIAnteriores = CRIAnteriores;
        this.CRIVigente = CRIVigente;
        this.costoMetro = costoMetro;
        this.cuotafija = cuotafija;
    }
    
    public String toString(){
        return "Conceptos{" + "descripcion=" + descripcion + ", [CRI-Anteriores]=" + CRIAnteriores + ", [CRI-Vigente]=" + CRIVigente +
                ", costoMetro=" + costoMetro + ", cuotaFija=" + cuotafija +'}';
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCRIAnteriores() {
        return CRIAnteriores;
    }

    public void setCRIAnteriores(String CRIAnteriores) {
        this.CRIAnteriores = CRIAnteriores;
    }

    public String getCRIVigente() {
        return CRIVigente;
    }

    public void setCRIVigente(String CRIVigente) {
        this.CRIVigente = CRIVigente;
    }

    public float getCostoMetro() {
        return costoMetro;
    }

    public void setCostoMetro(float costoMetro) {
        this.costoMetro = costoMetro;
    }

    public float getCuotafija() {
        return cuotafija;
    }

    public void setCuotafija(float cuotafija) {
        this.cuotafija = cuotafija;
    }
    
    
}
