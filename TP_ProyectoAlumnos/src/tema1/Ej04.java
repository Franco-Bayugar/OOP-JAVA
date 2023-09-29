//4- Un edificio de oficinas está conformado por 8 pisos (1..8) y 4 oficinas por piso
//(1..4). Realice un programa que permita informar la cantidad de personas que
//concurrieron a cada oficina de cada piso. Para esto, simule la llegada de personas al
//edificio de la siguiente manera: a cada persona se le pide el nro. de piso y nro. de
//oficina a la cual quiere concurrir. La llegada de personas finaliza al indicar un nro.
//de piso 9. Al finalizar la llegada de personas, informe lo pedido.
package tema1;
import PaqueteLectura.Lector;
//imports
public class Ej04 {
     public static void main(String[] args) {
    //variables
    int pisos=8, oficinas=4, i, j, p=0, o;
    int [][] edificio = new int [pisos][oficinas];
 
    //p.p
    for(i=0;i<pisos;i++){ //Inicializar matriz en 0
        for(j=0;j<oficinas;j++){
            edificio[i][j] = 0;
        }
    }
    //a cada persona se le pide el nro. de piso y nro. de oficina a la cual quiere concurrir. 
    //La llegada de personas finaliza al indicar un nro. de piso 9.
    // Al finalizar la llegada de personas, informe lo pedido. 
    while(p != 9){
        System.out.println("Ingrese el piso: ");
        p = Lector.leerInt();
        if(p != 9){
            System.out.println("Ingrese la oficina: ");
            o = Lector.leerInt();
            edificio[p-1][o-1]++;
        }
    }
    //print de datos
    for(i=0;i<pisos;i++){
        for(j=0;j<oficinas;j++){
            System.out.println("Cantidad de gente en la oficina "+(j+1)+" del piso "+(i+1)+": "+edificio[i][j]);
        }
    }
}    
}
