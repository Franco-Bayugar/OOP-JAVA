/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoej02;

public class Estacionamiento {
    private String nombre;
    private String direccion;
    private int horaApertura;
    private int horaCierre;
    private Auto[][] matrizEstacionamiento;
    private int piso, plaza;

    public Estacionamiento(String nombre, String direccion) { //CONSTRUCTOR 1
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setHoraApertura(8);
        this.setHoraCierre(21);
        
        this.setPiso(5);
        this.setPlaza(10);
        this.matrizEstacionamiento = new Auto[this.getPiso()][this.getPlaza()]; //Instanciamiento Matriz
        for(int i= 0; i<this.getPiso(); i++){
            for(int j=0; j<this.getPlaza();j++){
                this.matrizEstacionamiento[i][j] = null; //Inicializacion Matriz
            }
        }
    }
    
    public Estacionamiento(String nombre, String direccion, int hA, int hC, int N, int M) {  //CONSTRUCTOR 2
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setHoraApertura(hA);
        this.setHoraCierre(hC);
        this.setPiso(N);
        this.setPlaza(M);
        
        this.matrizEstacionamiento = new Auto[this.getPiso()][this.getPlaza()]; //Instanciamiento Matriz
        for(int i= 0; i<this.getPiso(); i++){
            for(int j=0; j<this.getPlaza();j++){
                this.matrizEstacionamiento[i][j] = null; //Inicializacion Matriz
            }
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setHoraApertura(int horaApertura) {
        this.horaApertura = horaApertura;
    }

    public void setHoraCierre(int horaCierre) {
        this.horaCierre = horaCierre;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }

    public int getPiso() {
        return piso;
    }

    public int getPlaza() {
        return plaza;
    }


    //METHODS

    public void ingresarAuto(Auto A, int X, int Y){ //instanciar auto???????
        this.matrizEstacionamiento[X][Y] = new Auto(A.getNombreDueno(), A.getPatente());
    }
    
    public String retornarAuto(String unaPatente){
        for(int i=0;i<this.getPiso();i++){
            for(int j=0;j<this.getPlaza();j++){
                if(this.existeAuto(i, j)&& this.matrizEstacionamiento[i][j].getPatente().equals(unaPatente)){
                    return "Auto encontrado ||| Piso: "+i+" Plaza: "+j;
                } 
            }
        } return "Auto inexistente";
    }

    private boolean existeAuto(int x,int y){
         return(this.matrizEstacionamiento[x][y] != null);
    }
    
    @Override
    public String toString() {  //REVISAR!!!!!!!
        String aux ="";
        for(int i=0;i<this.getPiso();i++){
            for(int j=0;j<this.getPlaza();j++){
                aux += "\nPiso "+i+" Plaza "+j;
                if(this.existeAuto(i, j)){
                    aux+= " Datos del auto: "+this.matrizEstacionamiento[i][j].toString();
                }
                else {
                    aux+= " Libre.";
                }
                aux += "\n=================================";
            }
        }
    return aux;
    }
    
    
    public int sumaPlazas(int Y){ //quiero saber las plazas, entonces en plaza me quedo fijo y muevo en pisos
        int total = 0;
        for(int i=0;i<this.getPiso();i++){
            if(this.matrizEstacionamiento[i][Y] != null){
                total++;
            }
        }
        return total;
    }
  
    
    
    
    
    
}
