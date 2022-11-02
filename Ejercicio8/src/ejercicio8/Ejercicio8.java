/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import ejercicio8.Entidades.Cadena;
import ejercicio8.Entidades.CadenaServicio.CadenaServicio;
import java.util.Scanner;

public class Ejercicio8 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();
        
        Cadena cadena1 = new Cadena("", 0);
        System.out.println("Ingrese una palabra o frase: ");
        String frase = leer.next();
        int longitud = frase.length();
        
        cadena1.setFrase(frase);
        cadena1.setLongitud(longitud);
       
        
        /*
        cs.contarVocales(cadena1);
        cs.invertirFrase(cadena1);
        System.out.println(" ");
        cs.vecesRepetido(cadena1);
        cs.compararLongitud(cadena1);
     
        cs.unirFrases(cadena1);
       
        cs.reemplazar(cadena1);
       */
        cs.contiene(cadena1);
        
        
    }
        
    }
