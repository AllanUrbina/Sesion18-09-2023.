public class App {
    public static void main(String[] args) throws Exception {
       
        //Declaracion de arreglos 
        
        // primera forma dde dclarar un arreglo
        int arreglo1[] = new int [5];// 0,1,2,3,4
        
        //Segunda forma de declarar un Arreglo
        // Esta es la mejor forma de declarar um arreglo
        int []arreglo2 = new int [10]; // 0,1,2,3,4,5,6,7,8,9 
        //todos los elementos del arreglo son 0
       
        //inicializar un arreglo y a su vez declarar
        int arreglo3[]= {1,2,3,4,5,6,7}; // 0,1,2,3,4,5,6                

        int [] arreglo4 = new int [] {10,20,30,40,50}; // 0,1,2,3,4

        // Acceder e imprimir
        System.out.println(arreglo1[2]); //0 esto es lo que imprime
        System.out.println(arreglo2[7]); //0 esto es lo que imprime
        System.out.println(arreglo3[5]); //6 esto es lo que imprime
        System.out.println(arreglo4[4]); //50 esto es lo que imprime

         //Asignar valores a los Arreglos

         arreglo1[0] = 18;
         arreglo1[1] = 9;
         arreglo1[2] = 5;
         arreglo1[3] = 20;
          
          System.out.println("Arreglo[0]="+arreglo1[0]);
          System.out.println("Arreglo[1]="+arreglo1[1]);
          System.out.println("Arreglo[2]="+arreglo1[2]);
          System.out.println("Arreglo[3]="+arreglo1[3]);
          System.out.println("Arreglo[4]="+arreglo1[4]);

         System.out.println(arreglo1[0]);



    }
}
