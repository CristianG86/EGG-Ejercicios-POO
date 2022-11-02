
package ejercicio1;

import ejercicio1.Entidades.Libro;
import ejercicio1.ServicioLibro.ServicioLibro;


public class Ejercicio1 {

    
    public static void main(String[] args) {
       
        ServicioLibro lb = new ServicioLibro();
        
        Libro libro1 = lb.cargarLibro();
        
        lb.mostrarLibro(libro1);
        
        
        
    }
    
}
