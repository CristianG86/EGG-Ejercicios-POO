
package ejercicio1.Entidades;


public class Libro {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int numpaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numpaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numpaginas = numpaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numpaginas=" + numpaginas + '}';
    }
    
    
    
    
}
