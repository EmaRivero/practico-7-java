
package practico5;
import Ejercicio1.Foto;
import Ejercicio1.Pasaporte;
import Ejercicio1.Titular;
import Ejercicio2.Bateria;
import Ejercicio2.Celular;
import Ejercicio2.Usuario;

/**
 *
 * @author emmanuelrivero
 */
public class Practico5 {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
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
    
    public static void ejercicio2() {
        System.out.println("===== EJERCICIO 2 =====");

        // Baterías (agregación)
        Bateria b1 = new Bateria("BN-100", 4000);
        Bateria b2 = new Bateria("BN-200", 5000);
        Bateria b3 = new Bateria("BN-300", 4500);

        // Celulares
        Celular c1 = new Celular("IMEI-001", "Samsung", "S22");
        Celular c2 = new Celular("IMEI-002", "Apple",   "iPhone 14");
        Celular c3 = new Celular("IMEI-003", "Xiaomi",  "Mi 12");

        // Asignar baterías (agregación: set simple)
        c1.setBateria(b1);
        c2.setBateria(b2);
        c3.setBateria(b3);

        // Usuarios (bidireccional 1↔1, patrón simple con guardas)
        Usuario u1 = new Usuario("Emmanuel Rivero",  "31.111.222");
        Usuario u2 = new Usuario("Albahaca Rivero", "32.222.333");
        Usuario u3 = new Usuario("María Eugenia Conte", "33.333.444");

        c1.setUsuario(u1);
        c2.setUsuario(u2);
        c3.setUsuario(u3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
}
