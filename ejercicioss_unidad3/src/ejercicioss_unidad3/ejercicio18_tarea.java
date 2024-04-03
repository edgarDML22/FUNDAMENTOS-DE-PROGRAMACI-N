
package ejercicioss_unidad3;
import java.util.Scanner;


public class ejercicio18_tarea {
  //CHACÓN ARELLANO GABRIEL
//MARTÍNEZ LÓPEZ EDGAR DANIEL
//GRUPO: A  
public static void main(String []args){

int precio, suma = 0, cam, pago, aux;
Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio de sus productos");
            do{
            precio = sc.nextInt();
            suma += precio;
            }while(precio != -1);
            suma++;
            
        System.out.println("Total a pagar: $"+suma+"\nIngrese la cantidad con la que pagará");       
            pago = sc.nextInt();
            cam = pago - suma;
            aux = cam;
        //Cálculos para dar el cambio
        int n500, n200, n100, n50, n20, n10, n5, n2, n1;
        
        for(n500 = 0; (cam - 500) >= 0; n500++  ){
        cam -= 500;
        }
        
        for(n200 = 0; (cam - 200) >= 0; n200++  ){
        cam -= 200;
        }
        
        for(n100 = 0; (cam - 100) >= 0; n100++  ){
        cam -= 100;
        }
        
        for(n50 = 0; (cam - 50) >= 0; n50++  ){
        cam -= 50;
        }
        
        for(n20 = 0; (cam - 20) >= 0; n20++  ){
        cam -= 20;
        }
        
        for(n10 = 0; (cam - 10) >= 0; n10++  ){
        cam -= 10;
        }
        
        for(n5 = 0; (cam - 5) >= 0; n5++  ){
        cam -= 5;
        }
        
        for(n2 = 0; (cam - 2) >= 0; n2++  ){
        cam -= 2;
        }
        
        n1 = 0;
        if (cam > 0){
        n1++;
        }
        
            System.out.println("Total a pagar = $" +suma);
            System.out.println("Cantidad recibida = $" +pago+ "\n" + "Cambio = $" +aux);
            System.out.println("Con"  + "\t" + "billetes o monedas de:");
            System.out.println(n500 + "\t" + "500");
            System.out.println(n200 + "\t" + "200");
            System.out.println(n100 + "\t" + "100");
            System.out.println(n50 + "\t" + "50");
            System.out.println(n20 + "\t" + "20");
            System.out.println(n10 + "\t" + "10");
            System.out.println(n5 + "\t" + "5");
            System.out.println(n2 + "\t" + "2");
            System.out.println(n1 + "\t" + "1");
    }
}