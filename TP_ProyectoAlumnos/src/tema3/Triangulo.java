/*
1-A- Definir una clase para representar triángulos. 

Un triángulo se caracteriza por:
- el tamaño de sus 3 lados (double)
- el color de relleno (String)
- el color de línea (String).

Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.

Provea métodos para:

- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
- Calcular el perímetro y devolverlo (método calcularPerimetro)
- Calcular el área y devolverla (método calcularArea)
*/

package tema3;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String relleno;
    private String linea;

    //constructor de todas las propiedades
    public Triangulo(double L1, double L2, double L3, String R, String L){
        this.lado1 = L1;
        this.lado2 = L2;
        this.lado3 = L3;
        this.relleno = R;
        this.linea = L;
    }

    //constructor vacio
    public Triangulo() {
    }
    
    //Methods

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
 
    @Override
    public String toString() {
        return "Triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", relleno=" + relleno + ", linea=" + linea + '}';
    }
    
    //Calcular el perímetro y devolverlo (método calcularPerimetro)
    
    public double calcularPerimetro(){
       return (this.lado1 + this.lado2 + this.lado3); 
    }
    
    //Calcular el área y devolverla (método calcularArea)
    
    public double calcularArea(){
        double s = (this.lado1+this.lado2+this.lado3) / 2;
        return Math.sqrt(s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3));  
    }   
}

