
package mascotaapp;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;
import mascotaapp.servicios.ServicioMascota;


public class MascotaAPP {
    
    public static void main(String[] args) {
        
        ServicioMascota sm = new ServicioMascota();

        
        Mascota m1 = sm.crearMascota();
        
     
       
        System.out.println(m1);
}
    
}
