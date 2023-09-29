/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import PaqueteLectura.GeneradorAleatorio;

public class Ej01Tabla2 {

    /*
    1- Analice el programa Ej01Tabla2.java, que carga un vector que representa la
    tabla del 2. Luego escriba las instrucciones necesarias para:
    - generar enteros aleatorios hasta obtener el número 11. Para cada número
    muestre el resultado de multiplicarlo por 2 (accediendo al vector).
    */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar(); 
        int DimF=11;  
        int [] tabla2 = new int[DimF]; // indices de 0 a 10
        int i,random;
        for (i=0;i<DimF;i++) {
            tabla2[i]=2*i;  
            System.out.println(i +" multiplicado 2: " +tabla2[i]);
        }
        
        
        System.out.println("----------------");
        
        random = GeneradorAleatorio.generarInt(12);
        System.out.println("Numero generado: "+random+", Multiplicado * 2 = "+random*2);
        while(random != 11){
            System.out.println("Numero generado: "+random+", Multiplicado * 2 = "+random*2);
            random = GeneradorAleatorio.generarInt(12);
        }  
        System.out.println("Termino la ejecucion de numeros random, encontrada la condicion: "+random);
        
    }
    
}
