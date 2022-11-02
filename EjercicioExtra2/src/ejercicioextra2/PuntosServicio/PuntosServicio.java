
package ejercicioextra2.PuntosServicio;

import ejercicioextra2.Puntos.Puntos;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;


public class PuntosServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Puntos crearPuntos(){
        System.out.println("Ingrese el valor de x1: ");
        int x1 = leer.nextInt();
        
        System.out.println("Ingrese el valor de y1: ");
        int y1 = leer.nextInt();
        
        System.out.println("Ingrese el valor de x2: ");
        int x2 = leer.nextInt();
        
        System.out.println("Ingrese el valor de y2: ");
        int y2 = leer.nextInt();
        
        return new Puntos(x1, y1, x2, y2);
        
    }
    
    public void calcularDistancia(Puntos p){
        
        double distancia = sqrt(pow((p.getX2()-p.getX1()),2) + pow((p.getY2()- p.getY1()),2));
        
        System.out.println("La distancia entre los puntos es: "+ distancia);
    }


    
   
    
    
    
}
