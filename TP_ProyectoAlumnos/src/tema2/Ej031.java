
package tema2;
import PaqueteLectura.Lector;

public class Ej031 {
    public static void main(String[] args) {
        int filaTurno = 8, columnaDia = 5, dia = 0, turno= 0, turnoCapacidadMax = 8, i, j;
        String corte = "ZZZ";
        Persona [][] matriz = new Persona[columnaDia][filaTurno]; 
        Persona p = new Persona(" ", 0, 0);
        
        //matriz se carga implicitamente en null
            
        while((dia<5) && !(p.getNombre().equals(corte))){
            p = new Persona(); //instancia de clase
            System.out.print(" Nombre: ");
            p.setNombre(Lector.leerString()); //asignacion (...)
            System.out.print(" DNI: ");
            p.setDNI(Lector.leerInt());
            System.out.print(" Edad: ");
            p.setEdad(Lector.leerInt());           
            matriz[dia][turno] = p; //asignacion a la posicion en la matriz
            System.out.println("Turno asignado al dia "+dia+" y turno "+turno);
            turno++; //aumento del turno
            if(turno == turnoCapacidadMax){
                System.out.println("Dia "+dia+" terminado.");
                turno = 0;
                dia++;
                System.out.println("Nuevo cupo de turnos, dia "+dia);
                System.out.println("---");
            }            
        }
        
        for(i=0;i<columnaDia;i++){
            for(j=0;j<filaTurno;j++){
                if(matriz[i][j] != null){
                   System.out.println(matriz[i][j].toString());
                }
            }       
        }
        
        

        
    }
    
}
