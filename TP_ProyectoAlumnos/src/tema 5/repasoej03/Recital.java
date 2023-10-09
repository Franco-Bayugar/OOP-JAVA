
package repasoej03;

public abstract class Recital {
    private String nombreBanda;
    private String[] listaTemas;
    private int diml;
    
    public Recital(String nombreBanda, int cantTemas) { //constructor recital
        this.setNombreBanda(nombreBanda);
        //instanciar vector
        listaTemas = new String[cantTemas];
        //inicializacion diml
        this.setDiml(0);
        //inicializar vector
        for(int i=0; i<cantTemas;i++){
            listaTemas[i] = null;
        }
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public String[] getListaTemas() {
        return listaTemas;
    }

    public int getDiml() {
        return diml;
    }

    public void setDiml(int diml) {
        this.diml = diml;
    }
    

    
    //metodos
    
    public void agregarTema(String unNombre){
        if(this.getDiml() < this.getListaTemas().length){
            this.getListaTemas()[this.getDiml()] = unNombre;
            this.diml++;
        }
    }    
    
    public String actuar(){
        String aux = " y ahora tocaremos:";
        for(int i=0;i<this.getDiml();i++){
            aux += "\n-"+this.getListaTemas()[i];
        }
        return aux;
    }

    public abstract double calcularCosto();
    
}