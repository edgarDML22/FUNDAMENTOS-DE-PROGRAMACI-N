
package personal_proyects;
import java.util.Scanner;


public class diagnostico_POO {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cadena");
        String cad = sc.nextLine();
        
        Cadena cad1 = new Cadena(cad);
        
        boolean flag = cad1.verificar();
        if(flag){
            System.out.println("Cadena válida");
        }
        else{
            System.out.println("Cadena NO válida");
        }
        
        
    }
    
}

class Cadena{
    String cad;
    
    
    public Cadena(String cadena){
        cad = cadena;
        
    }
    
    public boolean verificar(){
    boolean flag = true;
    
        for (int i = 0; i < cad.length() && flag ; i++) {
            char car = cad.charAt(i);
            int contador = 0;          
            switch(car){
                
                case '(':
                    for (int j = i + 1; j <= cad.length() - 1 && flag; j++) {
                        if(cad.charAt(j) == ')'){
                            if(contador % 2 != 0){
                                flag = false;
                                break;
                            }                           
                        }
                        else{
                            contador++;
                        }                        
                    if(contador == cad.length() - 1){
                        flag = false;
                        break;
                    }    
                        
                    }
                    
                break;    
                    
                    
                case '[':
                    for (int j = i + 1; j < cad.length() - 1; j++) {
                        if(cad.charAt(j) == ']'){
                            if(contador % 2 != 0){
                                flag = false;
                            }                           
                        }
                        else{
                            contador++;
                        }
                        
                    }
                    
                break;    
                    
                case '{':
                    for (int j = i + 1; j < cad.length() - 1; j++) {
                        if(cad.charAt(j) == '}'){
                            if(contador % 2 != 0){
                                flag = false;
                            }                           
                        }
                        else{
                            contador++;
                        }
                        
                    }
                    
                break;    
                
                
                
                case ')':
                case ']':
                case '}':
                if(i == 0){
                    flag = false;
                }                       
                break;  
                
                
                
                
                
            }
            
        }
    



    return flag;
    }
    
}
