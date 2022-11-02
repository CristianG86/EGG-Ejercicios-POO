
package Entidad.Servicio;

import Entidad.Persona;
import java.util.Scanner;


public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        System.out.println("Introducir un nombre: ");
        String nombre = leer.next();
        
        System.out.println("Introducir el Apellido: ");
        String apellido = leer.next();
        
        System.out.println("Introducir el dni: ");
        int dni = leer.nextInt();
        
        return new Persona(nombre, apellido, dni);
        
    }
    
    public void mostrarPersona(Persona persona) {
        
        System.out.println("" + persona.getNombre()+ " "+ persona.getApellido() + " "+  persona.getDni());
        
    }

}
