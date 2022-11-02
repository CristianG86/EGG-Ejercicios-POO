
package ejercicioextra5;

import ejercicioextra5.Meses.Meses;
import java.util.Scanner;

public class EjercicioExtra5 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        Meses meses = new Meses();
        
        String mesSecreto = meses.getMeses()[9]; 
        
        System.out.println(mesSecreto);
        
        System.out.println("Ingrese un mes del año (en minúsculas) hasta adivinar el mes secreto:");
        
        String mesIngresado = leer.next();
        
        while (mesSecreto.equals(mesIngresado) == false){
        
        System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            mesIngresado = leer.next();
        
        }
        
        System.out.println("¡Felicitaciones! ¡Has acertado!");
     
    }
    
}
    

