/*3- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en
cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
personas primero completan el primer día en turnos sucesivos, luego el segundo día y así
siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los
40 cupos de casting.
Una vez finalizada la inscripción:
b) Informar para cada día y turno asignado, el nombre de la persona a entrevistar.
NOTA: utilizar la clase Persona. Pensar en la estructura de datos a utilizar. Para comparar
Strings use el método equals*/
package tema2;

import PaqueteLectura.Lector;
public class Ej03 {
    public static void main(String[] args) {
        int filaTurno = 8, columnaDia = 5, i, j;
        Persona [][] matriz = new Persona[filaTurno][columnaDia];
        Persona p = new Persona(" ", 0, 0);
        String corte = "ZZZ";
        
        //inicializacion matriz en null
        for(i=0;i<filaTurno;i++){
            for(j=0;j<columnaDia;j++){
                matriz[i][j] = null;
            }
        }
            //primero cargo dia 1..5; el DIA va a ser la COLUMNA y ca/u de los elementos de la columna es el turno
            for(i=0;i<columnaDia;i++){                 
                 //adentro asigno desde 1..8, los TURNOS de la columna fija, las FILAS ITERAN
                for(j=0;j<filaTurno;j++){
                    if(!(p.getNombre().equals(corte))){
                        p = new Persona(); //instancia de la clase
                        System.out.println("Nombre: ");
                        p.setNombre(Lector.leerString());
                        System.out.println("DNI: ");
                        p.setDNI(Lector.leerInt());
                        System.out.println("edad: ");
                        p.setEdad(Lector.leerInt());
                        System.out.println("---- ");
                        matriz[j][i] = p;
                    }                         
                }
            }

           
       /* b) Informar para cada día y turno asignado, el nombre de la persona a entrevistar.
            NOTA: utilizar la clase Persona. Pensar en la estructura de datos a utilizar. Para comparar
            Strings use el método equals*/
        for(i=0;i<columnaDia;i++){
            for(j=0;j<filaTurno;j++){
                if(matriz[i][j] != null){
                    System.out.println(matriz[i][j].toString()); 
                }            
            }
        }
 } 
 }
    

