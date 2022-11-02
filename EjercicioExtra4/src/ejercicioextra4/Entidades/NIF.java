
package ejercicioextra4.Entidades;


public class NIF {
    
    private long DNI;
    private String NIF;

    public NIF() {
    }

    public NIF(long DNI, String NIF) {
        this.DNI = DNI;
        this.NIF = NIF;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return "NIF{" + "DNI=" + DNI + ", NIF=" + NIF + '}';
    }
    
    
    
}
