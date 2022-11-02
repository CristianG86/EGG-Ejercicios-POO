
package ejercicioextranuevo4.Entidades;


public class Fecha {
    
    
    private int dia = 1;
    private int mes = 1;
    private int anio = 1900;
    private int [] diasMeses = {31,28,31,30,31,30,31,31,30,31,30,31};
    private String [] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", 
        "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int[] getDiasMeses() {
        return diasMeses;
    }

    public void setDiasMeses(int[] diasMeses) {
        this.diasMeses = diasMeses;
    }

    public String[] getNombreMeses() {
        return nombreMeses;
    }

    public void setNombreMeses(String[] nombreMeses) {
        this.nombreMeses = nombreMeses;
    }


    
 
    
    
    
    
}
