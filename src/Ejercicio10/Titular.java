/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author emmanuelrivero
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public String getDni() { 
        return dni; 
    }
    
    public CuentaBancaria getCuenta() {
        return cuenta; 
    }

    public void setCuenta(CuentaBancaria c) {
        this.cuenta = c;
        if (c != null && c.getTitular() != this) {
            c.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni='" + dni + "', cbu=" + cuenta.getCbu() + "}";
    }
}
