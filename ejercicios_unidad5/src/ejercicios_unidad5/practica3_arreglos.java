//IMPRIME EL PRIMER EL ELEMENTO: primero, último, segundo, penúltimo, etc.
package ejercicios_unidad5;
import java.util.Scanner;

public class practica3_arreglos {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);    
    
    System.out.println("Ingrese el número de dígitos que va a ingresar");
    int n = sc.nextInt();
    int array[] = new int[n];
    int arregloR[] = new int[n];
    
    for (int i = 0; i < array.length; i++) {
        System.out.print((i+1)+". Ingrese valor: ");
        array[i] = sc.nextInt();
    }//LLENADO DEL ARREGLO
    
    int k = array.length - 1, i = 0;
        for (int j = 0; j < n; j++) {
            
        if(j % 2 == 0){  
        arregloR[j] = array[i];
        i++;
        }
        
        else{
        arregloR[j] = array[k];
        k--;
        }
        
        }
    IMPRIMIR(arregloR);    
    }
    
public static void IMPRIMIR(int arregloR[]){
for(int elemento: arregloR){
    System.out.print(elemento + "/");
}
}    
   
}
