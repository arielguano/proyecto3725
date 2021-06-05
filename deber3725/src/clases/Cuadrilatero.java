/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author ARIEL PC
 */
public class Cuadrilatero {
 private int lado1;
 private int lado2;
 //constructor del Cuadrado
 public Cuadrilatero(int lado ){
     this.lado1=lado;
     this.lado2=lado;
 }
 //Constructor del Rectangulo
 public Cuadrilatero(int base,int altura ){
     this.lado1=base;
     this.lado2=altura;
 }
 //funcion del area
 public int getArea(){
     return lado1*lado2;
     }
 //vamos hacer la funcion para el perimetro
 public int getPerimetro(){
     return(lado1*2+lado2*2);
 }
}
 