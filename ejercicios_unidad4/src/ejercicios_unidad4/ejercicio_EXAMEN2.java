//DIPTONGOS Y TRIPTONGOS
package ejercicios_unidad4;
import java.util.Scanner;

public class ejercicio_EXAMEN2 {
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
    while(true){
    System.out.println("Ingrese cadena");    
    String cad = sc.nextLine(); 
    
    
        if(cad.equals("STOP")){
            break;
        }
        
        else{
        DIPTONGOS(cad);
        
            
                    
                
                
            }
        
        }
        
    }//MAIN


//VAMOS A HACERLO PENSANDO QUE SON EXACTAMENTE 3 VOCALES 

public static void DIPTONGOS(String cad){
int contador = 0, diptongos = 0, triptongos = 0;
cad = cad + "*";

    for (int i = 0; i < cad.length() - 2; i++) {
        char car = cad.charAt(i);
        contador = 0;
        
        if("AEIOUaeiou".contains(String.valueOf(car))){
            contador++;
            
            
            for (int j = i; ; j++) {
                char sig_car = cad.charAt(j + 1);
                if ("AEIOUaeiou".contains(String.valueOf(sig_car)) ) {
                    
                    contador++;
                    //System.out.println(contador);
                                        
                }
                else{
                    switch(contador){
                        case 2:
                            diptongos++;
                            break;
                        case 3: 
                            triptongos++;
                            break;
                        default:
                            break;
                            
                        
                    }
                    i = j;
                    break;
                }
            }
        }
        
    }
    
System.out.println("Se encontraron: " + diptongos + " diptongos");
System.out.println("Se encontraron: " + triptongos + " triptongos");    
}

//public static int TRIPTONGOS(String cad){
//int contador = 0;
//
//return contador;
//}
    
}    




