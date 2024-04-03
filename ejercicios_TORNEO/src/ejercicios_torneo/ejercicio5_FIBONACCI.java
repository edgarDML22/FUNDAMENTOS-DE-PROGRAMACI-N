
package ejercicios_torneo;

import java.util.Scanner;


public class ejercicio5_FIBONACCI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 0;
        do {
            System.out.println("Ingrese valor");
            N = sc.nextInt();
            
        } while (N <= 0);
        
        
        int a = 0;
        int b = 1;
        for (int i = 1; i <= N; i++) {
            int c = 0;
            switch (i) {
                case 1:
                    System.out.print("1, ");
                    break;
                case 2:
                    System.out.print("1, ");
                    break;
                default:
                    c = a + b;
                    a = b;
                    b = c;
                    if (i != N) {
                    System.out.print(c + ", ");    
                    }
                    else{
                        System.out.print(c);    
                    }
                    
                    
                    break;
            }
            
            
            
            
        }
        System.out.println("");
    }
    
}
