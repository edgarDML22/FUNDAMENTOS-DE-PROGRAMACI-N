
package ejercicios_unidad4;
import java.util.Scanner;
import java.util.Random;

public class ejercicio_examenNelly_MATRICES {


public static void main (String [] args){
int n = 3;


   
String matrix[][] = new String [n][n];


    for (int i = 0; i < matrix.length; i++) { //ESTRUCTURA PARA LLENAR LA MATRIZ
                for (int j = 0; j != matrix[i].length; j++) { //DE ESPACIOS
                    matrix[i][j] = " ";
                }
    }
    
    String matrix_generada [][] = GENERAR(matrix); //GENERAR LA MATRIZ
    
    int aciertos = JUEGO(matrix_generada);
        switch(aciertos){
            case 0:
                System.out.println("Que lástima no logró encontrar ninguno, suerte para la próxima");
            case 1:
                System.out.println("Logró encontrar sólo un asterisco");
            break;
            case 2:
                System.out.println("Logró encontrar dos asteriscos");
            break;    
            case 3:
                System.out.println("¡FELICIDADES!"+"\n Logró encontrar los 3 asteriscos");
            break;
            default:
            break;
        }
    
    System.out.println("El juego generado por el programa fue el siguiente");
    
    
    
    MOSTRAR(matrix_generada);
    
    
    
    
}


public static String[][] GENERAR(String matrix[][]){
Random ran = new Random();    
int m = 3;

while(m > 0){
    int Px = ran.nextInt(3);
    int Py = ran.nextInt(3);   
        if(matrix[Px][Py] == "[ ]"){
            matrix[Px][Py] = "[*]";
            m--;
                    }
                }

return(matrix);
}

public static int JUEGO(String matrix[][]){
Scanner sc = new Scanner(System.in);    
int contador = 0;    
String Cx = "";
String Cy = "";    
System.out.println("ATENCIÓN");
    System.out.println("Sólo cuenta con 3 oportunidades para encontrar los asteriscos ocultos");
    System.out.println("Las coordenadas de cada intento deben ingresarse de la siguiente forma:");
    System.out.println("X,Y");
    
    for (int i = 1; i <= 3; i++) {
    int x ;
    int y ;
        System.out.println("Intento no. "+i+ ". "+ "Ingrese la scoordenadas donde piensa que se encuentra el asterisco");
        String cad = sc.nextLine();
            Cx = cad.substring( 0 , cad.indexOf(','));
            Cy = cad.substring(cad.indexOf(',') + 1);
            x = Integer.parseInt(Cx);
            y = Integer.parseInt(Cx);
            
            if (matrix[x][y] == "[*]"){
            contador++;    
            }
        
        
        cad = "";
        Cx = "";
        Cy = "";
    }
return(contador);    
}

public static void MOSTRAR(String matrix[][]){
for (int i = 0; i < matrix.length; i++) { //ESTRUCTURA PARA IMPRIMIR LA MATRIZ
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");   
            }
            System.out.println("");
   }    
    
}



}
