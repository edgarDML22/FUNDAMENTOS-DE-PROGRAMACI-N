
package ejercicios_torneo;

import java.util.Scanner;


public class ejercicio10_SUMAR_NUMEROS_CADENA {
    public static void main(String[] args){
        

        
        while(true){
            String entrada = pedir_cadena();
            boolean flag = verificar_cadena(entrada);
            
            
            if(!flag){
                break;
            }
            else{
                System.out.println("La suma fue: " + calcular_suma(entrada));
            }
            
            
        }
               
        
    }
    
    public static String pedir_cadena(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese cadena"); 
            String cad = sc.nextLine();
    return cad;    
    }
    
    public static boolean verificar_cadena(String cad){
        boolean flag = false;
        for (int i = 0; i < cad.length(); i++) {
            if("1234567890".contains(String.valueOf(cad.charAt(i)))){
                flag = true;
                break;
            }    
        }
    return flag;
    }
    
    public static int calcular_suma(String cad){
        int suma = 0;
        cad = cad.concat("*");
        
        for (int i = 0; i < cad.length(); i++) {
            String num = "";
            char car = cad.charAt(i);
            
            if ("1234567890".contains(String.valueOf(car))) {
                num += car;
                
                for (int j = i; j < cad.length() - 1; j++) {
                    if("1234567890".contains(String.valueOf(cad.charAt(j + 1)))){
                        num += cad.charAt(j + 1);
                        
                    }
                    else{
                        int n =  Integer.parseInt(num);
                        i = j;
                        suma += n;
                        break;
                    }
                    
                }
                
            }
            
            
        }
    return suma;    
    }
    
}
