
package dominio;


public class Jubilado {
private int cedula ; 
private String nombres;
private int salariob;
private int numero_años_aporte;
public float porcentaje;

    public Jubilado(int cedula, String nombres, int salariob, int numero_años_aporte) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.salariob = salariob;
        this.numero_años_aporte = numero_años_aporte;
        if( numero_años_aporte<=10){
            this.porcentaje=(float) 0.50;
        } else if(numero_años_aporte>10&&numero_años_aporte<=20){
             this.porcentaje=(float) 0.60;
        }else if(numero_años_aporte>20&&numero_años_aporte<=30){
             this.porcentaje=(float) 0.70;
        }else if(numero_años_aporte>30&&numero_años_aporte<=35){
             this.porcentaje=(float) 0.80;
        } else if(numero_años_aporte>35&&numero_años_aporte<=39){
             this.porcentaje=(float) 0.90;
        }else if(numero_años_aporte>=40){
            this.porcentaje=(float) 1.00;
        }
    }

    
}
