//ALMACENA EN UN ARREGLO LOS ELEMENTOS DE OTROS 2 ARREGLOS DE MANERA ALTERNADA
package ejercicios_unidad5;
import java.util.Scanner;


public class practica4_arreglos {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);    
    
    System.out.println("Ingrese el número de dígitos que va a ingresar");
    
    int n = sc.nextInt();
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
    
    //System.out.println("LLENADO DEL ARREGLO C");
//    int j = 0, k = 0; 
//    for (int i = 0; i < arregloC.length; i++) {
//    
//        if (i % 2 == 0){
//            arregloC[i] = arregloA[j];
//            j++;
//        }                 //FORMA QUE SE ME OCURRIÓ A MI
//        else{
//            arregloC[i] = arregloB[k];
//            k++;
//        }
//    
//    }//LLENADO DEL ARREGLO C
    
//FORMA DEL TUTORIAL
    int j = 0;
    for (int i = 0; i < n; i++) {
    arregloC[j] = arregloA[i];
    j++;
    arregloC[j] = arregloB[i];
    j++;
    }
    
    for(int elemento: arregloC){
        System.out.print(elemento+"/");
    }
        
        
        }
        
    }    

