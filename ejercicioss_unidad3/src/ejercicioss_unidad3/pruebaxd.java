
package ejercicioss_unidad3;
import java.util.Scanner;

public class pruebaxd {
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int V, i=0, n;
        System.out.println("Ingrese valor");
        V = sc.nextInt();
        
            while (V<=0){
            V = sc.nextInt();
            }
                System.out.println("La serie resultante es la siguiente");
                
                if (V == 1){System.out.println(V);
                }
                
                else{
                System.out.print(V); //SE IMPRIME EL PRIMER DÍGITO
                    
                    for (n = V % 2; V != 1; n = V % 2){
                    if (n == 0){
                        V = V / 2; //SI ES PAR
                            System.out.print(", "+V);
                    }
            
                    else {
                        V = (3*V) + 1; //SI ES IMPAR
                            System.out.print(", "+V);
                            }
                    }
        
                }
                System.out.println("");
    }
}
