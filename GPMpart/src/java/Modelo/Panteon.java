package Modelo;

import Modelo.Localidad;

/**
 *
 * @author Azael
 */
public class Panteon {
    
    private int Id;
    private int Codigo;
    private String Nombre;
    private String Responsable;
    private String Calle;
    private int Num;
    private String Estatus;
    private String HorarioAtencion;
    private String Municipio;
    private Localidad local;
    
    
    public Panteon(){
        this.Id=-1;
        this.Codigo=-1;
        this.Nombre="";
        this.Responsable="";
        this.Calle="";
        this.Num=-1;
        this.Estatus="";
        this.HorarioAtencion="";
        this.Municipio="";
    
    }
    
    public Panteon(int Id,int Codigo, String Nombre, String Responsable, String Calle, int Num, String Estatus, String HorarioAtencion, String Municipio, Localidad local) {
        this.Id= Id;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Responsable = Responsable;
        this.Calle = Calle;
        this.Num = Num;
        this.Estatus = Estatus;
        this.HorarioAtencion = HorarioAtencion;
        this.Municipio = Municipio;
        this.local = local;
    }
    @Override
    public String toString(){
        return "Panteon{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Responsable=" + Responsable + ", Calle=" + Calle + ", Numero=" + Num+ ", Estatus=" + Estatus + ", HorarioAtencion=" + HorarioAtencion + ", Municipio=" + Municipio + '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public String getHorarioAtencion() {
        return HorarioAtencion;
    }

    public void setHorarioAtencion(String HorarioAtencion) {
        this.HorarioAtencion = HorarioAtencion;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public Localidad getLocal() {
        return local;
    }

    public void setLocal(Localidad local) {
        this.local = local;
    }
    
}
