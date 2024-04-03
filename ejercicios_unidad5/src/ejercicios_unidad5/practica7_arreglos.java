//CAMBIA UN ELEMENTO ESPECÍFICO DE UN ARREGLO A LA POSICION ESPECIFICADA POR EL USUARIO
package ejercicios_unidad5;
import java.util.Scanner;
import java.util.Random;

public class practica7_arreglos {
public static void main(String[] args){
Random ran = new Random();
Scanner sc = new Scanner(System.in);

    System.out.println("Cuántos elementos desea que contenga el arreglo");
    int n = sc.nextInt();

    int array[] = new int[n];

    for (int i = 0; i < array.length; i++) {//SE LLENA EL ARREGLO
        array[i] = ran.nextInt(50) + 1;    
    }
    
    System.out.println("Este es el arreglo generado, previo a los cambios");
    for(int x: array){
        System.out.print( x + " ");
    }
    System.out.println("");
    
    
    
    System.out.println("Ingrese el índice del elemento a cambiar de posición");
    int indice = sc.nextInt(); //INDICE DEL ELEMENTO A CAMBIAR DE POSICION

    System.out.println("Ingrese la posicion a la que desea desplazar el elemento");
    int p = sc.nextInt();
    int aux = array[indice];//SE RESPALDA EL VALOR A CAMBIAR PARA NO PERDERLO

        if( p > indice){ //SI ES MAYOR SIGNIFICA QUE HABRA 
            for (int j = indice; j < p; j++) { //DESPLAZAR A LA IZQUIERDA
                array[j] = array[j+1];    
            }
        }

        else{
            for (int j = indice; j > p; j--) { //DESPLAZAR A LA DERECHA
                array[j] = array[j-1];    
                }
        }

        array[p] = aux;
            
        
            for(int elemento: array){
                System.out.print(elemento + " ");    
            }
            System.out.println("");

    }
}

