/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.ej3;

/**
 *
 * @author DIBAS
 */
public class Trabajador extends Persona{
    private String tarea;

    public Trabajador(String nombre, int DNI, int edad, String tarea) {
        super(nombre, DNI, edad);
        setTarea(tarea);
    }

    public Trabajador() {
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    
    @Override
    public String toString(){
        String aux = super.toString() + " Soy "+this.getTarea()+".";
        return aux;
    }
    
    
    
}
