        
       /* PARA CALCULAR LA EDAD DE LA PERSONA
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;
        
        LocalDate hoy = LocalDate.now();
        LocalDate fnac = LocalDate.of(1986,4,8);
        
        long edad = ChronoUnit.YEARS.between(fnac, hoy);
        
        System.out.println(edad);

        */
package ejercicio7;

import ejercicio7.Entidades.Persona;
import ejercicio7.PersonaServicio.PersonaServicio;


public class Ejercicio7 {

    
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        
        /* Para crear un arreglo de Personas
         Persona [] matrizPersona = new Persona [4];

        for (int i = 0; i < 4; i++) {
            matrizPersona[i]= ps.crearPersona();
        }*/
       
        Persona persona1 = ps.crearPersona();
        Persona persona2 = ps.crearPersona();
        Persona persona3 = ps.crearPersona();
        Persona persona4 = ps.crearPersona();
      
        
        ps.calcularIMC(persona1);
        ps.calcularIMC(persona2);
        ps.calcularIMC(persona3);
        ps.calcularIMC(persona4);
        
        
       /*    CONSIGNA:
        Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
        
        
        ES CONVENIENTE CREAR UN ARREGLO PERSONA PARA GUARDAR LOS DISTINTOS DATOS Y ASÍ RECORRERLOS
        DE MANERA MÁS RÁPIDA.
        */
        
        
        
      
       
       
       
        
    }
    
}
