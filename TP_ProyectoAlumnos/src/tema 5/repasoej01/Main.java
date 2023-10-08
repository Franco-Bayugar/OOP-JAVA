
package repasoej01;


public class Main {

   
    public static void main(String[] args) {
        Proyecto P = new Proyecto("Investigacion Fisica cosmica", 12345, "Dir. Pablo Perez");
        Investigador I1, I2, I3;
        
        I1 = new Investigador("Franco Fernandez", 1, "Fisico Teorico");
        I2 = new Investigador("Sebastian Martinez", 4, "Quimico");
        I3 = new Investigador("Micaela Arrin", 2, "Biologo molecular");

        P.agregarInvestigador(I1);
        P.agregarInvestigador(I2);
        P.agregarInvestigador(I3);
        
        I1.agregarSubsidio(1000, "Porque pinta");
        I1.agregarSubsidio(1500, "Porque re pinta");
        
        I2.agregarSubsidio(1000, "Damelo");
        I2.agregarSubsidio(1600, "Damelo porfa");
        
        I3.agregarSubsidio(5000, "Para comer");
        I3.agregarSubsidio(4000, "Para tomar");

        
        I3.otorgarTodos();
        
        System.out.println(P.toString());

        

    }
    
}
