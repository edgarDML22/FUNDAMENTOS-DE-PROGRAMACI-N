
package ejercicios_unidad5;
import java.util.Scanner;


public class ejercicio_serie_CONWAY {
    //PRIMERO HAZ LA LÓGICA, LUEGO HAZLO CON MÉTODOS 
    public static void main(String[] args){
    
        
        int matrix[][] = new int[100][100];
        
        matrix[0][0] = 1;
        
        
        
        for (int i = 1; i < matrix.length; i++) {
            int contador = 1;
            int k = 0;            
            for (int j = 0; j < matrix[i].length - 1 && matrix[i - 1][j] != 0; j++) {               
                int valor = matrix[i - 1][j];
                        if (valor == matrix[i - 1][j + 1]) {
                            contador++;    
                        }
                        else{
                            if(k < matrix.length){
                                matrix[i][k] = contador;
                                matrix[i][k + 1] = valor;    
                            }
                            contador = 1;                            
                            k += 2;
                            
                        }
                        
                    
                    
                
                
            }
            
            
        }
        
        
        
        
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[i].length; j++) {
                
                if (matrix[i][j] != 0) {
                    System.out.print(matrix[i][j] + " ");
                    
                }
                else{
                    System.out.print(" ");
                }
                    
                
                
            }
            System.out.println("");
            
        }
    
}
    
}
