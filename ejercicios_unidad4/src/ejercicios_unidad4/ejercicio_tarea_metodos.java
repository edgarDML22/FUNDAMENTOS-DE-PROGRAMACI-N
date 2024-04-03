package ejercicios_unidad4;
import java.util.Scanner;

public class ejercicio_tarea_metodos {
//FERNÁNDEZ GARIBAY ALFONSO MARÓN
//CHACÓN ARELLANO GABRIEL
//MARTÍNEZ LÓPEZ EDGAR DANIEL
//GRUPO: A
    

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

boolean flag = false;  
    
    for (; flag == false ;) {
    
    if (flag==true){
    break;
    }
    System.out.println("¿Qué programa desea ejecutar?");
    int num_ejercicio = sc.nextInt();
      
    
    switch (num_ejercicio){
        
        case 1:
            System.out.println("Ingrese valor");
            int num = sc.nextInt();
        char R1 = EJERCICIO1(num);
        switch (R1){
            case 'D':
            System.out.println("El número es deficiente");
            break;
        
            case 'A':
            System.out.println("El número es abundante");
            break;
            
            default:
            System.out.println("El número es perfecto");
            break;
        }//EJERCICIO 1
        break;
        
        case 2:
        System.out.println("Ingrese cadena");
        String cad2 = sc.next();
        boolean R2 = EJERCICIO2(cad2);
        if(R2){
            System.out.println("La cadena tiene formato de binario");
        }
        else {
            System.out.println("La cadena no tiene formato de binario");
        }
            
        break;
        
        case 3:
            System.out.print("Ingrese un valor en binario: ");
            String cadena = sc.next();
            int R3 = EJERCICIO3(cadena);
            System.out.println("La conversión a decimal es: "+R3);
        break;
        
        case 4:
            System.out.println("Ingrese el número en formato decimal");
            int ndecimal = sc.nextInt();
            String R4 = EJERCICIO4(ndecimal);
            System.out.println("La conversión a binario es la siguiente: " +R4);
        break;
        
        case 5:
        System.out.println("Ingrese cadena");
        String cad5 = sc.next();
        System.out.println("Ingrese el caracter a identificar");
        char car5 = sc.next().charAt(0);
        int R5 = EJERCICIO5(cad5, car5);
            System.out.println("El carácter "+car5+ " aparece " +R5+ " veces");
        break;
        
        case 6:
            System.out.println("Ingrese el primer elemento de la serie");
            int elemento1 = sc.nextInt();
            System.out.println("Ingrese el número de elementos de la serie que desea");
            int nelementos = sc.nextInt();
            String R6 = EJERCICIO6(elemento1, nelementos);
            System.out.println("La serie resultante es la siguiente: " +R6);
        break;
        
        default:
        System.out.println("El número de ejercicio ingresado no existe");
        flag = true;
        break;
        }//SWITCH CASE
    }
    
    }//MAIN

public static char EJERCICIO1(int num) {//EJERCICIO 1

char regreso;
int division, suma=0;
int numero = num;
        
    for (int i = 1; i != numero; i++) {
        division = numero%i;
        if (division == 0) {
        suma += i;
        }
    }//FOR
        
        if (suma==numero) {
            regreso = 'P';  
        }
        else if (suma<numero) {
            regreso = 'D';
        }
        else{
            regreso = 'A';
        }
        return regreso;
}//EJERCICIO 1

public static boolean EJERCICIO2(String cad2) { //EJERCICIO 2
    Scanner sc = new Scanner(System.in);
        boolean flag = false;
        char evaluar;
        String cad = cad2;
  

        for (int i = 0; i != cad.length(); i++) {
            evaluar = cad.charAt(i);
            if(evaluar == '0' || evaluar == '1'){
            flag = true;
            }
            else{
            flag = false;
            break;
            }
        }
       
        return flag;
}//EJERCICIO 2

public static int EJERCICIO3(String cadena){ //EJERCICIO 3
int rFinal = 0;
int p = 0;    
    for (int i = cadena.length() - 1; i >= 0; i--,p++) {
                char car=cadena.charAt(i);
                
                switch(car){
                    case '0': 
                        break;
                    case '1':
                        rFinal = rFinal + (int)(Math.pow(2,p));
                        break;
                    default: 
                        break;
                } 
            }//FOR
            
            return rFinal;
}//EJERCICIO 3


public static String EJERCICIO4(int valor){// EJERCICIO 4 
int V = valor;
String cFinal = "";
String cadR="";

            while(V > 0){
                if(V % 2 != 0){
                    cFinal = cFinal+"1";
                }
                else{
                    cFinal = cFinal+"0";
                }
                V = V / 2;
            }
            
            for(int j = cFinal.length()- 1 ; j >= 0; j--){
                char aux = cFinal.charAt(j);
                cadR = cadR+aux;
            }
            
            return cadR;
}//EJERCICIO 4

 public static int EJERCICIO5(String cad, char car){ //EJERCICIO 5
        int identificador=0;
        for (int i = 0; i < cad.length(); i++) {
            if(cad.charAt(i)== car){
              identificador++;
            }
        }
 return identificador;       
 } //EJERCICIO 5




public static String EJERCICIO6(int V, int nE){ //EJERCICIO 6
Scanner sc = new Scanner(System.in);
String regreso = "";
int i = 0, k = 1;
regreso = regreso+V;

        for (int n = V % 2; V != 1 && k != nE; n = V % 2, k++){
            if (n == 0){
                V = V / 2; 
                regreso = regreso+","+V;
            }
            
            else {
                V = (V*3) + 1; 
                regreso = regreso+","+V;
            }
        }//FOR
return regreso;
} //EJERCICIO 6

}//PUBLIC CLASS
    