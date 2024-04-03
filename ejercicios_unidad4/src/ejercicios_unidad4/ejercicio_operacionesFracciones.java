
package ejercicios_unidad4;
import java.util.Scanner;
import java.util.Random;

public class ejercicio_operacionesFracciones {
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
char car;
int k, i = 0, entero =0, resto = 0;
String cad="";

    System.out.println("Ingresar expresión");
    String aux = sc.nextLine();
    
    for(; !aux.equalsIgnoreCase("fin");){ //CICLO PARA HACER VARIAS OPERACIONES
    for (i = 0; aux.charAt(i)>=48 && aux.charAt(i)<=57; i++) {//CICLO PARA EXTRAER EL PRIMER NUMERADOR
        cad += aux.charAt(i);
    }
    int num1 = Integer.parseInt(cad);
    
    for (i++, cad=""; aux.charAt(i)>=48 && aux.charAt(i)<=57; i++) { //CICLO PARA EXTRAER EL PRIMER DENOMINADOR
        cad += aux.charAt(i);
    }
    int den1 = Integer.parseInt(cad);
    
    char operador = aux.charAt(i);//SE GUARDA EL OPERADOR ARITMÉTICO
    
    for (i++, cad=""; aux.charAt(i)>=48 && aux.charAt(i)<=57; i++) {//CICLO PARA EXTRAER EL SEGUNDO NUMERADOR
        cad += aux.charAt(i);
    }
    int num2 = Integer.parseInt(cad);
    
    i++;
    cad = aux.substring(i);
    int den2 = Integer.parseInt(cad); // SE EXTEAE EL SEGUNDO DENOMINADOR
    
    
    int numR=0, denR=0;
    switch(operador){//SWITCH PARA LAS 4 OPERACIONES
    case '+':
    numR = (num1*den2)+(num2*den1);
    denR = den1*den2;
    break;
    
    case '-':
    numR = (num1*den2)-(num2*den1);
    denR = den1*den2;
    break;
    
    case '*':
    numR = num1*num2;
    denR = den1*den2;
    break;
    
    case '/':
    numR = num1*den2;
    denR = num2*den1;
    break;
    
    default: 
    break;
    }
    
    if(numR>=denR){ //FRACCIÓN IMPROPIA
    entero = numR / denR;
    resto = numR % denR;
    if(resto != 0){
    numR = resto;
    boolean flag = false;
        // k es el máximo común divisor entre ambos números
        for (k = numR; flag == false  ; ) {
            if(numR % k == 0 && denR % k == 0){
                flag = true;
            }
            else{
            k--;
            }
        }
        numR /= k; 
        denR /= k;
    System.out.println(aux+" = "+entero+" + "+numR+"/"+denR);
    
        }
    else{
    System.out.println(aux+" = "+entero); //CUANDO EL RESULTADO ES UN ENTERO EXACTO
        }
    }
    
    //Lo del maximo comun divisor funciona porque al ser el numerador el más pequeño se empieza a probar a partir
    //de este todos los divisores hasta llegar a uno(1) o a alguno que divida a los dos de manera exacta
    //por eso se resta en la actualización del ciclo
    
    else{ //FRACCIÓN PROPIA
        boolean flag = false;
        // k es el máximo común divisor entre ambos números
        for (k = numR; flag == false  ; ) {
            if(numR % k == 0 && denR % k == 0){
                flag = true;
        }
            else{    
            k--;
            }
        }
        numR /= k; 
        denR /= k;
        System.out.println(aux+" = "+numR+ "/"+denR);
    }
    
    aux="";
    cad="";
    System.out.println("Ingresar expresión");
    aux = sc.nextLine();
    
    }
    System.out.println("Colorín colorado, este código ha terminado");

    }    
}
