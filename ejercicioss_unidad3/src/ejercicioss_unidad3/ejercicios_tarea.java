/* CHACÓN ARELLANO GABRIEL
   MARTÍNEZ LÓPEZ EDGAR DANIEL
   GRUPO: A :)
*/
package ejercicioss_unidad3;
import java.util.Scanner;

public class ejercicios_tarea {
    public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    int num_ej; //Número de ejercicio
    System.out.println("Ingrese el número de ejercicio que desea realizar(11, 20, 23 o 29)");
        num_ej = sc.nextInt();
            switch(num_ej){
                    case 11:
                        int n1, n3, value;
                        System.out.println("Ingrese valor");
                        value = sc.nextInt();
                                    if (value>99 && value<1000){
                            n1 = value/100;
                            n3 = value%10;
                            if (n1==n3){
                                System.out.println("Tu número es palíndromo");
                            }
                            else {
                                System.out.println("Tu número no es palíndromo");
                            }
                        }
                        else {
                            System.out.println("ERROR");
                            System.out.println("El número que ingresaste no es de 3 cifras");
                        }
                    break;
                    
                    case 20:
                        char vt;
                        double km, imp, nT, sumT, sumKm ;
                            System.out.println("Ingrese el número de kilómetros");
                            km = sc.nextDouble();
                            System.out.println("Ingrese el vehículo");
                            vt = sc.next().charAt(0); //ESSTRUCTURA PARA LEER CARACTERES
                                switch (vt){
                                    case 'b':
                                        imp = km*0.8;
                                        break;
                                    case 'm':
                                        imp = km*3.5;
                                        break;
                                    case 'a':
                                        imp = km*3.5;
                                    default:
                                        System.out.println("Ingrese el número de toneladas");
                                        nT = sc.nextDouble();
                                            sumKm = km*12.8;
                                            sumT = nT*12;
                                            imp = sumKm + sumT;
                                        break;
                                }
                                System.out.println("El monto total es el siguiente: $" +imp);
                    break;
                    
                    case 23:
                        double nA, nB, nC, desA, desB, desC, pA, pB, pC, suma;
                            System.out.println("¿Cuántas sillas compró de cada tipo?");
                            System.out.println("Número de sillas de tipo A");
                            nA = sc.nextInt();
                            System.out.println("Número de sillas de tipo B");
                            nB = sc.nextInt();
                            System.out.println("Número de sillas de tipo C");
                            nC = sc.nextInt();
                                desA = (nA/10)*10*(520)*(0.03);
                                pA = (520*nA) - desA;
                                desB = (nB/10)*10*(480)*(0.05);
                                pB = (480*nB) - desB;
                                desC = (nC/10)*10*(350)*(0.07);
                                pC = (350*nC) - desC;
                                suma = pA + pB + pC;
                                
                                System.out.println("Deberás pagar en total $" +suma);
                                System.out.println("Precio por las sillas de tipo A: $" +pA);
                                System.out.println("Precio por las sillas de tipo B: $" +pB);
                                System.out.println("Precio por las sillas de tipo C: $" +pC);
                    break;
                    
                    case 29:
                        int num, ip, in7;
                            System.out.println("Ingrese valor");
                            num = sc.nextInt();
                            ip = num%2;//Indicador de si es par o impar
                            
                                if (num!=0){ //filtro de si es 0 o no
                                    if(ip==0){ //si enttra en este if el número es par
                                        if(num>0){
                                            System.out.println("Positivo");
                                        }
                                        else{
                                            System.out.println("Negativo");
                                        }
                                    }
                                    else { //aquí el número es impar
                                        in7 = num%7;
                                        if(in7==0){
                                            System.out.println("Es múltiplo de 7");
                                        }
                                        else {
                                            System.out.println("No es mútliplo de 7");
                                        }
                                    }
                                }
                                else{
                                    System.out.println("No trabajo con valor cero");
                                }
                    break;
                    
                    default:
                        System.out.println("El número de ejercicio que ingresó es erróneo");
                    break;
                }
    }
}
