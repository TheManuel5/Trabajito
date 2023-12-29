/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;
import entidades.*;
import java.util.*;
import datos.*;
/**
 *
 * @author Gaby
 */
public class PruebaHerencia {
    private static Scanner sc = new Scanner(System.in);
    public static int menu() {
        int opcion;
        String opciones ="\n\t1. Registrar a los empleados." +
                "\n\t2. Registrar los automóviles." +
                "\n\t3. Registrar a los clientes. \n\t4. Registrar la venta realizada. \n\t5. Listar los datos de las ventas totales por cada vendedor" +
                "\n\t6. Listar el total de ventas realizadas en un mes determinado"
                +"\n\t7. Mostrar los datos de los automóviles vendidos. \n\t8.Salir ";
        do {
            System.out.println("\n\t\tConcesionario XYZ - Menú Principal");
            System.out.print(opciones + "\n\n\tDigite una opción [1-8]: ");
            opcion = sc.nextInt();
            if(opcion<1 || opcion>8)
                System.out.println("\n\tLa opción debe estar entre 1 y 8\n");
        }while(opcion<1 || opcion>8);
        return opcion;
    }
    public static void main(String[] args) {
        int opcion;
         do {
            opcion = menu();
            switch(opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
    }
         }
}

