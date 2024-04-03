
package ejercicios_unidad5;

import java.util.Random;
import java.util.Scanner;

public class pruebas {
public static void main(String[] args){
    EJERCICIO_7();
    int num = 5;
    int r = num / 2;
    System.out.println("r = " + r);
}


public static void EJERCICIO_7(){ //DEVOLVER A MAIN EL ARREGLO GENERADO
Scanner sc = new Scanner(System.in);
Random ran = new Random();
    System.out.println("Ingrese el número de celdas");
    int n = sc.nextInt();
    
    while(n < 1 || n > 50){//SE VERIFICA QUE ESTE EN EL RANGO(1-50)
    n = sc.nextInt();
    }
    
    int arreglo[] = new int[n]; 
    
    for (int i = 0; i < n; i++) { //LENADO DEL ARREGLO
        int num = ran.nextInt(898) + 3;
        arreglo[i] = num;
    }
    
    for (int i = 0; i < n; i++) {//creo que este ciclo sobra
        for (int j = 0; j < n - 1; j++) {
            int a = arreglo[j];
            int b = arreglo[j+1];
            
            if(a > b){ //INTERCAMBIA EL ELEMENTO N CON N+1
            arreglo[j+1] = a;
            arreglo[j] = b;
            }
        
        }
    }
    
    for (int elemento: arreglo) {
        System.out.print(elemento + " ");
        
    }
    System.out.println("");
    
}   
}

