/*
 * Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 */
package ejercicioextranuevos2;

import ejercicioextranuevos2.Entidades.Tiempo;
import ejercicioextranuevos2.Servicio.TiempoServicio;
import java.util.Date;


public class EjercicioExtraNuevos2 {

    public static void main(String[] args) {
        
        TiempoServicio ts = new TiempoServicio();
        
        Tiempo hora1 = ts.crearHora();
        
        ts.imprimirHoraCompleta(hora1);
        
        Date horaActual = new Date();
        
        int horasPasadas = horaActual.getHours() - hora1.getHora();
        int minutosPasados = horaActual.getMinutes() - hora1.getMinutos();
        int segundosPasados = horaActual.getSeconds() - hora1.getSegundos();
        
        
        System.out.println("El tiempo transcurrido desde la hora marcada y la hora actual es: " +
                horasPasadas + " hs. "+ minutosPasados + " min. " + segundosPasados + " sec.");
    }
    
}
