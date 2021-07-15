
package Test;

import Dominio.Empleado;
import Dominio.Fecha;
import java.util.Scanner;


public class TestEmpleadoFecha {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Fecha fNacimiento;
        Fecha fIngreso; 
        Fecha fecha1;
        Empleado empleado1;
        
        int anio, mes, dia;

        String nombre;
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.println("Fecha de Nacimiento: ");
        System.out.print("Año: ");
        anio=entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        System.out.print("Dia: ");
        dia = entrada.nextInt();
        fNacimiento = new Fecha(anio,mes,dia); 
        
        
        
        System.out.println("Fecha de Ingreso a la Empresa: ");
        System.out.print("Año: ");
        anio=entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        System.out.print("Dia: ");
        dia = entrada.nextInt();
        fIngreso = new Fecha(anio,mes,dia);
        empleado1 = new Empleado(nombre, fNacimiento, fIngreso);
        fecha1 = new Fecha(dia, mes, anio);
        
        //System.out.println(empleado1);
        
        empleado1.verDatos();
        fNacimiento.calcularEdad();
        empleado1.verDatos1();
        fIngreso.calcularfechaempresa();
        
        
}
}