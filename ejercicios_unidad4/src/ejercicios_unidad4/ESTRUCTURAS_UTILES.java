
package ejercicios_unidad4;
import java.util.Random;

public class ESTRUCTURAS_UTILES {
public static void main (String[] args){
Random ran = new Random();
//PRIMER ESTRUCTURA:
//CICLO PARA OBTENER EL MÁXIMO COMÚN DIVISOR ENTRE 2 NÚMEROS

boolean flag = false;
int numMENOR = 36;
int numMAYOR = 81;
int k = 0 ;
// k es el máximo común divisor entre ambos números
        for (k = numMENOR; flag == false  ; ) {
            if(numMENOR % k == 0 && numMAYOR % k == 0){
                flag = true;
        }
            else{    
            k--;
            }
        }
        System.out.println(k);

        
//SEGUNDA ESTRUCTURA
//CICLO PARA INVERTIR UNA CADENA POR COMPLETO

String cadINICIAL = "9876543210";
String cadINVERTIDA = ""; 
for(int j = cadINICIAL.length()- 1 ; j >= 0; j--){
                char ultimoCARACTER = cadINICIAL.charAt(j);
                cadINVERTIDA = cadINVERTIDA + ultimoCARACTER;
            }
    System.out.println(cadINVERTIDA);

//TERCERA ESTRUCTURA
//USO DE METODOS PARA OBTENER LOS ELEMENTOS DE UNA CADENA SEPARADOS POR UN CARACTER

String cad = "CAD1*CAD2*CAD3",cad1, cad2, cad3;
 cad1 = cad.substring(0,cad.indexOf('*'));
    System.out.println(cad1);
 cad2 = cad.substring(cad.indexOf('*')+1, cad.lastIndexOf('*'));
    System.out.println(cad2);
cad3 = cad.substring(cad.lastIndexOf('*')+1);
    System.out.println(cad3);

//CUARTA ESTRUCTURA
//GENERAR NUMEROS CON DECIMALES DE FORMA ALEATORIA
//Para este ejemplo se generaron números entre 0 y 5000 con una precisión de dos decimales

int parte_ENTERA = ran.nextInt(4901)+100;
double parte1_DECIMAL = (ran.nextInt(100));
double parte2_DECIMAL = parte1_DECIMAL / 100;
double num_FINAL = parte_ENTERA + parte2_DECIMAL;
    System.out.println(num_FINAL);

//QUINTA ESTRUCTURA
//OBTENCIÓN DE CARACTERES DE FORMA ALEATORIA DE UNA CADENA
String CadPrueba = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    System.out.println(CadPrueba.charAt(ran.nextInt(CadPrueba.length())));
//Obtener un caracter de la cadena en la posición que genere el objeto
//de tipo Random que toma como máximo valor la longitud de la cadena


//SEXTA ESTRUCTURA
//MÉTODO DE LA CLASE STRING PARA INVERTIR UNA CADENA
String cad_original = "9876543120";
StringBuilder invertir = new StringBuilder(cad_original);
String cad_invertida = invertir.reverse().toString();
    System.out.println(cad_invertida);
    
    
    
//SÉPTIMA ESTRUCTURA
//OBTENER EL FACTORIAL DE UN NÚMERO
int n = 6;    
}






}
