/*
3-A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
un construcImplemente un constructor que permita iniciar el estante sin libros. Provea métodos para: 

(i) devolver la cantidad de libros que almacenados 
(ii) devolver si el estante está lleno
(iii) agregar un libro al estante
(iv) devolver el libro con un título particular que se recibe.
 */
package tema3;

/**
 *
 * @author DIBAS
 */
public class Estante {
    private int diml =0, dimf;
    private Libro[] arrayEstante;
    
    
    //constructor

    public Estante(int dimf){ //si lo dejo vacio, al cargarle algo me da error, necesito que tenga la instancia del objeto
        this.dimf = dimf;
        arrayEstante = new Libro[dimf];      
    }

    
    
    //metodos
    //(i) devolver la cantidad de libros que almacenados
    public int cantLibrosAlmacenados() {
        return diml;
    }
    //ii) devolver si el estante está lleno
    public boolean estanteLleno(){
        return diml == dimf; // -> true si esta lleno
    }
    
    //(iii) agregar un libro al estante
    public void agregarLibro(Libro unLibro){
        if(!this.estanteLleno()){
            arrayEstante[diml] = unLibro;
            diml++;
            System.out.println("diml actualizada: "+diml);
        } else {
            System.out.println("ESTANTE LLENO");
        }
        
    }
    
    //(iv) devolver el libro con un título particular que se recibe.
    public Libro buscarLibro(String unTitulo){
        for(int i=0; i<diml;i++){
            if(arrayEstante[i].getTitulo().equals(unTitulo)){
                return arrayEstante[i];
            }            
        }
        return null;
    }

    
}
