
package ejercicio3.ServicioOperacion;

import ejercicio3.Operacion.Operacion;
import java.util.Scanner;


public class ServicioOperacion {
    
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        
        System.out.println("Ingrese el número 1: ");
        double numero1 = leer.nextDouble();
        
        System.out.println("Ingrese el número 2: ");
        double numero2 = leer.nextDouble();
        
        return new Operacion(numero1,numero2);
        
    }
    
    
    public void sumar(Operacion operacion){
        
        double suma = operacion.getNumero1() + operacion.getNumero2();
        
        System.out.println("La suma de los números es: " + suma);
        
    }
    
    public void restar(Operacion operacion){
        
        double resto = operacion.getNumero1() - operacion.getNumero2();
        
        System.out.println("La resta de los números es: " + resto);
        
    }
    
    public void multiplicar(Operacion operacion){
        
        if (operacion.getNumero1() != 0.0 & operacion.getNumero2() !=0){   
   
        double producto = operacion.getNumero1() * operacion.getNumero2();
        
        System.out.println("La multiplicación de los números es: " + producto);
        }
        else {
            int producto = 0;
            System.out.println("La multiplicación de los números es: " + producto);
            System.out.println("Error, uno de los número es 0.");
        }
        }
    
    public void dividir(Operacion operacion){
        
        if (operacion.getNumero1() != 0.0 & operacion.getNumero2() !=0){   
   
        double cociente = operacion.getNumero1() / operacion.getNumero2();
        
        System.out.println("La división de los números es: " + cociente);
        }
        else {
            int cociente = 0;
            System.out.println("La multiplicación de los números es: " + cociente);
            System.out.println("Error, uno de los número es 0.");
        }
    }
}
   
