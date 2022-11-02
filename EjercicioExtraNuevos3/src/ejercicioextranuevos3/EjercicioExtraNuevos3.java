
package ejercicioextranuevos3;

import ejercicioextranuevos3.Entidades.Pass;
import ejercicioextranuevos3.Servicio.PassServicio;
import java.util.Scanner;

public class EjercicioExtraNuevos3 {

 
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        PassServicio ps = new PassServicio();
        Pass usuario1 = new Pass("123456789a", "Susanita", 12345678);
        
        /*o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
        
        */
        String opcion = "A";
        while (opcion.equalsIgnoreCase("F") == false){
            System.out.println(" ------ MENÚ ------");
            System.out.println("A. INGRESAR LA CONTRASEÑA. ");
            System.out.println("B. VER EL NIVEL DE LA CONTRASEÑA. ");
            System.out.println("C. MODIFICAR LA CONTRASEÑA. ");
            System.out.println("D. MODIFICAR NOMBRE. ");
            System.out.println("E. MODIFICAR DNI. ");
            System.out.println("F. SALIR ");
            
            opcion = leer.next();
            switch (opcion){
                case "A":
                    ps.crearPass(usuario1);
                    continue;
                case "B":
                    ps.analizarPass(usuario1);
                    continue;
                case "C":
                    ps.modificarPass(usuario1);
                    continue;
                case "D":
                    ps.modificarNombre(usuario1);
                    continue;
                case "E":
                    ps.modificarDNI(usuario1);
                    continue;
                    
            }
            
            
            
            
        }
        
        
    }
    
}
