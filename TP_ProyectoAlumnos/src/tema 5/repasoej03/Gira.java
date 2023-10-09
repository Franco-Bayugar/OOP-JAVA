
package repasoej03;

public class Gira extends Recital{
    private String nombreGira;
    private Fecha[] arrayFechas;
    private Fecha proximaFecha;
    private int diml;

    public Gira(String nombreBanda, int cantTemas, String nombreGira, int cantFechas) {
        super(nombreBanda, cantTemas);
        this.setNombreGira(nombreGira);
        
        this.diml = 0;
        arrayFechas = new Fecha[cantFechas]; //instanciamiento array fechas
        for(int i=0;i<cantFechas;i++){ //inicializacion array fechas
            arrayFechas[i] = null;
        }
    }

    public void setNombreGira(String nombreGira) {
        this.nombreGira = nombreGira;
    }

    public Fecha[] getArrayFechas() {
        return arrayFechas;
    }

    
    
    //metodos 
    public void agregarFecha(Fecha unaFecha){
        if(this.diml < this.getArrayFechas().length){
            this.getArrayFechas()[this.diml] = unaFecha;
            this.diml++;
        }
    }
    
    @Override
    public String actuar(){
        String aux = "";
        for(int i=0;i<this.diml;i++){
                aux ="Buenas noches "+this.getArrayFechas()[i].getCiudad();
        }
        aux+= super.actuar();
        return aux;
    }
    
    @Override
    public double calcularCosto(){
        double total = (30000.0 * this.diml);
        return total;
    }
}
