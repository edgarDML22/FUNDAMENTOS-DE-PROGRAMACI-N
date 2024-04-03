
package ejercicios_unidad5;
import java.util.Scanner;


public class pruebas_SISEPUEDE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        //String cadena = sc.nextLine();

        String palabra = "", palabraOrdenada = "";

         for (int i = 0; i < cadena.length(); i++) {
            char car = cadena.charAt(i);

            if (car != ' ') {
                palabra += car;
            } else {
                palabraOrdenada = insertarEnOrden(palabraOrdenada, palabra);
                palabra = "";
            }
        }

        // Manejar la última palabra si no hay un espacio al final
        palabraOrdenada = insertarEnOrden(palabraOrdenada, palabra);

        System.out.println("CADENA ORIGINAL: " + cadena);
        System.out.println("CADENA ORDENADA: " + palabraOrdenada.trim());
    }

    public static String insertarEnOrden(String cadena, String palabra) {
        if (cadena.isEmpty()) {
            return palabra;
        }

        int i = 0;
        while (i < cadena.length() && cadena.substring(i).compareToIgnoreCase(palabra) < 0) {
            i = cadena.indexOf(" ", i);
            if (i == -1) {
                break;
            }
            i++;
        }

        if (i == -1) {
            return cadena + " " + palabra;
        } else {
            return cadena.substring(0, i) + palabra + " " + cadena.substring(i);
        }
    }
}
        
        
        //String arreglo[] = {"beto" , "juan" , "luis" , "ana"};
        
//        for (int i = 0; i < arreglo.length; i++) {
//            for (int j = 0; j < arreglo.length - 1; j++) {
//                if(arreglo[j].compareToIgnoreCase(arreglo[j + 1]) > 0){
//                    String aux = arreglo[j];
//                    arreglo[j] = arreglo[j + 1];
//                    arreglo[j + 1] = aux;
//                }
//            
//            
//            }            
//        }
//        
//        for(String palabra: arreglo){
//            System.out.print(palabra + " ");
//        }
        
        
//        System.out.println("Ingrese cadena");
//        String cad2 = sc.nextLine();
//        String cad = "Beto y Juan";
//        
//        String resultado = cad.substring(cad.indexOf(" ") + 1 ,cad.lastIndexOf(" "));
//        System.out.println("resultado = " + resultado);
        
        
        
        
//        while(true){
//            System.out.println("Ingrese cadena");
//            String cad = sc.nextLine();
//            
//            if(cad.equals("STOP")){
//                break;
//            }
//            
//            else{
//                cad_ordenada = ordenar_cadena(cad_ordenada , cad);
//            }
//            
//        }
//        
//    }
//    
//    public static String ordenar_cadena(String cad, String nombre){
//        String cad_final = "";
//        
//        
//        
//        
    //}
    
    
    //public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Ingrese nombres separados por espacios:");
//        String cadenaNombres = scanner.nextLine();
//
//        String nombresOrdenados = ordenarNombres(cadenaNombres);
//
//        System.out.println("Nombres ordenados alfabéticamente: " + nombresOrdenados);
//    }
//
//    public static String ordenarNombres(String cadenaNombres) {
//        String nombresOrdenados = cadenaNombres;
//
//        boolean intercambioRealizado = true;
//
//        while (intercambioRealizado) {
//            intercambioRealizado = false;
//
//            int indiceEspacio = nombresOrdenados.indexOf(" ");
//
//            while (indiceEspacio != -1) {
//                String palabraActual = nombresOrdenados.substring(0, indiceEspacio);
//                String siguientePalabra = "";
//
//                int siguienteEspacio = nombresOrdenados.indexOf(" ", indiceEspacio + 1);
//
//                if (siguienteEspacio != -1) {
//                    siguientePalabra = nombresOrdenados.substring(indiceEspacio + 1, siguienteEspacio);
//                } else {
//                    siguientePalabra = nombresOrdenados.substring(indiceEspacio + 1);
//                }
//
//                if (siguienteEspacio != -1 && palabraActual.compareToIgnoreCase(siguientePalabra) > 0) {
//                    nombresOrdenados = intercambiarPalabras(nombresOrdenados, indiceEspacio, siguienteEspacio);
//                    intercambioRealizado = true;
//                }
//
//                indiceEspacio = siguienteEspacio == -1 ? -1 : siguienteEspacio;
//            }
//        }
//
//        return nombresOrdenados;
//    }
//
//    public static String intercambiarPalabras(String cadena, int indicePalabra1, int indicePalabra2) {
//        String palabra1 = cadena.substring(0, indicePalabra1);
//        String palabra2 = "";
//
//        if (indicePalabra2 != -1) {
//            palabra2 = cadena.substring(indicePalabra1 + 1, indicePalabra2);
//        } else {
//            palabra2 = cadena.substring(indicePalabra1 + 1);
//        }
//
//        String parteRestante = "";
//
//        if (indicePalabra2 != -1) {
//            parteRestante = cadena.substring(indicePalabra2 + 1);
//        }
//
//        return palabra1 + " " + palabra2 + parteRestante;
//    }
    

