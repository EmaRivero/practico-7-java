package Ejercicio11;

/**
 *
 * @author emmanuelrivero
 */
public class Reproductor {
    public void reproducir(Cancion cancion) {
        if (cancion == null) {
            System.out.println("No hay canción para reproducir.");
            return;
        }
        String artista = cancion.getArtista().getNombre();
        System.out.println("▶ Reproduciendo: " + cancion.getTitulo() + " — " + artista);
    }
}
