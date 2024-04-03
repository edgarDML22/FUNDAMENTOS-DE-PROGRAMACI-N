
package ejercicios_torneo;
import java.util.Scanner;
import java.util.Random;


public class ejercicio19_ANAGRAMAS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese palabra: ");
        String cad = sc.nextLine();
        
        String arreglo[] = new String[cad.length()];
        
        llenar(arreglo , cad);
        revolver(arreglo , cad);
        mostrar(arreglo);
        
        
        
        
        
    }
    
    public static void llenar(String arreglo[] , String cad){
        for (int i = 0; i < cad.length(); i++) {
            arreglo[i] = "[ ]";
            
        }
        
    }
    
    
    public static void revolver(String arreglo[] , String cad){
    Random ran = new Random();    
        
        for (int i = 0; i < cad.length();) {
            int x = ran.nextInt(cad.length());
            System.out.println("RANDOM GENERADO: " + x);
            if (arreglo[x] == "[ ]") {
                arreglo[x] = "[" + cad.charAt(i) + "]";
                i++;   
                
            }
            
            
            
        }
        
        
    }
    
    public static void mostrar(String arreglo[]){
        for(String elemento: arreglo){
            System.out.print(elemento + " ");
        }
        
        
    }
    
}
