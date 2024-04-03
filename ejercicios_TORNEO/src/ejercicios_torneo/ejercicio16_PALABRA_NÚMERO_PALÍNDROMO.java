
package ejercicios_torneo;

import java.util.Scanner;




public class ejercicio16_PALABRA_NÚMERO_PALÍNDROMO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cadena");
        String cad = sc.nextLine();
        
        String inv = "";
        
        for (int i = cad.length() - 1; i >= 0; i--) {
            inv += cad.charAt(i);
            
        }
        
        
        if(cad.equals(inv)){
            System.out.println("PALABRA SI ES PALÍNDROMA");
            
        }
        else{
            System.out.println("PALABRA NO ES PALÍNDROMA");
            
            
        }
        
    }
    
}
