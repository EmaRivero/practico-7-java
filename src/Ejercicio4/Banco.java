package Ejercicio4;

/**
 *
 * @author emmanuelrivero
 */
public class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() { 
        return nombre; 
    }

    @Override
    public String toString() {
        return "Banco{nombre='" + nombre + "', cuit='" + cuit + "'}";
    }
}
