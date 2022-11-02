/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio11;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;


public class Ejercicio11 {

 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        // el mes comienza a contar desde 0 --ENERO--  por lo que hay que restar 1 al número que se ingrese.
        
        System.out.println("Ingrese un número del día: ");
        
        int dia = leer.nextInt();
        
        System.out.println("Ingrese un número para el mes: ");
        
        int mes = leer.nextInt() - 1;
        
        System.out.println("Ingrese un número de dos dígitos para el año: ");
        
        int anio = leer.nextInt();
        
        Date fechanac = new Date(anio,mes,dia);
        
        System.out.println(fechanac);
        
        Date fechaActual = new Date();
        
        int dif = fechaActual.getYear() - fechanac.getYear();
        
        
        System.out.println(dif);
       
          
          
        /* FUNCIONA!
       LocalDate hoy = LocalDate.now();
       
       LocalDate fechanac = LocalDate.of(1986, 4, 8);
       
    
        System.out.println(hoy);
        System.out.println(fechanac);
        
        
        System.out.println(ChronoUnit.YEARS.between(fechanac, hoy));
        
        */
        
      
        
        
        
        
    }
    
}
