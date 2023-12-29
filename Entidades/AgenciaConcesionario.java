/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import datos.*;

/**
 *
 * @author Diego Cuba
 */
public class AgenciaConcesionario{
    private String nombre;
    private Gerente gerente;
    private ListaVendedores listaVendedores ;    
    private ListaAutomoviles listaAutomoviles;
    private ListaVentas listaVentas;
    private ListaClientes listaClientes;

    public AgenciaConcesionario(){
    super();
    nombre="NN";
    }
    
    public AgenciaConcesionario(String nombre, Gerente gerente, ListaVendedores listaVendedores, ListaAutomoviles listaAutomoviles, ListaVentas listaVentas, ListaClientes listaClientes) {
        this.nombre = nombre;
        this.gerente = gerente;
        this.listaVendedores = listaVendedores;
        this.listaAutomoviles = listaAutomoviles;
        this.listaVentas = listaVentas;
        this.listaClientes = listaClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ListaVendedores getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(ListaVendedores listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public ListaAutomoviles getListaAutomoviles() {
        return listaAutomoviles;
    }

    public void setListaAutomoviles(ListaAutomoviles listaAutomoviles) {
        this.listaAutomoviles = listaAutomoviles;
    }

    public ListaVentas getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ListaVentas listaVentas) {
        this.listaVentas = listaVentas;
    }

    public ListaClientes getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ListaClientes listaClientes) {
        this.listaClientes = listaClientes;
    }
       
    
    @Override
    public String toString() {
        return "Concesionario " + nombre 
               +"\nGerente : " + gerente + "\nVendedores : " + listaVendedores.toString() 
               + "\nAutomoviles : " + listaAutomoviles.toString() + "\nVentas : " + listaVentas.listarContenido()
               + "\nClientes : " + listaClientes.listarContenido() + '}';
    }
}
