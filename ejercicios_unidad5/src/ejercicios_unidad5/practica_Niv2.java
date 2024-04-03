
package ejercicios_unidad5;
import java.util.Scanner;


public class practica_Niv2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String matrix[][] = new String[3][3];
        
        llenar_matrix(matrix);
        mostrar_matriz_original(matrix);
        String arreglo[][] = palindromas(matrix);
        mostrar_palindromas(arreglo);
        
        
        
        
        
    }
    
    
    public static void llenar_matrix(String matrix[][]){
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Ingrese cadena");
                matrix[i][j] = sc.nextLine();
                
            }            
            
        }
        
        
    }
    
    public static String[][] palindromas(String matrix[][]){
        String arreglo[][] = new String[2][9];
        int n = 0 , m = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                
                matrix[i][j] = quitar_Espacios(matrix[i][j]);
                
                
                if(verificar(matrix[i][j])){                    
                   arreglo[0][n] = matrix[i][j];
                   n++;
                }
                else{
                    arreglo[1][m] = matrix[i][j];
                    m++;
                }
                
                
            }
            
        }
        
        
    return arreglo;    
    }
    
    public static String quitar_Espacios(String cad){
        String retorno = "";
        
        
        for (int i = 0; i < cad.length(); i++) {
            if(cad.charAt(i)!= ' '){
                retorno += String.valueOf(cad.charAt(i));
            }
            
        }
        
    return retorno;    
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
    
    
    
    
    public static void mostrar_palindromas(String arreglo[][]){
        for (int i = 0; i < 2; i++) {
            if(i == 0){
                System.out.println("Las palabras palíndromas encontradas fueron las siguientes: \n");
                for (int j = 0; j < arreglo[i].length; j++) {
                    if(arreglo[i][j] != null){
                        System.out.print(arreglo[i][j] + "\t");

                    }
                }
                
                
            }
            else{
                System.out.println("Las palabras NO palíndromas encontradas fueron las siguientes: \n");
                for (int j = 0; j < arreglo[i].length; j++) {
                    if(arreglo[i][j] != null){
                        System.out.print(arreglo[i][j] + "\t");

                    }
                }
                
            }
            
            
            System.out.println("");      
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void mostrar_matriz_original(String matrix[][]){
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] +"]" + "\t");
            }
            System.out.println("");
        }
    }
    
    
    
    
}
