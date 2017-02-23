package Modelo;
import Modelo.Cuentas;

/**
 *
 * @author Azael
 */
public class AdeudosManten {
    
    private int id;
    private int año;
    private float cuota;
    private float descCuota;
    private float recargo;
    private float descRecargo;
    private float subtotal;
    private Cuentas cuentas;

    public AdeudosManten() {
        this.id=-1;
        this.año = -1;
        this.cuota = -1;
        this.descCuota = -1;
        this.recargo = -1;
        this.descRecargo = -1;
        this.subtotal = -1;
    }

    public AdeudosManten(int id, int año, float cuota, float descCuota, float recargo, float descRecargo, float subtotal, Cuentas cuentas) {
        
        this.id=id;
        this.año = año;
        this.cuota = cuota;
        this.descCuota = descCuota;
        this.recargo = recargo;
        this.descRecargo = descRecargo;
        this.subtotal = subtotal;
        this.cuentas = cuentas;
    }
    @Override
    public String toString(){
    return "AdeudosManteni{" + "año=" + año + ", cuota=" + cuota + ", desCuota=" + descCuota + ", recargo=" + recargo +
                ", descRecargo=" + descRecargo + ", subtotal=" + subtotal +'}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public float getDescCuota() {
        return descCuota;
    }

    public void setDescCuota(float descCuota) {
        this.descCuota = descCuota;
    }

    public float getRecargo() {
        return recargo;
    }

    public void setRecargo(float recargo) {
        this.recargo = recargo;
    }

    public float getDescRecargo() {
        return descRecargo;
    }

    public void setDescRecargo(float descRecargo) {
        this.descRecargo = descRecargo;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public Cuentas getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuentas cuentas) {
        this.cuentas = cuentas;
    }
    
    
}