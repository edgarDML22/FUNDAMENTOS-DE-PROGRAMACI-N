
package ejercicios_unidad5;
import java.util.Scanner;
import java.util.Random;

public class POO_ejercicio4 {
    //FERNÁNDEZ GARIBAY ALFONSO MARÓN
    //CHACÓN ARELLANO GABRIEL
    //MARTÍNEZ LÓPEZ EDGAR DANIEL
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = sc.nextInt();
        
        Matrix m1 = new Matrix(filas, columnas);
        
        System.out.println("MÉTODO: Mostrar");
        m1.Mostrar();
        
        System.out.println("MÉTODO: " + "Obtener_min_max_fila");
        System.out.println(m1.Obtener_min_max_fila(ran.nextInt(filas)));
        
        System.out.println("MÉTODO: " + "Obtener_min_max_columna");
        System.out.println(m1.Obtener_min_max_columna(ran.nextInt(columnas)));
        
        
       
    }
    
}

class Matrix{
    int matrix[][];
    Random ran = new Random();
        
    public Matrix(int f, int c){ //Método constructor
        matrix = new int[f][c];  
        Incializar();
        
        
        
        
    }
    
    public void Incializar(){
        
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {

                    matrix[i][j] = ran.nextInt(91) + 10;                
                }
            }
    }
    
    public String Obtener_min_max_fila(int f){
        System.out.println("Se toma el valor mínimo y máximo del renglon: " +f);
        int min = matrix[f][0];
        int max = matrix[f][0];
        
        for (int k = 0; k < matrix[f].length - 1; k++) {
            if (min > matrix[f][k + 1]) {
                min = matrix[f][k + 1];                
            }
            
            if (max < matrix[f][k + 1]) {
                max = matrix[f][k + 1];                
            }
                                                
        }
                
        String cad = min + "-" + max;
        
    return cad; 
    }
    
    public String Obtener_min_max_columna(int c){
        System.out.println("Se toma el valor mínimo y máximo de la columna: " +c);
        int min = matrix[0][c];
        int max = matrix[0][c];
        
        for (int k = 0; k < matrix.length - 1; k++) {
            if(min > matrix[k + 1][c]){
                min = matrix[k + 1][c];
            }
            
            if(max < matrix[k + 1][c]){
                max = matrix[k + 1][c];
            }
        }        
        
        String cad = min + "-" + max;
        
    return cad;                                        
    }
    
    public void Mostrar(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                
                System.out.print(matrix[i][j] + "\t");                
            }
            System.out.println("");
            
        }
        
    }
                                           
    
}
