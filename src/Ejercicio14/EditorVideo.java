package Ejercicio14;

/**
 *
 * @author emmanuelrivero
 */
public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        if (formato == null || formato.isBlank()) {
            System.out.println("Formato inválido.");
            return;
        }
        if (proyecto == null) {
            System.out.println("Proyecto inválido.");
            return;
        }
        Render r = new Render(formato, proyecto);
        System.out.println("Render generado -> " + r);
    }
}
