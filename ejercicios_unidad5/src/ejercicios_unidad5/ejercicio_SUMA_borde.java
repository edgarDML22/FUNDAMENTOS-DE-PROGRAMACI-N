
package ejercicios_unidad5;
import java.util.Scanner;
import java.util.Random;

public class ejercicio_SUMA_borde {


    public static void main(String[] args) {
        //Edgar Daniel Martinez Loppez
        //Chacon Arellano Gabriel
        //Grupo A

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int N = ran.nextInt(6) + 3;
        int M = ran.nextInt(6) + 3;
        int suma = 0;
        int matriz[][] = new int[N][M];
//CON PUROS OR EN LAS CONDICIONES

//LLENADO DEL ARREGLO
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ran.nextInt(11) + 10;

            }

        }

        IMPRIMIR(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i == 0 || i == N - 1 || j == 0 || j == M - 1) {
                    suma += matriz[i][j];
                }

            }
        }
        System.out.println("LA SUMA FUE: " + suma);

    }

    public static void IMPRIMIR(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }

            System.out.println("");

        }
    }
}
