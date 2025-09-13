package Ejercicio4;

/**
 *
 * @author emmanuelrivero
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre; this.dni = dni;
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public String getDni() { 
        return dni; 
    }
    
    public TarjetaDeCredito getTarjeta() { 
        return tarjeta; 
    }

    public void setTarjeta(TarjetaDeCredito t) {
        this.tarjeta = t;
        if (t != null && t.getCliente() != this) {
            t.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente{nombre='" + nombre + "', dni='" + dni + "', tarjeta=" + tarjeta.getNumero() + "}";
    }
}