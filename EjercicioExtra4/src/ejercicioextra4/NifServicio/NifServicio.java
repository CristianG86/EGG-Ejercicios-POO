
package ejercicioextra4.NifServicio;

import ejercicioextra4.Entidades.NIF;
import java.util.Scanner;



public class NifServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public NIF crearNIF(){
        String [] NIF = new String [23];
        NIF[0] = "T";
        NIF[1] = "R";
        NIF[2] = "W";
        NIF[3] = "A";
        NIF[4] = "G";
        NIF[5] = "M";
        NIF[6] = "Y";
        NIF[7] = "F";
        NIF[8] = "P";
        NIF[9] = "D";
        NIF[10] = "X";
        NIF[11] = "B";
        NIF[12] = "N";
        NIF[13] = "J";
        NIF[14] = "Z";
        NIF[15] = "S";
        NIF[16] = "Q";
        NIF[17] = "V";
        NIF[18] = "H";
        NIF[19] = "L";
        NIF[20] = "C";
        NIF[21] = "K";
        NIF[22] = "E";
        
        
        System.out.println("Ingrese su número de DNI:");
        long DNI = leer.nextLong();
        
        int indice = (int) (DNI%23);
        
        return new NIF(DNI,NIF[indice]);
        
    }
    
    public void mostrar(NIF n){
        
        System.out.println("El NIF es: " + n.getDNI() + "-"+ n.getNIF());
    }
    
}
