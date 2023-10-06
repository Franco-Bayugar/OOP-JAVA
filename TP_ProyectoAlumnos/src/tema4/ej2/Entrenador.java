
package tema4.ej2;

public class Entrenador extends Empleado{
    private int cantCampeonatosGanados;

    public Entrenador(String nombre, Double sueldoB, int ant, int x) {
        super(nombre, sueldoB, ant);
        setCantCampeonatosGanados(x);
    }

    public Entrenador() {
    }
    

    public int getCantCampeonatosGanados() {
        return cantCampeonatosGanados;
    }

    public void setCantCampeonatosGanados(int cantCampeonatosGanados) {
        this.cantCampeonatosGanados = cantCampeonatosGanados;
    }
    
//    public abstract double calcularEfectividad();
//    public abstract double calcularSueldoACobrar();
    //La efectividad del entrenador es el promedio de campeonatos ganados por año de antigüedad
    
    @Override
    public double calcularEfectividad(){
        return (this.getCantCampeonatosGanados() / this.getAntiguedad());
    };
    
    @Override
    public double calcularSueldoACobrar(){
        double aux = super.calcularSueldoACobrar();
        //extra
        if(this.getCantCampeonatosGanados() >= 1 && this.getCantCampeonatosGanados() <= 4) {
            aux += 5000;
        } else if (this.getCantCampeonatosGanados() >= 5 && this.getCantCampeonatosGanados() <= 10){
            aux += 30000;
        } else if (this.getCantCampeonatosGanados() > 10) {
            aux += 50000;
        }
        
        return aux;
    }
    
    
    
}
