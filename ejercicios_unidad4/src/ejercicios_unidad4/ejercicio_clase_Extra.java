
package ejercicios_unidad4;
import java.util.Random;

public class ejercicio_clase_Extra {


public static void main(String[] args) {
        Random ran = new Random();
        int minutos, dia, auto;
        String pago,cad1,cad2,cad3;
        auto=ran.nextInt(6)+5;
        for (int i = 1; i <= auto; i++) {
            minutos = ran.nextInt(12) + 5;
            dia = ran.nextInt(7) + 1;
            pago = cobrar(minutos, dia);
            //int aster1=pago.indexOf('*');
            cad1=pago.substring(0,pago.indexOf('*'));
            cad2=pago.substring(pago.indexOf('*')+1,pago.lastIndexOf('*'));
            cad3=pago.substring(pago.lastIndexOf('*')+1,pago.length());
            System.out.println("Auto "+i+" permanecio " + cad1+" horas," + cad2+ " minutos, pagara " + cad3);

        }
        
    }

    public static String cobrar(int min, int d) {
        float p;
        int h=0;
        String retorno;
        if (min <= 10) {
            p = 0;
        } else {

            h = min / 60;
            min = min % 60; // de 0 a 59
            p = h * 20;
        }
        if (min > 30) {
            p += 20;

        } else if (min > 0) {

            p += 15.5; //media hora mas

        }
        if (d == 2 || d == 6) {
            p = p * 0.8744f; // la f convierte a float 

        }
        retorno=h+"*"+min+"*"+p;
        return retorno;
    }    
}
