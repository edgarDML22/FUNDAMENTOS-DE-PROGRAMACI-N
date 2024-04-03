
package ejercicios_unidad4;
import java.util.Scanner;
import java.util.Random;

public class ejercicio_practica_EXAMEN2 {
public static void main(String[] args){
    Random ran = new Random();
Scanner sc = new Scanner(System.in);
String cad = "", cadfinal = "";
String banco = "*";
System.out.println("Ingrese cadena");
cad = sc.nextLine();
int vocales = 0, consonantes = 0;

    for (int i = 0; i < cad.length(); i++) {//ciclo para contar
    char car = cad.charAt(i);
    
        if ("AEIOUaeiou".contains(String.valueOf(car))) {
            vocales++;
            cadfinal = cadfinal + (banco.charAt(ran.nextInt(banco.length())));  
        }
        else{
            consonantes++;
            cadfinal = cadfinal  + String.valueOf(car);
        }
        
    }
    
    
    
    
    System.out.println("La cadena original era: " + cad);
    System.out.println("La cuál contendía " + vocales + " vocales y " + consonantes + "consonantes");
    System.out.println("La cadena resultante es: " + cadfinal);
    
    

}
    


}
