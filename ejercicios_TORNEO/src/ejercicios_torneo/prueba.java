
package ejercicios_torneo;

import java.util.Scanner;


public class prueba {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("INSERT THE DATE");//  05/03/1987
        String cad = sc.nextLine();
        boolean flag1 = false, flag2 = false, flag3 = false;

        if(cad.length() == 10 && cad.charAt(2)== '/' && cad.charAt(5) == '/'){
           flag1 = true; 
        }
          
        if(flag1){   
          if(isNumber(cad.substring(0, 2)) && isNumber(cad.substring(3, 5)) && isNumber(cad.substring(6))){
              flag2 = true;
          }
        }
        
        if(flag1 && flag2){
            int day = Integer.parseInt(cad.substring(0, 2));
            int month = Integer.parseInt(cad.substring(3, 5));
            int year = Integer.parseInt(cad.substring(6));
            if(day > 0 && day <= 31 && month > 0 && month <= 12 && year > 1850 && year <= 2024){
                flag3 = true;
            }
        }
        if(flag1 && flag2 && flag3){
           System.out.println("DATE: " + cad); 
           System.out.println("YEAR: " + cad.substring(6,10));
        }
        else{
            System.out.println("INVALID DATE");  
        }
        
        
        
    }
    
    public static boolean isNumber(String cad){
        boolean flag = true;
            for (int i = 0; i < cad.length(); i++) {
                char car = cad.charAt(i);
                if(!(car >= 48 && car <= 57)){
                    flag = false;
                    break;
                }
            }     
        return flag;
    }
    
}
