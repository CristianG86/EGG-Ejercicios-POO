
package ejercicioextranuevos5;

import ejercicioextranuevos5.Entidades.Triangulo;
import ejercicioextranuevos5.Servicios.TrianguloServicio;

public class EjercicioExtraNuevos5 {

    public static void main(String[] args) {
       
        TrianguloServicio ts = new TrianguloServicio();
        
        Triangulo [] arregloTriangulos = new Triangulo [4];
        
        for (int i = 0; i < 4; i++) {
            
            arregloTriangulos[i] = ts.crearTriangulo();
            
        }
            
        int mayorAreaIndice = 0;
        double mayorArea = 0;
        double area; 
        
        for (int i = 0; i < 4; i++) {
            
            area = ts.areaTriangulo(arregloTriangulos[i]);
            
            if (area > mayorArea){
                mayorArea = area;
                mayorAreaIndice = i;
            }
            
        }
        
        System.out.println("Los datos del triángulo con mayor área son: " + "\n " + arregloTriangulos[mayorAreaIndice]);
        
        
    }
    
}
