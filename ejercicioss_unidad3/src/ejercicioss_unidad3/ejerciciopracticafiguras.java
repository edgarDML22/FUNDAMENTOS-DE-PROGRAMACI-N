
package ejercicioss_unidad3;
import java.util.Scanner;
//CUADRADO SIN RELLENO DE N LADOS
public class ejerciciopracticafiguras {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese valor");
    int n = sc.nextInt(); //n es el número filas y columnas del cuadrado nxn
    //k es para imprimir asteriscos
    //i es para imprimir espacios
    //r es el contador de renglones
    for(int r = 1; r<=n ;r++){
        System.out.print("* ");
        }//primera fila
        System.out.println("");
        
        //medio
        for(int r = 1 ; r<=n-2; r++){
            System.out.print("* ");
            for(int i = 1; i <= n-2; i++){
                System.out.print("  ");
            }
            System.out.println("* "); 
        }
    
    for(int r = 1; r<=n ;r++){
        System.out.print("* ");
        }//última fila    
    

    System.out.println("");
    }
}
