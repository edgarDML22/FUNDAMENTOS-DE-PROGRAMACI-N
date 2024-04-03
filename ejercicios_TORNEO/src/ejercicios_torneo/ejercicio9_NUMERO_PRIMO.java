
package ejercicios_torneo;

import java.util.Scanner;

public class ejercicio9_NUMERO_PRIMO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese número");
        int v = sc.nextInt();
        
        
        boolean flag = false;
        for (int k = v - 1; k > 1; k--) {
            if (v % k == 0) {
                flag = true;
                break;                              
            }
            
            
        }
        
        if (flag) {
            System.out.println("El número NO es primo");
            
        }
        else{
            System.out.println("El número SI es primo");
        }
        
        
        
        
    }
    
}
