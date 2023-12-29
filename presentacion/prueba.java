package presentacion;

import entidades.*;
import java.util.*;
import datos.*;
/**
 *
 * @author Felix
 */
public class Prueba {
    private static Scanner sc = new Scanner(System.in);
    
    public static int menu() {
        int opcion;
        String opciones = "\n\t1. Registrar tipos de empleados" +
                "\n\t2. Registrar automoviles"+
                "\n\t3. Registrar clientes y ventas"+
                "\n\t4. Listar datos de ventas de cada vendedor"+
                "\n\t5. Listar total de ventas realizadas en un mes"+
                "\n\t6. Mostrar datos de automoviles vendidos"+
                "\n\t7. Salir";
        do {
            System.out.println("\n\n\t\tCONCESIONARIO - MENU");
            System.out.print(opciones + "\n\n\tDigite una opción [1-6]: ");
            opcion = sc.nextInt();
            if(opcion<1 || opcion>6)
                System.out.println("\n\tLa opción debe estar entre 1 y 6\n");
        }while(opcion<1 || opcion>6);
        return opcion;
    }
    
    public static void main(String[] args) {
        
        int opcion, opcion2, diaG, mesG, añoG, diaV, mesV, añoV, diaC, mesC, añoC, tiempoC, veriV, diaVen, mesVen, añoVen;
        float sueldoG, porcenG, porcenV;
        String dniG, nomG, apeG, profesionG, dniV, nomV, apeV, dniBuscar, dniC, nomC, apeC, direC, teleC;
        GregorianCalendar fechaG, fechaV, fechaConV, fechaC, fechaVen;
        Gerente gerente = null;
        Vendedor vendedor = null, vendeVenta;
        Cliente cliente = null;
        Venta venta = null;
        do{
            opcion = menu();
            switch(opcion) {
                case 1:
                    System.out.println("\n\t\t----Registro de empleados----");
                    sc.nextLine();  
                    System.out.print("\n\t\t¿Qué empleado es?  \n\t\t1.Gerente"+
                            "\n\t\t2.Vendedor \n\t\tIngrese su opción: ");
                    opcion2=sc.nextInt();
                    sc.nextLine();
                    switch(opcion2){
                        case 1:
                            System.out.print("\n\t\tIngrese numero de DNI: ");
                            dniG=sc.nextLine();
                            System.out.print("\n\t\tIngrese nombre: ");
                            nomG=sc.nextLine();
                            System.out.print("\n\t\tIngrese apellido: ");
                            apeG=sc.nextLine();
                            System.out.print("\n\t\tIngrese fecha de nacimiento: ");
                            System.out.print("\n\t\tDia: ");
                            diaG=sc.nextInt();
                            System.out.print("\t\tMes: ");
                            mesG=sc.nextInt();
                            System.out.print("\t\tAño: ");
                            añoG=sc.nextInt();
                            fechaG = new GregorianCalendar(añoG, mesG-1, diaG);
                            sc.nextLine();
                            System.out.print("\n\t\tIngrese su profesion: ");
                            profesionG=sc.nextLine();
                            System.out.print("\n\t\tIngrese su sueldo: ");
                            sueldoG=sc.nextFloat();
                            System.out.print("\n\t\tIngrese porcentaje de comisión: ");
                            porcenG=sc.nextFloat();
                            gerente = new Gerente(profesionG,sueldoG,porcenG,dniG, apeG,nomG, fechaG);
                            System.out.print("\n\t\tEl gerente fue registrado exitosamente");
                            break;
                        case 2:
                            System.out.print("\n\t\tIngrese numero de DNI: ");
                            dniV=sc.nextLine();
                            System.out.print("\n\t\tIngrese nombre: ");
                            nomV=sc.nextLine();
                            System.out.print("\n\t\tIngrese apellido: ");
                            apeV=sc.nextLine();
                            System.out.print("\n\t\tIngrese fecha de nacimiento: ");
                            System.out.print("\n\t\tDia: ");
                            diaV=sc.nextInt();
                            System.out.print("\t\tMes: ");
                            mesV=sc.nextInt();
                            System.out.print("\t\tAño: ");
                            añoV=sc.nextInt();
                            fechaV = new GregorianCalendar(añoV, mesV-1, diaV);
                            sc.nextLine();
                            System.out.print("\n\t\tIngrese fecha de contrato: ");
                            System.out.print("\n\t\tDia: ");
                            diaC=sc.nextInt();
                            System.out.print("\t\tMes: ");
                            mesC=sc.nextInt();
                            System.out.print("\t\tAño: ");
                            añoC=sc.nextInt();
                            fechaConV = new GregorianCalendar(añoC, mesC-1, diaC);
                            sc.nextLine();
                            System.out.print("\n\t\tIngrese tiempo de contrato: ");
                            tiempoC=sc.nextInt();
                            System.out.print("\n\t\tIngrese porcentaje de comisión: ");
                            porcenV=sc.nextFloat();
                            vendedor = new Vendedor(fechaConV, tiempoC, porcenV, dniV, apeV, nomV, fechaV);
                            ListaVendedores.setVendedor(vendedor);
                            System.out.print("\n\t\tEl vendedor fue registrado exitosamente");
                            break; 
                    }
                break;
                //case 2:
                    //PA TI IMA
                
                case 3:
                    /*
                    System.out.println("\n\t\t----Registro de ventas----");
                    sc.nextLine();
                    System.out.print("\n\t\tIngrese DNI del vendedor para continuar: ");
                    dniBuscar = sc.nextLine();
                    veriV=ListaVendedores.buscarVendedorPorDni(dniBuscar);
                    if(veriV==-1)
                        System.out.println("\n\t\tNo se encuentra registrado el DNI ingresado");
                    else {
                        System.out.print("\n\t\tRegistrando cliente ...");
                        System.out.print("\n\t\tIngrese DNI del cliente: ");
                        dniC=sc.nextLine();
                        System.out.print("\n\t\tIngrese nombre del cliente: ");
                        nomC=sc.nextLine();
                        System.out.print("\n\t\tIngrese apellido del cliente: ");
                        apeC=sc.nextLine();
                        System.out.print("\n\t\tIngrese la fecha de nacimiento del cliente: ");
                        System.out.print("\n\t\tDia: ");
                        diaC=sc.nextInt();
                        System.out.print("\t\tMes: ");
                        mesC=sc.nextInt();
                        System.out.print("\t\tAño: ");
                        añoC=sc.nextInt();
                        fechaC = new GregorianCalendar(añoC, mesC-1, diaC);
                        sc.nextLine();
                        System.out.print("\n\t\tIngrese direccion del cliente: ");
                        direC=sc.nextLine();
                        System.out.print("\n\t\tIngrese telefono del cliente: ");
                        teleC=sc.nextLine();
                        cliente = new Cliente(dniC, nomC, apeC, fechaC, direC, teleC);
                        ListaClientes.setCliente(cliente);
                        System.out.print("\n\t\tRegistrando venta ...");
                        System.out.print("\n\t\tIngrese la fecha de venta: ");
                        System.out.print("\n\t\tDia: ");
                        diaVen=sc.nextInt();
                        System.out.print("\t\tMes: ");
                        mesVen=sc.nextInt();
                        System.out.print("\t\tAño: ");
                        añoVen=sc.nextInt();
                        fechaVen = new GregorianCalendar(añoVen, mesVen-1, diaVen);
                        vendeVenta = ListaVendedores.getVendedor(veriV);
                        
                        //FALTA EL AUTOMOVIL
                        
                        //venta = new Venta(fechaVen, cliente, vendeVenta, auto);
                        //ListaVentas.setVenta(venta);
*/                
break;
                case 4:
                    System.out.println("\n\t\t----Listado de datos de ventas----");
                    sc.nextLine();
                    System.out.print("\n\t\tIngrese DNI del vendedor a buscar: ");
                    dniBuscar=sc.nextLine();
                    veriV=ListaVendedores.buscarVendedorPorDni(dniBuscar);
                    if(veriV==-1)
                        System.out.println("\n\t\tNo se encuentra registrado el DNI ingresado");
                    else
                        
                        System.out.println("a");
                break;
                //case 5:
                //case 6:
            }
        }while(opcion !=7);
    }
}

