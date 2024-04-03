//HECHO PARA QUE EL USUARIO INGRESE LAS COORDENADAS
package ejercicios_unidaad4;
import java.util.Scanner;
import java.util.Random;

public class ejercicio_ExamenNelly {
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
boolean flag = false;
    
    for (; flag == false;) {
        
    
int n = 3;
String matrix[][] = new String [n][n];


    for (int i = 0; i < matrix.length; i++) { //ESTRUCTURA PARA LLENAR LA MATRIZ
                for (int j = 0; j != matrix[i].length; j++) { //DE ESPACIOS

                    matrix[i][j] = "[ ]";
                }

            }
    
    String matrix_generada[][] = GENERAR(matrix);
    
    int aciertos = JUEGO(matrix_generada);
        switch(aciertos){
            case 0:
                System.out.println("Que lástima no logró encontrar ninguno, suerte para la próxima");
            break;    
            case 1:
                System.out.println("Logró encontrar sólo un asterisco");
            break;
            case 2:
                System.out.println("Logró encontrar dos asteriscos");
            break;    
            case 3:
                System.out.println("¡FELICIDADES!"+"\nLogró encontrar los 3 asteriscos");
            break;
            default:
            break;
        }

    System.out.println("El juego generado por el programa fue el siguiente");            
    IMPRIMIR(matrix_generada);
        System.out.println("¿Desea intentarlo de nuevo?");
        String respuesta = sc.nextLine();
        if(respuesta.equalsIgnoreCase("NO")){
        flag = true;
        
        }
    }
}//MAIN


public static String[][] GENERAR(String matrix[][]){
int n = 3;
Random ran = new Random();
while(n>0){
                int Px = ran.nextInt(3);
                int Py = ran.nextInt(3);   
                    if(matrix[Px][Py] == "[ ]"){
                    matrix[Px][Py] = "[*]";
                    n--;
                    }
                }
return(matrix);
}
    
public static int JUEGO(String matrix[][]){
    int contador = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("ATENCIÓN");
    System.out.println("Sólo cuenta con 3 oportunidades para encontrar los asteriscos ocultos");
    System.out.println("Las coordenadas de cada intento deben ingresarse de la siguiente forma:");
    System.out.println("X,Y");
   
    
    
        for (int i = 1; i <= 3; i++) {
        int x ;
        int y ;
            System.out.println("Intento no. "+i+ ". "+ "Ingrese las coordenadas donde piensa que se encuentra el asterisco");
            String cad = sc.nextLine();
                String Cx = cad.substring( 0 , cad.indexOf(','));
                String Cy = cad.substring(cad.indexOf(',') + 1);
                x = Integer.parseInt(Cx);
                y = Integer.parseInt(Cy);

                if (matrix[x][y] == "[*]"){
                contador++;    
                }
        
        
        cad = "";
        Cx = "";
        Cy = "";
    }
return(contador);    
}    
    
    



 

public static void IMPRIMIR(String matrix[][]){
    
    for (int i = 0; i < matrix.length; i++) { //ESTRUCTURA PARA IMPRIMIR LA MATRIZ
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");   
            }
            System.out.println("");
   }
            

}




}//PUBLIC CLASS