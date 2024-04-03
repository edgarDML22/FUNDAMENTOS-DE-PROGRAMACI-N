
package ejercicios_torneo;

import java.util.Scanner;


public class ejercicio4_FACTORIAL {
public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = 0;
    
    do {
        System.out.println("Ingrese valor");
        n = sc.nextInt();
        
    } while (n < 0);
    int r = 1;
    for (int i = 1 ; i <= n; i++) {
        r *= i;
        
        
    }
    System.out.println("El factorial de " + n + " es: " + r);
    
    
}    
}
