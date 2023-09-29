/*
5- Se dispone de la clase Partido (en la carpeta tema2). Un objeto partido representa un
encuentro entre dos equipos (local y visitante). Un objeto partido puede crearse sin
valores iniciales o enviando en el mensaje de creación el nombre del equipo local, el
nombre del visitante, la cantidad de goles del local y del visitante (en ese orden). Un objeto
partido sabe responder a los siguientes mensajes:

{mensajes}

Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en
el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga:
- Para cada partido, armar e informar una representación String del estilo:
{EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
- Calcular e informar la cantidad de partidos que ganó River.
- Calcular e informar el total de goles que realizó Boca jugando de local.

 */
package tema2;

//imports 
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ej05 {
    public static void main(String[] args) {
        // declaracion variables
        int dimf = 5, diml = 0, contadorVictorias = 0, contadorGoles = 0;
        Partido [] arrayPartidos = new Partido[dimf];
        Partido p = new Partido(" ", " ", 0, 0); 
        //p.p ----------
        //inicializacion arrayPartidos en null de manera implicita
     
        //carga de datos
        while(!(p.getVisitante().equals("ZZZ")) && (diml<dimf)){
            p = new Partido();  //!!!!! INSTANCIAR LA CLASE PARA RESERVAR NUEVO ESPACIO DE MEMORIA
            System.out.print("Equipo local: ");
            p.setLocal(Lector.leerString());
            System.out.print("Equipo visitante: ");
            p.setVisitante(Lector.leerString());
            p.setGolesLocal(GeneradorAleatorio.generarInt(6));
            p.setGolesVisitante(GeneradorAleatorio.generarInt(6));
            arrayPartidos[diml] = p;
            if(arrayPartidos[diml].getGanador().equals("River")) contadorVictorias++; //contador victorias River
            if(arrayPartidos[diml].getLocal().equals("Boca")) contadorGoles += arrayPartidos[diml].getGolesLocal();  //goles de boca de local
            
            diml++;
            System.out.println(p.getLocal().toUpperCase()+": "+p.getGolesLocal()+" VS. "+p.getVisitante().toUpperCase()+": "+p.getGolesVisitante());
            System.out.println("---------------");

           // {EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }           
        }
        System.out.println("Partidos ganador por River: "+contadorVictorias);
        System.out.println("Goles de Boca siendo local: "+contadorGoles); 
    }
    
}
