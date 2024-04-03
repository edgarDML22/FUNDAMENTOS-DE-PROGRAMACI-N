
package ejercicios_unidad5;
import java.util.Scanner;
import java.util.Random;

public class ejercicios_tareaVectores {
//CHACÓN ARELLANO GABRIEL
//FERNÁNDEZ GARIBAY ALFONSO MARÓN
//MARTÍNEZ LÓPEZ EDGAR DANIEL
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
boolean flag = false;
String cad;
    
    while(!flag){
        System.out.println("¿Qué ejercicio desea ejecutar?");  
        cad = sc.nextLine();

        switch(cad){

            case "ejercicio de moda":
                int arreglo[] = EJERCICIO_7();;
                float media = EJERCICIO_8(arreglo);
                System.out.println("El arreglo contenía " + arreglo.length + " elementos");
                System.out.println("La media fue: " + media);
            break;

            case "ejercicio Ulam":
                EJERCICIO_10();
            break;

            case "detener":
                flag = true;
            break;

            default:
                System.out.println("Lo que escribió no está en el menú de opciones, inténtelo nuevamente");
            break;    

        }
    
    }
    
    
    
    
    
}//MAIN

public static int[] EJERCICIO_7(){ 
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
    
    for (int i = 0; i < n; i++) {//RECORRE TODO EL ARREGLO
        for (int j = 0; j < n - 1; j++) {//ORDENA EL ARREGLO
            int a = arreglo[j];
            int b = arreglo[j+1];
            
            if(a > b){ //LOS INTERCAMBIA DE POSICIÓN
            arreglo[j] = b;
            arreglo[j+1] = a;
            }
        
        }
    }
    

    
    for (int elemento: arreglo) {
        System.out.print(elemento + " ");   
    }
    System.out.println("");
    
return(arreglo);    
}//EJERCICIO 7

public static float EJERCICIO_8(int arreglo[]){
float media;
int k = arreglo.length;

    if(k % 2 == 0){
        int x1 = k / 2; //ESTOS SON 
        int x2 = x1 - 1; // LOS INDICES
        
        float central_1 = arreglo[x1];
        float central_2 = arreglo[x2];
        media = (central_1 + central_2) / 2;
    }
    else{
        int x = k / 2;
        int central = arreglo[x];
        media = central;
    }
    
return(media);    
}//EJERCICIO 8

public static void EJERCICIO_10() {
Scanner sc = new Scanner(System.in);
int n ,contador;
int[] array = new int[1];
       
        do {
            System.out.print("Ingresa un valor entero positivo: ");
            n = sc.nextInt();
        } while (n<0);
        
        
        for (int i = 0, p = 1;  ; i++, p++) {
            array = new int[p];
            array[i] = n;
            System.out.print("[" + array[i] + "]" + " ");
            contador = array.length;
           
            if(n == 1){//PARA DETENER EL CICLO
                break;
            }
            
            if (n % 2 == 0) {
                n = n / 2;
                array[i] = n;
                
  
            } else {
                n = (n * 3) + 1;
                array[i] = n;

            }
            
        }
        
        for (int i = 0; i < array.length; i++) {
            
        }
        System.out.println("");      
        System.out.println("Tu arreglo tuvo "+ contador + " casillas");
        
    }
    
    
}//PUBLIC CLASS
