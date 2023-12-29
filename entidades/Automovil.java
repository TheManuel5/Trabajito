package entidades;
import java.util.*;
/**
 *
 * @author User
 */
public class Automovil {
    private String  codigo;
    private String marca;
    private String modelo;
    private int añoFabricación;
    private float precioVenta;
    private float porcentajeDescuento;
    private boolean conDescuento;
    private boolean esVendido;

    public Automovil() {
        codigo="NC";
        marca="NM";
        modelo="NMD";
        añoFabricación=0;
        precioVenta=0.0f;
        porcentajeDescuento=0.0f;
        conDescuento=false;
        esVendido=false;
    }

    public Automovil(String codigo, String marca, String modelo, int añoFabricación, float precioVenta, float porcentajeDescuento, boolean conDescuento, boolean esVendido) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricación = añoFabricación;
        this.precioVenta = precioVenta;
        this.porcentajeDescuento = porcentajeDescuento;
        this.conDescuento = conDescuento;
        this.esVendido = esVendido;
    }

    private void crearCodigo(int pdigito, int sdigito, int complemento) {
        int codigoGenerado= pdigito*1000000+sdigito*10000+complemento;
        this.codigo=String.valueOf(codigoGenerado);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAñoFabricación(int añoFabricación) {
        this.añoFabricación = añoFabricación;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setPorcentajeDescuento(float porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public void setConDescuento(boolean conDescuento) {
        this.conDescuento = conDescuento;
    }

    public void setEsVendido(boolean esVendido) {
        this.esVendido = esVendido;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAñoFabricación() {
        return añoFabricación;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public boolean getConDescuento() {
        return conDescuento;
    }

    public boolean getEsVendido() {
        return esVendido;
    }

    @Override
    public String toString() {
        return "\nMarca=" + marca + "\nModelo=" + modelo + "\nAño de Fabricación=" + añoFabricación + 
                "\nPrecio Venta=" + precioVenta + "\nPorcentaje Descuento=" + porcentajeDescuento;
    }
    
    
    public float getMontoDescuento() {
        return precioVenta * (porcentajeDescuento / 100);
    }
    public float getPrecioFinal() {
        if (conDescuento) {
                return precioVenta - getMontoDescuento();
        } else {
                return precioVenta;
        }
    }
    
    
}
