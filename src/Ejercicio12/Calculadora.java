package Ejercicio12;

/**
 *
 * @author emmanuelrivero
 */
public class Calculadora {
    private static final double ALICUOTA = 0.21;

    public void calcular(Impuesto impuesto) {
        if (impuesto == null) {
            System.out.println("No se indicó impuesto.");
            return;
        }
        double base = impuesto.getMonto();
        double aPagar = base * ALICUOTA;
        String nombre = impuesto.getContribuyente().getNombre();
        System.out.printf("🔎 %s - Base: $%.2f | Alícuota: %.0f%% | A pagar: $%.2f%n",
                nombre, base, ALICUOTA * 100, aPagar);
    }
}
