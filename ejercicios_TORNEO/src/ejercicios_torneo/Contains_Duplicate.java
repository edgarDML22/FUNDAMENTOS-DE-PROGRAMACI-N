
package ejercicios_torneo;
import java.util.Scanner;

public class Contains_Duplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese números");
        String cad = sc.nextLine();
        
        String arreglo[] = cad.split(","); 
        
        Solution solution = new Solution(arreglo);
        boolean v = solution.obtener();
        System.out.println(v);
    }
    
    
}

class Solution{
    String arreglo[];
    
    
    public Solution(String[] array){
        arreglo = array;
        
        
    }
    
    public boolean obtener(){
        boolean v = false;
        
        for (int i = 0 ; i < arreglo.length && !v; i++) {
            String num = arreglo[i];
            System.out.println("VALOR DE NUM: " + num);
            
            for (int k = i; k < arreglo.length - 1; k++) {
                System.out.println("VALOR DE ARREGLO EN K+1: " + arreglo[k+1]);
                if(num.equals(arreglo[k+1])){
                    System.out.println("VALOR DE V CAMBIADO");
                    v = true;
                    break;
                }
                    
                    
                    
            }
                
        }
            
            
    return v;        
    }
        
        
        
    }
    

