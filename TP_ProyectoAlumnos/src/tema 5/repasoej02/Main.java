
package repasoej02;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Main {


    public static void main(String[] args) {
        //String nombre, String direccion, int hA, int hC, int N, int M
        Estacionamiento E = new Estacionamiento("Estacionamiento24hs", "San Martin 999", 8, 21, 5, 3);
        GeneradorAleatorio.iniciar();
        
        Auto A1 = new Auto("Franco Martinez", "GFK 274");
        Auto A2 = new Auto("Marcela Nanda", "ASD 123");
        Auto A3 = new Auto("Carla Quimera", "GFD 524");
        Auto A4 = new Auto("Sebastian Poloi", "VCX 645");
        Auto A5 = new Auto("Alberto Marolo", "FEW 642");
        Auto A6 = new Auto("Paulo Piuz", "POI 987");
        // {0, 1, 2}
        E.ingresarAuto(A1, 0, 0);
        E.ingresarAuto(A2, 1, 0);
        E.ingresarAuto(A3, 2, 0);
        E.ingresarAuto(A4, 3, 0);
        E.ingresarAuto(A5, 4, 0);
        E.ingresarAuto(A6, 2, 2);
        
       System.out.println("=====PRINTEO ESTACIONAMIENTO======");
       System.out.println(E.toString());
       
       System.out.println("=====CANTIDAD DE PLAZAS X OCUPADAS======");
       System.out.print("Saber ocupacion de la plaza numero: ");
       System.out.println(E.sumaPlazas(Lector.leerInt()));
       
       System.out.println("=====BUSCAR AUTO EN ESTACIONAMIENTO======");
       System.out.println(E.retornarAuto(Lector.leerString()));
       
    }
    
}
