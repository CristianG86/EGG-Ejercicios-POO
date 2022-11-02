
package ejercicio5.ServicioCuenta;

import ejercicio5.Entidades.Cuenta;
import java.util.Scanner;


public class ServicioCuenta {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        System.out.println("Ingrese el DNI: ");
        int dni = leer.nextInt();
        System.out.println("Ingrese el Número de Cuenta: ");
        int numeroCuenta = leer.nextInt();
        int saldo = 0;
        double intereses = 0;
        
        return new Cuenta(numeroCuenta, dni, saldo, intereses);

    }
    
    public void ingresar(Cuenta cuenta){
        
        System.out.println("¿Qué cantidad desea ingresar?: ");
        double ingreso = leer.nextDouble();
        cuenta.setSaldoactual(cuenta.getSaldoactual() + ingreso);
    
}
    
    public void retirar(Cuenta cuenta){
        
        System.out.println("¿Qué cantidad desea retirar?: ");
        double retiro = leer.nextDouble();
        if (retiro > cuenta.getSaldoactual()){
            cuenta.setSaldoactual(0);
        }
        else {
            cuenta.setSaldoactual(cuenta.getSaldoactual() - retiro);
        }
}
    
    public void extraccionRapida(Cuenta cuenta){
        
        System.out.println("¿Qué cantidad desea retirar? (puede ser como máximo el 20% del saldo): ");
        double retiro = leer.nextDouble();
        if (retiro > (cuenta.getSaldoactual()*0.2)){
            System.out.println("No puede retirar más del 20%");
        }
        else {
            cuenta.setSaldoactual(cuenta.getSaldoactual() - retiro);
        }
}
    
    public void consultarSaldo(Cuenta cuenta){
        
        System.out.println("El saldo de tu cuenta es: $ " + cuenta.getSaldoactual());
        
    }
    
    public void consultarDatos (Cuenta cuenta){
        
        System.out.println("El número de cuenta es: " + cuenta.getNumeroCuenta());
        
        System.out.println("El DNI del cliente es: " + cuenta.getDni());
        
    }

  
}
