
package ejercicios_torneo;
import java.util.Scanner;

public class ejercicio8_TRIANGULO_PASCAL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el número de filas");
        int n = sc.nextInt();
        
        int matrix[][] = new int[n][2*n - 1];
        
        matrix[0][matrix[0].length / 2] = 1;
        
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {
                
                matrix[i][j] = matrix[i - 1][j + 1] + matrix[i - 1][j - 1];
                
            }
            
        }
        
        matrix[matrix.length - 1][0] = 1;
        matrix[matrix.length - 1][matrix[0].length - 1] = 1;
        

//IMPRIMIR      
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                
                
                if (matrix[i][j] != 0) {
                    System.out.print(matrix[i][j] + "\t");
                    
                }
                else{
                    System.out.print("\t");
                }
                
                
            }
            System.out.println("");
            
        }
        
        
        
        
    }
    
}
