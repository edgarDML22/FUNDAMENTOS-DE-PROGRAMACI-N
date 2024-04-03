
package ejercicios_unidad4;
import java.util.Scanner;
import java.util.Random;

public class ejerciciovehiculos_CLASE {
static Scanner sc = new Scanner(System.in);
static Random ran = new Random();
public static void main(String[]args){

    for (int i = 1; i <= 5; i++) {
        
    
char Vrandom;
String cad = "abcm";
Vrandom = cad.charAt(ran.nextInt(cad.length()));
int km_entero = ran.nextInt(4901)+100;
double km_decimal = (ran.nextInt(100));
double KM_decimal = km_decimal / 100;
double kmRandom = km_entero + KM_decimal;

//System.out.println("Vehiculo aleatorio " +Vrandom+ "\nNúmero de km aleatorio " +km_Random);
double pago = PAGAR(Vrandom, kmRandom);
System.out.println("El importe del vehículo " +i+ " es: " + pago);
    }//for
}//MAIN
public static double PAGAR(char V, double km){
double R = 0;
switch(V){
    case 'a':
    R = km*3.5;
    break;
    
    case 'b':
    R = km*0.8;
    break;
    
    case 'm':
    R = km* 0.8;
    break;
    
    default:
    double pT = 0, pK = 0;
    System.out.println("Ingrese el número de toneladas");
    double T = sc.nextDouble();
    pT = 12*T;
    pK = km*12.8;
    R = pT + pK;
}
return R;
}



}//public class
