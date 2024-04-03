
package ejercicios_torneo;

import java.util.Scanner;


public class ejercicio20_ORDENAR_PALABRAS_ALFABETICAMENTE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cad_nombres = "",cad_apellidos = "", nombres = "";
        int contador = 0;
        
        while(true){
        System.out.println("Ingrese cadena");
            String cad = sc.nextLine();  
            
            if(cad.equals("STOP")){
                break;
            }
            
            boolean flag = verificar(cad);
            
            if (flag) {
                cad_nombres = cad_nombres + nombre(cad) + " ";
                cad_apellidos = cad_apellidos +  apellido(cad) + " ";
   
            }
            else{
                nombres += cad + " ";
                contador++;
                
                
                
            }
            
        }
        nombres += " ";
        System.out.println("LOS NOMBRES ANTES DE SER ORDENADOS ERAN: " + nombres);
        String cad1 = "" , cad2 = "";
        
        
        
        
        String copia = "";
        boolean flag = true;
        
            
            
            for (int j = 0; j < contador && flag; j++) {
                copia = nombres;
                
                for (int i = 0; i < contador; ) {
                if(i == 0){
                    cad1 = nombres.substring(0 , nombres.indexOf(" "));    
                }
                    int k = nombres.indexOf(cad1) + cad1.length();
                    int m = nombres.indexOf(" ", k + 1);
                    cad2 = nombres.substring(k + 1 , m);
            
           
            System.out.println("cad1 = " + cad1);
            System.out.println("cad2 = " + cad2);
            

                if(cad1.compareToIgnoreCase(cad2) < 0 ){
                    cad1 = cad2;
                    
                }
                else{
                    String aux = cad2;
                    nombres = nombres.replace(cad2, cad1);
                    nombres = nombres.replaceFirst(cad1, aux);
                    cad1 = cad2;
                    
                }
                i++;
                
                System.out.println("CADENA ORIGINAL AL MOMENTO: " +nombres);
                if (copia.equals(nombres) && i > contador - 2) {
                nombres = copia;
                flag = false;
                break;
                
                }
           
            
            
            
            }
            
        }
            
            
            
            
        
        
        System.out.println("LA CADENA DE NOMBRES FUE: " + cad_nombres);
        System.out.println("LA CADENA DE APELLIDOS FUE: " + cad_apellidos);
        System.out.println("LOS NOMBRES ORDENADOS FUERON: " + nombres);
            
            
            
            
            
            
        
        
        
        
    }
    
    public static boolean verificar(String cad){
        boolean flag = false;
        for (int i = 0; i < cad.length(); i++) {
            if(" ".contains(String.valueOf(cad.charAt(i)))){
                flag = true;
                break;
                
            }
            
        }
        
    return flag;    
    }
    
    public static String nombre(String cad){
        String nombre = cad.substring(0, cad.indexOf(" "));
        
    return nombre;    
    }
    
    public static String apellido(String cad){
        String apellido = cad.substring(cad.indexOf(" ") + 1, cad.length());
    
    return apellido;
    }
    
    
}
