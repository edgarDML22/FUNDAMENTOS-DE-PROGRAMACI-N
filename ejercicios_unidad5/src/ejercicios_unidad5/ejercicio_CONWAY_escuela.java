
package ejercicios_unidad5;

import java.util.Scanner;


public class ejercicio_CONWAY_escuela {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[6][6];
        
        matrix[0][0] = 1;        
        int k = 0;
        
        
        for (int i = 1; i < matrix.length; i++) {
            int contador = 1;
            boolean flag = true;
            for (int j = 0; j < matrix[i].length - 1 && flag; j++) {
                
                if (matrix[i - 1][j] != 0) {
                    
                    int valor = matrix[i - 1][j];
                    System.out.println("VALOR ENCONTRADO: "+valor);
                    flag = true;
                    
                    for (int m = j + 1; flag ; m++) {
                        if (valor == matrix[i - 1][m]) {
                            contador++;
                            
                        }
                        else{
                            matrix[i][k] = contador;
                            System.out.println("CONTADOR AGREGADO: "+contador);
                            matrix[i][k+1] = valor;
                            contador = 1;
                            k += 2;
                            
                        }
                        if (!(k < matrix.length - 1)) {
                            flag = false;
                            
                        }
                        
                        
                    }
                    
                    
                    
                }
                
            }
            
                
        }
        
        
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0){
                    System.out.print(" ");
                    
                }
                else{
                    System.out.print(matrix[i][j] + " ");
                }
                
            }
            System.out.println("");
            
        }
        
        
    }
            
            
            
        }
        
        
        
        

    

