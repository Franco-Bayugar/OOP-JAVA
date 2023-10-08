
package repasoej02;

public class Auto {
   private String nombreDueno;
   private String patente;

    public Auto(String nombreDueno, String patente) {
        this.setNombreDueno(nombreDueno);
        this.setPatente(patente);
    }

    public Auto() {
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        String aux= "\n|Auto|" + "\nNombre del dueno: "+this.getNombreDueno()+"\nPatente: " +this.getPatente()+ "\n=================================";;
        return aux;
    }
    
    
   
   
}
