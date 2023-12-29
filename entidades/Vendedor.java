/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.GregorianCalendar;

/**
 *
 * @author Sistemas
 */
public class Vendedor extends Persona {
    private GregorianCalendar fechaContrato;
    private int tiempoContrato;
    private float PorcentajeComision;
    private float totalVentas;

    public Vendedor(){
        super();
        fechaContrato =new GregorianCalendar(1000, 0, 1);
        tiempoContrato= 0;
        PorcentajeComision=0.0f;
        totalVentas=0.0f;
    }    

     public Vendedor(GregorianCalendar fechaContrato, int tiempoContrato, float PorcentajeComision, String numeroDni, String apellidos, String nombres, GregorianCalendar fechaNacimiento) {
        super(numeroDni, apellidos, nombres, fechaNacimiento);
        this.fechaContrato = fechaContrato;
        this.tiempoContrato = tiempoContrato;
        this.PorcentajeComision = PorcentajeComision;
    }

    public float getPorcentajeComision() {
        return PorcentajeComision;
    }

    public void setPorcentajeComision(float PorcentajeComision) {
        this.PorcentajeComision = PorcentajeComision;
    }

    public GregorianCalendar getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(GregorianCalendar fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public int getTiempoContrato() {
        return tiempoContrato;
    }

    public void setTiempoContrato(int tiempoContrato) {
        this.tiempoContrato = tiempoContrato;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tFecha de contrato: " + getFechaContrato() 
                + "\n\tTiempo de Contrato: " + getTiempoContrato() + "\n\tPorcentaje de Comision: " + getPorcentajeComision();
    }
    
    public float getMontoComision() {
        return totalVentas*getPorcentajeComision();
    }
    
    public float getSueldo(){
        return 1050 + getTotalVentas()*getPorcentajeComision();
    }

    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }
}
