/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.*;
import entidades.*;


/**
 *
 * @author Gaby
 */
public class ListaClientes {
    private static ArrayList<Cliente>listaClientes= new ArrayList<>();
    private static Iterator<Cliente> iterador;

    public void setCliente(Cliente cliente){
        if(cliente!=null)
            listaClientes.add(cliente);
    }
    
    public Cliente getCliente(int pos){
        if(pos>=0 &&pos<listaClientes.size())
            return listaClientes.get(pos);
        return null;
    }

    public String listarContenido() {
        String contenido = "";
        if(!listaClientes .isEmpty()) {
            iterador = listaClientes.iterator();
            while(iterador.hasNext())
                contenido += iterador.next() + "\n";
        } else
            contenido = "\n\tNo hay datos registrados\n";
        return contenido;
    }

    public static int buscaClientePorDni(String dniBuscado) {
        int i=0;
        if(!listaClientes.isEmpty()){
         iterador=listaClientes.iterator();
           while(iterador.hasNext()){
               if(iterador.next().getNumeroDni().equals(dniBuscado))
               return i;
               else
               i++;
           }
        }
        return -1; 
     }
    
    public int buscaClientePorDni(Cliente cliente){
        return listaClientes.indexOf(cliente);
    }
     public static void ordenarPorApellido() {
        if(listaClientes .size()>1)
            Collections.sort(listaClientes,(Cliente p1,Cliente p2)->p1.getApellidos().compareTo(p2.getApellidos()));
    }
}
