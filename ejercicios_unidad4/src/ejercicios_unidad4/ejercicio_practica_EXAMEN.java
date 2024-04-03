
package ejercicios_unidad4;
import java.util.Random;
import java.util.Scanner;
public class ejercicio_practica_EXAMEN {


public static void main(String[] args) {
String banco = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvuwxyz1234567890$%#@&!*";
String contraseña = "";
char caracter = CARACTER(banco);
contraseña = CONTRASEÑA(caracter, banco);


System.out.println("La contraseña generada fue: "+ contraseña);
    
    
    


}//MAIN

public static char CARACTER(String banco){
Random ran = new Random();    
int n = ran.nextInt();
char car = banco.charAt(ran.nextInt(7) + 65);
    System.out.println("Es solo para ver si si se incluyó en la cadena" + car);
return car;
}

public static String CONTRASEÑA(char car, String banco){
Random ran = new Random();
String contraseña = "";  
int indice_car = ran.nextInt(10); 

    for (int i = 0; i < 10; i++) {
        
        if(i == indice_car){
            contraseña = contraseña + car;
        }
        
        else{
             contraseña = contraseña + banco.charAt(ran.nextInt(banco.length()));   
                }    
        
    }


return contraseña;  
}



}
