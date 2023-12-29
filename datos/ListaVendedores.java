package datos;
import java.util.*;
import entidades.*;
/**
 *
 * @author cristhian A.
 */
public class ListaVendedores {
    private  static ArrayList<Vendedor>listaVendedores=new ArrayList<>();
    private  static Iterator<Vendedor> iterador;

    public static void setVendedor(Vendedor vendedor){
        if(vendedor!=null)
            listaVendedores.add(vendedor);
    }
    public static Vendedor getVendedor(int pos){
        if(pos>=0 &&pos<listaVendedores.size())
            return listaVendedores.get(pos);
        return null;
    }
    
    @Override
    public String toString(){
        return listaVendedores.toString();
    }
    
    
    public  static int buscarVendedorPorDni (String numeroDni){
          int i=0;
        if(!listaVendedores.isEmpty()){
         iterador=listaVendedores.iterator();
           while(iterador.hasNext()){
               if(iterador.next().getNumeroDni().equals(numeroDni))
               return i;
               else
               i++;
           }
        }
        return -1; 
     } 
    
    public static int buscarVendedorPorDni(Vendedor vendedor){
    return listaVendedores.indexOf(vendedor);
 }

    
    public static void listaOrdenadaPorApellido() {
    if(listaVendedores.size() > 1) 
    Collections.sort(listaVendedores,(Vendedor p1,Vendedor p2)->p1.getApellidos().compareTo(p2.getApellidos()));
    }
    
}
