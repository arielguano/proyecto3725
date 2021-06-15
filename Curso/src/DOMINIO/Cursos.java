
package DOMINIO;

public class Cursos {
  //los 3 Parametros
  private double [] notas; 
  private double promedio;
  private int estudiantesEncimaPromedio;
  //vamos a crear el constructor
  //El constructor va ser un constructor vacio public
  public Cursos (){
      notas =new double[12];
}
public void setNotas(double notas[]){
    this.notas=notas;
} 
//para que me muestre las notas
public void mostrarNotas(){
    for(int i = 0;i<12;i++){
        System.out.println("Estudiante "+(i+1)+"    "+String.format("%.2f",this.notas[i] ));
    }
}
public void setPromedio(){
  //variable cantidad esta por demas
    double promedio=0;
    int cantidad=0;
    double suma=0;
    for (int i=0;i<notas.length;i++){
        suma=suma+notas[i];
        cantidad++;
    }
    promedio=suma/cantidad;
    this.promedio=promedio;
}
public void setEstudiantesEncimaPromedio(){
  
   int estudiantes=0;
     for(int i = 0;i<12;i++){
       if(this.promedio<=notas[i]){
           estudiantes++;
       }  
     }
       
    this.estudiantesEncimaPromedio=estudiantes;
}
public  double getPromedio(){
    return this.promedio;
}
public int getnroEstudiantesEncimaPromedio(){
    
return this.estudiantesEncimaPromedio;
}
public void cambiarnota(int i,double notaactual){
this.notas[i]=notaactual;
}
}
