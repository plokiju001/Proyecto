package Modelo;
import Modelo.Cudadanos;
import Modelo.Cuentas;
/**
 *
 * @author Azael
 */
public class Propietario {
    private String EsTitular;
    private float Porcentaje;
    private String Estatus;
    private String FechaAct;
    private Cudadanos Ciudadano;
    private Cuentas Cuentas;

    public Propietario() {
        this.EsTitular = "";
        this.Porcentaje = -1;
        this.Estatus = "";
        this.FechaAct = "";
    }

    public Propietario(String EsTitular, float Porcentaje, String Estatus, String FechaAct, Cudadanos Ciudadano, Cuentas Cuentas) {
        this.EsTitular = EsTitular;
        this.Porcentaje = Porcentaje;
        this.Estatus = Estatus;
        this.FechaAct = FechaAct;
        this.Ciudadano = Ciudadano;
        this.Cuentas = Cuentas;
    }
    
    @Override
    public String toString(){
        return "Propietarios{" + "Estitular=" + EsTitular + ", Porcentaje=" + Porcentaje + ", Estatus=" + Estatus +
                ", FechaActualizacion=" + FechaAct + '}';
    }

    public String getEsTitular() {
        return EsTitular;
    }

    public void setEsTitular(String EsTitular) {
        this.EsTitular = EsTitular;
    }

    public float getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(float Porcentaje) {
        this.Porcentaje = Porcentaje;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public String getFechaAct() {
        return FechaAct;
    }

    public void setFechaAct(String FechaAct) {
        this.FechaAct = FechaAct;
    }

    public Cudadanos getCiudadano() {
        return Ciudadano;
    }

    public void setCiudadano(Cudadanos Ciudadano) {
        this.Ciudadano = Ciudadano;
    }

    public Cuentas getCuentas() {
        return Cuentas;
    }

    public void setCuentas(Cuentas Cuentas) {
        this.Cuentas = Cuentas;
    }
    
    
}
