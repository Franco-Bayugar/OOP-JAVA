/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

public class Circulo extends Figura{
    private double radio;
    
    //constructor que, con super hereda lo del parent + setteo de la variable propia Radio
    public Circulo(double radio, String unCR, String unCL) {
        super(unCR, unCL);
        this.setRadio(radio);
    }

    //getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodos abstractos (vienen vacios) del parent    
    @Override
    public double calcularArea() {
        return (Math.PI * (this.getRadio()*this.getRadio()));
    }

    @Override
    public double calcularPerimetro() {
        return (2*Math.PI*this.getRadio());
    }
    
    @Override
    public void despintar(){
        super.despintar();
    }

    @Override
    public String toString() {
        String aux = super.toString() + " Radio: " + this.getRadio();
        return aux;
    }
    
    
    
}
