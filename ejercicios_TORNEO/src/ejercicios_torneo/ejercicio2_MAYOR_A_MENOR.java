
package ejercicios_torneo;
import java.util.Scanner;


public class ejercicio2_MAYOR_A_MENOR {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    
    int n;
        do {
            System.out.println("Ingrese valor");
            n = sc.nextInt();
        } while (n < 0);
        int arreglo[] = new int[n];
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese número");
            arreglo[i] = sc.nextInt();
            
        }
        
        for (int i = 0; i < arreglo.length; i++) {//DE MAYOR A MENOR
            for (int j = 0; j < arreglo.length - 1; j++) {
             
                int num = arreglo[j];
                if (num < arreglo[j + 1]) {
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = num;
                    
                }
                
            }
            
            
        }
        System.out.println("NÚMEROS ORDENADOS DE MAYOR A MENOR");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "\t");
            
            
        }
        
    
        
        
    }
    
}
