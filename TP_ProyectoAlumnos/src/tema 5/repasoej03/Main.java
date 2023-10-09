
package repasoej03;

public class Main {

    public static void main(String[] args) {
        System.out.println("===THE BEATLES===");
        EventoOcasional E = new EventoOcasional("The Beatles", 5, "TV", "Ed Sullivan", 5);
        E.agregarTema("Things we said today");
        E.agregarTema("Roll over Bethoveen");
        E.agregarTema("Twist and shout");
        System.out.println("Costo del show: "+E.calcularCosto());
        System.out.println(E.actuar());

        
        System.out.println("===ROLLING STONES===");
        Gira G = new Gira("The Rolling Stones", 10, "The roll over tour", 3);
        G.agregarTema("Paint in black");
        G.agregarTema("Satisfaction");
        G.agregarTema("Gimme Shelter");
        Fecha F = new Fecha(5, 9, "New York");
        G.agregarFecha(F);
        System.out.println(G.actuar());
        
        System.out.println("");
        Fecha F2 = new Fecha(6, 9, "California");
        G.agregarFecha(F2);
        System.out.println(G.actuar());
        
        System.out.println("");
        Fecha F3 = new Fecha(7, 9, "Toronto");
        G.agregarFecha(F3);
        System.out.println(G.actuar());
        
        System.out.println("");
        System.out.println("Costo de la gira: "+G.calcularCosto());
    }
    
}
