
package ejercicios_unidad4;
import java.util.Scanner;
import java.util.Random;


public class ejercicio_EXAMEN_grupoB {
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String cad, cad_nombres = "", cad_apellidos = "";
    char car;
    //DETENER CON STOP
    
    while(true){  
        
    boolean apellido = false;    
    System.out.println("Ingrese cadena");
    cad = sc.nextLine();   
    
    if(cad.equalsIgnoreCase("STOP")){
    break;
    }
    cad = cad.trim();
    //&& i != cad.length() - 1
        for (int i = 0; i < cad.length(); i++) {
            car = cad.charAt(i);
            if(car == ' ' ){
            apellido = true;
            break;         
            } 
        }
        
        if(!apellido){
        String nombre = NOMBRE(cad);
        System.out.println(nombre);
        }
        else{
        cad_nombres = cad_nombres + " " + CAD_NOMBRES(cad) ;    
        cad_apellidos = cad_apellidos + " " + CAD_APELLIDOS(cad);    
        }
    
         
    }//WHILE
    
    System.out.println("La cadena de nombres es: " + cad_nombres);
    System.out.println("La cadena de apellidos es: " + cad_apellidos);
    
      

    
}//MAIN

public static String NOMBRE(String cad){
String nombre = cad.toUpperCase();
return nombre;
}

public static String CAD_NOMBRES(String cad){
String nombre = cad.substring(0, cad.indexOf(" "));
return nombre;
}

public static String CAD_APELLIDOS(String cad){
String apellido = cad.substring(cad.indexOf(" ") + 1);
return apellido;
}

}//PUBLIC CLASS
