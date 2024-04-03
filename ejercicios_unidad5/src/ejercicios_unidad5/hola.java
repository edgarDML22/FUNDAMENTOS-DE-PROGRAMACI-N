
package ejercicios_unidad5;
import java.util.Scanner;

public class hola {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombresOrdenados = "";
        String nombreActual;

        // Leer nombres hasta que se ingrese la palabra "STOP"
        while (true) {
            System.out.print("Ingrese un nombre (o STOP para detenerse): ");
            nombreActual = scanner.nextLine();

            if (nombreActual.equalsIgnoreCase("STOP")) {
                break;
            }

            // Concatenar el nombre actual a la cadena
            nombresOrdenados = insertarOrdenado(nombresOrdenados, nombreActual);
        }

        // Mostrar los nombres ordenados
        System.out.println("\nNombres ordenados alfabéticamente:");
        System.out.println(nombresOrdenados);

        scanner.close();
    }

    // Función para insertar un nombre en una cadena ordenada
    private static String insertarOrdenado(String cadena, String nuevoNombre) {
        int longitud = cadena.length();
        int i = 0;

        // Encontrar la posición de inserción
        while (i < longitud && nuevoNombre.compareToIgnoreCase(cadena.substring(i, i + 1)) > 0) {
            i++;
        }

        // Insertar el nuevo nombre en la posición correcta
        cadena = cadena.substring(0, i) + nuevoNombre + cadena.substring(i);

        return cadena;
    }
}
    

