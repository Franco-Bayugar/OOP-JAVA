/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

public class Triangulo extends Figura{
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3, String unCR, String unCL) {
        super(unCR, unCL);
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
       double per = this.calcularPerimetro()/2;
       double aux = per*((per - this.getLado1()) * (per - this.getLado2()) * (per - this.getLado3()));
       return Math.sqrt(aux);
    }

    @Override
    public double calcularPerimetro() {
        return this.getLado1()+this.getLado2()+this.getLado3();
    }
    
    @Override
    public void despintar(){
        super.despintar();
    }

    @Override
    public String toString() {
        String aux = super.toString() + 
                    " Lado 1: "+ this.getLado1() +
                    " Lado 2: "+ this.getLado2() +
                    " Lado 3: "+ this.getLado3();
        
        return aux;
    }
    
    

    

}
