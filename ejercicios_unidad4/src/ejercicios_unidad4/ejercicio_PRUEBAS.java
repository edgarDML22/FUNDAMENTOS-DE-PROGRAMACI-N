
package ejercicios_unidad4;


public class ejercicio_PRUEBAS {
public static void main(String[] args){
 String cad = "CAD1*CAD2*CAD3",cad1, cad2, cad3;
 cad1 = cad.substring(0,cad.indexOf('*'));
    System.out.println(cad1);
 cad2 = cad.substring(cad.indexOf('*')+1, cad.lastIndexOf('*'));
    System.out.println(cad2);
cad3 = cad.substring(cad.lastIndexOf('*')+1);
    System.out.println(cad3);
    }
}
