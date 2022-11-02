
package ejercicioextra3.Entidades;


public class Raices {
    
    private double coeficienteA;
    private double coeficienteB;
    private double coeficienteC;
    private double discriminante;

    public double getDiscriminante() {
        return discriminante;
    }

    public void setDiscriminante(double discriminante) {
        this.discriminante = discriminante;
    }

    public Raices() {
    }

    public Raices(double coeficienteA, double coeficienteB, double coeficienteC) {
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    }

    public double getCoeficienteA() {
        return coeficienteA;
    }

    public void setCoeficienteA(double coeficienteA) {
        this.coeficienteA = coeficienteA;
    }

    public double getCoeficienteB() {
        return coeficienteB;
    }

    public void setCoeficienteB(double coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    public double getCoeficienteC() {
        return coeficienteC;
    }

    public void setCoeficienteC(double coeficienteC) {
        this.coeficienteC = coeficienteC;
    }

    @Override
    public String toString() {
        return "Raices{" + "coeficienteA=" + coeficienteA + ", coeficienteB=" + coeficienteB + ", coeficienteC=" + coeficienteC + ", discriminante=" + discriminante + '}';
    }
    
    
    
    
}
