package Dominio;


public class caja {
    private String NOMBRES;
    private double SaldoPersona;
    private static int Contador;
    private int Cuenta;
   
    public caja(String nombre, double saldo) {
        this.NOMBRES= nombre;
        this.SaldoPersona= saldo;
        this.Cuenta = caja.Contador++;
    }
      

    public int getCuenta() {
        return Cuenta;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }
    
     public double getSaldoPersona(){
        return SaldoPersona;
    }

    public void setNOMBRES(String nombre) {
        this.NOMBRES= nombre;
    }

    public void setSaldoPersona(double saldo) {
        this.SaldoPersona = saldo;
    }
    
   
     
    @Override
    public String toString(){
    return getNOMBRES();
}
    
}



