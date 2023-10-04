/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import PaqueteLectura.Lector;
public class Ej04 {

   
    public static void main(String[] args) {
        System.out.print("Generar hotel de n posiciones, n (poner 5: ");
        int n = Lector.leerInt(), pos;
        System.out.println("======");
        Hotel h = new Hotel(n);
        Cliente c1, c2, c3, c4;
        double monto =0;
        
        h = new Hotel(n);
        //carga de datos cliente
        c1 = new Cliente("Franco", 40897, 26);
        c2 = new Cliente("Fabricio", 345345, 26);
        c3 = new Cliente("Fuu", 434325, 22);
        c4 = new Cliente("Dio", 55433, 26);
        
        h.cargarHabitacion(c1, 0);
        h.cargarHabitacion(c2, 1);
        h.cargarHabitacion(c3, 2);
        h.cargarHabitacion(c4, 3);
        
        System.out.println(h.printearHotel());
        System.out.print("Incrementar costo de habitaciones en: ");
        h.aumentarPrecio(Lector.leerDouble());
        System.out.println(h.printearHotel());




    }
    
}
