
package ejercicio12;

import ejercicio12.Persona.Persona;
import ejercicio12.ServicioPersona.ServicioPersona;


public class Ejercicio12 {


    public static void main(String[] args) {
        
        ServicioPersona sp = new ServicioPersona();
        
        Persona persona1 = sp.crearPersona();
        
        sp.calcularEdad(persona1);
        
        sp.menorQue(persona1);
        
        sp.mostrarPersona(persona1);
        
        
        
        
    }
    
}
