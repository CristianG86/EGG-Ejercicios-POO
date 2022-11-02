
package ejercicioextranuevos3.Servicio;

import ejercicioextranuevos3.Entidades.Pass;
import java.util.Scanner;


public class PassServicio {
    Scanner leer = new Scanner(System.in);
    
    
    public void crearPass(Pass p){
        
        String contrasenia = "";
        
        while (contrasenia.length() != 10){
        System.out.println("Ingrese una contraseña de al menos 10 carácteres: ");
        contrasenia = leer.next();
        
        p.setPass(contrasenia);
        }
        System.out.println("Su contraseña es: " + p.getPass());
    }
    
    public void analizarPass(Pass p){
        
        int contadorA = 0;
        int contadorZ = 0;
        String nivel;
        for (int i = 0; i < p.getPass().length(); i++) {
            
            if (p.getPass().substring(i, i+1).equalsIgnoreCase("a") == true){
                
                contadorA +=1;
            }
            else if (p.getPass().substring(i, i+1).equalsIgnoreCase("z") == true){
                
                contadorZ +=1;
                
            }
        }
        
        if (contadorZ >= 1 && contadorA >=2){
            
            nivel = "ALTO";
            
        }
        else if (contadorZ >= 1){
            nivel = "MEDIO";
        }
        else if (contadorA >=2){
            nivel = "MEDIO";
        }
        else {
            nivel = "BAJO";
        }
        System.out.println("La contraseña es de nivel: " + nivel);
        
    }
    
    public void modificarPass (Pass p){
        
        int intentos = 3;
        boolean verificar = false;
        
        while (intentos >0 && verificar == false){
            
            // INGRESAMOS LA CONTRASEÑA PARA VALIDAR USARIO
            System.out.println("Ingrese su contraseña: ");
            String verificarPass = leer.next();
            
            // SI LA CONTRASEÑA ES CORRECTA, NOS PERMITIRÁ CAMBIAR LA CONTRASEÑA ***(VALIDAMOS QUE TENGA 10 CARACTERES)***
            if (p.getPass().equals(verificarPass) == true){
                String contrasenia = "";
                while (contrasenia.length() != 10){
                    
                System.out.println("Ingrese una contraseña de al menos 10 carácteres: ");
                contrasenia = leer.next();
                p.setPass(contrasenia);
               }
                verificar = true;
            }
            else {
                verificar = false;
                intentos -= 1;
            }
            
        }
        if (intentos == 0){
            
            System.out.println("Ingreso su contraseña incorrectamente y agoto los 3 intentos, no puede realizar esta acción.");
        }
        
        System.out.println("Su nueva contraseña es: " + p.getPass());
        
    }
    
    public void modificarNombre (Pass p){
        
        int intentos = 3;
        boolean verificar = false;
        
        while (intentos >0 && verificar == false){
            System.out.println("Ingrese su contraseña: ");
            String verificarPass = leer.next();
            if (p.getPass().equals(verificarPass) == true){
                System.out.println("Ingrese un nuevo Nombre:");
                p.setNombre(leer.next());
                verificar = true;
            }
            else {
                verificar = false;
                intentos -= 1;
            }
            
        }
        if (intentos == 0){
            
            System.out.println("Ingreso su contraseña incorrectamente y agoto los 3 intentos, no puede realizar esta acción.");
        }
        System.out.println("Su nuevo nombre es: " + p.getNombre());
    }
    
    public void modificarDNI (Pass p){
    
     int intentos = 3;
        boolean verificar = false;
        
        while (intentos >0 && verificar == false){
            System.out.println("Ingrese su contraseña: ");
            String verificarPass = leer.next();
            if (p.getPass().equals(verificarPass) == true){
                System.out.println("Ingrese su nuevo DNI:");
                p.setDni(leer.nextInt());
                verificar = true;
            }
            else {
                verificar = false;
                intentos -= 1;
            }
            
        }
        if (intentos == 0){
            
            System.out.println("Ingreso su contraseña incorrectamente y agoto los 3 intentos, no puede realizar esta acción.");
        }
    
     System.out.println("Su nuevo DNI es: " + p.getDni());
    
    
    }
    
    
        
}
