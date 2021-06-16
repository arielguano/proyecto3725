
package pruebaunoguano;


public class Estudiante {
   private String nombre; 
   private String genero;
   private double nota;
   public Estudiante(String nombre,String genero,double nota){
       this.nombre=nombre;
       this.genero=genero;
       this.nota=nota;
   }
   public double getnota()
   {return this.nota;}
   @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", genero=" + genero + ", nota=" + nota + '}';
    }
    public String getgenero(){
         {return this.genero;}
    }
            
}
