
package ejercicioextra6.Servicio;

import ejercicioextra6.Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {
    Scanner leer = new Scanner(System.in);
 
    
    public Ahorcado crearJuego(){
        
        System.out.println("Ingrese una palabra: ");
        String palabra = leer.next();
        
        System.out.println("Ingrese la cantidad de intentos posibles: ");
        int vidas = leer.nextInt();
        
        int longitudPalabra = palabra.length();
        
        String [] vectorPalabra = new String [longitudPalabra];
        
        for (int i = 0; i < longitudPalabra; i++) {
            
            vectorPalabra[i] = palabra.substring(i, i+1);
        }
        
        int letrasencontradas = 0;
        
        return new Ahorcado (vectorPalabra, letrasencontradas, vidas);
        
        
        
    }
    
    public void longitud(Ahorcado juego){
        
        System.out.println("El tamaño de la palabra es " + juego.getPalabra().length);
        
    }
    
    public void buscar(Ahorcado juego, String letra){
        
        boolean encontrada = false;
        
        for (int i = 0; i < juego.getPalabra().length; i++) {
            
            if (juego.getPalabra()[i].equals(letra)== true){
                encontrada = true;
                juego.setLetrasencontradas(juego.getLetrasencontradas()+1);
                break;
            }
            else if (juego.getPalabra()[i].equals(letra)== false){
                encontrada = false;
                
            }
        }
        if (encontrada == true){
            System.out.println("MENSAJE: La letra pertenece a la palabra.");
        }
        else if (encontrada == false){
            System.out.println("MENSAJE: La letra no pertenece a la palabra.");
            juego.setVidas(juego.getVidas()-1);
        }
        
    }
    
    public void encontradas(Ahorcado juego, String letra){
        
        int faltantes = juego.getPalabra().length-juego.getLetrasencontradas();
        System.out.println("Número de letras (encontradas, faltantes):"
                + "("+juego.getLetrasencontradas()+ ";" + faltantes + ")");
    }
    
    public void intentos (Ahorcado juego){
        
        System.out.println("Número de oportunidades restantes: " + juego.getVidas());
    }
    
    public void juego(){
        
        Ahorcado juego1 = crearJuego();
        
        longitud(juego1);
        
        while (juego1.getVidas() > 0 && juego1.getLetrasencontradas()!= juego1.getPalabra().length){
            
        
        System.out.println("Ingrese una letra:");
        String letra = leer.next();
        
        buscar(juego1,letra);
        
        encontradas(juego1, letra);
        
        intentos(juego1);
       
        }
        System.out.println("--------------------");
         if (juego1.getVidas() == 0){
            System.out.println("Lo sentimos, no hay más oportunidades");
    }
         else if (juego1.getLetrasencontradas() == juego1.getPalabra().length){
             System.out.println("¡Excelente! ¡Has ganado!");
         }

        }
        
    }



