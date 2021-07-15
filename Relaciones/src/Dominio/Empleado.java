package Dominio;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {
    private String nombre;
    private Fecha fechaN;
    private Fecha fechaI;
    

    public Empleado(String nombre, Fecha fechaN, Fecha fechaI) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.fechaI = fechaI;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaN() {
        return fechaN;
    }

    public Fecha getFechaI() {
        return fechaI;
    }
    public void verDatos(){
        System.out.println("\nNombre: "+this.nombre);
        System.out.println("Fecha de nacimiento: Anio  Mes  Dia");
        System.out.println("                   "+fechaN.getAnio()+" "+fechaN.getMes()+" "+fechaN.getDia());
        
    }
    
    public void verDatos1(){
        System.out.println("\nFecha de Ingreso a la Empresa:  Anio  Mes  Dia ");
        System.out.println("                                "+fechaI.getAnio()+" "+fechaI.getMes()+" "+fechaI.getDia());
    } 
    
   // @Override
    //public String toString(){
        //return this.getNombre()+"\n"+this.getFechaN()+"\n"+this.fechaI;
   // }
}