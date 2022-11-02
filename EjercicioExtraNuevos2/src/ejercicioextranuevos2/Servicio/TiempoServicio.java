
package ejercicioextranuevos2.Servicio;

import ejercicioextranuevos2.Entidades.Tiempo;
import java.util.Scanner;


public class TiempoServicio {
    
    Scanner leer = new Scanner (System.in);
    
    
    
    public Tiempo crearHora (){
        int hora =999;
        int minutos = 999;
        int segundos =999;
        
        while(hora > 24){
        System.out.println("Ingrese la hora:");
        hora = leer.nextInt();
        }
        
        while(minutos >60){
        System.out.println("Ingrese los minutos:");
        minutos = leer.nextInt();
        }
        
        while(segundos >60){
        System.out.println("Ingrese los segundos:");
        segundos = leer.nextInt();
        }
        
        return new Tiempo(hora, minutos, segundos);
        
    }
    
    public void imprimirHoraCompleta(Tiempo t){
        
        
        System.out.println("La hora es " + t.getHora()+ ":"+ t.getMinutos() +":"+t.getSegundos()+" hs");
    }
    
    
    
    
}
