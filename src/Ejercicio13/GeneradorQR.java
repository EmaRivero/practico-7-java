package Ejercicio13;

/**
 *
 * @author emmanuelrivero
 */
public class GeneradorQR {

    public void generar(String valor, Usuario usuario) {
        if (valor == null || valor.isBlank()) {
            System.out.println("Valor inválido para el QR.");
            return;
        }
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado -> " + qr);
    }
}
