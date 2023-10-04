/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import PaqueteLectura.GeneradorAleatorio;

public class Hotel {
    private Habitacion[] arrayHabitaciones;
    private int dimf, diml, pos = 0;

    public Hotel(int dimf) {
        this.dimf = dimf;
        this.diml = 0;
        //Habitacion hab; //declaracion de la variable habitacion
        arrayHabitaciones = new Habitacion[dimf]; //instancia el vector
        for(int i=0;i<dimf;i++){
            arrayHabitaciones[i] = new Habitacion(GeneradorAleatorio.generarDouble(8000-2000)+2000, false, pos); //inicializo el vector
        }
    }
    
    //metodos
    public void cargarHabitacion(Cliente c, int pos){
        if(!arrayHabitaciones[pos].isOcupada() ){
            arrayHabitaciones[pos].setCliente(c);
            arrayHabitaciones[pos].setOcupada(true);
            diml++;
        } else {
            System.out.println("Room requested by: "+arrayHabitaciones[pos].getCliente().getNombre());
        }
        
    }
    
//{Habitación 1: costo, libre u ocupada, información del cliente si está ocupada} 
    public String printearHotel(){
        String aux ="";
        for(int i=0;i<this.diml;i++){
            aux += "\n<Habitacion "+i+"> costo: "+arrayHabitaciones[i].getCostoNoche()
                    +", ocupada: "+arrayHabitaciones[i].isOcupada()
                    +", cliente: "+arrayHabitaciones[i].getCliente().toString();                    
        } 
        return aux;
    }
    
  
    
     public void aumentarPrecio(double monto){
        for(int i=0;i<this.diml;i++){
            arrayHabitaciones[i].setCostoNoche(arrayHabitaciones[i].getCostoNoche() + monto);     
        }   
    }
}
