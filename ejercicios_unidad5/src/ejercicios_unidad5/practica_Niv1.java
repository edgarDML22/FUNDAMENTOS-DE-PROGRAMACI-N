
package ejercicios_unidad5;
import java.util.Scanner;


public class practica_Niv1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);        
        
        //QUE TE DIGA AL FINAL QUE LE FALTA A LA CONTRA PARA SER CORRECTA Y SINO QUE DIGA QUE ES VÁLIDA
        
        System.out.println("Ingrese contraseña");
        String cad = sc.nextLine();
        
        String arreglo[] = new String[cad.length()];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = String.valueOf(cad.charAt(i));            
        }
        
        boolean b1 = longitud(cad);
        boolean b2 = especial(arreglo);
        boolean b3 = numero(arreglo);
        boolean b4 = mayus(arreglo);
        boolean b5 = minus(arreglo);
        
        if(!b1){
            System.out.println("La contraseña tiene una longitud menor a 8");            
        }
        if(!b2){
            System.out.println("La contraseña debe tener al menos un caracter especial");
        }
        if(!b3){
            System.out.println("La contraseña debe contener al menos un número");
        }
        if(!b4){
            System.out.println("La contraseña debe contener al menos una letra MAYUSCULA");
        }
        if(!b5){
            System.out.println("La contraseña debe contener al menos una letra MINUSCULA");
        }
        
        if(b1 && b2 && b3 && b4 && b5){
            System.out.println("CONTRASEÑA VÁLIDA :)");
        }
        
        
        
        
    }
    
    public static boolean longitud(String cad){
        boolean flag = true;
        
        if(cad.length() < 8){
            flag = false;
        }
    return flag;    
    }
    
    public static boolean especial(String[] arreglo){
        boolean flag = false;
        String cad = "!*@%&$#";
        
        for (int i = 0; i < arreglo.length; i++) {
            if(cad.contains(arreglo[i])){
                flag = true;
                break;                                
            }            
        }
    return flag;            
    }
    
    public static boolean numero(String[] arreglo){
        boolean flag = false;
        String cad = "0123456789";
        
        for (int i = 0; i < arreglo.length; i++) {
            if(cad.contains(arreglo[i])){
                flag = true;
                break;                                
            }            
        }
    return flag;
        
    }
    
    public static boolean mayus(String[] arreglo){
        boolean flag = false;
        String cad = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        
        for (int i = 0; i < arreglo.length; i++) {
            if(cad.contains(arreglo[i])){
                flag = true;
                break;                                
            }            
        }
    return flag;
        
    }
    
    public static boolean minus(String[] arreglo){
        boolean flag = false;
        String cad = "abcdefghijklmnñopqrstuvwxyz";
        
        for (int i = 0; i < arreglo.length; i++) {
            if(cad.contains(arreglo[i])){
                flag = true;
                break;                                
            }            
        }
    return flag;
        
    }
    
    
}
