package entidades;

import java.util.*;
/**
 *
 * @author Usuario
 */
public class Venta {
    
    private GregorianCalendar fechaVenta;
    private Cliente cliente;
    private Vendedor vendedor;
    private Automovil automovil;
    
    public Venta() {
    this(new GregorianCalendar(1800, 0, 1), new Cliente(),
            new Vendedor(), new Automovil());
    }
    
    public Venta(GregorianCalendar fechaVenta, Cliente cliente, Vendedor vendedor, Automovil automovil) {
        this.fechaVenta = fechaVenta;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.automovil = automovil;
    }
    
    public void setFechaVenta(GregorianCalendar fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
    
    public GregorianCalendar getFechaVenta() {
        return fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Automovil getAutomovil() {
        return automovil;
    }
    
    public String toString() {
        return "\n\tFecha de venta: " + getFechaVenta() +
               "\n\tDNI del Vendedor: " + getVendedor().getNumeroDni() +
               "\n\tDNI del Cliente: " + getCliente().getNumeroDni() +
               "\n\tCodigo de automovil: " + getAutomovil().getCodigo()+
               "\n\tCon Descuento: " + getAutomovil().getConDescuento();
    }
}
