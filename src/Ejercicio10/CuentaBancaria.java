/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author emmanuelrivero
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private final ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
    }

    public String getCbu() {
        return cbu; 
    }
    
    public double getSaldo() { 
        return saldo; 
    }
    
    public ClaveSeguridad getClave() {
        return clave; 
    }

    public Titular getTitular() {
        return titular; 
    }
    
    public void setTitular(Titular t) {
        this.titular = t;
        if (t != null && t.getCuenta() != this) {
            t.setCuenta(this);
        }
    }

    public void depositar(double monto) { 
        if (monto > 0) {
            saldo += monto;
        }
    }
    
    public void extraer(double monto)   { if (monto > 0 && monto <= saldo) saldo -= monto; }

    @Override
    public String toString() {
        return "CuentaBancaria{cbu='" + cbu + "', saldo=" + saldo +
               ", clave=" + clave + ", titular=" + titular.getNombre() + "}";
    }
}
