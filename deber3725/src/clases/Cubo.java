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
public class Cubo {
    //atributos 
    private int ancho;
    private int alto ;
    private int profundidad;
   
    //constructores y metosods
    public Cubo(){
        //: ancho=3, alto= 2, profundo = 6 y
     this.ancho=1;
     this.alto=1;
     this.profundidad=1;
    }
    public Cubo(int altura,int anchura, int profundo){
        this.ancho =anchura;
        this.alto=altura;
        this.profundidad=profundo;
    } 
    //nombre de la funcion get=obetener tipo de funcion
    //asignacion set(asignar)
    public int getVolumen(){
        //operacion
        return(this.ancho*this.alto)*this.profundidad;
    }
}
