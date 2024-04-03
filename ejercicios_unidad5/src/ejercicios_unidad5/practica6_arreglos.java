//DETERMINA SI EL ARREGLO ESTÁ FORMADO POR NÚMEROS DE FORMA CRECIENTE, DECRECIENTE
//DESORDENADOS O SI BIEN SON TODOS IGUALES
package ejercicios_unidad5;
import java.util.Scanner;

public class practica6_arreglos {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int arreglo[] = new int[10];

    for (int i = 0; i < arreglo.length; i++) {
    System.out.println((i+1)+". Ingrese valor:");
    arreglo[i] = sc.nextInt();    
    }
    
boolean creciente = false, decreciente = false, iguales = false;

        for (int k = 0; k < arreglo.length - 1; k++){  
            
                if(arreglo[k] != arreglo[k+1]){
                iguales = false;
                break;
                }
                
                else{
                iguales = true;    
                }
        }
        
        for (int k = 0; k < arreglo.length - 1 && !iguales; k++) {
            
                if(arreglo[k] > arreglo[k+1]){
                creciente = false;
                break;
                }
                
                else{
                creciente = true;    
                }
        }
        
        for (int k = 0; k < arreglo.length - 1 && !iguales; k++) {
            
                if(arreglo[k] < arreglo[k+1]){
                decreciente = false;
                break;
                }
                
                else{
                decreciente = true;    
                }
        }
        
        
        
        if(creciente){
            System.out.println("Los números están en orden creciente");    
        }
        else if(decreciente){
            System.out.println("Los números están en orden decreciente");
        }
        else if(iguales){
            System.out.println("Los números son iguales");
        }
        else{
            System.out.println("Los números están desordenados");
        }
        
        System.out.println("El arreglo generado fue el siguiente");
        for(int elemento: arreglo){
            System.out.print(elemento);
            if(elemento != arreglo[arreglo.length - 1 ]){
            System.out.print(", ");
            }
        }
        System.out.println("");
        
    }    
}
