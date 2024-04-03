
package ejercicios_unidad4;
import java.util.Scanner;
import java.util.Random;

public class ejercicios_repasoCadenas {
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
Random ran = new Random();
//int i, x;
//String cad;
//char car;
//String cad5;
//    System.out.println("Ingrese cadena");
//    cad5 = sc.nextLine();
//    String cadR = cad5.substring(2);
//    System.out.println(cadR);
//    
//    System.out.println("Ingrese una cadena");
//        cad = sc.nextLine();      
//        System.out.println(cad.charAt(rn.nextInt(cad.length())));
//    
//    System.out.println("Ingrese otra cadena");
//    String cad2 = sc.nextLine();
//    
//    if(cad.equalsIgnoreCase(cad2)){
//        System.out.println("Cadenas iguales");
//    cad = cad.toUpperCase();
//    cad2 = cad2.toUpperCase();
//        System.out.println("Primer cadena: " +cad+ "\nSegunda cadena: "+cad2);
//    }
//    else {
//        System.out.println("Las cadenas no son iguales");
//    cad = cad.toLowerCase();
//    cad2 = cad2.toLowerCase();
//        System.out.println("Primer cadena: " +cad+ "\nSegunda cadena: "+cad2);    
//    }
//    
//System.out.println("Ingrese la última cadena");
//        String cadT = sc.nextLine();
//    for (int j = 0; j < cadT.length(); j++) { //Imprime caracter por caracter
//        System.out.println(cadT.charAt(j)); 
//        
//    }

String cad = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
String cad2 = "FULLMAYUSfullminus";
String cad3 = "                 Ejemplo de cadena       ";

//System.out.println(cad.charAt(ran.nextInt(cad.length())));
//
//
//cad2 = cad2.toUpperCase();
//System.out.println(cad2);
//
//cad3 = cad3.trim();
//    if(cad3.equalsIgnoreCase("eJeMplO De cAdeNa")){
//        System.out.println("Son iguales");
//        
//    }
//    else{
//        System.out.println("no son iguales");
//    }
//    System.out.println(cad.length());
//    
//    
//    String cadInvertida = "";
//    for (int i = cad.length() - 1; i >= 0; i--) {
//        
//        cadInvertida = cadInvertida + cad.charAt(i);
//    }
//    System.out.println(cadInvertida);

//    System.out.println(numeros.length());
//    String numeros = "0123456789";
//    System.out.println(numeros.substring(numeros.indexOf("2") , numeros.indexOf("8")) );

//String vacia = "                           ";
//vacia = vacia.trim();
//    if (vacia.isEmpty()) {
//        System.out.println("cadena vacía");
//        
//    }
//    else{
//        System.out.println("cadena no vacía");
//    }

String cad4 = "arbola";
String corregida = cad4.replace('a', 'A');
int contador = 0;
    System.out.println(corregida);
    if (corregida.charAt(0) == 'A') {
        System.out.println("Empieza con A");
        for (int i = 0; i < corregida.length(); i++) {
            if (corregida.charAt(i) == 'A') {
                contador++;
                
            }
    
        }
    }
    else{
        System.out.println("No empieza con A");    
    }
    System.out.println("La palabra corregida es: " + corregida);
    System.out.println("Y tuvo este número de a o A:  " + contador);
    
    int x = ran.nextInt(21);
    String cadena = String.valueOf(x);
    x = Integer.parseInt(cadena);
    String banco = "abcdefghijklmnñopqrstuvwxyz";
    for (int i = 0; i < 5; i++) {
    cadena = cadena + banco.charAt(ran.nextInt(banco.length()));    
    }
    
    if(cadena.isEmpty()){
        System.out.println("cadena vacía");
        System.out.println(cadena);
        
    }
    else{
        System.out.println("cadena no vacía");
        System.out.println(cadena);
        System.out.println("Longitud de la cadena = " + cadena.length());
        System.out.println( (x+1));
    }
    
    
    }   
}