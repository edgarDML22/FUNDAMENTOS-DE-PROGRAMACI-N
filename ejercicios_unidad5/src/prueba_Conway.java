
import java.util.Scanner;


public class prueba_Conway {
   public static void main(String[] args) {
    int matrix[][] = new int[100][100];

    matrix[0][0] = 1;

    for (int i = 1; i < matrix.length; i++) {
        int count = 1;
        int value = matrix[i - 1][0];

        int k = 0;
        int j;

        for (j = 1; j < matrix[i - 1].length; j++) {
            if (matrix[i - 1][j] == value) {
                count++;
            } else {
                if(k < matrix.length){
                matrix[i][k] = count;
                matrix[i][k + 1] = value;
                count = 1;
                value = matrix[i - 1][j];
                k += 2;
                }
            }
        }

        
    }

    // Imprimir la matriz
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length && matrix[i][j] != 0; j += 2) {
            System.out.print(matrix[i][j] + " " + matrix[i][j + 1] + " ");
        }
        System.out.println();
    }
}


    
}
