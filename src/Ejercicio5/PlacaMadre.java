package Ejercicio5;

/**
 *
 * @author emmanuelrivero
 */
public final class PlacaMadre {
    private final String modelo;
    private final String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo()  { 
        return modelo; 
    }
    
    public String getChipset() { 
        return chipset; 
    }

    @Override
    public String toString() {
        return "PlacaMadre{modelo='" + modelo + "', chipset='" + chipset + "'}";
    }
}
