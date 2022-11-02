/*
 Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package ejercicioextranuevos1;

import ejercicioextranuevos1.Entidades.Fraccion;
import ejercicioextranuevos1.Servicios.FraccionServicio;
import java.util.Scanner;


public class EjercicioExtraNuevos1 {

    public static void main(String[] args) {
        
        FraccionServicio fs = new FraccionServicio();
        Scanner leer = new Scanner(System.in);
        
        Fraccion fraccion1 = fs.crearfraccion();
        
        int opcion = 1;
        
        while (opcion !=5){
            System.out.println("Ingrese la opción que desea realizar: ");
            System.out.println("1. Sumar Fracciones.");
            System.out.println("2. Restar Fracciones.");
            System.out.println("3. Multiplicar Fracciones.");
            System.out.println("4. Dividir Fracciones.");
            System.out.println("5. Salir.");
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    fs.sumar(fraccion1);
                    continue;
                case 2:
                    fs.restar(fraccion1);
                    continue;
                case 3:
                    fs.multiplicar(fraccion1);
                    continue;
                case 4:
                    fs.division(fraccion1);
                    continue;
            } 
        
        }
    } }      

