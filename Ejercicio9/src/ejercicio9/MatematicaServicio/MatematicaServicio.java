
package ejercicio9.MatematicaServicio;

import ejercicio9.Entidades.Matematica;
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class MatematicaServicio {

public void devolverMayor(Matematica m){
    
    double mayor = max(m.getNum1(),m.getNum2());
    System.out.println("El mayor de lo números es " + mayor);
    
}


public void calcularPotencia(Matematica m){

if(m.getNum1() > m.getNum2()){
    
    double potencia = pow(round(m.getNum1()), round(m.getNum2()));
    System.out.println("La potencia del mayor valor elevado al menor es " + potencia);
}
else{
        double potencia = pow(round(m.getNum2()), round(m.getNum1()));
        System.out.println("La potencia del mayor valor elevado al menor es " + potencia);

}
   
}

public void calcularRaiz(Matematica m){
    
    if(m.getNum1() < m.getNum2()){
    
    double raiz = sqrt(abs(m.getNum1()));
    System.out.println("La raiz cuadrada del menor valor es " + raiz);
}
else{
        double raiz = sqrt(abs(m.getNum2()));
    System.out.println("La raiz cuadrada del menor valor  es " + raiz);
}
    
}







    
}
