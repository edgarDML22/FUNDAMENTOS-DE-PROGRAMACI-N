
package ejercicios_torneo;

import java.util.Scanner;


public class ejercicio3_ENCONTRAR_DIPTONGOS { //DIPTONGOS SON PALABRAS QUE TENGAN DOS VOCALES JUTNAS
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.println("Ingrese cadena");
        String cad = sc.nextLine();
        cad += "*";
        
        for (int i = 0; i < cad.length(); i++) {
            
            for (int j = i; j < cad.length() - 1; j++) {
              
                if("aeiouAEIOU".contains(String.valueOf(cad.charAt(j))) && "aeiouAEIOU".contains(String.valueOf(cad.charAt(j + 1)))){
                    //if( "aeiouAEIOU".contains(String.valueOf(cad.charAt(j + 1)))){
                                contador++;
                                i = j;
                                

                    //}
                }
            }
            
        }
        System.out.println("Se encontraron: " + contador  + " diptongos");
        
        
    }
    
}
