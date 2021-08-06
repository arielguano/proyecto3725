
package dominio;


public class Vejez  extends Jubilado {
   private float pi;
   private float ganancia;

    public Vejez(float pi, float ganancia, int cedula, String nombres, int salariob,int numero_años_aporte) {
        super(cedula, nombres, salariob, numero_años_aporte);
        this.pi = salariob+(salariob*this.porcentaje);
        this.ganancia = ganancia;
    }

 
   
}
