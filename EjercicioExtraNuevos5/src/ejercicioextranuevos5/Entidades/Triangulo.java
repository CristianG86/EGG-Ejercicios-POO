
package ejercicioextranuevos5.Entidades;


public class Triangulo {
    
    private double ladosAyB;
    private double ladoC;

    public Triangulo() {
    }

    public Triangulo(double ladosAyB, double ladoC) {
        this.ladosAyB = ladosAyB;
        this.ladoC = ladoC;
    }

    public double getLadosAyB() {
        return ladosAyB;
    }

    public void setLadosAyB(double ladosAyB) {
        this.ladosAyB = ladosAyB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "ladosAyB=" + ladosAyB + ", ladoC=" + ladoC + '}';
    }


    


    
}
