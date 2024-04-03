
package ejercicios_unidad4;
import java.util.Scanner;

public class calculadora_metodos {
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Ingrese expresión");
String aux = sc.nextLine();
String cad = "";
int i, R;
    for (i = 0; aux.charAt(i)>=48 && aux.charAt(i)<=57; i++) {
        cad += aux.charAt(i);
    }
    int num1 = Integer.parseInt(cad);
    
    char operador = aux.charAt(i);
    
    cad="";
    i++;
    cad = aux.substring(i);
    int num2 = Integer.parseInt(cad);
    
    switch(operador){
        case '+':
        R = SUMA(num1, num2);
        break;
        case '-':
        R = RESTA(num1, num2);
        break;
        case '*':
        R = PRODUCTO(num1, num2);
        break;
        default:
        R = DIVISION(num1, num2);
        break;
    }
    
    System.out.println("Resultado = " + R);


    }

public static int SUMA(int n1, int n2){
int Resultado = n1 + n2;
return Resultado;
}
public static int RESTA(int n1, int n2){
int Resultado = n1 - n2;
return Resultado;
}
public static int PRODUCTO(int n1, int n2){
int Resultado = n1 * n2;
return Resultado;
}
public static int DIVISION(int n1, int n2){
int Resultado = n1 / n2;
return Resultado;
}
}

