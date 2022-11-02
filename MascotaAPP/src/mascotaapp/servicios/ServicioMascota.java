
package mascotaapp.servicios;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

public class ServicioMascota {
    private Scanner leer = new Scanner (System.in);
    public Mascota crearMascota(){
        
        System.out.println("Introducir un nombre: ");
        String nombre = leer.next();
        
        System.out.println("Introducir un apodo: ");
        String apodo = leer.next();
        
        System.out.println("Introducir el tipo: ");
        String tipo = leer.next();
        
        return new Mascota(nombre, apodo, tipo);
    
        
        
    }
    
}
