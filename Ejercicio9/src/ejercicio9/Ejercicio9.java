
package ejercicio9;

import ejercicio9.Entidades.Matematica;
import ejercicio9.MatematicaServicio.MatematicaServicio;


public class Ejercicio9 {

   
    public static void main(String[] args) {
        
        MatematicaServicio ms = new MatematicaServicio();
        
        double num1 = Math.random()*10;
        double num2 = Math.random()*10;
        Matematica m1 = new Matematica();
        m1.setNum1(num1);
        m1.setNum2(num2);
        
        System.out.println(num1);
        System.out.println(num2);
        
        
        ms.devolverMayor(m1);
        ms.calcularPotencia(m1);
        ms.calcularRaiz(m1);
        
        
        
        
        
        
        
        
        
        
    }
    
}
