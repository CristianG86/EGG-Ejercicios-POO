
package ejercicio5.Entidades;


public class Cuenta {
    
    private int numeroCuenta;
    private int dni;
    private double saldoactual;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dni, double saldoactual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoactual = saldoactual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    
}
