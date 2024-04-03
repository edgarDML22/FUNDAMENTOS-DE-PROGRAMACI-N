
package ejercicios_unidad5;

import java.util.Random;


public class ejercicio10_matrices {
    int x = 0;
    public static void main(String[] args){
        Random ran = new Random();
        int m = ran.nextInt(10) + 3;
        
        int matrix[][] = new int[m][ran.nextInt(10) + 3];
        int arreglo[] = new int[m];
        
        Binario binario = new Binario(matrix , arreglo);
        binario.llenar();
        binario.calcular();
        binario.mostrar();
        
        
        
        
        
    }
    
}

class Binario{
    int matrix[][];
    int arreglo[];
    
   public Binario(int matriz[][] , int array[]){
       matrix = matriz;
       arreglo = array;
       
       
       
   }
   
   public void llenar(){
       Random ran = new Random();
       
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               matrix[i][j] = ran.nextInt(2);
               
               
           }
       }
       
       
   }
   
   public void calcular(){
       
       for (int i = 0; i < matrix.length; i++) {
           int suma = 0;
           
           for (int j = matrix[i].length - 1 , p = 0; j >= 0 ; j-- ,p++) {
               suma += (matrix[i][j])*(Math.pow(2, p));
               
               
               
           }
           arreglo[i] = suma;
       }
       
       
   }
   
   public void mostrar(){
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               System.out.print(matrix[i][j] + "\t");
           }
           System.out.print(arreglo[i]);
           System.out.println("");
           
       }
       
       
   }
    
    
}
