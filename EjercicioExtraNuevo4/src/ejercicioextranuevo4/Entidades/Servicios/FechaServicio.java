
package ejercicioextranuevo4.Entidades.Servicios;

import ejercicioextranuevo4.Entidades.Fecha;
import java.util.Scanner;


public class FechaServicio {
    Scanner leer = new Scanner(System.in);
    
    
    public Fecha crearFecha(){
        
        System.out.println("Ingrese un día: ");
        int dia = leer.nextInt();
        
        System.out.println("Ingrese un mes: ");
        int mes = leer.nextInt();
        
        System.out.println("Ingrese el año: ");
        int anio = leer.nextInt();
        
        verificarAnio(anio);
        
        return new Fecha (dia, mes, anio);
       
    }
    
    public void verificarAnio(int anio){
        
        if (anio >= 1900 && anio <= 2021){
            anio = anio;
            
        }
        else{
            anio = 1900;
        }
    }
  
    public void conocerDiasMes (Fecha f){
        
        int indiceMes= f.getMes()- 1;
        
        System.out.println("Usted ingreso el mes " + f.getMes() + "(" + f.getNombreMeses()[indiceMes]+ ") que tiene "
                + f.getDiasMeses()[indiceMes]+ " días.");
        
        
    }
    
    public void mostrarDiaAnterior (Fecha f){
               
        //Verificar si el día se encuentra entre 1 y la cantidad de días del mes
        if (f.getDia() >= 2 && f.getDia() <= f.getDiasMeses()[f.getMes()-1] ){
            
            System.out.println(" El día anterior es el " + (f.getDia()-1) + " de " + f.getNombreMeses()[f.getMes()-1] + " de " + f.getAnio());
        }
        else{
            // sino si es 1, el día anterior será igual al último día del mes anterior
            System.out.println("El día anterior es " + f.getDiasMeses()[f.getMes()-1] + " de " + f.getNombreMeses()[f.getMes()-2] + " de " + f.getAnio() );
            
            
        }
            
        
        
        
    }
    
    public void mostrarDiaPosterior(Fecha f){
        
          //Verificar si el día se encuentra entre 1 y la cantidad de días del mes menos 1.
        if (f.getDia() >= 1 && f.getDia() <= ((f.getDiasMeses()[f.getMes()-1]))-1){
            
            System.out.println(" El día posterior es el " + (f.getDia()+1) + " de " + f.getNombreMeses()[f.getMes()-1] + " de " + f.getAnio());
        }
        else if (f.getDia() == f.getDiasMeses()[f.getMes()-1]){
            // sino si es día es igual a la cantidad total de días del mes, el día posterior será igual primer día del mes siguiente
            System.out.println("El día posterior es el 1 de " + f.getNombreMeses()[f.getMes()] + " de " + f.getAnio() );
          
    }
}
    
    public boolean anioBisiesto(Fecha f){
        
        boolean bisiesto;
        
        if (f.getAnio()%4 == 0 && f.getAnio() % 100 != 0 || f.getAnio() % 400 == 0){
            bisiesto = true;
        }
        else{
            bisiesto = false;
        }
        
        return bisiesto;
        
    }
    
}
