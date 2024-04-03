
package ejercicios_torneo;

import java.util.Scanner;


public class ejercicio12_CALCULADORA_HEXADECIMAL_DECIMAL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese valor: ");
        String cad = sc.nextLine();
        
        Hexadecimal calcu = new Hexadecimal(cad);
        System.out.println("La conversión fue: " + calcu.resolver(cad));
        
        
    }
    
    
    
}

class Hexadecimal{
    String cad;
    
    public Hexadecimal(String cadena){
        cad = cadena;
        
    }
    
    
    public int resolver(String cad){
        int suma = 0;
        
        for (int i = 0; i < cad.length(); i++) {
            char car = cad.charAt(cad.length() - 1 - i);
            
            if("1234567890".contains(String.valueOf(car))){
                suma +=  Integer.parseInt(String.valueOf(car))* Math.pow(16 , i);
                
            }
            
            else{
                int num = 0;
                
                switch(car){
                    case 'A':
                        num = 10;
                        break;
                    
                    case 'B':
                        num = 11;
                        break;
                        
                    case 'C':
                        num = 12;
                        break;
                        
                    case 'D':
                        num = 13;
                        break;
                        
                    case 'E':
                        num = 14;
                        break; 
                        
                    case 'F':
                        num = 15;
                        break;                                                                                     
                }
                
                suma += num * Math.pow(16, i); 
            }
            
        }
     
    return suma;    
    }
} 
