package tema1;
//5- El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen
//(con puntaje de 1 a 10) los siguientes aspectos: (0) Atención al cliente (1) Calidad
//de la comida (2) Precio (3) Ambiente.
//Escriba un programa que lea desde teclado las calificaciones de los cinco clientes
//para cada uno de los aspectos y almacene la información en una estructura. Luego
//imprima la calificación promedio obtenida por cada aspecto.
import PaqueteLectura.Lector;

public class Ej05 {
    public static void main(String[] args) {
    
    //declaracion de variables
    String [] aspectos = {"Atencion al cliente", "Calidad de la comida", "Precio", "Ambiente"};
    int clientes= 5, notas=4, matrizCalificaciones [][] = new int [clientes][notas], i, j, suma=0;
    
    //p.p
    
    //Carga de datos
    for(i=0;i<clientes;i++){
        System.out.println("Cliente numero: "+(i+1));
        for(j=0;j<notas;j++){
            System.out.println(aspectos[j]+": ");
            matrizCalificaciones[i][j] = Lector.leerInt();
        }
    }  
    //Calculo Promedio -> Aspectos son columnas, fijo columna itero filas
    for(i=0;i<notas;i++){
        for(j=0;j<clientes;j++){
            suma += matrizCalificaciones[j][i];
        }
        System.out.println("Promedio en "+aspectos[i]+": "+(suma/5));
        suma = 0;
    } 
    }
    }    
