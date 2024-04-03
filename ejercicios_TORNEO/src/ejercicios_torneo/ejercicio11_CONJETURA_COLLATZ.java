
package ejercicios_torneo;

import java.util.Scanner;


public class ejercicio11_CONJETURA_COLLATZ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int V = sc.nextInt();
        Collatz collatz = new Collatz(V);
        collatz.generar_serie();
        collatz.mostrar_serie();
        
    }
    
    
    
    
    
}

class Collatz{
    int V;
    int arreglo[];
    
    public Collatz(int value){
        V = value;
        
    }
    
    public void generar_serie() {
        int i = 0;
        arreglo = new int[1];

        while (V != 1) {
            arreglo[i] = V;

            System.out.println("VALOR DE V: " + V);
            System.out.println(arreglo[i]);

            if (V % 2 == 0) {
                V /= 2;
            } else {
                V = 3 * V + 1;
            }

            // Crear un nuevo array con un tamaño mayor
            int[] nuevoArreglo = new int[i + 2];

            // Copiar los elementos del antiguo array al nuevo
            for (int j = 0; j <= i; j++) {
                nuevoArreglo[j] = arreglo[j];
            }

            // Asignar el nuevo array al antiguo
            arreglo = nuevoArreglo;

            i++;
        }

        // Imprimir el último valor (1)
        arreglo[i] = V;
    }

    public void mostrar_serie() {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }
    
}
