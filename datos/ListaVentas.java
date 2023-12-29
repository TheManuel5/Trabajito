package datos;

import java.util.*;
import entidades.*;
/**
 *
 * @author Felix Chávez
 */
public class ListaVentas {
    
    private  static ArrayList<Vendedor>listaVendedores=new ArrayList<>();;
    private Iterator<Venta>iterador;
    
    public void setVenta(Venta venta) {
        if(venta!=null)
            listaVentas.add(venta);
    }
        
    public Venta getVenta(int pos) {
        if(pos>=0 &&pos<listaVentas.size())
            return listaVentas.get(pos);
        return null;
    }
    
    public String listarContenido() {
        String contenido = "";
        if(!listaVentas.isEmpty()) {
            iterador = listaVentas.iterator();
            while(iterador.hasNext())
                contenido += iterador.next() + "\n";
            contenido += "\nMonto de porcentaje: " + iterador.next().getVendedor().getPorcentajeComision();
        } else
            contenido += "No hay registro de datos";
        return contenido;
    }
    
    public String listarContenidoSoloMes(int mes) {
        String contenido = "";
        if(!listaVentas.isEmpty()) {
            iterador = listaVentas.iterator();
            while(iterador.hasNext())
                if(iterador.next().getMes() == mes)
                    contenido += iterador.next() + "\n";
        } else
            contenido += "No hay registro de datos";
        return contenido;
    }
    
    public int buscarVentaPorDni(String dniBuscado) {
        int i=0;
        if(!listaVentas.isEmpty()) {
            iterador = listaVentas.iterator();
            while(iterador.hasNext()) {
                if(iterador.next().getVendedor().getNumeroDni().equals(dniBuscado))
                    return i;
                else
                    i++; }
        }
        return -1;
    }
    
    public int buscaVentaPorDni(Vendedor venta) {
        return listaVentas.indexOf(venta);
    }
}
