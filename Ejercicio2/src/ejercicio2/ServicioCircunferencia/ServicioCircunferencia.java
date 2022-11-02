
package ejercicio2.ServicioCircunferencia;

import static java.lang.Math.pow;
import java.util.Scanner;

public class ServicioCircunferencia {
    Scanner leer = new Scanner(System.in);
    
    public void area(){
        System.out.println("Ingrese el radio: ");
        double radio = leer.nextDouble();
        double area = Math.PI * (pow(radio,2));
        
            System.out.println("El área de la circunferencia es: " + area);
    }
    
     public void perimetro(){
        System.out.println("Ingrese el radio: ");
        double radio = leer.nextDouble();
        double perimetro = 2 * Math.PI * radio;
        
            System.out.println("El área de la circunferencia es: " + perimetro);
    }
}
