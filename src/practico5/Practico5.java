
package practico5;
import Ejercicio1.Foto;
import Ejercicio1.Pasaporte;
import Ejercicio1.Titular;

/**
 *
 * @author emmanuelrivero
 */
public class Practico5 {
    public static void main(String[] args) {
        ejercicio1();
    }
    
    public static void ejercicio1() {
        System.out.println("===== EJERCICIO 1 =====");
        Foto f1 = new Foto("ruta/a1.jpg", "jpg");
        Foto f2 = new Foto("ruta/a2.png", "png");
        Foto f3 = new Foto("ruta/a3.webp", "webp");

        Pasaporte p1 = new Pasaporte("AR-0001", "2025-01-01", f1);
        Pasaporte p2 = new Pasaporte("AR-0002", "2025-02-01", f2);
        Pasaporte p3 = new Pasaporte("AR-0003", "2025-03-01", f3);

        Titular t1 = new Titular("Emmanuel Rivero",  "30.111.222");
        Titular t2 = new Titular("Menta Rivero", "30.999.888");
        Titular t3 = new Titular("María Eugenia Conte","28.987.654");

        p1.setTitular(t1);
        p2.setTitular(t2);
        p3.setTitular(t3);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
