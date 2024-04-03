
package ejercicios_torneo;

import java.util.Scanner;


public class ejercicio7_CONTADOR_PALABRAS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese su texto");
        String cad = sc.nextLine();
        //cad += " ";
        String arreglo[] = cad.split(" ");
        System.out.println("Se encontraron " + arreglo.length + " palabras");
        
        for(String palabra: arreglo){
            System.out.print(palabra + "\t");
        }
          
        //FORMA QUE USE EN MI EXAMEN
        /*
        int contador = 0;
        cad += " ";
        String palabra = "",resultado = "";
        
        for (int i = 0; i < cad.length();i++) {
            palabra = " ";
            char car = cad.charAt(i);
            
            if (car != ' '){
                palabra += car;
                for (int j = i; j < cad.length() - 1; j++) {
                    if (cad.charAt(j + 1) != ' ') {
                        palabra += cad.charAt(j + 1);                        
                    }
                    else{
                        contador++;
                        resultado += palabra + " / ";
                        i = j;
                        break;
                    }                                     
                }    
            }                                    
        }
        System.out.println("Se encontraron " + contador + " palabras");
        System.out.println("Las cuáles fueron las siguientes: ");
        System.out.println(resultado);
        */
        
        
        
    }
    
}
