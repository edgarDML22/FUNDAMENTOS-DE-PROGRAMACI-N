
package ejercicios_unidad5;


public class ejercicio_SUDOKU {
    public static void main(String[] args){
        
        String matrix[][] = {{"8","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"}};
    
        
        
        System.out.println("VERIFICACIÓN FILA:"  + verificarFilas(matrix));
        System.out.println("VERIFICACIÓN COLUMNA: " + verificarColumnas(matrix));
        System.out.println("VERIFICACIÓN CUADRITO: " + verificarCuadro(matrix));
        
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    
    }
    
public static boolean verificarFilas(String matrix[][]){
    boolean flag = true;
    
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            
            if(matrix[i][j] != "."){
                String valor = matrix[i][j];
                
                
                for (int k = j; k < matrix[i].length - 1; k++) {
                    if(valor == matrix[i][k + 1]){
                        flag = false;
                        break;
                    }
                }
            }
            
            
        }
        
    }

return flag;    
}

public static boolean verificarColumnas(String matrix[][]){
    boolean flag = true;
    
    for (int j = 0; j < matrix[0].length; j++) {
        for (int i = 0; i < matrix.length; i++) {
            
            if(matrix[i][j] != "."){
                String valor = matrix[i][j];
                
                
                for (int k = i; k < matrix.length - 1; k++) {
                    if(valor == matrix[k + 1][j]){
                        flag = false;
                        break;
                    }
                }
            }
            
            
        }
        
    }

return flag;    
}

public static boolean verificarCuadro(String matrix[][]){
    boolean flag = true;
    String arreglo[] = new String[9];
    
    int n = 3;
    for (int i = 0; i < n; i++) {
        if(n > 9){
            break;
        }
        
        for (int j = 0; j < n ; j++) {
            if(matrix[i][j] != "."){
                String valor = matrix[i][j];
                System.out.println("VALOR: " + valor);
            
                if(j == 3){
                    j = 0;
                }
                
            
                
                
                if(valor == matrix[i][j + 1]){
                    System.out.println("ENTRÓ");
                    flag = false;
                    break;
                }
                
                
                
                
            }
            
        }
        
    n += 3;
        System.out.println("VALOR DE N: " + n);    
    }
        
        

return flag;    
}


    
}


