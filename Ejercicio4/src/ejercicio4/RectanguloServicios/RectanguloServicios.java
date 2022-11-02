
package ejercicio4.RectanguloServicios;

import ejercicio4.Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese la base del rectángulo: ");
        int base = leer.nextInt();
        
        System.out.println("Ingrese la altura del rectángulo: ");
        int altura = leer.nextInt();
        
        return new Rectangulo(base,altura);
    }
    
    
    public void superficieRectangulo (Rectangulo rectangulo) {
    
        double superficie = rectangulo.getBase() * rectangulo.getAltura();
        
        System.out.println("La superficie del Rectángulo es: "+ superficie);
    
}
    
    public void perimetroRectangulo (Rectangulo rectangulo) {
    
        double perimetro = (rectangulo.getBase() + rectangulo.getAltura())*2;
        
        System.out.println("El Perímetro del Rectángulo es: "+ perimetro);
    
}
    
    public void mostrarRectangulo(Rectangulo rectangulo){
        
         for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j < rectangulo.getBase(); j++) {
                if (i == 0 || i == rectangulo.getAltura() - 1 || j < 1 || j == rectangulo.getBase()-1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println("");
      
    }

        
    }
    

}
    

