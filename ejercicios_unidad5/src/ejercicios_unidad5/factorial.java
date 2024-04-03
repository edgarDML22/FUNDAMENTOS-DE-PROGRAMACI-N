
package ejercicios_unidad5;
import java.util.Scanner;


public class factorial {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese valor");
    int valor = sc.nextInt();
    while(valor < 0){
    valor = sc.nextInt();
    }   
    
    String cad = "";
    int r = 1;
    for (int i = 1; i <= valor; i++) {
        r *= i;
        if (i != valor ) {
         cad += i + " * ";   
        }
        else{
         cad += i;   
        }
        
    }
    System.out.println("El factorial de un número es el producto de todos los números naturales que le anteceden");
    System.out.println(cad);
    System.out.println("El factorial de " + valor + " es: " + r);
    
}    
    
    
}
