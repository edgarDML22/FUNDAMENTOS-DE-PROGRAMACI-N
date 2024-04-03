
package ejercicios_unidad5;
import java.util.Scanner;

public class ejercicio9_arreglos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String arreglo[] = new String[12];
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese cadena");
            String cad = sc.nextLine();
            
            if(cad.equals("$")){
                break;
            }
            
            
            
            if(i == 0){
                arreglo[i] = cad;
            }
            
            else{
                for (int j = i; j > 0; j--) {
                    arreglo[j] = arreglo[j - 1];
                    
                    
                }
                arreglo[0] = cad;
            }
            
            
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] != null){
                System.out.print(arreglo[i] + "\t");
            }
            
        }
        
        
        
        
        
        
    }
    
}
