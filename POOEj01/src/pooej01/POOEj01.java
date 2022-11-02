
package pooej01;

import Entidad.Persona;
import Entidad.Servicio.ServicioPersona;

public class POOEj01 {

    public static void main(String[] args) {
        
        ServicioPersona sp = new ServicioPersona();
        
        Persona p1 = sp.crearPersona();
        
        
        sp.mostrarPersona(p1);

    }
    
}
