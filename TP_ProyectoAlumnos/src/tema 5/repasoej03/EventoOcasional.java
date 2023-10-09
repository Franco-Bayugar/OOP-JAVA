
package repasoej03;

/**
 *
 * @author DIBAS
 */
public class EventoOcasional extends Recital{
    private String motivo;
    private String nombreContratante;
    private int diaEvento;

    public EventoOcasional(String nombreBanda, int cantTemas, String motivo, String nombreContratante, int diaEvento) {
        super(nombreBanda, cantTemas);
        this.setMotivo(motivo);
        this.setNombreContratante(nombreContratante);
        this.setDiaEvento(diaEvento);
    }

    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setNombreContratante(String nombreContratante) {
        this.nombreContratante = nombreContratante;
    }

    public void setDiaEvento(int diaEvento) {
        this.diaEvento = diaEvento;
    }


    public String getMotivo() {
        return motivo;
    }

    public String getNombreContratante() {
        return nombreContratante;
    }

    
    //metodos 
    
    @Override
    public String actuar(){
        String aux = "";
        if(this.getMotivo().equals("Beneficiencia")){
            aux += "Recuerden colaborar con "+this.getNombreContratante();
        } else if (this.getMotivo().equals("TV")){
            aux += "Saludos amigos televidentes";
          } else if(this.getMotivo().equals("Show privado")){
              aux += "Un feliz cumplea;os para "+this.getNombreContratante();
          } 
        
        aux += super.actuar();
        return aux;
    }
    
    @Override
    public double calcularCosto(){
        double valor = -1;
        if(this.getMotivo().equals("Beneficiencia")){
            valor = 0;
        } else if(this.getMotivo().equals("TV")){
            valor = 5000;
        } else if(this.getMotivo().equals("Show privado")){
            valor = 30000;
        }
        return valor;
    }
}
