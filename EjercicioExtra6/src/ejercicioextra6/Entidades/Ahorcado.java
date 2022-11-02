
package ejercicioextra6.Entidades;

public class Ahorcado {
    
    private String [] palabra;
    
    private int letrasencontradas;
    
    private int vidas;

    public Ahorcado() {
    }

    public Ahorcado( int letrasencontradas, int vidas) {
        
        
        this.letrasencontradas = letrasencontradas;
        this.vidas = vidas;
        
    }

    public Ahorcado(String[] palabra, int letrasencontradas, int vidas) {
        this.palabra = palabra;
        this.letrasencontradas = letrasencontradas;
        this.vidas = vidas;
    }
    
    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasencontradas() {
        return letrasencontradas;
    }

    public void setLetrasencontradas(int letrasencontradas) {
        this.letrasencontradas = letrasencontradas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    
    
}
