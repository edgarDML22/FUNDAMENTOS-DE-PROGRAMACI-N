
package ejercicios_unidad5;
import java.util.Scanner;

public class practica_Niv3 {
    public static void main(String[] args){
        String matrix[][] = new String[3][3];
        
        llenar(matrix);
        mostrar(matrix);
        
        System.out.println("La palabra de mayor longtitud fue: ");
        mayor(matrix);
        System.out.println("La palabra de menor longitud fue: ");
        menor(matrix);
        System.out.println("Las palabras palíndromas encontradas fueron las siguientes: ");
        palindromas(matrix);
        
        
    }
    
    
    public static void llenar(String matrix[][]){
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Ingrese cadena");
                matrix[i][j] = sc.nextLine();
            }
        }
        
    }
    
    public static void mostrar(String matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print( "[" + matrix[i][j] + "]" + "\t");
            }
            System.out.println("");
        }
        
    }
    
    
    
    public static void mayor(String matrix[][]){
        int n = 0 , m = 0;
        String mayor = matrix[0][0];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(mayor.length() < matrix[i][j].length()){
                    mayor = matrix[i][j];
                    n = i;
                    m = j;
                    
                }
                
            }
            
        }
        
        System.out.println("Longitud: " + mayor.length());
        System.out.println("'" + mayor + "'" +" en la coordenada: (" + n + ", " + m + ")");
           
    }
    
    public static void menor(String matrix[][]){
        int n = 0 , m = 0;
        String menor = matrix[0][0];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(menor.length() > matrix[i][j].length()){
                    menor = matrix[i][j];
                    n = i;
                    m = j;
                    
                }
                
            }
            
        }
        System.out.println("Longitud: " + menor.length());
        System.out.println("'" + menor + "'" + " en la coordenada: (" + n + ", " + m + ")");
           
    }
        
        
        
        
    
    
    public static void palindromas(String matrix[][]){
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(verificar(matrix[i][j])){
                    System.out.println("'" + matrix[i][j] + "'" + " en la coordenada: ("  + i + ", " + j + ")");
                    
                }
                
            }
            
        }
        
        
        
        
        
        
        
        
    }
    
    public static boolean verificar(String cad){
        boolean flag = false;
        String inv = "";
        
        for (int i = cad.length() - 1; i >= 0; i--) {
            inv += String.valueOf(cad.charAt(i));            
        }
        
        if(cad.equalsIgnoreCase(inv)){
            flag = true;
        }
    return flag;    
    }
    
}
    
    
    
    
    
    
