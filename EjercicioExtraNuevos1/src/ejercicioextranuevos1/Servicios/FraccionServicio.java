
package ejercicioextranuevos1.Servicios;

import ejercicioextranuevos1.Entidades.Fraccion;
import java.util.Scanner;


public class FraccionServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Fraccion crearfraccion(){
        
        System.out.println("Ingrese el numerador 1: ");
        double numerador1 = leer.nextInt();
        
        System.out.println("Ingrese el denominador 1: ");
        double denominador1 = leer.nextInt();
        
        System.out.println("Ingrese el numerador 2: ");
        double numerador2 = leer.nextInt();
        
        System.out.println("Ingrese el denominador 2: ");
        double denominador2 = leer.nextInt();
       
        return new Fraccion(numerador1, denominador1, numerador2, denominador2);
        
    }
    
    public void sumar(Fraccion f){
        
        double resultado = ((f.getNumerador1()*f.getDenominador2())+ (f.getDenominador1()*f.getNumerador2()))
                                                                  /(f.getDenominador1()*f.getDenominador2());
        
        
        System.out.println("El resultado de la suma de las fracciones es: " + resultado);
    }
    
    public void restar (Fraccion f){
        
        double resultado = ((f.getNumerador1()*f.getDenominador2()) - (f.getDenominador1()*f.getNumerador2()))
                                                                  /(f.getDenominador1()*f.getDenominador2());
        
        
        System.out.println("El resultado de la resta de las fracciones es: " + resultado);
    }
    
    public void multiplicar (Fraccion f){
        
        double resultado = (f.getNumerador1()*f.getNumerador2()/ (f.getDenominador1()* f.getDenominador2()));
        
         System.out.println("El resultado de la multiplicación de las fracciones es: " + resultado);
    }
    
    public void division (Fraccion f){
        
        double resultado = (f.getNumerador1()*f.getDenominador2())/(f.getDenominador1()*f.getNumerador2());
        
         System.out.println("El resultado de la división de las fracciones es: " + resultado);
        
    }
}
