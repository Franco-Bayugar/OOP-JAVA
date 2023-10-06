
package tema4.ej2;

public abstract class Empleado {
    private String nombre;
    private double sueldoBasico;
    private int antiguedad;

    public Empleado(String nombre, double sueldoBasico, int antiguedad) { //constructor
        setNombre(nombre);
        setSueldoBasico(sueldoBasico);
        setAntiguedad(antiguedad);
    }

    public Empleado() { //empty constructor
    }

    public String getNombre() { //needed setters and getters
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    //methods
    
    public abstract double calcularEfectividad();
    
    public double calcularSueldoACobrar(){
        return this.getSueldoBasico() + ((this.getSueldoBasico() / 10) * (this.getAntiguedad()));
    };
    
    public String toString(){
        String aux = ("Nombre: "+this.getNombre()+
                     ", sueldo a cobrar: "+this.calcularSueldoACobrar()+
                     ", efectividad: "+ this.calcularEfectividad());
        return aux;
    };
   
    
}
