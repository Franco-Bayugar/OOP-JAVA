/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoej01;

/**
 *
 * @author DIBAS
 */
public class Investigador {
    private String nombre, especialidad;
    private int categoria, diml, dimf = 5, cantSubsidios;
    private Subsidio[] arraySubsidios;

    
    public Investigador(String unNombre, int unaCategoria, String unaEspecialidad) {
        this.setNombre(unNombre);
        this.setCategoria(unaCategoria);
        this.setEspecialidad(unaEspecialidad);
        this.diml = 0;
        
        arraySubsidios = new Subsidio[dimf]; //INSTANCIA/MATERIALIZACION DE VECTOR
        for(int i=0;i<this.dimf;i++){   //SETEO DEL VECTOR
           arraySubsidios[i] = new Subsidio();
        }
    }

    public Investigador() {
        }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCantSubsidios() {
        return cantSubsidios;
    }

    public void setCantSubsidios(int cantSubsidios) {
        this.cantSubsidios = cantSubsidios;
    }
    
    public void agregarSubsidio(double monto, String motivo){
        if(this.diml < this.dimf){
            this.arraySubsidios[diml].setMontoPedido(monto);
            this.arraySubsidios[diml].setMotivo(motivo);
            this.arraySubsidios[diml].setOtorgado(true);
            this.diml++;
        }
    };
    
    public void otorgarTodos(){
        for(int i=0;i<dimf;i++){
            if(!this.arraySubsidios[i].isOtorgado()){
                this.arraySubsidios[i].setOtorgado(true);
                this.agregarSubsidio(this.arraySubsidios[i].getMontoPedido(), this.arraySubsidios[i].getMotivo());
            }
        }
    }
    
    public double cantidadTotalSubdidios(){
        double total = 0;
        for(int i=0; i<dimf;i++){
          total += this.arraySubsidios[i].getMontoPedido();
        }
        return total;
    }

    @Override
    public String toString() {
        String aux ="\nNombre del investigador: "+this.getNombre()+
                    "\nCategoria del inv.: "+this.getCategoria()+
                    "\nEspecialidad del inv.: "+this.getEspecialidad()+
                    "\nDinero total de subsidios al inv.: "+this.cantidadTotalSubdidios()+
                    "\n========================================:";
        
        return aux;
    }
    
    
    
}
