/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoej03;

/**
 *
 * @author DIBAS
 */
public class Fecha {
    private int dia;
    private int mes;
    private String ciudad;

    public Fecha(int dia, int mes, String ciudad) {
        this.setDia(dia);
        this.setMes(mes);
        this.setCiudad(ciudad);
    }

    public Fecha() {
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }
    
 
    
}
