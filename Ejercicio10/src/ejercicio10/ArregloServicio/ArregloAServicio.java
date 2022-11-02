
package ejercicio10.ArregloServicio;

import ejercicio10.Entidades.ArregloA;
import static java.lang.Math.random;


public class ArregloAServicio {
    
    
    public void construirArregloA(ArregloA a){
        
        for (int i = 0; i < 50; i++) {
            
            a.getArregloA()[i] = random()*10;
            
            
        }
        
        
        
        
        
        
    }
    
    
}
