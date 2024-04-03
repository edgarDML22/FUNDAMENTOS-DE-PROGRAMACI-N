//PROGRAMA GENERADOR DE 3 CADENAS ALEATORIAS EN FORMA DE COORDENADAS
package ejercicios_unidaad4;
import java.util.Random;

public class pruebas {
public static void main(String [] args){
    Random ran = new Random();
    String arreglo[] = new String[3];

    for (int i = 0; i < arreglo.length; ) {
            int x = ran.nextInt(3);
            int y = ran.nextInt(3);
            String cad = x+","+y;
            
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

    for (int i=0; i < arreglo.length;i++) {
        System.out.print(arreglo[i] + "/");
    }
    }


}
