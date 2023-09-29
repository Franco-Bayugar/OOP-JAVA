
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;

public class Ej02Jugadores {
    /*
    2- Escriba un programa que lea las alturas de los 15 jugadores de un equipo de
    básquet y las almacene en un vector. Luego informe:
    - la altura promedio
    - la cantidad de jugadores con altura por encima del promedio
    NOTA: Dispone de un esqueleto para este programa en Ej02Jugadores.java*/
  
    
    public static void main(String[] args) {
        int dimF = 15, i;
        double [] arrayAlturas = new double[dimF];
        double promedio = 0, suma = 0;
        int cantMasPromedio = 0;
        
        
        for(i=0; i<dimF; i++){
            arrayAlturas[i] = 0;
        } //inicializacion vector en 0
        
        for(i=0; i<dimF; i++){
            System.out.println("Ingrese la altura del jugador numero "+i);
            arrayAlturas[i] = Lector.leerDouble();
            suma = suma + arrayAlturas[i];
        }
        
        promedio = suma / i;
        System.out.print("Promedio de alturas: "+ promedio);
        
        for(i=0;i<dimF;i++){
            if(arrayAlturas[i] > promedio){
                cantMasPromedio++;
            }
        }
        
        System.out.println("Cantidad de jugadores con alturas superior al promedio: "+ cantMasPromedio);
      
    }
    
}
