
package ejercicioextra3;

import ejercicioextra3.Entidades.Raices;
import ejercicioextra3.RaicesServicio.RaicesServicio;


public class EjercicioExtra3 {

  
    public static void main(String[] args) {
       
        RaicesServicio rs = new RaicesServicio();
        
        Raices ecuacion1 = rs.crearRaiz();
        
        
        rs.getDiscriminante(ecuacion1);
     
        rs.calcular(ecuacion1);
        
        
        
    }
    
}
