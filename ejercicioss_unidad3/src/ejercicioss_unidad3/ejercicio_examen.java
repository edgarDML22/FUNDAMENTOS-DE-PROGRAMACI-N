
package ejercicioss_unidad3;
import java.util.Scanner;

public class ejercicio_examen {
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int V, i, suma, r;
    System.out.println("Ingrese valor");
    V = sc.nextInt();
    
    for(;V > 0;){
    int ncifras = (int)(Math.log10(V)+1);
    suma = 0;
    for(i = 0; i < ncifras; i++, V /= 10){//impresiones de sumas
        
    int ultcifra = V % 10;
    r = (ultcifra)*(int)(Math.pow(2, i)); //r es una suma parcial
    suma = suma + r;
    
    }
    System.out.println("La conversión a decimal es: "+suma);
    System.out.println("Ingrese valor");
    V = sc.nextInt();
    }














    }  
}
