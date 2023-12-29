package entidades;

import java.util.GregorianCalendar;


public class Gerente extends Persona {
    private String profesion;
    private float salarioMensual;
    private float porcentajeComision;
    private float totalVentas;

    public Gerente() {
        super();
        profesion = "NA";
        salarioMensual = 0.0f;
        porcentajeComision = 0.0f;
        totalVentas = 0.0f;
    }

    public Gerente(String profesion, float salarioMensual, float porcentajeComision, String numeroDni, String apellidos, String nombres, GregorianCalendar fechaNacimiento) {
        super(numeroDni, apellidos, nombres, fechaNacimiento);
        this.profesion = profesion;
        this.salarioMensual = salarioMensual;
        this.porcentajeComision = porcentajeComision;
    }    

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public float getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(float salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n\tProfesión: " + getProfesion() + 
               "\n\tSalario mensual: " + getSalarioMensual() + 
               "\n\tPorcentaje de comisión: " + getPorcentajeComision()*100 + '%';
    }
    
    public float getMontoComision(){
        return totalVentas*getPorcentajeComision();
    }
    
    public float getSalarioNeto(){
        return getSalarioMensual()+getMontoComision();
    }

    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }
}
