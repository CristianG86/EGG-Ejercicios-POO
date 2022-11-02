
package ejercicio6.CafeteraServicios;

import ejercicio6.Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicios {
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(Cafetera cafetera){
        
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        
    }
    
    
    public void servirTaza(Cafetera cafetera){
        System.out.println("Indique el tamaño de la taza: ");
        int taza = leer.nextInt();
        
        if (taza < cafetera.getCantidadActual()){
        cafetera.setCantidadActual(cafetera.getCantidadActual()- taza);
        }
        else {
            System.out.println("No alcanzó el café para llenar la taza");
            System.out.println("Sólo se pudo cargar " + cafetera.getCantidadActual() + "ml");
            cafetera.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera cafetera){
        System.out.println("¿Qué cantidad de café desea preparar?: ");
        int cafe = leer.nextInt();
        cafetera.setCantidadActual(cafe);
    }
    
    
}




