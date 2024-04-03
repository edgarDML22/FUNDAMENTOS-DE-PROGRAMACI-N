
package ejercicioss_unidad3;
import java.util.Scanner;
//ROMBO AJUSTABLE EL TAMAÑO A TRAVÉS DE N
public class ejercicio_figuraspractica {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
//k es para imprimir asteriscos
//i es para imprimir espacios
//r es el contador de renglones
//m es el número de asteriscos del primer renglón
//j es el número de espacios del primer renglón
//aux va a ser el número de asteriscos de la fila más grande
    System.out.println("Ingrese valor");
    int n = sc.nextInt(),topCar=1, aux=0, topEsp = 1;
    aux = n + (n-1);


    for(int r = 1; r <= n ;r++){//ARRIBA
        
        for(int i = n-r; i>0 ;i-- ){//para espacios
            System.out.print(" ");
        }
        for(int k = 1; k <= topCar; k++){//para asteriscos
            System.out.print("*");
        }
    System.out.println("");
    topCar +=2;
    }
    
    aux-=2;
    
    for(int r = 1; r <= n; r++ ){//ABAJO
    
        for(int i = 1; i<=topEsp; i++){//para espacios
            System.out.print(" ");
        }
        for(int k = 1; k<=aux; k++){//para asteriscos
            System.out.print("*");
        }
    topEsp++;
    aux-=2;
    System.out.println("");    
    }
    
    }
}
