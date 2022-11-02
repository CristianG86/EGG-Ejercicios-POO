
package ejercicioextranuevo4;

import ejercicioextranuevo4.Entidades.Fecha;
import ejercicioextranuevo4.Entidades.Servicios.FechaServicio;


public class EjercicioExtraNuevo4 {

    public static void main(String[] args) {
        
        FechaServicio fs = new FechaServicio();
        
        Fecha fecha1 = fs.crearFecha();
        
        fs.conocerDiasMes(fecha1);
        
        fs.mostrarDiaAnterior(fecha1);
        
        fs.mostrarDiaPosterior(fecha1);
        
        System.out.println("¿El año ingresado es bisiesto?: " + fs.anioBisiesto(fecha1));
       
    }
    
}
