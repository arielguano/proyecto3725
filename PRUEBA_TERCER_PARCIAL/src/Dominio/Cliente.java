
package Dominio;


public class Cliente {
    private String Nombre;
    private double Saldo;
    private double SaldoPersona;
    
    public Cliente(String nombre, double saldo) {
        this.Nombre= nombre;
        this.Saldo= saldo;
         this.SaldoPersona= saldo;
    }
    
 public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
  
}
