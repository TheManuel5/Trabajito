public abstract class Persona { //implementar clase abstracto
    private String numeroDni;
    private String apellidos;
    private String nombre;
    private GregorianCalendar fechaNacimiento;

    public Persona() {
        this("00000000","NA","NN", new GregorianCalendar(1800,0,1));
    }

    public Persona(String numeroDni, String apellidos, String nombre, GregorianCalendar fechaNacimiento) {
        this.numeroDni = numeroDni;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroDni() {
        return numeroDni;
    }

    public void setNumeroDni(String numeroDni) {
        this.numeroDni = numeroDni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setFechaNacimiento(int dia, int mes, int año){
        fechaNacimiento=new GregorianCalendar(año,(mes-1),dia);
    }
    
    public String getFechaNacimientoCorta(){
        int dia,mes,año;
        dia=fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        mes=fechaNacimiento.get(Calendar.MONTH);
        año=fechaNacimiento.get(Calendar.YEAR);
        return (dia<=9?"0"+dia:dia)+"/"+(mes<=9?"0"+mes:mes)+"/"+año;
    }
    
    @Override
    public String toString() {
        return "\nNumero de Dni=" + getNumeroDni()+
               "\nApellidos y nombres:" +getApellidos()+", "+getNombre()+
               "\nFecha de nacimiento:" +getFechaNacimientoCorta();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.numeroDni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return true;
    }
    
}
