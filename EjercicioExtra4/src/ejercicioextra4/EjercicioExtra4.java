
package ejercicioextra4;

import ejercicioextra4.Entidades.NIF;
import ejercicioextra4.NifServicio.NifServicio;

public class EjercicioExtra4 {

    public static void main(String[] args) {
        
        NifServicio ns = new NifServicio ();
        
        NIF persona1 = ns.crearNIF();
        
        ns.mostrar(persona1);
        
        
    }
    
}
