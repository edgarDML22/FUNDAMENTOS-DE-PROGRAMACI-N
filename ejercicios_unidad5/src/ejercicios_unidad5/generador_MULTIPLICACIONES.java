
package ejercicios_unidad5;
import java.util.Random;

public class generador_MULTIPLICACIONES {
    
    public static void main(String[] args){
        String matrix[][] = new String[10][6];
        
        LLENAR(matrix);
        MOSTRAR_PREGUNTAS(matrix);
        MOSTRAR_RESPUESTAS(matrix);
        CUADRADOS_PERFECTOS(matrix);
        
        
        
        
        
    }
    
    
public static void LLENAR( String matrix[][]){
Random ran = new Random();

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            int n  = ran.nextInt(90) + 11;
            int m  = ran.nextInt(90) + 10;
            int r = n * m;
            
            matrix[i][j] = n + " * " + m + " = " + r; 
            
            
        }
        
    }
    
}

public static void MOSTRAR_PREGUNTAS( String matrix[][]){
String cad;

    
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            cad = matrix[i][j].replace(matrix[i][j].substring(matrix[i][j].indexOf("= ") + 1 , (matrix[i][j].length())), " ??");
            
            System.out.print(cad + "\t");
            
            
            
            
            
        }
        System.out.println("");
        
    }
    
    
    
}

public static void MOSTRAR_RESPUESTAS( String matrix[][]){
    
    System.out.println("-----------------------------------------------------------------------------------------------");
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
              
            System.out.print(matrix[i][j] + "\t");  
        }
        System.out.println("");
        
    }
    
    
    
}


public static void CUADRADOS_PERFECTOS(String matrix[][]){

    System.out.println("Los cuadrados perfectos son aquellos números que tienen una raíz cuadrada exacta");
    System.out.println("Por lo tanto son resultado de un número al cuadrado");
    System.out.println("Se encontraron los siguientes cuadrados perfectos en las tablas de multiplicar generadas");
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            //String cad1 = matrix[i][j].substring(0 , matrix[i][j].indexOf("*"));
            //String cad2 = matrix[i][j].substring(matrix[i][j].indexOf("*") + 1 , matrix[i][j].indexOf("="));
            //cad1 = cad1.trim();
            //cad2 = cad2.trim();
            
            if (matrix[i][j].substring(0 , matrix[i][j].indexOf("*")).trim().equals(matrix[i][j].substring(matrix[i][j].indexOf("*") + 1 , matrix[i][j].indexOf("=")).trim())) {
                System.out.println(matrix[i][j]);
            }
            //System.out.println(cad1 + " + " + cad2);
            //System.out.println("HOLA MUNDO");
            //System.out.print("  Y " + cad2);
            //System.out.println("HOLA MUNDO");
            
                //if(cad1.equals(cad2)){
                    //System.out.println(matrix[i][j]);    
                //}
        }    
    }
    
    
}
    
}
