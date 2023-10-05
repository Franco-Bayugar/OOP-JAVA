/*
1-A- Incluya la clase Triángulo a la jerarquía de figuras vista (carpeta tema4). Triángulo
debe heredar de Figura todo lo que es común y definir su constructor y sus atributos y
métodos propios. Además debe redefinir el método toString.
B- De igual manera, incluya la clase Círculo a la jerarquía de figuras.
C- Añada a la representación String el valor del perímetro. Piense ¿qué método toString
debe modificar: el de cada subclase o el de Figura?
D- Añada el método despintar que establece los colores de la figura a línea “negra” y
relleno “blanco”. Piense ¿dónde debe definir el método: en cada subclase o en Figura?
E- Realizar un programa que instancie un triángulo y un círculo. Muestre en consola la
representación String de cada uno. Pruebe el funcionamiento del método despintar.

 */
package tema4;


public class DemoFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado cuad = new Cuadrado(10,"Rojo", "Negro");
        System.out.println("Color linea: " + cuad.getColorLinea()); 
        System.out.println("Area: " + cuad.calcularArea()); 
        System.out.println("Representacion del cuadrado: " + cuad.toString()); 
       
    }
    
    
    
}
