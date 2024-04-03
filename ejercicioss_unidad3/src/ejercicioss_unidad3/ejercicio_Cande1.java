
package ejercicioss_unidad3;
import java.util.Scanner;

public class ejercicio_Cande1 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el número de ejercicio(1, 2, 3 o 4)");
    int ejercicio = sc.nextInt();
        switch(ejercicio){
            case 1:
             /*1. Escribir un programa que sume los primeros números del 1 a n(siendo n ingresado por el usuario)
            impares utilizando ciclo for que muestre el resultado*/
                
            System.out.println("Ingrese el valor hasta el cuál quiere sumar");
            int MAX = sc.nextInt();
            int suma = 0;
            
            for(int num = 1; num <= MAX; num++){
            int ip = num % 2;
            
            if(ip == 1){//si son impares se sumarán en la variable suma
            suma += num;
                }
            }
            System.out.println("El resultado es: " +suma);
            
            break;

            case 2: 
            /*2. Escribir un programa que solicite 5 facturas o tickets de compra, se debe especificar el número de ticket al usuario,
            se deben especificar los kilos de la venta(pueden ser decimales) y se debe obtener el precio, considerando que el kilo 
            cuesta $27. Asimismo mostrar la cantidad de ventas que fueron superiores a $90*/
                
            double Kg;
            int j = 1, nfact = 0;
            
            do{
            System.out.println("Ingrese el número de kilos de la compra no. "+j);
            Kg = sc.nextDouble();
            
            double Factura = Kg * 27;
            
            if(Factura > 90){//contador mayores que 90
                nfact++;
            }
            
            j++;
            } while(j <= 5);
            System.out.println("Esta fue la cantidad de ventas mayor a $90 " +"\n" +nfact);
            
            break;    
            
            case 3:
                
                

        }//switch
    
    }    
}
