package Modelo;

/**
 *
 * @author Azael
 */
public class HistCuentas {
    private int Asiento;
    private String FechaAsiento;
    private String Usuario;
    private int Codigo;
    private String Lote;
    private int Seccion;
    private String TipoCons;
    private float FrenteMts;
    private float FondoMts;
    private float AreaMtsC;
    private String Comprobantes;
    private int panteon;
    private int localidad;
    private String Estatus;
    private int NumGavetas;

    public HistCuentas() {
        this.Asiento = -1;
        this.FechaAsiento = "";
        this.Usuario = "";
        this.Codigo = -1;
        this.Lote = "";
        this.Seccion = -1;
        this.TipoCons = "";
        this.FrenteMts = -1;
        this.FondoMts = -1;
        this.AreaMtsC = -1;
        this.Comprobantes = "";
        this.panteon = -1;
        this.localidad = -1;
        this.Estatus = "";
        this.NumGavetas = -1;
    }

    public HistCuentas(int Asiento, String FechaAsiento, String Usuario, int Codigo, String Lote, int Seccion, String TipoCons, float FrenteMts, float FondoMts, float AreaMtsC, String Comprobantes, int panteon, int localidad, String Estatus, int NumGavetas) {
        this.Asiento = Asiento;
        this.FechaAsiento = FechaAsiento;
        this.Usuario = Usuario;
        this.Codigo = Codigo;
        this.Lote = Lote;
        this.Seccion = Seccion;
        this.TipoCons = TipoCons;
        this.FrenteMts = FrenteMts;
        this.FondoMts = FondoMts;
        this.AreaMtsC = AreaMtsC;
        this.Comprobantes = Comprobantes;
        this.panteon = panteon;
        this.localidad = localidad;
        this.Estatus = Estatus;
        this.NumGavetas = NumGavetas;
    }
    
    @Override
    public String toString(){
    return "Cuentas{" + "Asiento=" + Asiento + ", FechaAsiento=" + FechaAsiento + ", Usuario=" + Usuario +", Codigo=" + Codigo + ", Lote=" + Lote + "Seccion" + Seccion + ", TipoCons=" + TipoCons +
            ", FrenteMts=" + FrenteMts + ", FondoMts=" + FondoMts + ", AreaMtsC=" + ", Comprobantes=" + Comprobantes+ 
            ", Estatus=" + Estatus + ", NumGavetas=" + NumGavetas + "Comprobantes" + Comprobantes + "Localidad" + localidad+'}';
    }

    public int getAsiento() {
        return Asiento;
    }

    public void setAsiento(int Asiento) {
        this.Asiento = Asiento;
    }

    public String getFechaAsiento() {
        return FechaAsiento;
    }

    public void setFechaAsiento(String FechaAsiento) {
        this.FechaAsiento = FechaAsiento;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
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

    public int getPanteon() {
        return panteon;
    }

    public void setPanteon(int panteon) {
        this.panteon = panteon;
    }

    public int getLocalidad() {
        return localidad;
    }

    public void setLocalidad(int localidad) {
        this.localidad = localidad;
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
    
    
}
