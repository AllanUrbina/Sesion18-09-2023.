import java.util.Scanner;
public class Arreglos {
    public static void main(String []args){
     Scanner lector=new Scanner(System.in);
     
     System.out.println("Ingrese Cantidad de nota ");
     int CantidadNota=lector.nextInt();
    
     
     
     while(CantidadNota <=0){
        System.out.println("No puede ingresar valores menores o iguales a 0");
        System.out.println("Cantidad de Nota");
        CantidadNota=lector.nextInt();
     }
     
      int [] notas = new int [CantidadNota];
      String[] NombreEstudiante = new String [CantidadNota];
       int sumaNotas=0;
      System.out.println("Ingrese nombre y nota de cada estudiantes");
       
       for(int i=0; i<notas.length; i++) {
        System.out.print("Estudiante["+(i+1)+"]=");
        NombreEstudiante[i]=lector.next();
        System.out.print("NOta["+(i+1)+"]=");
        notas[i]=lector.nextInt();
       sumaNotas += notas [i];
      
     }
     for  (int i =0; i <NombreEstudiante.length;i++){
        System.out.println(NombreEstudiante[i]+""+notas[i]);
        

     }
     //double promedio =0.0;
     System.out.println(" El promedio de notas " +(double)sumaNotas/CantidadNota);
      
     
   
   
   
   
   
   
    lector.close();
    }
}
