
package ejercicios_unidad5;
import java.util.Scanner;


public class serie_Conway {
    //CHACÓN ARELLANO GABRIEL
    //MARTÍNEZ LÓPEZ EDGAR DANIEL
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el número de filas que desea ver");
        int n = sc.nextInt();
        Conway conway = new Conway(n);
        
        conway.generar_serie();
        conway.mostrar_serie(n);
    }
    
}

class Conway{
    int matrix[][];

    public Conway(int n){ //Método constructor
        System.out.println("N: "+n);
        matrix = new int[100][100];
        
    }
    
    public void generar_serie(){
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
                            if(k < matrix[i].length){
                                matrix[i][k] = contador;
                                matrix[i][k + 1] = valor;    
                            }
                            contador = 1;                            
                            k += 2;    
                        }   
            }   
        }
        
    }
    
    public void mostrar_serie(int n){
        System.out.println("LA SERIE GENERADA FUE LA SIGUIENTE: ");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] != 0){
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
