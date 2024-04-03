
package ejercicios_unidad4;
import java.util.Scanner;

public class ejercicio_PiramideNumeros {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
boolean flag = false;

    System.out.println("Ingrese valor");
    int V = sc.nextInt();
    int n = 1 ;
    for (int r = 0; flag == false ; r++) {//FOR PARA LOS RENGLONES
    
        for (int i = 0; i < r ; i++, n++) {//FOR PARA IMPRIMIR LOS NÚMEROS
            System.out.print(n+ " ");
                if(n == V){//SI SE HA ALCANZADO EL VALOR INGRESADO POR EL USUARIO SE DETIENE EL PROGRAMA
                flag = true;
                break;
                }  
        }      
        System.out.println("");
         
    }
        
        
    
    
    }    
}
