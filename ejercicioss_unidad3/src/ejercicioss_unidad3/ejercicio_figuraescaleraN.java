
package ejercicioss_unidad3;
import java.util.Scanner;

public class ejercicio_figuraescaleraN {
public static void main(String [] args){
//k es para imprimir asteriscos
//r es el contador de renglones
//i es para imprimir espacios
int  maxC=1;
Scanner sc = new Scanner(System.in);
System.out.println("Ingrese valor");
int n = sc.nextInt();

    for( int r = 1 ; r <= n; r++ ){
                
        for(int k = 1; k <= maxC; k++){
        System.out.print("*");
        }
        if(maxC != n){
        maxC++;
        }
        
        
    
        System.out.print("\n");
    }
}    
}
