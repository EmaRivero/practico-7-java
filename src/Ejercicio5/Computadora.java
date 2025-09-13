package Ejercicio5;

/**
 *
 * @author emmanuelrivero
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private final PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
    }

    public String getMarca() { 
        return marca;
    }
    
    public String getNumeroSerie() { 
        return numeroSerie; 
    }
    
    public PlacaMadre getPlacaMadre() { 
        return placaMadre; 
    }
    
    public Propietario getPropietario() { 
        return propietario; 
    }

    public void setPropietario(Propietario p) {
        this.propietario = p;
        if (p != null && p.getComputadora() != this) {
            p.setComputadora(this);
        }
    }

    @Override
    public String toString() {
        return "Computadora{marca='" + marca + "', numeroSerie='" + numeroSerie +
               "', placaMadre=" + placaMadre + ", propietario=" + propietario.getNombre() + "}";
    }
}
