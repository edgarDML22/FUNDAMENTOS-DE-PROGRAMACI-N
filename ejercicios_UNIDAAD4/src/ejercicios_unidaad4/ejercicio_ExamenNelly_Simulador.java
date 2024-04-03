//SE HACEN SIMULACIONES HASTA QUE HAYA UN CASO GANADOR
package ejercicios_unidaad4;
import java.util.Scanner;
import java.util.Random;

public class ejercicio_ExamenNelly_Simulador {
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
boolean flag = false;
    
    for (int r = 1; !flag ; r++) {
    System.out.println("SIMULACIÓN NO. "+r);    
    
    int n = 3;
    String matrix[][] = new String [n][n];

    //1. LLENAR LA MATRIZ DE ESPACIOS
    matrix = RELLENO_ESPACIOS();
    
    //2. LLENAR LA MATRIZ CON 3 ASTERISCOS EN POSICIONES ALEATORIAS
    String matrix_generada[][] = GENERAR(matrix);
    
    //3. LLENAR UN ARREGLO QUE CONTENGA 3 COORDENADAS GENERADAS DE FORMA ALEATORIA Y QUE SEAN DIFERENTES
    String arreglo_random[] = ARREGLO();
    
    //4. SE REALIZ EL JUEGO USANDO LAS COORDENADAS ALEATORAS Y LA MATRIZ GENERADA PREVIAMENTE
    int aciertos = SIMULACION(arreglo_random , matrix_generada);
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
    //5. SE MUESTRA LA MATRIZ PARA COMPROBAR EL RESULTADO
    IMPRIMIR(matrix_generada);
        
        if(aciertos == 3){//SI SE ENCONTRARON LOS 3 ASTERISCOS SE ENCIENDE UNA BANDERA Y SE TERMINA EL PROGRAMA
        flag = true;
        System.out.println("**********************************");
        }
        else{//DE LO CONTRARIO SE CONTINUA INTENTANDO
        System.out.println("-------------------------------------");    
        aciertos = 0;
        }
    }
}//MAIN

public static String[][]RELLENO_ESPACIOS(){
int n = 3;
String matrix[][] = new String [n][n];


    for (int i = 0; i < matrix.length; i++) { //ESTRUCTURA PARA LLENAR LA MATRIZ
                for (int j = 0; j < matrix[i].length; j++) { //DE ESPACIOS

                    matrix[i][j] = "[ ]";
                }

            }    
    
return matrix;    
}


public static String[][] GENERAR(String matrix[][]){
int n = 3;
Random ran = new Random();
while(n > 0){
                int Px = ran.nextInt(3);
                int Py = ran.nextInt(3);   
                    if(matrix[Px][Py] == "[ ]"){
                    matrix[Px][Py] = "[*]";
                    n--;
                    }
                }
return(matrix);
}


public static String[] ARREGLO(){
Random ran = new Random();
    String arreglo[] = new String[3];

    for (int i = 0; i < arreglo.length; ) {
            int x = ran.nextInt(3);
            int y = ran.nextInt(3);
            String cad = x + "," + y;
            
            boolean flag = false;

            for (int j = 0; j < i; j++) { //VERIFICA QUE LAS COORDENADAS SEAN ÚNICAS
            if (arreglo[j].equals(cad)){  //RECORRE EL ARREGLO CADA VEZ QUE SE GENERA UNA CADENA ALEATORIA
                flag = true;              //Y SI ENCUENTRA UNA COINCIDENCIA ENCIENDE LA BANDERA
                }      
            }
            if(!flag){ // !flag ES LO MISMO QUE flag == false
            arreglo[i] = cad;
            i++;
            }
                
    
    }
return arreglo;    
}
    
public static int SIMULACION(String arreglo_random[], String matrix[][]){
    int contador = 0;
        for (int i = 0; i < 3; i++) {
        int x ;
        int y ;
            
        String cad = arreglo_random[i];
        System.out.println("Coordenada no. " +(i + 1)+", fue la siguiente "+cad);
                String Cx = cad.substring( 0 , cad.indexOf(','));
                String Cy = cad.substring(cad.indexOf(',') + 1);
                x = Integer.parseInt(Cx);
                y = Integer.parseInt(Cy);

                if ( matrix[x][y].equals("[*]") ){
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
    
}
