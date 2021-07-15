
package Dominio;

import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class Fecha {
    private int anio;
    private int mes; 
    private int dia; 
    int mesResultado, diaResultado, anioResultado;
    private String nombre;
    private Fecha fechaN;
    private Fecha fechaI;

    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }
    public void calcularEdad(){
             
        Calendar cal = new GregorianCalendar(); 
        
        int diaActual = cal.get(Calendar.DAY_OF_MONTH); 
        int mesActual= 1;
        mesActual+=cal.get(Calendar.MONTH);
        int anioActual = cal.get(Calendar.YEAR);
        int edad = anioActual-anio;
        if(mesActual<=mes){
		if(mesActual==mes){
			if(dia>diaActual){
                          
				edad--;
			}
		}else{
			edad--;
		}
	}
    
       
        diaResultado= Math.abs(diaActual-dia);
        mesResultado = Math.abs(mesActual-mes);
        anioResultado=Math.abs(edad);
        
        System.out.println("Tienes "+anioResultado+" años " + ", "+mesResultado+" meses "+ " y "+diaResultado+" dias");
       
    }
    public void calcularfechaempresa(){
             
        Calendar cal = new GregorianCalendar(); 
        
        int diaActual = cal.get(Calendar.DAY_OF_MONTH); 
        int mesActual= 1;
        mesActual+=cal.get(Calendar.MONTH);
        int anioActual = cal.get(Calendar.YEAR);
        int edad = anioActual-anio;
        if(mesActual<=mes){
		if(mesActual==mes){
			if(dia>diaActual){
                          
				edad--;
			}
		}else{
			edad--;
		}
	}
    
       
        diaResultado= Math.abs(diaActual-dia);
        mesResultado = Math.abs(mesActual-mes);
        anioResultado=Math.abs(edad);
        
        System.out.println("Esta en la empresa: "+anioResultado+" años " + ", "+mesResultado+" meses "+ " y "+diaResultado+" dias");
       
    }
}
//Codigo de Gia
/*int OperacionesPersona::calcularEdad(Date nacimiento){

    time_t t = std::time(0);   
    tm* now = std::localtime(&t);

	int anioNacimiento = nacimiento.getYear();
	int mesNacimiento = nacimiento.getMonth();
	int diaNacimiento = nacimiento.getDay();

	int anioActual = now->tm_year+1900;
	int mesActual = now->tm_mon + 1;
	int diaActual = now->tm_mday;

	int edad = anioActual-anioNacimiento;

	if(mesActual<=mesNacimiento){
		if(mesActual==mesNacimiento){
			if(diaNacimiento>diaActual){
				edad--;
			}
		}else{
			edad--;
		}
	}
	return edad; 
}
*/







   // @Override
   // public String toString(){
      //  return this.anio+" "+this.mes+" "+this.dia;
    //}