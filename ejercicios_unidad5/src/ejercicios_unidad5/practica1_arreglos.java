//IMPRESION DE NÚMEROS DE MANERA INVERTIDA
package ejercicios_unidad5;
import java.util.Scanner;

public class practica1_arreglos {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);    
    
    System.out.println("Ingrese el número de dígitos que va a ingresar");
    int n = sc.nextInt();
    int array[] = new int[n]; 
    
    for (int i = 0; i < array.length; i++) {
        System.out.print((i+1)+". Ingrese valor: ");
        array[i] = sc.nextInt();
    }
    
    for(int i = array.length - 1; i >= 0; i--){
        System.out.print(array[i]);    
    }
    
}    
}
