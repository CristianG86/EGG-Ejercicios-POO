
package ejercicio5;

import ejercicio5.Entidades.Cuenta;
import ejercicio5.ServicioCuenta.ServicioCuenta;
import java.util.Scanner;

public class Ejercicio5 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        ServicioCuenta sc = new ServicioCuenta();
        
        int opcion = 0;
        
        while (opcion != 6){        
        System.out.println(" ---- MENÚ ----");
        System.out.println("Elija una opción:");
        System.out.println("1. Crear Cuenta");
        System.out.println("2. Ingresar dinero a la cuenta.");
        System.out.println("3. Retirar dinero de la cuenta.");
        System.out.println("4. Extracción Rápida (hasta 20% del saldo).");
        System.out.println("5. Consultar Saldo.");
        System.out.println("6. Consultar Datos.");
        opcion = leer.nextInt();
        switch (opcion){
            case 1:
                Cuenta cliente1 = sc.crearCuenta();
            case 2:
                sc.ingresar(cliente1);
            case 3:
                sc.retirar(cliente1);
            case 4:
                sc.extraccionRapida(cliente1);
            case 5:
                sc.consultarSaldo(cliente1);
            case 6:
                sc.consultarDatos(cliente1);
                
            
            
        }
        }
        
        
        
        
    }
    
}
