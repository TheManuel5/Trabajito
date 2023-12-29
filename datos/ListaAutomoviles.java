package datos;
import java.util.*;
import entidades.*;

/**
 *
 * @author User
 */
public class ListaAutomoviles {

    private static ArrayList<Automovil> listaAutomoviles = new ArrayList<>();
    private static Iterator<Automovil> iterador;

    public static void setAutomovil(Automovil automovil) {
        if (automovil != null)
            listaAutomoviles.add(automovil);
    }
    
    public static Automovil getAutomovil (int pos) {
        if(pos>=0 && pos<listaAutomoviles.size())
            return listaAutomoviles.get(pos);
        return null;
    }

    public static int buscarAutomovil(String codigo){
        for(int i = 0; i<listaAutomoviles.size();i++){
            if(listaAutomoviles.get(i).getCodigo().equals(codigo)){
                return i;
            }
        }
        return -1;
    }
    
    public static String listarAutomovilesVendidos() {
        String contenido = "";
        for ( int i = 0; i < listaAutomoviles.size(); i++) {
            Automovil automovil = listaAutomoviles.get(i);
            if (automovil.getEsVendido()) {
                contenido +="\n\t\tMarca: " + automovil.getMarca() +"\n\t\tModelo: "
                        +automovil.getModelo()+"\n\t\tAño de Fabricación: " +automovil.getAñoFabricación()+"\n";

            }
        }
        return contenido;
    }
 
    @Override
    public String toString() {
        String contenido = "";
        iterador = listaAutomoviles.iterator();
        while(iterador.hasNext())
            contenido += iterador.next() + "\n\n";
        return contenido;
    }

}
