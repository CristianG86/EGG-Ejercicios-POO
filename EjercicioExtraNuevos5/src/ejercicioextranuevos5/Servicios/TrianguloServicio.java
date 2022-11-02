
package ejercicioextranuevos5.Servicios;

import ejercicioextranuevos5.Entidades.Triangulo;
import java.util.Scanner;

public class TrianguloServicio {
    Scanner leer = new Scanner (System.in);
    
    
    public Triangulo crearTriangulo(){
        
        System.out.println("Ingrese la longitud de los lados de igual medida: ");
        double ladosAyB = leer.nextDouble();
        
        System.out.println("Ingrese la longitud del otro lado: ");
        double ladoC = leer.nextDouble();
        
        return new Triangulo(ladosAyB, ladoC);
        
    }
    
    public double areaTriangulo(Triangulo t){
        
        double area = (t.getLadosAyB() * t.getLadoC())/2;
        
        return area;
        
    }
    
    public double perimetroTriangulo (Triangulo t){
        
        double perimetro = (t.getLadosAyB()*2) + t.getLadoC();
        
        return perimetro;
        
    }



    
}
