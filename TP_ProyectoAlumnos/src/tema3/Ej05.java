/*
B- Realizar un programa que instancie un círculo, le cargue información leída de teclado e
informe en consola el perímetro y el área. 
 */
package tema3;

import PaqueteLectura.Lector;
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //variables
       Circulo c = new Circulo(Lector.leerInt(),Lector.leerString(),Lector.leerString());

       //p.p
       System.out.println("Perimetro: "+c.calcularPerimetro());
       System.out.println("Area: "+c.calcularArea());
    }    
}
