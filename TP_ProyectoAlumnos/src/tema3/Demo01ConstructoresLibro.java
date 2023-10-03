/*B- Modifique el programa Demo01Constructores (carpeta tema3) para instanciar los
libros con su autor, considerando las modificaciones realizadas. Luego, a partir de uno de
los libros instanciados, obtenga e imprima la representación del autor de ese libro.*/
package tema3;
import PaqueteLectura.Lector;
public class Demo01ConstructoresLibro {
    public static void main(String[] args) {
        
        //Instanciamiento de Autor
        Autor A = new Autor("Gabriel G. Marquez", 
                            "Colombian novelist, short-story writer, screenwriter, and journalist", 
                            "Colombia");
        Libro libro1= new  Libro("Java A Beginner's Guide",   
                                 "Mcgraw-Hill",
                                 2014,   
                                 A, 
                                 "978-0071809252", 
                                 21.72);
        
        //Otro instanciamiento de Autor
        Autor A2 = new Autor("Jorge Luis Borges", 
                            "short-story writer, essayist, poet and translator regarded", 
                            "Argentina");
        Libro libro2= new Libro("Learning Java by Building Android Games",  
                                "CreateSpace Independent Publishing", 
                                A2, 
                                "978-1512108347");
        
        System.out.println("Libro 1: "+ libro1.toString());
        System.out.println("------------------------------");
        System.out.println("Libro 2: "+ libro2.toString());
        System.out.println("------------------------------");
        System.out.println("Precio del Libro 2: " +libro2.getPrecio());
        System.out.println("Año edición del libro2: " +libro2.getAñoEdicion());
        System.out.println("------inicia ejemplo con carga de datos-------");
        //Ejemplo usando los constructores vacios para cargar datos manualmente en consola
        Libro libro3= new Libro(); //instanciamiento Libro
        Autor A3 = new Autor(); //instanciamiento Autor
        
        //titulo, editorial, anio, {a}, isnb, precio        
        System.out.println("Titulo: "); libro3.setTitulo(Lector.leerString());
        System.out.println("Editorial: ");  libro3.setEditorial(Lector.leerString());
        System.out.println("A;o de edicion: "); libro3.setAñoEdicion(Lector.leerInt());
          
        System.out.println("-Datos del autor-");//cargo datos de la subclase autor
        System.out.println("Nombre: "); A3.setNombre(Lector.leerString());
        System.out.println("Biografia: ");  A3.setBiografia(Lector.leerString());
        System.out.println("Origen: "); A3.setOrigen(Lector.leerString());
        libro3.setAutor(A3); //asigno el objeto cargado Autor a la propiedad Autor de la clase Libro
       
        System.out.println("ISBN (es String): ");libro3.setISBN(Lector.leerString());
        System.out.println("Precio: ");libro3.setPrecio(Lector.leerDouble());
        
        System.out.println("");
        System.out.println("Libro 3: "+libro3.toString());
    }
}
