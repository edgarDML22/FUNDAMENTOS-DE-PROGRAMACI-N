
package ejercicios_torneo;

import java.util.Random;
import java.util.Scanner;



public class ejercicio18_ROTAR_MATRIZ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int n = ran.nextInt(4) + 3;
        
        String matrix[][] = new String[3][3];
        
        llenar(matrix);
        System.out.println("LA MATRIX ORIGINAL ES LA SIGUIENTE: ");
        mostrar(matrix);
        
        String matrix_rotada[][] = rotar(matrix);
        System.out.println("LA MATRIZ ROTADA ES LA SIGUIENTE: ");
        mostrar(matrix_rotada);
        
        
    }
    
    public static void llenar(String matrix[][]){
        Random ran = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = "[" + ran.nextInt(31) + "]";
                
            }
            
        }
    }
    
    public static void mostrar(String matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]  + "\t");
                
            }
            System.out.println("");
            
        }   
    }
    
    public static String[][] rotar(String matrix[][]){
        String matrix_rotada[][] = new String[matrix.length][matrix[0].length]; 
        
        for (int j = 0 , n = 0; j < matrix[0].length; j++, n++) {
            for (int i = matrix[0].length - 1, m = 0; i >=0; i-- , m++) {
                
                matrix_rotada[n][m] =  matrix[i][j] + "" ;
            }
            
        }
                
                
            
        
        
    return matrix_rotada;    
    } 
    
}
