package Ejercicio4;

/**
 *
 * @author emmanuelrivero
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public String getNumero() {
        return numero; 
    }
    
    public Banco getBanco() { 
        return banco; 
    }
    
    public Cliente getCliente() { 
        return cliente; 
    }

    public void setCliente(Cliente c) {
        this.cliente = c;
        if (c != null && c.getTarjeta() != this) {
            c.setTarjeta(this);
        }
    }

    @Override
    public String toString() {
        String cli = (cliente != null) ? cliente.getNombre() + " (" + cliente.getDni() + ")" : "—";
        return "TarjetaDeCredito{numero='" + numero + "', venc='" + fechaVencimiento +
               "', banco=" + banco + ", cliente=" + cli + "}";
    }
}