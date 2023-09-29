/*
2- Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta
obtener edad 0. Luego de almacenar la información:
 - Informe la cantidad de personas mayores de 65 años.
 - Muestre la representación de la persona con menor DNI.
 */
package tema2;

import PaqueteLectura.GeneradorAleatorio;

public class Ej02 {
    public static void main(String[] args) {
        //declaraciond variables
        int dimf = 15, diml= 0, counter = 0, dniMenor = 999, i;
        Persona [] arrayPersonas = new Persona[dimf];
        Persona p = new Persona();
        //carga de datos 
     
        System.out.println("Array lenght: "+arrayPersonas.length);
        do{ 
            p = new Persona();  //INSTANCIAR LA CLASE EN CADA ITERACION PARA TENER UNA NUEVA REFERENCIA!!!
            p.setNombre(GeneradorAleatorio.generarString(10));
            p.setDNI(GeneradorAleatorio.generarInt(55));
            p.setEdad(GeneradorAleatorio.generarInt(100));
            if(p.getEdad() > 65) counter++;           
            arrayPersonas[diml] = p;       
            System.out.println(arrayPersonas[diml].toString());
            diml++;      
        } while(p.getEdad() != 0 && diml < dimf);
        
    
        //actualizacion de minimos
        for(i=0;i<diml;i++){
            if(arrayPersonas[i].getDNI() < dniMenor){
                dniMenor = arrayPersonas[i].getDNI();
            }
        }
        
        //print de datos 
        System.out.println("Cantidad de personas mayores a 65: "+ counter);
        System.out.println("La persona con el menor DNI: "+ dniMenor);
              
    }
}
