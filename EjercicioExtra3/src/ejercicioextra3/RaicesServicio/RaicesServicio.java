
package ejercicioextra3.RaicesServicio;

import ejercicioextra3.Entidades.Raices;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;



public class RaicesServicio {
    Scanner leer = new Scanner(System.in);
    
    
    public Raices crearRaiz(){
        System.out.println("Ingrese el coeficiente A: ");
        double coefA = leer.nextDouble();
        
        System.out.println("Ingrese el coeficiente B: ");
        double coefB = leer.nextDouble();
        
        System.out.println("Ingrese el coeficiente C: ");
        double coefC = leer.nextDouble();
        
        return new Raices(coefA,coefB,coefC);
      
    }
    
    public void getDiscriminante(Raices r){
        
        r.setDiscriminante((pow(r.getCoeficienteB(),2)) - (4*r.getCoeficienteA()*r.getCoeficienteC()));
        
        System.out.println(r.getDiscriminante());
    }
    
    public boolean tieneRaices(Raices r){
        
        boolean tieneraices = false;
        
        if (r.getDiscriminante()>= 0){
            
            tieneraices = true;
        }
        
         return tieneraices;
        
    }
    
    public boolean tieneRaiz(Raices r){
        
         boolean tieneraiz = false;
        
        if (r.getDiscriminante()== 0){
            
            tieneraiz = true;
        }
        
        return tieneraiz;
    }
    
    public void obtenerRaices(Raices r){
        
        boolean tieneraices = tieneRaices(r);
        
        if (tieneraices == true){
            
            double raiz1 = (-r.getCoeficienteB() + sqrt(pow(r.getCoeficienteB(),2)- (4*r.getCoeficienteA()*r.getCoeficienteC())))
                    /(2*r.getCoeficienteA());
            
            double raiz2 = (-r.getCoeficienteB() - sqrt(pow(r.getCoeficienteB(),2)- (4*r.getCoeficienteA()*r.getCoeficienteC())))
                    /(2*r.getCoeficienteA());
            
            System.out.println("Las dos soluciones son: " + "\n" + raiz1 + "\n" + raiz2);
        }
        else {
            System.out.println("La fórmula cuadrática no tiene dos soluciones");
        }
    }
    
    public void obtenerRaiz(Raices r){
        
        boolean tieneraiz = tieneRaiz(r);
        
        if (tieneraiz == true){
            
            double raiz = (-r.getCoeficienteB() + sqrt(pow(r.getCoeficienteB(),2))- (4*r.getCoeficienteA()*r.getCoeficienteC()))
                    /(2*r.getCoeficienteA());
            
            System.out.println("La única solución es: " + "\n" + raiz);
    }
        else {
            
            System.out.println("La función cuadrática no tiene una única solución");
            
        }
    
    
}
    
    public void calcular(Raices r){
        
        if(r.getDiscriminante() > 0){
            tieneRaices(r);
            obtenerRaices(r);
        }
        else if (r.getDiscriminante() == 0){
            tieneRaiz(r);
            obtenerRaiz(r);
        }
        else {
            System.out.println("La ecuación cuadrática no tiene solución.");
        }
    }
    
}
    

