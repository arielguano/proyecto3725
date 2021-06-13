
package curso;
import DOMINIO.Cursos;
import java.util.Scanner;

public class Curso {

    public static void llenaNotas(double[]notas){
     //proceso de llenado de notas
     for(int i=0;i<12;i++){
        notas[i]=Math.random()*5;
    }   
 }
    public static void calcularpromedio(Cursos curso){
     curso.setPromedio();
     System.out.println("Promedio del curso = "+curso.getPromedio());
    
    }
    public static void cambiarnotas(Cursos curso,int numeroestudiante,double notaactual){
         for(int i=0;i<12;i++){
        if((numeroestudiante-1)==i){curso.cambiarnota(i, notaactual);}
         }
         
    }
    
    public static void estudiantesencimapromedio(Cursos curso){
         curso.setEstudiantesEncimaPromedio();
     System.out.println("Nro de estudiantes Encima del promedio ="+curso.getnroEstudiantesEncimaPromedio());
    
    }
    public static void main(String[] args) {
       Cursos cursoA=new Cursos();
       double [] notas =new double [12];
       Scanner sc=new Scanner(System.in);
        llenaNotas(notas);
        cursoA.setNotas(notas);
        for(;;){
            System.out.println(" \n\n");
            System.out.println("--ADMINISTRADOR DE ESTUDIANTES--");
        cursoA.mostrarNotas();
            System.out.println("---------------------------------------------");
        System.out.println("1.Cambiar notas de estudiantes");
        System.out.println("2.Calcular el promeio");
        System.out.println("3.Mostrar numero de estudiantes sobre el promedio");
        System.out.println("4.Salir");
        System.out.println("---------------------------------------------");
        System.out.println("Ingrese la opcion:  ");
        //permite ller la entrada desde el teclado
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:System.out.println("Ingrese el numero del estudiante que desee cambiar");
            int numeroestudiante=sc.nextInt();
                System.out.println("Ingrese la nueva nota : ");
                double notaactual=sc.nextDouble();
                cambiarnotas(cursoA,numeroestudiante,notaactual);
            break;
            case 2:calcularpromedio(cursoA);
            break;
            case 3:estudiantesencimapromedio(cursoA);
            break;
            case 4:System.exit(0);
            default:System.out.println("Ingrese la opcion correcta");
            break;
        }
            
        }
        
    }
    
}
