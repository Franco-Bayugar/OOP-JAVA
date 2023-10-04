/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import PaqueteLectura.GeneradorAleatorio;
public class Habitacion {
    private double costoNoche;
    private boolean ocupada;
    private Cliente cliente;
    private int numero;

    public Habitacion(double costoNoche, boolean ocupada, int numero) {
        this.costoNoche = costoNoche;
        this.ocupada = ocupada;
        this.numero = numero;
    }

    public Habitacion(double costoNoche, boolean ocupada, Cliente cliente, int numero) {
        this.costoNoche = costoNoche;
        this.ocupada = ocupada;
        this.cliente = cliente;
        this.numero = numero;
    }
 
    public Habitacion() {    
    }
    
    public double getCostoNoche() {
        return costoNoche;
    }

    public void setCostoNoche(double costoNoche) {
        this.costoNoche = costoNoche;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "costoNoche=" + costoNoche + ", ocupada=" + ocupada + ", cliente=" + cliente + '}';
    }
    
    
}
