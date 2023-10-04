
package tema3;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

public class Ej03 {

    public static void main(String[] args) {
        //variables       
        System.out.println("Generar estante de n posiciones, n: ");
        int n = Lector.leerInt();
        Estante e = new Estante(n);
        
        Libro l = new Libro();
        Autor a = new Autor();
        
        //p.p
        //instanciacion 
        e = new Estante(n); 
        //INSTANCIAR EL OBJETO MAYOR FUERA DEL ITERACIONAL   
        do{
            //instanciar
            l = new Libro();
            a = new Autor();
            //carga de datos
            System.out.print("Titulo: "); l.setTitulo(Lector.leerString());
            if(!l.getTitulo().equals("zzz") ){
                System.out.print("Editorial: ");  l.setEditorial(Lector.leerString());
                System.out.print("A;o de edicion: "); l.setAñoEdicion(Lector.leerInt());

                System.out.println("-Datos del autor-");//cargo datos de la subclase autor
                System.out.print("Nombre: "); a.setNombre(Lector.leerString());
                System.out.print("Biografia: ");  a.setBiografia(Lector.leerString());
                System.out.print("Origen: "); a.setOrigen(Lector.leerString());
                l.setAutor(a); //asigno el objeto cargado Autor a la propiedad Autor de la clase Libro

                System.out.print("ISBN (es String): ");l.setISBN(Lector.leerString());
                System.out.print("Precio: ");l.setPrecio(Lector.leerDouble());
                e.agregarLibro(l);
                System.out.println("-------------");
            }
        } while((!e.estanteLleno()));
        System.out.println("Cantidad libros almacenados: "+ e.cantLibrosAlmacenados());
        System.out.println("Titulo a buscar: ");
        System.out.print(e.buscarLibro(Lector.leerString())); 
        
    }
}
