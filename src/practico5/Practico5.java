
package practico5;
import Ejercicio1.Foto;
import Ejercicio1.Pasaporte;
import Ejercicio1.Titular;
import Ejercicio10.ClaveSeguridad;
import Ejercicio10.CuentaBancaria;
import Ejercicio11.Artista;
import Ejercicio11.Cancion;
import Ejercicio11.Reproductor;
import Ejercicio2.Bateria;
import Ejercicio2.Celular;
import Ejercicio2.Usuario;
import Ejercicio3.Autor;
import Ejercicio3.Editorial;
import Ejercicio3.Libro;
import Ejercicio4.Banco;
import Ejercicio4.Cliente;
import Ejercicio4.TarjetaDeCredito;
import Ejercicio5.Computadora;
import Ejercicio5.PlacaMadre;
import Ejercicio5.Propietario;
import Ejercicio6.Mesa;
import Ejercicio6.Reserva;
import Ejercicio7.Conductor;
import Ejercicio7.Motor;
import Ejercicio7.Vehiculo;
import Ejercicio8.Documento;
import Ejercicio8.FirmaDigital;
import Ejercicio9.CitaMedica;
import Ejercicio9.Paciente;
import Ejercicio9.Profesional;

/**
 *
 * @author emmanuelrivero
 */
public class Practico5 {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        ejercicio11();
    }
    
    public static void ejercicio1() {
        System.out.println("===== EJERCICIO 1 =====");
        Foto f1 = new Foto("ruta/a1.jpg", "jpg");
        Foto f2 = new Foto("ruta/a2.png", "png");
        Foto f3 = new Foto("ruta/a3.webp", "webp");
        Pasaporte p1 = new Pasaporte("AR-0001", "2025-01-01", f1);
        Pasaporte p2 = new Pasaporte("AR-0002", "2025-02-01", f2);
        Pasaporte p3 = new Pasaporte("AR-0003", "2025-03-01", f3);
        Titular t1 = new Titular("Emmanuel Rivero", "30.111.222");
        Titular t2 = new Titular("Menta Rivero", "30.999.888");
        Titular t3 = new Titular("María Eugenia Conte", "28.987.654");
        p1.setTitular(t1);
        p2.setTitular(t2);
        p3.setTitular(t3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
    
    public static void ejercicio2() {
        System.out.println("===== EJERCICIO 2 =====");
        Bateria b1 = new Bateria("BN-100", 4000);
        Bateria b2 = new Bateria("BN-200", 5000);
        Bateria b3 = new Bateria("BN-300", 4500);
        Celular c1 = new Celular("IMEI-001", "Samsung", "S22");
        Celular c2 = new Celular("IMEI-002", "Apple", "iPhone 14");
        Celular c3 = new Celular("IMEI-003", "Xiaomi", "Mi 12");
        c1.setBateria(b1);
        c2.setBateria(b2);
        c3.setBateria(b3);
        Usuario u1 = new Usuario("Emmanuel Rivero", "31.111.222");
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
    
    public static void ejercicio3() {
        System.out.println("===== EJERCICIO 3 =====");
        Autor a1 = new Autor("Julio Cortázar", "Argentina");
        Autor a2 = new Autor("Isabel Allende", "Chile");
        Autor a3 = new Autor("Haruki Murakami", "Japón");
        Editorial e1 = new Editorial("Alfaguara", "Av. Siempre Viva 123");
        Editorial e2 = new Editorial("Planeta", "Calle Falsa 456");
        Editorial e3 = new Editorial("Tusquets","Boulevard 789");
        Libro l1 = new Libro("Rayuela", "ISBN-001", a1, e1);
        Libro l2 = new Libro("La casa de los espíritus", "ISBN-002", a2, e2);
        Libro l3 = new Libro("Kafka en la orilla", "ISBN-003", a3, e3);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
    
    public static void ejercicio4() {
        System.out.println("===== EJERCICIO 4 =====");
        Banco b1 = new Banco("Banco Río", "30-11111111-9");
        Banco b2 = new Banco("Banco Nación", "30-22222222-7");
        Banco b3 = new Banco("Banco Galicia", "30-33333333-5");
        TarjetaDeCredito t1 = new TarjetaDeCredito("4509 1234 5678 0001", "12/27", b1);
        TarjetaDeCredito t2 = new TarjetaDeCredito("4509 1234 5678 0002", "08/26", b2);
        TarjetaDeCredito t3 = new TarjetaDeCredito("4509 1234 5678 0003", "05/28", b3);
        Cliente c1 = new Cliente("Emmanuel Rivero", "30.111.222");
        Cliente c2 = new Cliente("Menta Rivero", "30.999.888");
        Cliente c3 = new Cliente("María E. Conte", "28.987.654");
        t1.setCliente(c1);
        t2.setCliente(c2);
        t3.setCliente(c3);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
    
    public static void ejercicio5() {
        System.out.println("===== EJERCICIO 5 =====");
        PlacaMadre pm1 = new PlacaMadre("ASUS TUF B550", "AM4");
        PlacaMadre pm2 = new PlacaMadre("Gigabyte Z690", "LGA1700");
        PlacaMadre pm3 = new PlacaMadre("MSI B760", "LGA1700");
        Computadora c1 = new Computadora("ASUS", "SN-0001", pm1);
        Computadora c2 = new Computadora("HP", "SN-0002", pm2);
        Computadora c3 = new Computadora("Lenovo", "SN-0003", pm3);
        Propietario p1 = new Propietario("Emmanuel Rivero", "30.111.222");
        Propietario p2 = new Propietario("Menta Rivero", "30.999.888");
        Propietario p3 = new Propietario("María E. Conte", "28.987.654");
        c1.setPropietario(p1);
        c2.setPropietario(p2);
        c3.setPropietario(p3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
    
    public static void ejercicio6() {
        System.out.println("===== EJERCICIO 6 =====");
        Mesa m1 = new Mesa(1, 4);
        Mesa m2 = new Mesa(2, 2);
        Mesa m3 = new Mesa(3, 6);
        Ejercicio6.Cliente c1 = new Ejercicio6.Cliente("Emmanuel Rivero",   "11-2222-3333");
        Ejercicio6.Cliente c2 = new Ejercicio6.Cliente("Pepe Gómez",  "11-4444-5555");
        Ejercicio6.Cliente c3 = new Ejercicio6.Cliente("Mauricio Gomez",  "11-6666-7777");
        Reserva r1 = new Reserva("2025-09-20", "20:30", c1, m1);
        Reserva r2 = new Reserva("2025-09-21", "21:00", c2, m2);
        Reserva r3 = new Reserva("2025-09-22", "21:30", c3, m3);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
    
    public static void ejercicio7() {
        System.out.println("===== EJERCICIO 7 =====");
        Motor m1 = new Motor("Nafta", "M-0001");
        Motor m2 = new Motor("Eléctrico", "M-0002");
        Motor m3 = new Motor("Diésel", "M-0003");
        Vehiculo v1 = new Vehiculo("AB123CD", "Ford Focus", m1);
        Vehiculo v2 = new Vehiculo("AC234DE", "Tesla Model 3", m2);
        Vehiculo v3 = new Vehiculo("AD345EF", "Hilux", m3);
        Conductor c1 = new Conductor("Emmanuel Rivero", "B123456");
        Conductor c2 = new Conductor("Albahaca Rivero", "B654321");
        Conductor c3 = new Conductor("María E. Conte", "C777777");
        v1.setConductor(c1);
        v2.setConductor(c2);
        v3.setConductor(c3);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
    
    public static void ejercicio8() {
        System.out.println("===== EJERCICIO 8 =====");
        Ejercicio8.Usuario u1 = new Ejercicio8.Usuario("Emmannuel Rivero",  "emmanuel@correo.com");
        Ejercicio8.Usuario u2 = new Ejercicio8.Usuario("Silvia Corradi", "silvia@correo.com");
        Ejercicio8.Usuario u3 = new Ejercicio8.Usuario("María Eugenia Conte", "maria@correo.com");
        FirmaDigital f1 = new FirmaDigital("H-001", "2025-09-01", u1);
        FirmaDigital f2 = new FirmaDigital("H-002", "2025-09-02", u2);
        FirmaDigital f3 = new FirmaDigital("H-003", "2025-09-03", u3);
        Documento d1 = new Documento("Contrato A", "Contenido...", f1);
        Documento d2 = new Documento("Contrato B", "Contenido...", f2);
        Documento d3 = new Documento("Contrato C", "Contenido...", f3);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
    
    public static void ejercicio9() {
        System.out.println("===== EJERCICIO 9 =====");
        Paciente p1 = new Paciente("Ana Pérez", "OSDE");
        Paciente p2 = new Paciente("Luis Gómez","Swiss Medical");
        Paciente p3 = new Paciente("María Ruiz","Galeno");
        Profesional pr1 = new Profesional("Dra. López", "Clínica");
        Profesional pr2 = new Profesional("Dr. Pérez", "Cardiología");
        Profesional pr3 = new Profesional("Dra. Sosa", "Dermatología");
        CitaMedica c1 = new CitaMedica("2025-10-01", "09:00", p1, pr1);
        CitaMedica c2 = new CitaMedica("2025-10-01", "10:30", p2, pr2);
        CitaMedica c3 = new CitaMedica("2025-10-02", "11:15", p3, pr3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
    
    public static void ejercicio10() {
        System.out.println("===== EJERCICIO 10 =====");
        ClaveSeguridad k1 = new ClaveSeguridad("ABC123", "2025-09-01");
        ClaveSeguridad k2 = new ClaveSeguridad("DEF456", "2025-09-02");
        ClaveSeguridad k3 = new ClaveSeguridad("GHI789", "2025-09-03");
        CuentaBancaria cb1 = new CuentaBancaria("000-111-222-1", 100000.0, k1);
        CuentaBancaria cb2 = new CuentaBancaria("000-111-222-2", 50000.0, k2);
        CuentaBancaria cb3 = new CuentaBancaria("000-111-222-3", 250000.0, k3);
        Ejercicio10.Titular t1 = new Ejercicio10.Titular("Emmanuel Rivero", "30.111.222");
        Ejercicio10.Titular t2 = new Ejercicio10.Titular("Menta Rivero", "30.999.888");
        Ejercicio10.Titular t3 = new Ejercicio10.Titular("María E. Conte", "28.987.654");
        cb1.setTitular(t1);
        cb2.setTitular(t2);
        cb3.setTitular(t3);
        System.out.println(cb1);
        System.out.println(cb2);
        System.out.println(cb3);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
    
    public static void ejercicio11() {
        System.out.println("===== EJERCICIO 11 =====");
        Artista ar1 = new Artista("Gustavo Cerati", "Rock");
        Artista ar2 = new Artista("Mercedes Sosa", "Folclore");
        Cancion c1 = new Cancion("Crimen", ar1);
        Cancion c2 = new Cancion("De música ligera", ar1);
        Cancion c3 = new Cancion("Gracias a la vida", ar2);
        Reproductor rep = new Reproductor();
        rep.reproducir(c1);
        rep.reproducir(c2);
        rep.reproducir(c3);
    }
}
