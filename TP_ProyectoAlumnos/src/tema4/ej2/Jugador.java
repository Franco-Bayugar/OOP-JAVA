
package tema4.ej2;


public class Jugador extends Empleado {
    private int nroPartidosJugados;
    private int nroGoles;

    public Jugador(String nombre, double sueldoBasico, int antiguedad, int n, int x) {
        super(nombre, sueldoBasico, antiguedad);
        setNroPartidosJugados(n);
        setNroGoles(x);
    }

    public Jugador() {
    }

    public int getNroPartidosJugados() {
        return nroPartidosJugados;
    }

    public void setNroPartidosJugados(int nroPartidosJugados) {
        this.nroPartidosJugados = nroPartidosJugados;
    }

    public int getNroGoles() {
        return nroGoles;
    }

    public void setNroGoles(int nroGoles) {
        this.nroGoles = nroGoles;
    }

    //metodos overrideados
    @Override
    public double calcularEfectividad() {
        return (this.nroGoles / this.nroPartidosJugados);
    }

    @Override
    public double calcularSueldoACobrar() {
        double aux = super.calcularSueldoACobrar();
        if(this.calcularEfectividad() > 0.5){
            aux = aux*2;
        }
        return aux;
    }
    
    

    
    
}
