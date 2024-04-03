
package ejercicios_unidad5;
import java.util.Random;

public class ejercicio_valor_MINIMO {
    public static void main(String[] args){
        Random ran = new Random();
        int matrix[][] = new int[4][8];
        System.out.println(matrix.length);
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ran.nextInt(91) + 10;
                
            }
            
        }
        int f = 3;
        int c = 3;
        
        //int menor = matrix[f][0];
//        for (int k = 0; k < matrix[f].length - 1; k++) {
//            if(menor > matrix[f][k + 1]){
//                menor = matrix[f][k + 1];
//            } 
//            
//        }
//        System.out.println("EL MENOR FUE: " + menor);

        int menor = matrix[0][c];
        
        for (int k = 0; k < matrix.length - 1; k++) {
            //if(menor <)
            
        }


        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
                
            }
            System.out.println("");
        }
        
        
    }
    
}
