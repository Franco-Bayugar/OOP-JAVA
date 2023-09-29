/*
Realice un programa que cree un objeto persona con datos leídos desde teclado. Luego
muestre en consola la representación de ese objeto en formato String. 
 */
package tema2;

import PaqueteLectura.Lector;

public class Ej01 {
    public static void main(String[] args) {
        //declaracion de variables
        Persona p = new Persona();
        
        //setteo de estado interno
        System.out.print("Nombre: "); 
        p.setNombre(Lector.leerString());
        System.out.print("DNI: ");
        p.setDNI(Lector.leerInt());
        System.out.print("Edad: ");
        p.setEdad(Lector.leerInt());
        
        //print objeto con methods
        System.out.println(p.toString());
        
                 
    }
}
