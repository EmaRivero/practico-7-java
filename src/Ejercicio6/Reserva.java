package Ejercicio6;

/**
 *
 * @author emmanuelrivero
 */
public class Reserva {
    private String fecha;
    private String hora;

    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public Cliente getCliente() { 
        return cliente; 
    }
    
    public Mesa getMesa() { 
        return mesa; 
    }

    @Override
    public String toString() {
        return "Reserva{fecha='" + fecha + "', hora='" + hora +
               "', cliente=" + cliente.getNombre() + ", mesa=" + mesa.getNumero() + "}";
    }
}
