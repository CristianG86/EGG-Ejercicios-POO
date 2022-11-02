
package ejercicio12.Persona;

import java.util.Date;


public class Persona {
    
        private String nombre;
        
        private Date fechadenac;
        
        private int edad;
        

    public Persona() {
    }
    
    public Persona(String nombre, Date fechadenac) {
        this.nombre = nombre;
        this.fechadenac = fechadenac;
    }
    
    public Persona(String nombre, Date fechadenac, int edad) {
        this.nombre = nombre;
        this.fechadenac = fechadenac;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechadenac() {
        return fechadenac;
    }

    public void setFechadenac(Date fechadenac) {
        this.fechadenac = fechadenac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechadenac=" + fechadenac + ", edad=" + edad + '}';
    }
        
        
        
    
}
