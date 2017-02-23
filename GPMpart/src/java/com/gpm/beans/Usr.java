/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gpm.beans;
import com.utiles.datos.Cifrar;

/**
 *
 * @author SHALOM
 */
public class Usr {
   
    
    private String n_empleado;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String usuario;
    private String pass;
    private int permisos;
    private String imagen;
    
    protected final String KEY = "Tlj159753mX#";
    private int domicilio;
    private String email;

    public Usr() {
        this.n_empleado = "";
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.correo = "";
        this.usuario = "";
        this.pass = "";
        this.permisos = -1;
        this.imagen = "";
    }

    public Usr(String n_empleado, String nombre, String apellido, String telefono, String correo, String usuario, String pass, int permisos, String imagen) {
        this.n_empleado = n_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.usuario = usuario;
        this.pass = pass;
        this.permisos = permisos;
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Usr{" + "n_empleado=" + n_empleado + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", correo=" + correo + ", usuario=" + usuario + ", pass=" + pass + ", permisos=" + permisos + ", imagen=" + imagen + '}';
    }

     public String getN_empleado() {
        return n_empleado;
    }

    public void setN_empleado(String n_empleado) {
        this.n_empleado = n_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        pass = Cifrar.Codifica(pass, KEY);
        this.pass = pass;
    }

    public int getPermisos() {
        return permisos;
    }

    public void setPermisos(int permisos) {
        this.permisos = permisos;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
    
    
}
