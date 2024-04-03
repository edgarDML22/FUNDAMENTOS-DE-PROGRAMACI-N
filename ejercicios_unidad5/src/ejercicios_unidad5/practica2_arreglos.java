//IDENTIFICA SI LOS NUMEROS INGRESADOS FUERON POSITIVOS, NEGATIVOS O 0s
package ejercicios_unidad5;
import java.util.Scanner;


public class practica2_arreglos {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
    int contP = 0, contN = 0, contCeros = 0, sumaP = 0, sumaN = 0;
    System.out.println("Ingrese el número de dígitos que va a ingresar");
    int n = sc.nextInt();
    int array[] = new int[n]; 
    
    for (int i = 0; i < array.length; i++) {
        System.out.print((i+1)+". Ingrese valor: ");
        array[i] = sc.nextInt();
    }//LLENADO DE ARREGLO
    
    for (int i = 0; i < array.length; i++) {
        
        if(array[i] > 0){
        contP++;
        sumaP += array[i];
        }
        else if(array[i] < 0){
        contN++;
        sumaN += array[i];
        }
        else{
        contCeros++;    
        }
        
        }
   
            if(contP > 0){
            double mediaP = sumaP / contP;
                System.out.println("La media de los positivos fue: "+mediaP);
            }
            else{
                System.out.println("No se ingresaron valores positivos");
            }
            
            if(contN > 0){
            double mediaN = sumaN / contN;
            System.out.println("La media de los negativos fue: "+mediaN);
            }
            else{
                System.out.println("No se ingresaron valores negativos");
            }
            
            if(contCeros > 0){
                System.out.println("El número de ceros ingresado fue: "+contCeros);    
            }
            else{
                System.out.println("No se ingresaron ceros");    
            }
            
    
    
    
}
    
}
