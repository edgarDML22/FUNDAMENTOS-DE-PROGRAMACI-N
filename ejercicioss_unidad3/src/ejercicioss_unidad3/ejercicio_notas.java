
package ejercicioss_unidad3;
import java.util.Scanner;

public class ejercicio_notas {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num, N,ultnum, inv=0; 
 num = sc.nextInt();
    System.out.println("Ingrese el número de dígitos del número");
    N = sc.nextInt();
 for(int i=0; i<N; i++, num/=10){
    ultnum = num % 10;
        inv = inv*10 + ultnum; //PARTE QUE VA GUARDANDO EL NÚMERO INVERTIDO
 }
    System.out.println("El número invertido es: " +inv);
    }
}
