
package ejercicios_unidad4;
import java.util.Scanner;

public class ejercicio_EXAMEN1 {
public static void main(String[] args){
  

while(true){
int suma = 0;
String cad = PEDIR_CADENA(); 

boolean flag = false;
    for (int i = 0; i < cad.length(); i++) {
    char car = cad.charAt(i);
    
        if(car >= 48 && car <= 57){
            flag = true;
            break;
        }
        else{
            flag = false;
        }
        
    }//FOR PARA VER SI CONTIENE NÚMEROS O NO Y ROMPER EL CICLO
    
        if(!flag){
            System.out.println("FIN DEL PROGRAMA");
        break;                
        }
        
        else{
        suma = OBTENER_SUMA(cad);
        System.out.println("La suma fue: " + suma);
        }
    
}
}//MAIN

public static String PEDIR_CADENA(){
Scanner sc = new  Scanner(System.in);    
String cad;    
    System.out.println("Ingrese cadena");
    cad = sc.nextLine();   
return cad;    
}

public static int OBTENER_SUMA(String cad){
int suma = 0;
String num_completo = "";

cad = cad + "*";



    for (int i = 0; i < cad.length() ; i++) {
        char car = cad.charAt(i);
        int x = 0;
        num_completo = "";
        
        if (car >= 48 && car <= 57) { 
        num_completo = num_completo + car;    
            
            for (int j = i ; ; j++) {//FOR PARA IR ENCONTRANDO LOS NÚMEROS E IRLOS SUMANDO
            char num_siguiente = cad.charAt(j + 1);
            
                if(num_siguiente >= 48 && num_siguiente <=  57){
                   num_completo = num_completo + num_siguiente;                     
                }
                else{
                    x = Integer.parseInt(num_completo);                    
                    suma = suma + x;                    
                    i = j;
                    break;
                }
                
            }//FOR PARA IR ENCONTRANDO LOS NÚMEROS E IRLOS SUMANDO
    
        }
    }
    

return suma;    
}


  
}
