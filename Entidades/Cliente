/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.*;

/**
 *
 * @author Gaby
 */
public class Cliente extends Persona {
    private String direccion;
    private String telefono;

    public Cliente() {
        super ();
        direccion="ND";
        telefono="000000000";
    }
    
    public Cliente(String numeroDni, String apellidos, String nombre, GregorianCalendar fechaNacimiento, String direccion, String telefono) {
        super(numeroDni, apellidos, nombre, fechaNacimiento);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
       return super.toString() +"\nDirección: "+getDireccion()
               + "\nTeléfono: "+getTelefono();
    }
    
    
}
