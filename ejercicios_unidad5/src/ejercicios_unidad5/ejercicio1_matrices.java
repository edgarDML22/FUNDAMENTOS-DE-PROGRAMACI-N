
package ejercicios_unidad5;
import java.util.Random;



public class ejercicio1_matrices {
    
    public static void main(String[] args){
        Random ran = new Random();
        
        int matrix[][] = new int[ran.nextInt(8) + 2][ran.nextInt(5) + 2];
        
        llenar(matrix);
        mostrar(matrix);
        
        
    }
    
    public static void llenar(int matrix[][]){
        Random ran = new Random();
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length;) {
                int num = ran.nextInt(100);
                
                
                if(i % 2 == 0){//par
                    if(num % 2 == 0){
                        matrix[i][j] = num;
                        j++;                        
                    }                                                            
                }
                else{//impar
                    if(num % 2 == 1){
                        matrix[i][j] = num;
                        j++;                        
                    }
                    
                    
                }
                
            }
            
        }
        
        
    }
    
    public static void mostrar(int matrix[][]){
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
                
            }
            System.out.println("");
            
        }
        
        
    }
    
}
