/*

• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.

*/
package ejercicio12.ServicioPersona;

import ejercicio12.Persona.Persona;
import java.util.Date;
import java.util.Scanner;


public class ServicioPersona {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println("Para guardar su fecha de nacimiento, primero ingrese el "
                + "día, luego el mes, y por último el año(dos últimos dígitos).");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        
        Date fechadenac = new Date(anio,mes,dia);
        
        return new Persona(nombre, fechadenac);

    }
    
    
    public void calcularEdad(Persona pers){
        
        Date hoy = new Date();
        
        pers.setEdad(hoy.getYear() - pers.getFechadenac().getYear());
        
        System.out.println("La edad es de: " + pers.getEdad());
        
        
    }
    
    public void menorQue(Persona pers){
        
        boolean menor = true;
        
        System.out.println("Ingrese una edad: ");
        int edad = leer.nextInt();
        
        if (edad > pers.getEdad()){
            
            menor = true;
        }
        else {
            menor = false;
        }
        
        System.out.println(menor);
    }
    
    public void mostrarPersona(Persona pers){
        
        System.out.println("El nombre es " + pers.getNombre()+ "\n" + "Fecha de nacimiento es : " +"\n" + 
                "Día : " + pers.getFechadenac().getDate() + "\n" +
                "Mes: " + pers.getFechadenac().getMonth() + "\n" +
                "Año: " + pers.getFechadenac().getYear());
                
                
        
        
    }
}
