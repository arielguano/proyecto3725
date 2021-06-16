
package pruebaunoguano;
import java.util.Scanner;
public class PruebaUnoGuano {

    
 public static void main(String[] args) {
        int n=4;
         Estudiante [] estudiante;
         estudiante=new Estudiante[n];
         System.out.println("Inserte los estudiantes: ");
         llenarestudiantes(n,estudiante);
         System.out.println("EL promedio total es: "+ calcularpromedio(n,estudiante));
         System.out.println("El porcentaje de hombres es :"+ calcularporcentaje(n,estudiante,"h"));
         System.out.println("El porcentaje de mujeres es :"+ calcularporcentaje(n,estudiante,"m"));
         System.out.println("El porcentaje de hombres sobre el promedio es :"+  estudiantesobrepromedio(n,estudiante,"h"));
         System.out.println("El porcentaje de mujeres sobre el promedio es:"+  estudiantesobrepromedio(n,estudiante,"m"));
    }
 
  static Scanner datos ;
  
 public static void llenarestudiantes(int n,Estudiante [] estudiante) {
   datos = new Scanner(System.in);
     for(int i=0;i<n;i++){
         System.out.println("Ingrese  la informacion del estudiante");
         String nombre=datos.nextLine();
         String genero=datos.nextLine();
         double nota=datos.nextDouble();
         estudiante[i]=new Estudiante(nombre,genero,nota);
     }
    } 
   public static void mostrarestudiantes(int n,Estudiante [] estudiante) {
   
     for(int i=0;i<n;i++){
         System.out.println(estudiante[i].toString());
       
     }
    }
   public static double calcularpromedio(int n,Estudiante [] estudiante){
       double suma=0;
       double promedio=0; 
       for(int i=0;i<n;i++){
        suma =suma+estudiante[i].getnota();
     }
      promedio=suma/n;
      return promedio; 
   }
   public static double calcularporcentaje(int n,Estudiante [] estudiante,String genero){
    double porcentaje=0;
    int cantidad=0;
   for(int i=0;i<n;i++){
    if(genero==estudiante[i].getgenero()){
        cantidad=cantidad+1;
    }
     }
    porcentaje=(cantidad*100)/n;
    return porcentaje;
   }
   public static double estudiantesobrepromedio(int n,Estudiante [] estudiante,String genero){
       double promedio=calcularpromedio(n ,estudiante);
       int cantidad=0;
       double porcentaje=0;
        for(int i=0;i<n;i++){
         if((estudiante[i].getnota() >= promedio) && (genero == estudiante[i].getgenero())){
         cantidad=cantidad+1;
    }
     }
    porcentaje=(cantidad*100)/n;
    return porcentaje;
   }
   
}
