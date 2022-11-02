
/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
*/

package ejercicio10sinclases;

import static java.lang.Math.random;
import java.util.Arrays;
import java.text.DecimalFormat;

public class Ejercicio10sinclases {

    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("###.##");
       
        double [] arregloA = new double[50];
        double [] arregloB = new double [20];
        
        /*   NO FUNCIONA, SÓLO DA UN NÚMERO ALEATORIO Y RELLENA TODO EL ARREGLO CON EL MISMO NÚMERO
        for (int i = 0; i < 50; i++) {
            Arrays.fill(arregloA, random()*10);
            
        }*/
        
        for (int i = 0; i < 50; i++) {
            
            arregloA[i] = random()*10;   
        }

        System.out.println(Arrays.toString(arregloA));
        
        // Ordenar el arreglo
        
        Arrays.sort(arregloA);
        
        
        // ME SUGIRIO EL CAMBIO DEL FOR PARA COPIAR LOS 10 PRIMEROS ÍNDICES POR EL SYSTEM.ARRAYCOPY
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        System.out.println(Arrays.toString(arregloB));

        
        Arrays.fill(arregloB,10,20,0.5);
        
        System.out.println(Arrays.toString(arregloB));

     


        }
        
    
        
        
        
        
        
        
    }
    

