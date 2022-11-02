
package ejercicio1.ServicioLibro;

import ejercicio1.Entidades.Libro;
import java.util.Scanner;

public class ServicioLibro {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro cargarLibro(){
        System.out.println("Introducir el ISBN: ");
        int ISBN = leer.nextInt();
        
        System.out.println("Introducir el Título: ");
        String titulo = leer.next();
        
        System.out.println("Introducir el Autor: ");
        String autor = leer.next();
        
        System.out.println("Introducir el número de páginas: ");
        int numpaginas = leer.nextInt();
        
        return new Libro(ISBN, titulo,autor,numpaginas);
    }
    
    public void mostrarLibro(Libro libro){
        
        System.out.println("" + libro.getAutor());
        System.out.println("" + libro.getTitulo());
        System.out.println("" + libro.getNumpaginas());
        System.out.println("" + libro.getISBN());
        
        
    }
    
    
}
