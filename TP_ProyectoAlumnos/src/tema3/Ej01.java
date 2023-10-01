/*1-A- Definir una clase para representar triángulos. 

Un triángulo se caracteriza por:
- el tamaño de sus 3 lados (double)
- el color de relleno (String)
- el color de línea (String).

Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
Provea métodos para:

- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
- Calcular el perímetro y devolverlo (método calcularPerimetro)
- Calcular el área y devolverla (método calcularArea)

B- Realizar un programa que instancie un triángulo, le cargue información leída desde
teclado e informe en consola el perímetro y el área.
*/


package tema3;

import PaqueteLectura.Lector;
public class Ej01 {

    public static void main(String[] args) {
        //instanciacion de la Class
        Triangulo t = new Triangulo();
        
        //cargar de datos
        System.out.print("Lado 1:");
        t.setLado1(Lector.leerDouble());
        System.out.print("Lado 2: ");
        t.setLado2(Lector.leerDouble());
        System.out.print("Lado 3: ");
        t.setLado3(Lector.leerDouble());
        System.out.print("Color relleno: ");
        t.setRelleno(Lector.leerString());
        System.out.print("Color linea: ");
        t.setLinea(Lector.leerString());

        //utilizacion de metodos
        System.out.println("Triangulo cargado con exito -> "+t.toString());
        
        System.out.println("Perimetro del triangulo: "+t.calcularPerimetro());
        System.out.println("Area del triangulo: "+t.calcularArea());
    }
    
}
