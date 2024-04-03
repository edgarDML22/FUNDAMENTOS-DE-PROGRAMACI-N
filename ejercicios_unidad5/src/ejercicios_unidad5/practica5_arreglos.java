
package ejercicios_unidad5;
import java.util.Scanner;

public class practica5_arreglos {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = 12;
    
    //DECALARACIÓN DE ARREGLOS
    int arregloA[] = new int[n]; 
    int arregloB[] = new int[n];
    int arregloC[] = new int[n*2];

    System.out.println("LLENADO DEL ARREGLO A");
    for (int i = 0; i < arregloA.length; i++) {
        System.out.print((i+1)+". Ingrese valor: ");
        arregloA[i] = sc.nextInt();
    }//LLENADO DEL ARREGLO A
    
    System.out.println("LLENADO DEL ARREGLO B");
    for (int i = 0; i < arregloB.length; i++) {
        System.out.print((i+1)+". Ingrese valor: ");
        arregloB[i] = sc.nextInt();
    }//LLENADO DEL ARREGLO B
    
   int i = 0, m = 0; 
    for (int j = 0; j < arregloC.length;) {
        
        for (int k = 0; k < 3; k++) {
            
            arregloC[j] = arregloA[i];
            i++;
            j++;    
        }
        for (int k = 0; k < 3; k++) {
            arregloC[j] = arregloB[m];
            m++;
            j++;
        }
    }
    
    for(int elemento: arregloC){
        System.out.print(elemento);
        if (elemento != arregloC[arregloC.length - 1]) {
        System.out.print("/");
    }
    System.out.println();
    }
    
    }
    
    
}
