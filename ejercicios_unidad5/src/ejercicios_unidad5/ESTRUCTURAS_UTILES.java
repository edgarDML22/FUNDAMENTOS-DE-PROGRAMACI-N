
package ejercicios_unidad5;


public class ESTRUCTURAS_UTILES {
public static void main(String [] args){

    
//PRIMERA ESTRUCTURA
//DECLARACIÓN Y CREACIÓN DE UN ARREGLO
    int n = 3;
    String matrix[][] = new String [n][n];
//TIPO DE DATO + NOMBRE = NEW + TIPO DE DATO [][]    

//SEGUNDA ESTRUCTURA
//ESTRUCTURA PARA LLENAR LA MATRIZ DE ESPACIOS
    for (int i = 0; i < matrix.length; i++) { //ESTRUCTURA PARA LLENAR LA MATRIZ
                for (int j = 0; j != matrix[i].length; j++) { //DE ESPACIOS

                    matrix[i][j] = " ";
                }
    }

//TERCERA ESTRUCTURA
//ESTRUCTURA PARA IMPRIMIR LOS ELEMENTOS GUARDADOS EN LA MATRIZ
    for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");   
            }
            System.out.println("");
    }
    
//CUARTA ESTRUCTURA
//ESTRUCTURA PARA LLENAR LA MATRIZ DE ASTERISCOS
    for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
            
            if( i == 0 || i == n-1 || j ==0 || j == n-1){    
                matrix[i][j] = "*";
                }
            }
            
    }
//ESTA ESTRUCTURA SE PUEDE REUTILIZAR, LO ÚNICO QUE SE CAMBIA ES LA CONDICIÓN DEL IF
    IMPRIMIR(matrix);



    

}//MAIN 

//QUINTA ESTRUCTURA
//MÉTODO PARA IMPRIMIR CUALQUIER MATRIZ
public static void IMPRIMIR(String matrix[][]){
    
    for (int i = 0; i < matrix.length; i++) { //ESTRUCTURA PARA IMPRIMIR LA MATRIZ
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");   
            }
            System.out.println("");
   }
            
}

}
