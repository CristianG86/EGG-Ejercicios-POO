
package ejercicio7.PersonaServicio;

import ejercicio7.Entidades.Persona;
import static java.lang.Math.pow;
import java.util.Scanner;


public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    
    
    public Persona crearPersona(){
        String sexo = "";
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese su edad:");
        int edad = leer.nextInt();
        while (sexo != "0" || sexo != "M" || sexo != "H"){
            System.out.println("Ingrese su sexo:");
            System.out.println("M - Mujer" +"\n" + "H - Hombre" + "\n"+ "O - Otro");
            sexo = leer.next();
        }
        
        return new Persona(nombre, edad, sexo);
    }
    
    public void calcularIMC(Persona persona){
        System.out.println("Ingrese su peso en kg: ");
        double peso = leer.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = leer.nextDouble();
        
        double imc = peso / (pow(altura,2));
        
        if (imc < 20){
            persona.setImc(-1);
        } 
        else if (imc >= 20 && imc <= 25){
            persona.setImc(1);
        }
        else {
            persona.setImc(1);
        }
        System.out.println("" + persona.getImc());
    }
    
    public void esMayorDeEdad(Persona persona){
        
        boolean bandera = false;
    
        if (persona.getEdad() > 18){
            bandera = true;
        }
        else{
            bandera = false;
        }
        
        System.out.println(bandera);
    }
    
    
    }
