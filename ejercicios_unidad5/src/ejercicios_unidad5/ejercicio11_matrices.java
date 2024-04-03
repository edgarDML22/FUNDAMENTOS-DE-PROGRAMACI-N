
package ejercicios_unidad5;
import java.util.Scanner;
import java.util.Random;


public class ejercicio11_matrices {
    public static void main(String[] args){
        
        Random ran = new Random();
        
        String matrix[][] = new String[3][ran.nextInt(5) + 4];
        
        Cadenas cadena = new Cadenas(matrix);
        
        while( 3 == 3 ){
            String cad = cadena.pedirCadena();
            
            if(cad.equals("alto")){
                break;
            }
            
            else{
                boolean unCar = cadena.verificarUnicaracter(cad);
                
                if(unCar){
                    System.out.println(cadena.agregar(cad , 0));
                    
                }
                else{
                    boolean biCar = cadena.verificarBicaracter(cad);
                    if(biCar){
                        System.out.println(cadena.agregar(cad , 1));
                        
                        
                    }
                    
                    else{
                        System.out.println(cadena.agregar(cad , 2));
                        
                        
                    }
                    
                    
                }
                
                
                
                
                
            }
            
        }
        
        cadena.mostrar();
        
        
        
        
        
        
    }
    
    
}

class Cadenas{
    String matrix[][];
    
    public Cadenas(String matriz[][]){
        matrix = matriz;
        
           
    }
    
    public String pedirCadena(){
        System.out.println("Ingrese cadena");
        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine();
    return cad;    
    }
    
    public boolean verificarUnicaracter(String cad){
        boolean flag = true;
        char car = cad.charAt(0);
        
        for (int i = 1; i < cad.length(); i++) {
            if(cad.charAt(i) != car){
                flag = false;
                break;
            }            
        }
        
    return flag;    
    }
    
    public boolean verificarBicaracter(String cad){
        boolean flag = true;
        char car1 = cad.charAt(0);
        char car2 = cad.charAt(1);
        String secuencia = String.valueOf(car1) + String.valueOf(car2);
        System.out.println("SECUENCIA: " + secuencia);
        
        if (cad.length() % 2 == 0) {
            for (int i = 2; i < cad.length(); i+=2) {
            
                if(!(secuencia.equals(String.valueOf(cad.charAt(i)) + String.valueOf(cad.charAt(i + 1))  )  )  ){
                    flag = false;
                    break;                                                
                }            
            }
    
        }
        else{
            
            if(cad.charAt(cad.length() - 1) != car1){
                flag = false;
            }
            for (int i = 2; i < cad.length() - 1 && flag; i+=2) {
            
                if(!(secuencia.equals(String.valueOf(cad.charAt(i)) + String.valueOf(cad.charAt(i + 1))  )  )  ){
                    flag = false;
                    break;                                                
                }            
            }
            
                    
        } 
        
        
        System.out.println("VERIFICACIÓN DE BICARACTER: " + flag);
        
    return flag;    
    }
    
    public boolean agregar(String cad , int r){
        boolean flag = false;
        
        
        for (int j = 0; j < matrix[r].length; j++) {
            if(matrix[r][j] == null){
                matrix[r][j] = cad;
                flag = true;
                break;
            }
            
        }
    
        
        
        
        
        
        
        
    return flag;    
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
