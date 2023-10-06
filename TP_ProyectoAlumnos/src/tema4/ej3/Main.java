/*
B- Realice un programa que instancie una persona y un trabajador y muestre la
representación de cada uno en consola.
 */
package tema4.ej3;


public class Main {

    public static void main(String[] args) {
       Persona P = new Persona("Franco", 40404040, 25);
       Trabajador T = new Trabajador("Sebastian", 41414141, 26, "Peluquero");
       
        System.out.println(P.toString());
        System.out.println(T.toString());
    }
    
}
