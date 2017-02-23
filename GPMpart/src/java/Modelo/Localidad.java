package Modelo;

/**
 *
 * @author Azael
 */
public class Localidad {
    
    private int id;
    private int Codigo;
    private String Nombre;
    private String Tipo;
    
    public Localidad(){
        this.id= -1;
        this.Codigo= -1;
        this.Nombre="";
        this.Tipo="";
    } 
    
    public Localidad(int id, int Codigo, String Nombre, String Tipo) {
        this.id=-1;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
    }

    @Override
    public String toString(){
        return "Localidad{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Tipo=" + Tipo + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
}
