
package ejercicios_unidad5;
import java.util.Scanner;
public class ejercicio_cuadro_mágico {
@SuppressWarnings("empty-statement")
public static void main(String[]args){
Scanner sc = new Scanner(System.in);    
    System.out.println("Ingrese valor");
    int n = sc.nextInt();
    if(n % 2 == 0 || n<3){
        System.out.println("Número no válido");
    }
    else{
    int array[][] = new int [n][n];
    
    int i = 1, f = 0, c = array.length / 2;
    
    
    do {
    if (array[f][c] != 0) {
        f++;
        c--;
        if (f < 0)
            f = n - 1;
        if (c < 0)
            c = n - 1;
    }
    array[f][c] = i;
    f--;
    c++;
    if (f < 0)
        f = n - 1;
    if (c == n)
        c = 0;
    i++;
} while (i <= n * n);

    
    for (i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[i][j]);
            
        }
        System.out.println("");
    }
    }
}
}
    

