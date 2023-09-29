package tema1;
 /*3- Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice
la matriz con números aleatorios entre 0 y 30.
Luego realice las siguientes operaciones:
- Mostrar el contenido de la matriz en consola.
- Calcular e informar la suma de los elementos de la fila 1
- Generar un vector de 5 posiciones donde cada posición j contiene la suma
de los elementos de la columna j de la matriz. Luego, imprima el vector.
- Lea un valor entero e indique si se encuentra o no en la matriz. En caso de
encontrarse indique su ubicación (fila y columna) en caso contrario
imprima “No se encontró el elemento”*/

import PaqueteLectura.GeneradorAleatorio;   
import PaqueteLectura.Lector;

public class Ej03Matrices {

    public static void main(String[] args) {
	//variables
        int filas=5, columnas=5, dimF=5;
        int [][] matriz = new int [filas][columnas];
        int i, j;
        int sumaFila = 0, sumaColumna = 0, sumaVector = 0, buscar;
        int [] arraySuma = new int [dimF];
        boolean exito;
        
        //p.p
        GeneradorAleatorio.iniciar(); 
        //inciso 1
        for(i=0;i<filas;i++){
            for(j=0;j<columnas;j++){
                matriz[i][j] = GeneradorAleatorio.generarInt(31);
            }
        }
        
        //inciso 2
        for(i=0;i<filas;i++){
            for(j=0;j<columnas;j++){
                System.out.print("/"+matriz[i][j]);
            }
            System.out.println();
        }
        
        //inciso 3 - SUMA ELEMENTOS DE FILA 1 (FILA FIJA COLUMNA VARIABLE)
        for(j=0;j<columnas;j++){
            sumaFila += matriz[0][j];
        }
        System.out.println("Suma de los elementos de la fila 1: "+sumaFila);
        
        //inciso mio 3 - SUMA COLUMNA 2 (COLUMNA FIJA, FILA VARIABLE)
        for(i=0;i<filas;i++){
            sumaColumna += matriz[i][0];
        }
        System.out.println("Suma de los elementos de la columna 1: "+sumaColumna);

        
        //inciso 4 - Generar un vector de 5 posiciones donde cada posición j contiene la suma
        //          de los elementos de la columna j de la matriz. Luego, imprima el vector.
        
        for(j=0; j<dimF; j++){
           arraySuma[j] = 0;
        }
        for(i=0;i<dimF;i++){
            System.out.print(arraySuma[i] + "-");
        }
        System.out.println();
        
        for(i=0; i<dimF; i++){                  //loop vector
            for(j=0; j<columnas; j++){            //loop columnas con columna fija
                arraySuma[i] += matriz[j][i];
            }      
        }
        
         for(i=0; i<dimF; i++)
             System.out.println("Suma columna "+i+" es: "+arraySuma[i]);

        //- Lea un valor entero e indique si se encuentra o no en la matriz. En caso de
        //encontrarse indique su ubicación (fila y columna) en caso contrario
        //imprima “No se encontró el elemento”*/  
        
        System.out.println("Ingrese int a leer: ");
        exito= false;
        buscar = Lector.leerInt();
        
        
        for(i=0;i<filas;i++){
            for(j=0;j<columnas;j++){
                if(matriz[i][j] == buscar){
                    exito = true;
                    System.out.println("Valor encontrado, fila "+(i)+" y columna "+(j));   
                }
            }
        }
        
        if(!exito){
            System.out.println("Valor no encontrado");   
        }
        
    }
}
