package Ejercicio3;

/**
 *
 * @author emmanuelrivero
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Autor getAutor() { 
        return autor; 
    }
    
    public Editorial getEditorial() { 
        return editorial; 
    }
    
    public void setEditorial(Editorial editorial) { 
        this.editorial = editorial; 
    }

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', isbn='" + isbn +
               "', autor=" + autor +
               ", editorial=" + editorial + "}";
    }
}