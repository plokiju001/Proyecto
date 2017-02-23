package Modelo;
import Modelo.Localidad;
import Modelo.Panteon;
/**
 *
 * @author Azael
 */
public class Cuentas {
    private int Codigo;
    private String Lote;
    private int Seccion;
    private String TipoCons;
    private float FrenteMts;
    private float FondoMts;
    private float AreaMtsC;
    private String Comprobantes;
    private String Fecha;
    private String Estatus;
    private int NumGavetas;
    private Localidad Local;
    private Panteon Cementerio;
    
    public Cuentas() {
        this.Codigo = -1;
        this.Lote = "";
        this.Seccion = -1;
        this.TipoCons = "";
        this.FrenteMts = -1;
        this.FondoMts = -1;
        this.AreaMtsC = -1;
        this.Comprobantes = "";
        this.Fecha = "";
        this.Estatus = "";
        this.NumGavetas = -1;
    }

    public Cuentas(int Codigo, String Lote, int Seccion, String TipoCons, float FrenteMts, float FondoMts, float AreaMtsC, String Comprobantes, String Fecha, String Estatus, int NumGavetas, Localidad Local, Panteon Cementerio) {
        this.Codigo = Codigo;
        this.Lote = Lote;
        this.Seccion = Seccion;
        this.TipoCons = TipoCons;
        this.FrenteMts = FrenteMts;
        this.FondoMts = FondoMts;
        this.AreaMtsC = AreaMtsC;
        this.Comprobantes = Comprobantes;
        this.Fecha = Fecha;
        this.Estatus = Estatus;
        this.NumGavetas = NumGavetas;
        this.Local = Local;
        this.Cementerio = Cementerio;
    }
    @Override
    public String toString(){
    
    return "Cuentas{" + ", Codigo=" + Codigo + ", Lote=" + Lote + "Seccion" + Seccion + ", TipoCons=" + TipoCons +
            ", FrenteMts=" + FrenteMts + ", FondoMts=" + FondoMts + ", AreaMtsC=" + ", Comprobantes=" + Comprobantes+ 
            ", Fecha=" + Fecha + ", Estatus=" + Estatus + ", NumGavetas=" + NumGavetas +'}';
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getLote() {
        return Lote;
    }

    public void setLote(String Lote) {
        this.Lote = Lote;
    }

    public int getSeccion() {
        return Seccion;
    }

    public void setSeccion(int Seccion) {
        this.Seccion = Seccion;
    }

    public String getTipoCons() {
        return TipoCons;
    }

    public void setTipoCons(String TipoCons) {
        this.TipoCons = TipoCons;
    }

    public float getFrenteMts() {
        return FrenteMts;
    }

    public void setFrenteMts(float FrenteMts) {
        this.FrenteMts = FrenteMts;
    }

    public float getFondoMts() {
        return FondoMts;
    }

    public void setFondoMts(float FondoMts) {
        this.FondoMts = FondoMts;
    }

    public float getAreaMtsC() {
        return AreaMtsC;
    }

    public void setAreaMtsC(float AreaMtsC) {
        this.AreaMtsC = AreaMtsC;
    }

    public String getComprobantes() {
        return Comprobantes;
    }

    public void setComprobantes(String Comprobantes) {
        this.Comprobantes = Comprobantes;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public int getNumGavetas() {
        return NumGavetas;
    }

    public void setNumGavetas(int NumGavetas) {
        this.NumGavetas = NumGavetas;
    }

    public Localidad getLocal() {
        return Local;
    }

    public void setLocal(Localidad Local) {
        this.Local = Local;
    }

    public Panteon getCementerio() {
        return Cementerio;
    }

    public void setCementerio(Panteon Cementerio) {
        this.Cementerio = Cementerio;
    }
    
    
}
