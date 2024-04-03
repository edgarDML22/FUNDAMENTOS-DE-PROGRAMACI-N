
package ejercicios_unidad4;
import java.util.Random;


    

    


public class ejerciciopuebas {
public static void main(String[] args) {
        String cadenaOriginal = "ejemplo";
        String cadenaDesordenada = desordenarCadena(cadenaOriginal);
        
        System.out.println("Cadena original: " + cadenaOriginal);
        System.out.println("Cadena desordenada: " + cadenaDesordenada);
    }    



public static String desordenarCadena(String cadena) {
        Random random = new Random();
        StringBuilder cadenaDesordenada = new StringBuilder(cadena);
        
        for (int i = 0; i < cadena.length(); i++) {
            int indiceAleatorio = random.nextInt(cadena.length());
            // Intercambia caracteres en la posición i y el índice aleatorio
            char temp = cadenaDesordenada.charAt(i);
            cadenaDesordenada.setCharAt(i, cadenaDesordenada.charAt(indiceAleatorio));
            cadenaDesordenada.setCharAt(indiceAleatorio, temp);
        }
        
        return cadenaDesordenada.toString();
    }
}