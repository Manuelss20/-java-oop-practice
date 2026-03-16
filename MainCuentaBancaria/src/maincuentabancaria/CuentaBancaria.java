
package maincuentabancaria;

/* @author manuelsss20 */

public class CuentaBancaria {
    
    private String nombreTitular;
    private double saldo; 
    
    // Constructor, inicializa las variables de instancia
    public CuentaBancaria(String nombreTitular, double saldo){
        this.nombreTitular = nombreTitular;
        setSaldo(saldo);
    }
    
    // setter & getter nombreTitular
    public String getNombreTitular(){
        return nombreTitular;
    }
    
    public void setNombreTitular(String nombre){
        nombreTitular = nombre;
    }
    
    // setter & getter saldo
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double Saldo){
        if (Saldo >= 0) {
            saldo = Saldo;
        } else {
            saldo = 0;
        }
    }
    
    public void depositar(double cantidad){
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.print("Realizar un déposito mayor a $0 MXN\n");
        }
    }
    
    public void retirar(double cantidad){
        if (cantidad <= 0) {
            System.out.print("Monto no valido, intente otra vez\n");
        } else if (cantidad > saldo) {
            System.out.print("Fondos insuficientes\n");
        } else {
            saldo -= cantidad;
        }
    }
    
    
}
