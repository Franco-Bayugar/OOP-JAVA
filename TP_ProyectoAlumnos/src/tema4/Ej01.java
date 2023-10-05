package tema4;

public class Ej01 {

    public static void main(String[] args) {
       Triangulo t = new Triangulo(10, 10, 10, "Amarillo", "Azul");
       Circulo c = new Circulo(50, "Rojo", "Verde");
       
        System.out.println("Triangulo: \n"+ t.toString());
        System.out.println("==========");
        System.out.println("Circulo: \n"+ c.toString());
        
        t.despintar();
        c.despintar();
        System.out.println("===Despintados===");
        
        System.out.println("Triangulo: \n"+ t.toString());
        System.out.println("Circulo: \n"+ c.toString());

    }
    
}
