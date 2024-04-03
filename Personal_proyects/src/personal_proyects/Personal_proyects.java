
package personal_proyects;
import java.util.Random;


public class Personal_proyects {
   
public static void main(String[] args) {   

String matrix[][]= new String[5][8];
Tablas tab = new Tablas(matrix);

tab.generar();
tab.mostrar();
        
}
    
}

class Tablas{
    String matrix[][];
    Random ran = new Random();
    
    public Tablas(String matriz[][]){
      matrix = matriz;  
    
    }
    
   public void generar(){       
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               int ran1 = ran.nextInt(8) + 2;
               int ran2 = ran.nextInt(8) + 2;
               matrix[i][j]= String.valueOf(ran1) + "x" +String.valueOf(ran2) + "= ";               
           }           
       }       
   }
   
   public void mostrar(){
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               System.out.print(matrix[i][j] + "\t");               
           }
        System.out.println("");           
       }       
   }
    
    
}
