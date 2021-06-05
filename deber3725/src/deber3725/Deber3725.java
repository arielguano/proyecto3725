/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber3725;
import clases.*;
/**
 *
 * @author ARIEL PC
 */
public class Deber3725 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar obj de tipo cubo Cubo;clase y cubo es el objeto
        Cubo cuboVacio=new Cubo();
        //es como un print f para mostrar en la pantalla
        System.out.println("El volumen del cubo vacio es ; "+cuboVacio.getVolumen());
        //contructor con parametros
        Cubo cubo=new Cubo(2,3,6);
        //es como un print f para mostrar en la pantalla
        System.out.println("El volumen del cubo vacio es ; "+cubo.getVolumen());
        //vamos hacer la prueba del los cuadrilateros
        Cuadrilatero cuadrado=new Cuadrilatero(5);
        System.out.println("El area del Cuadrado es: "+cuadrado.getArea()+ " El perimetro es: "+cuadrado.getPerimetro());
        Cuadrilatero rectangulo=new Cuadrilatero(5,8);
        System.out.println("El area del Rectangulo es: "+rectangulo.getArea()+ " El perimetro es: "+rectangulo.getPerimetro());
        
    }
    
}
