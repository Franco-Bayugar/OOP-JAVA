/*
4- Sobre un nuevo programa, modifique el ejercicio anterior para considerar que:

a) Durante el proceso de inscripción se pida a cada persona sus datos (nombre, DNI, edad)
y el día en que se quiere presentar al casting. La persona debe ser inscripta en ese día, en el
siguiente turno disponible. En caso de no existir un turno en ese día, informe la situación.
La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los 40 cupos
de casting.

Una vez finalizada la inscripción:

b) Informar para cada día: la cantidad de inscriptos al casting ese día y el nombre de la
persona a entrevistar en cada turno asignado.

*/

package tema2;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

/**
 *
 * @author DIBAS
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filaTurno = 8, columnaDia = 5, dia = 0, turno= 0, turnoCapacidadMax = 8, i, j, eleccionDia;
        String corte = "ZZZ";
        Persona [][] matriz = new Persona[columnaDia][filaTurno]; 
        int [] contador = new int[columnaDia];
        Persona p = new Persona(" ", 0, 0);
        
       //inicializacion matriz en null
        for(i=0;i<columnaDia;i++){
            for(j=0;j<filaTurno;j++){
                matriz[i][j] = null;
            }
        }
        
        //inicializacion vector contador
        for(i=0;i<contador.length;i++){
            contador[i]= 0;
        }
              
        while(!(p.getNombre().equals(corte))){
            p = new Persona(); //instancia de clase
            System.out.print("Nombre: ");
            p.setNombre(Lector.leerString()); //asignacion (...)           
            p.setDNI(GeneradorAleatorio.generarInt(1000));
            System.out.println("DNI: "+p.getDNI());           
            p.setEdad(GeneradorAleatorio.generarInt(100)); 
            System.out.println("Edad: "+p.getEdad());
            System.out.print("Dia (1..5) en que desea presentarse?: ");
            eleccionDia = Lector.leerInt();           
            
            //Asigno a turno el valor de la posicion de eleccion
            turno = contador[eleccionDia];      
          
            //si el contador en ese indice < 8
            if(contador[eleccionDia] < turnoCapacidadMax) {
                matriz[eleccionDia][turno]= p; //a la matriz en el dia seleccionado y turno (depende de su acumulacion)
                contador[eleccionDia]++; //ahora aumento el contador, al final, cuando ya asigne todo
                System.out.println("----------------------------------------");
                System.out.println("TURNO ASIGNADO");
                System.out.println("----------------------------------------");
            } else {
                System.out.println("----------------------------------------");
                System.out.println("NO SE PUDO ASIGNAR EL TURNO, DIA AGOTADO");
                System.out.println("----------------------------------------");
            }
        }
        
        //
        for(i=0;i<columnaDia;i++){
           System.out.println("Dia "+i+" cantidad de turnos: "+contador[i]);
           for(j=0;j<filaTurno;j++){
                if(matriz[i][j] != null) {
                    System.out.println("Nombre de los turnos: "+matriz[i][j].getNombre());
                }           
            }
        }       
    }
}
               
                
            
            
            
                
                
            
            
            
            
            
            
        
            
        
        
        
        
//            for(i=0;i<columnaDia;i++){
//                for(j=0;j<filaTurno;j++){
//                     if(matriz[i][j] != null){
//                        System.out.println(matriz[i][j].toString());              
//                     }       
//                 } 
//            }             
   
           

    

