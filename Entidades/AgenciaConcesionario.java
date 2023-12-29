/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import java.util.*;

/**
 *
 * @author Diego Cuba
 */
public class AgenciaConcesionario{
    private String nombre;
    private Gerente gerente;
    private Vendedor vendedor;    
    private Automovil automovil;
    private Venta venta;
    private Cliente cliente;

    public AgenciaConcesionario(String nombre, Gerente gerente, Vendedor vendedor, Automovil automovil, Venta venta, Cliente cliente) {
        this.nombre = nombre;
        this.gerente = gerente;
        this.vendedor = vendedor;
        this.automovil = automovil;
        this.venta = venta;
        this.cliente = cliente;
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

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Concesionario " + nombre 
               +"\nGerente : " + gerente + "\nVendedor : " + vendedor 
               + "\nAutomovil : " + automovil + "\nVenta : " + venta
               + "\nCliente" + cliente + '}';
    }
}
