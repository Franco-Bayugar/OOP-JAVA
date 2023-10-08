
package repasoej01;


public class Proyecto {
    private String nombre;
    private int codigo;
    private String nombreDirector;
    private Investigador[] arrayInvestigadores;
    private int dimf = 50;
    private int diml;

    public Proyecto(String nombre, int codigo, String nombreDirector) {
        this.setNombre(nombre);
        this.setCodigo(codigo);
        this.setNombreDirector(nombreDirector);
        
        diml=0;
        arrayInvestigadores = new Investigador[dimf]; //MATERIALIZACION DEL VECTOR
        for(int i=0;i<dimf;i++){
            arrayInvestigadores[i] = new Investigador(); //SETEO DEFAULT
        }
      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }
    
    //methods 
    public void agregarInvestigador(Investigador unInvestigador){
        if(this.diml < this.dimf){
            arrayInvestigadores[this.diml] = unInvestigador;
            this.diml++;
        }
    }
    
    public double dineroTotalDelProyecto(){
        double total = 0;
        for(int i=0;i<diml;i++){
            total += this.arrayInvestigadores[i].cantidadTotalSubdidios();
        }
        return total;
    }
    
    
    //agregarle total dinero proyecto + investigadores
    @Override
    public String toString() {
        String aux = "PROYECTO NOMBRE: "+this.getNombre()+
                     "\ncodigo proj.: "+this.getCodigo()+
                     "\nNombre director: "+this.getNombreDirector()+
                     "\nTotal dinero del proj.: "+this.dineroTotalDelProyecto()+
                     "\n========================================:";
                     
                     
        for(int i=0; i<diml; i++){
            aux += "\nInvestigador numero "+i+" del proj.: "+this.arrayInvestigadores[i].toString();
        }
        
        return aux;
    }
    
    
    
}
