 
            /*
            switch(cadena.getFrase().substring(i,i+1)){
                case "a":
                    contador += 1;
                    continue;
                case "e":
                    contador += 1;
                    continue;
                case "i":
                    contador += 1;
                    continue;
                case "o":
                    contador += 1;
                    continue;
                case "u":
                    contador += 1;
                    continue;
        }
            System.out.println("La cantidad de vocales en la frase es: " + contador);
        }
            */

       /*
            if (cadena.getFrase().substring(i,i+1).equalsIgnoreCase("a")){
                 contador +=1;
               
            }
            else if (cadena.getFrase().substring(i,i+1).equalsIgnoreCase("e")){
                 contador +=1;
         
            }
            else if (cadena.getFrase().substring(i,i+1).equalsIgnoreCase("i")){
                 contador +=1;
       
            }
            else if (cadena.getFrase().substring(i,i+1).equalsIgnoreCase("o")){
                 contador +=1;
      }
            else if (cadena.getFrase().substring(i,i+1).equalsIgnoreCase("u")){
                 contador +=1;
                
                    }
        }
         System.out.println("La cantidad de vocales en la frase es: " + contador);
          */ 
            
package ejercicio8.Entidades.CadenaServicio;

import ejercicio8.Entidades.Cadena;
import java.util.Scanner;


public class CadenaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
public void contarVocales(Cadena cadena){
        
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud() ; i++) {
     
           if ( cadena.getFrase().substring(i,i+1).equalsIgnoreCase("a")  || cadena.getFrase().substring(i,i+1).equalsIgnoreCase("e")  ||
                    cadena.getFrase().substring(i,i+1).equalsIgnoreCase("i")  || cadena.getFrase().substring(i,i+1).equalsIgnoreCase("o")  ||
                    cadena.getFrase().substring(i,i+1).equalsIgnoreCase("u")){
                contador += 1;
            }
           
        }
        System.out.println("La cantidad de vocales en la frase es: " + contador);
}

public void invertirFrase(Cadena cadena){
    
    for (int i = cadena.getLongitud(); i > 0; i--) {
        
        System.out.print(cadena.getFrase().substring(i-1,i));
    }
}

public void vecesRepetido(Cadena cadena){
    System.out.println("Ingrese un carácter: ");
    String letra = leer.next();
    int contador = 0;
    for (int i = 0; i < cadena.getLongitud(); i++) {
        if (cadena.getFrase().substring(i,i+1).equalsIgnoreCase(letra)){
            contador += 1;
        }
    }
    System.out.println("La cantidad de veces que aparece la letra " + letra +
            " es "+ contador + " veces.");
    
}

public void compararLongitud(Cadena cadena){
    System.out.println("Ingrese otra frase: ");
    String frase2 = leer.next();
    int longitud2 = frase2.length();
    
    if(longitud2 == cadena.getLongitud()){
        System.out.println("Ambas frases tienen la misma longitud.");
    }
    else {
        System.out.println("Las frases no tienen la misma longitud.");
    }
}
        
public void unirFrases(Cadena cadena){
    System.out.println("Ingrese la frase que desea concatenar al primer texto o palabra: ");
    String frase = leer.next();
    System.out.println(cadena.getFrase().concat(" " + frase));
    
}        

public void reemplazar(Cadena cadena){
   
    System.out.println("Ingrese un carácter para reemplazar todas las letras - a -:");
    String caracter = leer.next();
    String frasenueva = cadena.getFrase();
    String frase2 = frasenueva.replace("a", caracter);
    
    System.out.println(frase2);
    /*
    for (int i = 0; i < cadena.getLongitud(); i++) {
        if (frasenueva.substring(i, i+1).equalsIgnoreCase("a")){
            
            frasenueva.substring(i, i+1).replace("a", caracter);
        }
    }*/
    
    /*  DA ERROR AL QUERER CONCATENER "FRASE NUEVA" VACÍA CON UN SÓLO SUBSTRING DE GETFRASE 
        POR ESO MEJOR GUARDAR CON GETFRASE EN LA FRASENUEVA Y TRABAJAR CON ESA.
    
    
    for (int i = 0; i < cadena.getLongitud(); i++) {
        
        if (cadena.getFrase().substring(i, i+1).equalsIgnoreCase("a")){
            frasenueva.concat(cadena.getFrase().substring(i,i+1),caracter);
        }
        else {
            frasenueva.concat(cadena.getFrase().substring(i, i+1),cadena.getFrase().substring(i, i+1));
        }
        System.out.println(frasenueva);
    }
    System.out.println(frasenueva);
    
    SEGUNDA PRUEBA: RECORRE BIEN LA FRASE PERO NO FUNCIONA, POR LO QUE VOY A PROBAR DIRECTAMENTE REMPLAZANDO LA FRASENUEVA.
    
    for (int i = 0; i < cadena.getLongitud(); i++) {
        if(frasenueva.substring(i, i+1).equalsIgnoreCase("a")){
            frasenueva.substring(i, i+1).replace("a", caracter);
        }
        System.out.println(frasenueva.substring(i, i+1));
    }
    System.out.println(frasenueva);
*/
}

public void contiene(Cadena cadena){
    System.out.println("Ingrese una letra para comprobar si aparece o no en la frase: ");
    String letra = leer.next();
    
    System.out.println(cadena.getFrase().contains(letra));
    
}

}