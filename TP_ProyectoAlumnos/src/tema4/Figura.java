/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;


public abstract class Figura {
    private String colorRelleno; //variables
    private String colorLinea;
    
    //constructor
    public Figura(String unCR, String unCL){ 
        setColorRelleno(unCR);
        setColorLinea(unCL);
    }
    
    //metodo string con this para el metodo de la clase que los intancie
    public String toString(){ 
        String aux = "Area: " + this.calcularArea() +
                     " Perimetro: " + this.calcularPerimetro() + 
                     " CR: "  + getColorRelleno() + 
                     " CL: " + getColorLinea();             
        return aux;
       }

    //getters and setters
    public String getColorRelleno(){
        return colorRelleno;       
    }
    public void setColorRelleno(String unColor){
        colorRelleno = unColor;       
    }
    public String getColorLinea(){
        return colorLinea;       
    }
    public void setColorLinea(String unColor){
        colorLinea = unColor;       
    }
    
    //metodos que settean
    public void despintar(){
        this.setColorLinea("Negro");
        this.setColorRelleno("Blanco");
    }
    
    //metodos vacios
    public abstract double calcularArea();  
    public abstract double calcularPerimetro();
     
}
