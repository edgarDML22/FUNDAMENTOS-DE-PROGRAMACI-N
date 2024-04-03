
package ejercicios_unidad5;
import java.util.Scanner;

public class triangulo_Pascal {
    
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el número de filas");
    int n = sc.nextInt();
    
    int matrix[][] = new int[n][n + (n - 1)];//CREACION DE LA MATRIZ
    LLENAR(matrix);
    MOSTRAR(matrix);
    
    
}

public static void LLENAR(int matrix[][]){
  
    matrix[0][ matrix[0].length / 2] = 1;//EL PRIMER UNO
    
    for (int i = 1; i < matrix.length; i++) {
        for (int j = 1; j < matrix[i].length - 1; j++) {
            
            matrix[i][j] = matrix[i - 1][j + 1] + matrix[i - 1][j - 1];  
            
        }
        
    }
    matrix[matrix.length - 1][0] = 1;//LOS UNOS DE HASTA ABAJO DEL TRIÁNGULO
    matrix[matrix.length - 1][matrix[0].length - 1] = 1;
    
}

public static void MOSTRAR(int matrix[][]){
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            
            if(matrix[i][j] == 0){
                System.out.print( "\t");
                
            }
            else{
                System.out.print(matrix[i][j] + "\t");
            }
            
        }
        System.out.println("");
        
    }
    
    
    
    
}

    
    
}
